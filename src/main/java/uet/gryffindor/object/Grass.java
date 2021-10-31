package uet.gryffindor.object;

import uet.gryffindor.base.GameObject;
import uet.gryffindor.base.OrderedLayer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Grass extends GameObject {
  @Override
  public void start() {
    this.position.setValue(300, 300);
    this.orderedLayer = OrderedLayer.BACKGROUND;
    this.collider.setEnable(false);
  }

  @Override
  public void update() {
    // TODO Auto-generated method stub

  }

  @Override
  public void render(GraphicsContext context) {
    context.setFill(Color.GREEN);
    context.fillRect(position.x, position.y, dimension.x, dimension.y);
  }
}