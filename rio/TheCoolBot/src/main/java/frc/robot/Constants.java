/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Controllers
    public static int controller_ButtonPanel = 0;
    public static int controller_DriverController = 1;
    public static int controller_DriverJoystick = 2;

    // Infrastructure Devices
    public static int inf_PCM = 0;

    // Drive Motors
    public static int drive_rightfront = 1;
    public static int drive_rightrear = 3;

    public static int drive_leftfront = 2;
    public static int drive_leftrear = 4;

    // Swerve Motors
    public static int swerve_leftdrive = 5;
    public static int swerve_rightdrive = 6;

    public static int swerve_leftpos = 7;
    public static int swerve_rightpos = 8;


}
