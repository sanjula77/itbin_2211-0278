
package View;

import javax.swing.*;
import java.awt.*;

public class RoundedPanel extends JPanel {

    private Color backgroundColor;
    private Color gradientColor1 = new Color(176, 196, 222); // Default gradient start color
    private Color gradientColor2 = new Color(176, 196, 222); // Default gradient end color
    private int cornerRadius = 50;

    public RoundedPanel() {
        super();
        setOpaque(false);
        backgroundColor = getBackground();
    }

    public RoundedPanel(int radius) {
        super();
        setOpaque(false);
        cornerRadius = radius;
        backgroundColor = getBackground();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the gradient background
        GradientPaint gradientPaint = new GradientPaint(0, 0, gradientColor1, width, height, gradientColor2);
        graphics.setPaint(gradientPaint);
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

        // Comment out or remove the following line to remove the border
        // graphics.setColor(getForeground());
        // graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        backgroundColor = bg;
    }

    public void setCornerRadius(int radius) {
        cornerRadius = radius;
        repaint();
    }

    public void setGradientColors(Color color1, Color color2) {
        this.gradientColor1 = color1;
        this.gradientColor2 = color2;
        repaint();
    }
}

