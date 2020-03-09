package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Constants;

public class Drivetrain {

    public static Talon m_rightfront;
    public static Talon m_rightrear;

    public static Talon m_leftfront;
    public static Talon m_leftrear;

    public static Talon m_rightswervedrive;
    public static Talon m_leftswervedrive;

    public static VictorSP m_rightswervepos;
    public static VictorSP m_leftswervepos;

    public Drivetrain() {

        m_rightfront = new Talon(Constants.drive_rightfront);
        m_rightrear = new Talon(Constants.drive_rightrear);

        m_leftfront = new Talon(Constants.drive_leftfront);
        m_leftrear = new Talon(Constants.drive_leftrear);

        m_rightswervedrive = new Talon(Constants.swerve_rightdrive);
        m_leftswervedrive = new Talon(Constants.swerve_leftdrive);

        m_rightswervepos = new VictorSP(Constants.swerve_rightpos);
        m_leftswervepos = new VictorSP(Constants.swerve_leftpos);


    }

    public void stop() {


    }

    public void alignWheels() {

        // Aligns swerve wheels with main wheels
    }
    
}