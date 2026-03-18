// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANFuelSubsystem;
import frc.robot.subsystems.SwerveSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ExampleAuto extends SequentialCommandGroup {
  /** Creates a new ExampleAuto. */
  public ExampleAuto(SwerveSubsystem drivebase, CANFuelSubsystem fuelSubsystem) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
    // Drive backwards for 3 seconds. The driveArcadeAuto command factory
    // intentionally creates a command which does not end which allows us to control
    // the timing using the withTimeout decorator
    // new AutoDrive(driveSubsystem,0.5,  0.0).withTimeout(3),

    // new swerve auto
    // TODO: test to calibrate time and also direction (can switch to driveBackward)
    drivebase.driveForward().withTimeout(3),

    // Spin up the launcher for 0.75 second and then launch balls for 9.25 seconds, for a
    // total of 10 seconds
    new LaunchSequence(fuelSubsystem).withTimeout(10));


  }
}