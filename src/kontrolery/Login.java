package kontrolery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Login {

@FXML
    public void rejestracja(MouseEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/wyglad/rejestracja.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Node node = (Node) event.getSource();
        Stage stage = (Stage)  node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void openPanelSystemowy(ActionEvent event) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/wyglad/panelSystemowy.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Node node = (Node) event.getSource();
        Stage stage = (Stage)  node.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}

