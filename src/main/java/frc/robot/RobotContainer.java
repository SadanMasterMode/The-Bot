// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.GearboxBackward;
import frc.robot.commands.GearboxForward;
import frc.robot.constants.RobotContainerConstants;
import frc.robot.subsystems.GearboxSubsystem;

public class RobotContainer {
  // XBOX
  // Controllers
  private final XboxController operatorController = new XboxController(RobotContainerConstants.OPERATOR_CONTROLLER_PORT);

  // Controller buttons
  private final JoystickButton forwardButton        = new JoystickButton(operatorController, RobotContainerConstants.GEARBOX_FORWARD_BUTTON);
  private final JoystickButton backwardButton       = new JoystickButton(operatorController, RobotContainerConstants.GEARBOX_BACKWARD_BUTTON);

  // Subsystem
  public static final GearboxSubsystem gearboxSubsystem           = new GearboxSubsystem();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    forwardButton.onTrue(new GearboxForward());
    backwardButton.onTrue(new GearboxBackward());
  }
}
