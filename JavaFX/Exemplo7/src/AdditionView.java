import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class AdditionView {
    private GridPane grid;
    private TextField txtX;
    private TextField txtY;
    private Label lblSum;
    private Button btnSum;
    private AdditionController controller;
    private AdditionModel model;

    public AdditionView(AdditionController controller, AdditionModel model) {
        this.controller = controller;
        this.model = model;
        createAndConfigurePane();
        createAndLayoutControls();
        configureHandlers();
    }

    public Parent asParent() {
        return grid;
    }

    private void createAndConfigurePane() {
        grid = new GridPane();
        ColumnConstraints leftCol = new ColumnConstraints();
        leftCol.setHalignment(HPos.RIGHT);
        leftCol.setHgrow(Priority.NEVER);
        ColumnConstraints rightCol = new ColumnConstraints();
        rightCol.setHgrow(Priority.SOMETIMES);
        grid.getColumnConstraints().addAll(leftCol, rightCol);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(10);
    }

    private void createAndLayoutControls() {
        txtX = new TextField();
        txtY = new TextField();
        lblSum = new Label();
        btnSum = new Button("Sum");
        grid.addRow(0, new Label("X:"), txtX);
        grid.addRow(1, new Label("Y:"), txtY);
        grid.addRow(2, new Label("Sum:"), lblSum);
        grid.addRow(3,btnSum);
    }

    private void configureHandlers() {
        btnSum.setOnAction(e -> {
            controller.upadteX(txtX.getText());
            controller.upadteY(txtY.getText());
            lblSum.setText(String.format("%d",controller.getSum()));
        });
    }
}
