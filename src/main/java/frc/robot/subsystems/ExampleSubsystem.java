/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Command;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
    TalonSRX motor;
    public ExampleSubsystem() {
      motor = new TalonSRX(8);
    }

    public void runMotor() {

      motor.set(ControlMode.PercentOutput, 0.5);
     
    }
    public void done() {

      motor.set(ControlMode.PercentOutput, 0);
     
    }
  public void initDefaultCommand() {

    
    
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
