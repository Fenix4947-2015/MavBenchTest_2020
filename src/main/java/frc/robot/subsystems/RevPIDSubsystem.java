/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class RevPIDSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  CANSparkMax motor;
  CANPIDController pid;
  public RevPIDSubsystem() {
    motor = new CANSparkMax(1, MotorType.kBrushless);
    pid = new CANPIDController(motor);
    pid.setP(5e-5);
    pid.setI(1e-6);
    pid.setD(0);
    pid.setIZone(0);
    pid.setFF(0);
    
    pid.setOutputRange(-5700, 5700);
  }

  
  public void goToPosition(double position) {

    pid.setReference(position, ControlType.kPosition);
   
  }

    
  public void goToRPM(double RPM) {

    pid.setReference(RPM, ControlType.kVelocity);
   
  }

  public void done() {

   
  }
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
