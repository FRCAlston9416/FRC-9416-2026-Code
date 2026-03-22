// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.concurrent.TimeUnit;

import com.revrobotics.spark.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.measure.Time;
import swervelib.math.Matter;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity. 
 */
public final class Constants {

  // public static final class DriveConstants {
  //   // Motor controller IDs for drivetrain motors
  //   public static final int LEFT_LEADER_ID = 1;
  //   public static final int LEFT_FOLLOWER_ID = 3;
  //   public static final int RIGHT_LEADER_ID = 2;
  //   public static final int RIGHT_FOLLOWER_ID = 4;

  public static final double ROBOT_MASS = (81.7) * 0.45359237; // 80 lbs * kg per pound
  public static final Matter CHASSIS    = new Matter(new Translation3d(0, 0, Units.inchesToMeters(8)), ROBOT_MASS); // not sure what this is for exactly
  public static final double LOOP_TIME  = 0.13; //s, 20ms + 110ms sprk max velocity lag
  public static final double MAX_SPEED  = Units.feetToMeters(14.5); // seems fast but no dent in floor yet lol
    
  // block

    public static final class DrivebaseConstants
  {


    // Current limit for drivetrain motors. 60A is a reasonable maximum to reduce
    // likelihood of tripping breakers or damaging CIM motors
    public static final int DRIVE_MOTOR_CURRENT_LIMIT = 60;
    public static final double WHEEL_LOCK_TIME = 0.5;//Time.ofBaseUnits(0.5, Units.Seconds); //TODO CONVERT DOUBLE TO TIME OBJECT (0.5 seconds)
    // https://github.wpilib.org/allwpilib/docs/release/java/edu/wpi/first/units/measure/Time.html
  }

  public static final class FuelConstants {
    // Motor controller IDs for Fuel Mechanism motors
    public static final int LEFT_INTAKE_LAUNCHER_MOTOR_ID = 12;
    public static final int RIGHT_INTAKE_LAUNCHER_MOTOR_ID = 10; // add ID to this hi guys
    public static final int INDEXER_MOTOR_ID = 9;

    // Current limit for fuel mechanism motors.
    public static final int INDEXER_MOTOR_CURRENT_LIMIT = 90;
    public static final int LAUNCHER_MOTOR_CURRENT_LIMIT = 90;

    // All values likely need to be tuned based on your robot
    public static final double INDEXER_INTAKING_PERCENT = 0.8; 
    public static final double INDEXER_LAUNCHING_PERCENT = -1;
    public static final double INDEXER_SPIN_UP_PRE_LAUNCH_PERCENT = 0.2;

    public static final double INTAKE_INTAKING_PERCENT = -0.6;
    public static final double LAUNCHING_LAUNCHER_PERCENT = -1.0;
    public static final double INTAKE_EJECT_PERCENT = 0.80;
    public static final double SPIN_UP_SECONDS = 1.4;
  }

  public static final class ClimbConstatns {
    // Motor controller IDs for Climb motor
    public static final int CLIMBER_MOTOR_ID = 11;

    // Current limit for climb motor
    public static final int CLIMBER_MOTOR_CURRENT_LIMIT = 40;
    // Percentage to power the motor both up and down
    public static final double CLIMBER_MOTOR_DOWN_PERCENT = -0.8;
    public static final double CLIMBER_MOTOR_UP_PERCENT = 0.8;
  }

  public static final class OperatorConstants {
  

    // Joystick Deadband
    public static final double DEADBAND        = 0.1;
    public static final double LEFT_Y_DEADBAND = 0.1;
    public static final double RIGHT_X_DEADBAND = 0.1;
    public static final double TURN_CONSTANT    = 6;
  }


    // Port constants for driver and operator controllers. These should match the
    // values in the Joystick tab of the Driver Station software
    // public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int OPERATOR_CONTROLLER_PORT = 1;

    // This value is multiplied by the joystick value when rotating the robot to
    // help avoid turning too fast and beign difficult to control
    // public static final double DRIVE_SCALING = 0.7;
    // public static final double ROTATION_SCALING = 0.8;
  } 

