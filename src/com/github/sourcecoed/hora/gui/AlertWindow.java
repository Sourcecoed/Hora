package com.github.sourcecoed.hora.gui;

import com.github.sourcecoed.hora.util.Display;
import com.github.sourcecoed.hora.util.Palette;

import javax.swing.*;
import java.awt.*;

/**
 * Screen overly that indicates an alert.
 * @author Sourcecoed
 */
public class AlertWindow extends JWindow {

    /**
     * Opacity of the color overlay.
     */
    private float opacity = 0;

    /**
     * Static test method.
     * @param args Command line arguments
     */
    public static void main(String[] args) throws Exception {
        AlertWindow window = new AlertWindow();
        window.setVisible(true);
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 15000) {
            window.opacity = (System.currentTimeMillis() - start) / 15000f;
            window.repaint();
            Thread.yield();
        }
        window.setVisible(false);
        window.dispose();
    }

    /**
     * Constructs a window to transparently overlay the entire screen.
     */
    public AlertWindow() {
        setAlwaysOnTop(true);
        setSize(Display.getSize());
        setLocationRelativeTo(null);
        setBackground(Palette.TRANSPARENT);
    }

    /**
     * Paints the render to the screen.
     * @param g Graphics context to paint to
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.setComposite(AlphaComposite.Clear);
        graphics.fill(Display.getBounds());
        graphics.setComposite(AlphaComposite.Src);
        graphics.setColor(Palette.deriveTransparent(Palette.AMBER, opacity));
        graphics.fill(Display.getBounds());
        graphics.setComposite(AlphaComposite.Clear);
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.fillOval(Display.getMouseX() - 10, Display.getMouseY() - 10, 20, 20);
    }

}
