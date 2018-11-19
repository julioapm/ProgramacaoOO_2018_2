import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacao extends Application {
    Contacts model;
    ContactsController controller;
    ContactsView view;

    @Override
    public void init() throws Exception {
        super.init();
        model = new Contacts();
        model.add(new Person("John","Doe", "john.doe@mail.com"));
        model.add(new Person("Mary","Doe", "mary.doe@mail.com"));
        controller = new ContactsController(model);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        view = new ContactsView(controller,model);
        Scene scene = new Scene(view.asParent(),800,600);
        primaryStage.setTitle("My Contacts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
