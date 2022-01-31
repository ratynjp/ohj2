package fxElokuva;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author Opiskelu
<<<<<<< HEAD
 * @version 26.1.2022
=======
 * @version 31.1.2022
>>>>>>> tyo2
 *
 */
public class ElokuvakirjastoMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("ElokuvakirjastoGUIView.fxml"));
            final Pane root = ldr.load();
            //final ElokuvakirjastoGUIController elokuvakirjastoCtrl = (ElokuvakirjastoGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("elokuvakirjasto.css").toExternalForm());
            primaryStage.setScene(scene);
<<<<<<< HEAD
            primaryStage.setTitle("elokuvakirjasto");
=======
            primaryStage.setTitle("Elokuvakirjasto");
>>>>>>> tyo2
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei käytössä
     */
    public static void main(String[] args) {
        launch(args);
    }
}