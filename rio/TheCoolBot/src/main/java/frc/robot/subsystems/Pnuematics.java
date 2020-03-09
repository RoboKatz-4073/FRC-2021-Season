package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import frc.robot.Constants;

public class Pnuematics {

    public static Compressor m_compressor;

    public Pnuematics() {

        m_compressor = new Compressor(Constants.inf_PCM);

    }

}