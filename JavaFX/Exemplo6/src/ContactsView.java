import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class ContactsView {
    private Contacts model;
    private ContactsController controller;

    private BorderPane borderPane;
    private AnchorPane anchorPane;
    private SplitPane splitPane;
    private AnchorPane leftPane;
    private AnchorPane rightPane;
    private TableView<Person> personTable;
    private TableColumn firstNameCol;
    private TableColumn lastNameCol;
    private TableColumn emailCol;
    private Label lblFirstName;
    private Label lblLastName;
    private Label lblEmail;
    private Label txtFirstName;
    private Label txtLastName;
    private Label txtEmail;
    private GridPane gridDetails;
    private ButtonBar barBtns;
    private Button btnNew;
    private Button btnEdit;
    private Button btnDelete;

    public ContactsView(ContactsController controller, Contacts model) {
        this.controller = controller;
        this.model = model;
        createAndConfigureView();
        configureTableObserver();
        observeModelAndUpdateControls();
    }

    public Parent asParent() {
        return borderPane;
    }

    private void createAndConfigureView() {
        personTable = new TableView<>();
        emailCol = new TableColumn();
        emailCol.setText("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        emailCol.setPrefWidth(75.0);
        firstNameCol = new TableColumn();
        firstNameCol.setText("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        firstNameCol.setPrefWidth(75.0);
        lastNameCol = new TableColumn();
        lastNameCol.setText("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        lastNameCol.setPrefWidth(75.0);
        personTable.getColumns().addAll(emailCol,firstNameCol,lastNameCol);
        personTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        personTable.setItems(model.getList());

        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        anchorPane.prefHeight(800);
        anchorPane.prefWidth(600);

        splitPane = new SplitPane();
        splitPane.prefHeight(800);
        splitPane.prefWidth(600);
        anchorPane.getChildren().add(splitPane);
        AnchorPane.setLeftAnchor(splitPane,0.0);
        AnchorPane.setRightAnchor(splitPane,0.0);
        AnchorPane.setTopAnchor(splitPane,0.0);
        AnchorPane.setBottomAnchor(splitPane,0.0);

        leftPane = new AnchorPane();
        leftPane.getChildren().add(personTable);
        AnchorPane.setLeftAnchor(personTable,0.0);
        AnchorPane.setRightAnchor(personTable,0.0);
        AnchorPane.setTopAnchor(personTable,0.0);
        AnchorPane.setBottomAnchor(personTable,0.0);

        rightPane = new AnchorPane();
        gridDetails = new GridPane();
        lblFirstName = new Label("Email:");
        lblLastName = new Label("First Name:");
        lblEmail = new Label("Last Name:");
        txtFirstName = new Label();
        txtLastName = new Label();
        txtEmail = new Label();
        gridDetails.add(lblEmail,0,0);
        gridDetails.add(txtEmail,1,0);
        gridDetails.add(lblFirstName,0,1);
        gridDetails.add(txtFirstName,1,1);
        gridDetails.add(lblLastName,0,2);
        gridDetails.add(txtLastName,1,2);
        barBtns = new ButtonBar();
        btnNew = new Button("New...");
        btnEdit = new Button("Edit...");
        btnDelete = new Button("Delete");
        barBtns.getButtons().addAll(btnNew,btnEdit,btnDelete);
        rightPane.getChildren().addAll(gridDetails,barBtns);
        AnchorPane.setLeftAnchor(gridDetails,5.0);
        AnchorPane.setRightAnchor(gridDetails,5.0);
        AnchorPane.setTopAnchor(gridDetails,5.0);
        AnchorPane.setBottomAnchor(barBtns,10.0);
        AnchorPane.setRightAnchor(barBtns,10.0);

        splitPane.getItems().addAll(leftPane,rightPane);
        borderPane.setCenter(anchorPane);
    }

    private void configureTableObserver() {
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    controller.getSelectedPerson().setEmail(newValue.getEmail());
                    controller.getSelectedPerson().setFirstName(newValue.getFirstName());
                    controller.getSelectedPerson().setLastName(newValue.getLastName());
                }
                //(observable, oldValue, newValue) -> showPersonDetails(newValue)
        );
    }

    private void observeModelAndUpdateControls() {
        Person person = controller.getSelectedPerson();
        person.emailProperty().addListener(
                (observable, oldValue, newValue) -> updateIfNeeded(newValue,txtEmail)
        );
        person.firstNameProperty().addListener(
                (observable, oldValue, newValue) -> updateIfNeeded(newValue,txtFirstName)
        );
        person.lastNameProperty().addListener(
                (observable, oldValue, newValue) -> updateIfNeeded(newValue,txtLastName)
        );
    }

    private void updateIfNeeded(String value, Label field) {
        if (! field.getText().equals(value)) {
            field.setText(value);
        }
    }

    private void handleNewPerson() {

    }

    private void handleEditPerson() {
        Person person = new Person();

    }
}
