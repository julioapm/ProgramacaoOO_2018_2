import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
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
        observeModelAndUpdateControls();
        updateControllerFromListeners();
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
        //btnSum = new Button("Sum");
        grid.addRow(0, new Label("X:"), txtX);
        grid.addRow(1, new Label("Y:"), txtY);
        grid.addRow(2, new Label("Sum:"), lblSum);
        //grid.addRow(3,btnSum);
    }

    private void observeModelAndUpdateControls() {
        model.xProperty().addListener((obs, oldX, newX) ->
                updateIfNeeded(newX, txtX));
        model.yProperty().addListener((obs, oldY, newY) ->
                updateIfNeeded(newY, txtY));
        lblSum.textProperty().bind(model.sumProperty().asString());
    }

    private void updateIfNeeded(Number value, TextField field) {
        String s = value.toString() ;
        if (! field.getText().equals(s)) {
            field.setText(s);
        }
    }

    private void updateControllerFromListeners() {
        txtX.textProperty().addListener((obs, oldText, newText) -> controller.updateX(newText));
        txtY.textProperty().addListener((obs, oldText, newText) -> controller.updateY(newText));
    }
}
