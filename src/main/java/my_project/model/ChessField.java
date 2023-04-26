package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class ChessField extends GraphicalObject {

    public ChessField(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(0, 0, 0));
        for (int i = 0; i < 10; i++) {
            drawTool.drawFilledRectangle(0, 0, 60, 60);
        }
    }
}
