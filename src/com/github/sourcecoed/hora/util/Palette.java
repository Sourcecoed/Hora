package com.github.sourcecoed.hora.util;

import java.awt.*;

/**
 * Color manipulation utilities and constants.
 * @author Sourcecoed
 */
public class Palette {

    public static final Color TRANSPARENT = new Color(0, 0, 0, 0);
    public static final Color AMBER = Color.decode("#FF7E00");

    /**
     * Creates a new transparent color from another given color.
     * @param color Original opaque {@link Color}
     * @param opacity Opacity of the new {@link Color}
     * @return Newly derived transparent {@link Color}
     */
    public static Color deriveTransparent(Color color, float opacity) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) (opacity * 255));
    }

}
