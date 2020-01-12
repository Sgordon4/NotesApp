package notesApp;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestApplication extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Initializing...");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Bruh");
        stage.show();

        Stage stage2 = new Stage();
        stage2.setTitle("Bribba");
        stage2.setAlwaysOnTop(true);
        stage2.setWidth(300);
        stage2.setHeight(600);

        stage2.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Closing up shop...");
    }
}
