package com.github.sourcecoed.hora;

import com.github.sourcecoed.hora.util.Display;

/**
 * Application launcher.
 * @author Sourcecoed
 */
public class Application {

    /**
     * Main entry point for the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Display: " + Display.getSize().width + "x" + Display.getSize().height);
    }

}
