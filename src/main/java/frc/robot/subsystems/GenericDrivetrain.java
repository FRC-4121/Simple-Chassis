/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import static frc.robot.Constants.DrivetrainConstants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.DriveWithJoysticksCommand;


public class GenericDrivetrain extends SubsystemBase {
  /**
   * Creates a new GenericDrivetrain.
   */
  
  public GenericDrivetrain() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  //Specific a default command
  public void initDefaultCommand() {
        
    //All drive trains have default command to drive with the joysticks
      setDefaultCommand(new DriveWithJoysticksCommand());
  }
  
  //Method for driving during Teleop - used for WCD
  public void drive(double leftJoyX, double leftJoyY, double rightJoyX, double rightJoyY) {}
  
  //Method for driving during Teleop - used for Mecanum
  public void drive(double rightJoyX, double rightJoyY, double rightJoyZ, boolean useGyro) {}

  //Method for driving during Autonomous - used for WCD
  public void autoDrive(double leftSpeed, double rightSpeed) {}

  //Method for driving during Autonomous - used for Mecanum
  public void autoDrive(double speed, double angle, double rotation) {}

}
