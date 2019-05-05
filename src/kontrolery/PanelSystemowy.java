package kontrolery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PanelSystemowy implements Initializable {

    @FXML
    private BorderPane borderPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void open(String nazwa) throws IOException {
        Parent noweOkno = FXMLLoader.load(getClass().getResource("/wyglad/"+nazwa+".fxml"));
        borderPane.setCenter(noweOkno);

    }
    @FXML
    private void openFaktury(ActionEvent event) throws IOException {
        open("faktury");

    }
    @FXML
    private void openZlecenia(javafx.event.ActionEvent event) throws IOException {

        open("zlecenia");


    }

    @FXML
    public void openMagazyn(ActionEvent event) throws IOException {
        open("Magazyn");

        event.getEventType();
    }

    @FXML
    public void openAdministracja(ActionEvent event) throws IOException {
        open("administracja");
    }
}
