package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class ChessField extends GraphicalObject {

    public ChessField(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0, 0, 0));
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if ((i + j) % 2 == 0) {
                    drawTool.setCurrentColor(new Color(255, 255, 255));
                } else {
                    drawTool.setCurrentColor(new Color(0, 0, 0));
                }
                double xPos = x + i * width;
                double yPos = y + j * height;
                drawTool.drawFilledRectangle(xPos, yPos, width, height);
            }
        }
    }
}