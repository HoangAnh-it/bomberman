package uet.gryffindor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uet.gryffindor.game.engine.TimeCounter;
import uet.gryffindor.sound.SoundController;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/** JavaFX App. */
public class GameApplication extends Application {
  private static Scene scene;

  @Override
  public void start(Stage stage) throws IOException {
    //scene = new Scene(loadFXML("WinScene"));
    scene = new Scene(loadFXML("menu"));
    SoundController.INSTANCE.getSound(SoundController.MENU).loop();
    stage.setScene(scene);
    stage.show();
  }

  public static void setRoot(String fxml) {
    try {
      scene.setRoot(loadFXML(fxml));
    } catch (IOException e) {
      System.out.println("Can not load resource from fxml: " + e.getMessage());
    }
  }

  private static Parent loadFXML(String fxml) throws IOException {
    return FXMLLoader.load(GameApplication.class.getResource(fxml + ".fxml"));
  }

  public static void main(String[] args) {
    launch(args);
  }
}
