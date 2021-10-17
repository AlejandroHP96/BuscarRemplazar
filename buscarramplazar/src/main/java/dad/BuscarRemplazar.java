package dad;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarRemplazar extends Application {

    private TextField buscarTextField, remplazarTextField;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private Button button1,button2,button3,button4,button5;

    @Override
    public void start(Stage primaryStage) throws Exception {

        buscarTextField = new TextField();

        remplazarTextField = new TextField();

        checkBox1 = new CheckBox("Mayúsculas y minúsculas");
        checkBox2 = new CheckBox("Buscar hacia atras");
        checkBox3 = new CheckBox("Expresión regular");
        checkBox4 = new CheckBox("Resaltar resultados");

        button1 = new Button("Buscar");
        button2 = new Button("Remplazar");
        button3 = new Button("Remplazar Todo");
        button4 = new Button("Cerrar");
        button5 = new Button("Ayuda");

        GridPane labeltextbox =new GridPane();
        labeltextbox.setGridLinesVisible(true);
        labeltextbox.setHgap(5);
        labeltextbox.setVgap(5);
        labeltextbox.setPadding(new Insets(5));
        labeltextbox.addRow(0,new Label("Buscar: "), buscarTextField);
        labeltextbox.addRow(1,new Label("Remplazar con : "), remplazarTextField);
        labeltextbox.addRow(2,checkBox1,checkBox2);
        labeltextbox.addRow(3,checkBox3,checkBox4);

        GridPane.setColumnSpan(buscarTextField, 2);
		GridPane.setColumnSpan(remplazarTextField, 2);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),	
				new ColumnConstraints(),	
				new ColumnConstraints()
			};
		labeltextbox.getColumnConstraints().setAll(cols);

        RowConstraints[] rows ={
            new RowConstraints(),
            new RowConstraints(),
            new RowConstraints(),
            new RowConstraints()
        };
        labeltextbox.getRowConstraints().setAll(rows);

        VBox buttons = new VBox();
        buttons.setPrefWidth(100);

        button1.setMinWidth(buttons.getPrefWidth());
        button2.setMinWidth(buttons.getPrefWidth());
        button3.setMinWidth(buttons.getPrefWidth());
        button4.setMinWidth(buttons.getPrefWidth());
        button5.setMinWidth(buttons.getPrefWidth());
        buttons.getChildren().addAll(button1,button2,button3,button4,button5);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(5));
        root.setLeft(labeltextbox);
        root.setRight(buttons);

        Scene scene = new Scene(root, 550, 280);

        primaryStage.setTitle("Buscar y Remplazar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}