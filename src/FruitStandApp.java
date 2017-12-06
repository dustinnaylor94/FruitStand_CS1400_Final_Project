/**
 * Created by dustm on 12/4/2017.
 */
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.*;

import javax.swing.*;

public class FruitStandApp extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch(args);
    }
    Button checkout = new Button("Checkout");
    Apple appleItem = new Apple();
    Banana bananaItem = new Banana();
    Blueberry blueberryItem = new Blueberry();
    Mango mangoItem = new Mango();
    Orange orangeItem = new Orange();
    Strawberry strawberryItem = new Strawberry();
    ShoppingCart cart = new ShoppingCart();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Fruit Stand");
        GridPane grid =new GridPane();
        grid.setHgap(10);
        grid.setVgap(50);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Label apple = new Label("Apple");
        GridPane.setConstraints(apple, 0, 0);

        ComboBox<Integer> appleBox = new ComboBox<Integer>();
        appleBox.setValue(0);
        appleBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(appleBox, 1, 0);

        Label banana = new Label("Banana");
        GridPane.setConstraints(banana, 0, 1);

        ComboBox<Integer> bananaBox = new ComboBox<Integer>();
        bananaBox.setValue(0);
        bananaBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(bananaBox, 1, 1);

        Label blueberry = new Label("Blueberries");
        GridPane.setConstraints(blueberry, 0, 2);

        ComboBox<Integer> blueberryBox = new ComboBox<Integer>();
        blueberryBox.setValue(0);
        blueberryBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(blueberryBox, 1, 2);

        Label mango = new Label("Mango");
        GridPane.setConstraints(mango, 2, 0);

        ComboBox<Integer> mangoBox = new ComboBox<Integer>();
        mangoBox.setValue(0);
        mangoBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(mangoBox, 3, 0);

        Label orange = new Label("Orange");
        GridPane.setConstraints(orange, 2, 1);

        ComboBox<Integer> orangeBox = new ComboBox<Integer>();
        orangeBox.setValue(0);
        orangeBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(orangeBox, 3, 1);

        Label strawberry = new Label("Strawberry");
        GridPane.setConstraints(strawberry, 2, 2);

        ComboBox<Integer> strawberryBox = new ComboBox<Integer>();
        strawberryBox.setValue(0);
        strawberryBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        GridPane.setConstraints(strawberryBox, 3, 2);


        checkout.setOnAction(this);
        GridPane.setConstraints(checkout, 3, 3);

        appleBox.setOnAction(t -> setFruitAmounts(appleBox.getValue(), bananaBox.getValue(), blueberryBox.getValue(), mangoBox.getValue(), orangeBox.getValue(), strawberryBox.getValue()));
        bananaBox.setOnAction(t -> setFruitAmounts(appleBox.getValue(), bananaBox.getValue(), blueberryBox.getValue(), mangoBox.getValue(), orangeBox.getValue(), strawberryBox.getValue()));
        blueberryBox.setOnAction(t -> setFruitAmounts(appleBox.getValue(), bananaBox.getValue(), blueberryBox.getValue(), mangoBox.getValue(), orangeBox.getValue(), strawberryBox.getValue()));
        mangoBox.setOnAction(t -> setFruitAmounts(appleBox.getValue(), bananaBox.getValue(), blueberryBox.getValue(), mangoBox.getValue(), orangeBox.getValue(), strawberryBox.getValue()));
        orangeBox.setOnAction(t -> setFruitAmounts(appleBox.getValue(), bananaBox.getValue(), blueberryBox.getValue(), mangoBox.getValue(), orangeBox.getValue(), strawberryBox.getValue()));
        strawberryBox.setOnAction(t -> setFruitAmounts(appleBox.getValue(), bananaBox.getValue(), blueberryBox.getValue(), mangoBox.getValue(), orangeBox.getValue(), strawberryBox.getValue()));



        grid.getChildren().addAll(apple, appleBox, banana, bananaBox, blueberry, blueberryBox, mango, mangoBox, orange, orangeBox, strawberry, strawberryBox, checkout);
        Scene scene = new Scene(grid, 350, 300);
        primaryStage.setScene(scene);

        primaryStage.show();



    }

    @Override
    public void handle(ActionEvent event) {

        if(event.getSource()==checkout){

            JOptionPane.showMessageDialog(null, "Receipt Printed in receipt.txt");
        }
    }
    public void setFruitAmounts(int appleAmount, int bananaAmount, int blueberryAmount, int mangoAmount, int orangeAmount, int strawberryAmount){

        appleItem.setAmount(appleAmount);
        bananaItem.setAmount(bananaAmount);
        blueberryItem.setAmount(blueberryAmount);
        mangoItem.setAmount(mangoAmount);
        orangeItem.setAmount(orangeAmount);
        strawberryItem.setAmount(strawberryAmount);

    }
}
