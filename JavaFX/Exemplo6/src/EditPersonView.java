import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EditPersonView {
    private Stage dialogStage;
    private AnchorPane anchorPane;
    private GridPane gridDetails;
    private Label lblFirstName;
    private Label lblLastName;
    private Label lblEmail;
    private TextField txtFirstName;
    private TextField txtLastName;
    private TextField txtEmail;
    private Button btnOk;
    private Button btnCancel;
    private ButtonBar barBtns;

    private ContactsController controller;

    public EditPersonView(ContactsController controller) {
        this.controller = controller;
    }

    public Parent asParent() {
        return anchorPane;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    private void createAndConfigureView() {
        anchorPane = new AnchorPane();
        anchorPane.prefHeight(270);
        anchorPane.prefWidth(413);
        gridDetails = new GridPane();
        lblFirstName = new Label("Email:");
        lblLastName = new Label("First Name:");
        lblEmail = new Label("Last Name:");
        txtEmail = new TextField();
        txtFirstName = new TextField();
        txtLastName = new TextField();
        gridDetails.add(lblEmail,0,0);
        gridDetails.add(txtEmail,1,0);
        gridDetails.add(lblFirstName,0,1);
        gridDetails.add(txtFirstName,1,1);
        gridDetails.add(lblLastName,0,2);
        gridDetails.add(txtLastName,1,2);
        barBtns = new ButtonBar();
        btnOk = new Button("OK");
        btnCancel = new Button("Cancel");
        btnCancel.setOnAction(e -> handleCancel());
        barBtns.getButtons().addAll(btnOk,btnCancel);
        anchorPane.getChildren().addAll(gridDetails,barBtns);
        AnchorPane.setLeftAnchor(gridDetails,10.0);
        AnchorPane.setRightAnchor(gridDetails,10.0);
        AnchorPane.setTopAnchor(gridDetails,10.0);
        AnchorPane.setBottomAnchor(barBtns,10.0);
        AnchorPane.setRightAnchor(barBtns,10.0);
    }

    private void handleCancel() {
        dialogStage.close();
    }

    private void handleOK() {

    }
}
