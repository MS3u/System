package kontrolery;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.awt.*;
import java.awt.event.ActionEvent;
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

@FXML
    private void openZlecenia(javafx.event.ActionEvent event) throws IOException {

        Parent zlecenia = FXMLLoader.load(getClass().getResource("/wyglad/zlecenia.fxml"));
        borderPane.setCenter(zlecenia);




    }


}
