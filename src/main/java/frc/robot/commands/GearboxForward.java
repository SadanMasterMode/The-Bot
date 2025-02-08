// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;

public class GearboxForward extends Command {
  public GearboxForward() {
    addRequirements(RobotContainer.gearboxSubsystem);
  }

  @Override
  public void initialize() {
    RobotContainer.gearboxSubsystem.forward();
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
