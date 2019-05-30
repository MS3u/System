package kontrolery;

import hybernate.UsersEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.main.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.*;
import java.io.IOException;

public class Rejestracja {

    private TextField tfimie;
    private TextField tfnazwisko;
    private TextField tfstanowisko;
    private PasswordField tfhaslo;

    @FXML
    public void powrot(ActionEvent event) {
        Parent root = null;
        try {
              root = FXMLLoader.load(getClass().getResource("/wyglad/login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Node node = (Node) event.getSource();
        Stage stage = (Stage)  node.getScene().getWindow();
        assert root != null;
        stage.setScene(new Scene(root));

    }
    @FXML


    public void rejestracja(ActionEvent event) {
        String imie = tfimie.getText();
        String nazwisko = tfnazwisko.getText();
        String stanowisko = tfstanowisko.getText();
        String haslo = tfhaslo.getText();

        SessionFactory sessionFactory;
        sessionFactory= (SessionFactory) new Configuration().configure().buildSessionFactory();
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UsersEntity usersEntity = new UsersEntity(imie, nazwisko, stanowisko, haslo);
        session.save(usersEntity);
        transaction.commit();
        session.close();

    }
}


