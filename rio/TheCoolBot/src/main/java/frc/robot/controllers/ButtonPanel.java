package frc.robot.controllers;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;
import frc.robot.subsystems.LED;
import frc.robot.subsystems.Pnuematics;

public class ButtonPanel {

    public static Joystick m_buttonpanel;

    // Switches
    public static int m_compressorSwitch = 1;
    public static int m_ledSwitch = 2;

    // Buttons
    public static int m_checkSwitches = 0;

    /**
     * Constructor for testing 
     * Adds user-defined panel controller port
     * 
     * @param code
     */
    public ButtonPanel(int code) {

        // Set up controller
        m_buttonpanel = new Joystick(code);

    }

    /**
     * Default constructor
     * Adds default button panel controller port
     */
    public ButtonPanel() {

        // Set up controller
        m_buttonpanel = new Joystick(Constants.controller_ButtonPanel);

    }

    public void checkInputs() {

        // Check buttons

        if (m_buttonpanel.getRawButton(m_checkSwitches)) {

            // Check on-off switches
            checkSwitches();

        }



    }

    public static void checkSwitches() {

        // If-Else statments for every option

        // Compressor power switch
        if (m_buttonpanel.getRawButton(m_compressorSwitch)) {

            // Start compressor
            Pnuematics.m_compressor.start();


        } else if (Pnuematics.m_compressor.enabled()){

            // Stop compressor if it is active
            Pnuematics.m_compressor.stop();

        }

        // LED Lights
        if (m_buttonpanel.getRawButton(m_ledSwitch)) {

            // Turn on lights

        } else if (LED.ledEnable) {

            // Turn off lights
            
        }

    }


}