package dad;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarRemplazar extends Application {

    private TextField buscarTextField, remplazarTextField;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button button1,button2,button3,button4,button5;
    private Label buscarLabel,remplazarLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {

        buscarTextField = new TextField();
        remplazarTextField = new TextField();

        buscarLabel = new Label("Buscar:");
        remplazarLabel = new Label("Remplazar con:");

        checkBox1 = new CheckBox();
        checkBox2 = new CheckBox();
        checkBox3 = new CheckBox();
        checkBox4 = new CheckBox();

        button1 = new Button("Buscar");
        button2 = new Button("Remplazar");
        button3 = new Button("Remplazar Todo");
        button4 = new Button("Cerrar");
        button5 = new Button("Ayuda");

        HBox labelTeBox1 = new HBox();
        labelTeBox1.getChildren().addAll(buscarLabel,buscarTextField);

        HBox labelTeBox2 = new HBox();
        labelTeBox2.getChildren().addAll(remplazarLabel,remplazarTextField);

        VBox labelField = new VBox(labelTeBox1,labelTeBox2);

        VBox buttons = new VBox();
        buttons.getChildren().addAll(button1,button2,button3,button4,button5);

        HBox ultimo = new HBox(labelField,buttons);
        ultimo.setAlignment(Pos.CENTER);

        Scene scene = new Scene(ultimo, 320, 280);

        primaryStage.setTitle("Buscar y Remplazar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}