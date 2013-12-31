/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.plasmarobotics.jim;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;


/**
 *This class controls the drive system 
 * @author Jim
 */

public class FroboDrive {
    
    Joystick leftJoystick,
            rightJoystick;
   
    RobotDrive chassis;
     
    /**
     * Used to create a FroboDrive object to control all driving controls
     * 
     * @param leftJoystick Left joystick for tank drive
     * @param rightJoystick Right joystick for tank drive
     * @param frobo Instance of the main class
     */
    public FroboDrive(Joystick leftJoystick, Joystick rightJoystick, Frobo frobo){
        //Binds the joysticks...
        this.leftJoystick = frobo.getLeftJoystick();
        this.rightJoystick = frobo.getRightJoystick();
        
        //Creates a RobotDrive...
        chassis = new RobotDrive(Constants.FRONT_LEFT_DRIVE_PORT, 
                Constants.BACK_LEFT_DRIVE_PORT, 
                Constants.FRONT_RIGHT_DRIVE_PORT, 
                Constants.BACK_RIGHT_DRIVE_PORT);
        
    }
    
    /*
     * called periodically during teleop to control the robot
     */
    public void update(){
        chassis.tankDrive(leftJoystick, rightJoystick);
        
    }
    
}
