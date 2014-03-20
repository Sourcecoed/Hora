package com.github.sourcecoed.hora.util;

import java.awt.*;

/**
 * Utilities for managing the display.
 * @author Sourcecoed
 */
public class Display {

    private static final GraphicsEnvironment ENVIRONMENT = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private static final DisplayMode MODE = ENVIRONMENT.getDefaultScreenDevice().getDisplayMode();

    /**
     * Returns the width and height of the current display.
     * @return Size of the screen as a {@link Dimension}
     */
    public static Dimension getSize() {
        return new Dimension(MODE.getWidth(), MODE.getHeight());
    }

    /**
     * Returns the bounds of the current display.
     * @return Size and location of the screen as a {@link Rectangle}
     */
    public static Rectangle getBounds() {
        return new Rectangle(getSize());
    }

    /**
     * Returns the horizontal offset of the mouse.
     * @return Mouse x coordinate
     */
    public static int getMouseX() {
        return MouseInfo.getPointerInfo().getLocation().x;
    }

    /**
     * Returns the vertical offset of the mouse.
     * @return Mouse y coordinate
     */
    public static int getMouseY() {
        return MouseInfo.getPointerInfo().getLocation().y;
    }

}
