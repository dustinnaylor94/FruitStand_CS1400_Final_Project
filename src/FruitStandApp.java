/**
 * Created by dustm on 12/4/2017.
 */
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.*;

public class FruitStandApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Fruit Stand");
        Group root = new Group();
        GridPane grid =new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Label apple = new Label("Apple");
        GridPane.setConstraints(apple, 0, 0);

        ComboBox<Integer> a = new ComboBox<Integer>();
        a.setValue(0);
        a.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(a, 1, 0);

        grid.getChildren().addAll(apple, a);
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
