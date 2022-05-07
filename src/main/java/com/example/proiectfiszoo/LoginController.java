package com.example.proiectfiszoo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.io.File;

public class LoginController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView foxImageView;
    @FXML
    private ImageView giraffeImageView;
    @FXML
    private TextField enterUsernameField;
    @FXML
    private PasswordField enterPasswordField;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile= new File("ProiectFis/tiger (2).jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File foxFile= new File("ProiectFis/fox.png");
        Image foxImage = new Image(foxFile.toURI().toString());
        foxImageView.setImage(foxImage);

        File giraffeFile= new File("ProiectFis/giraffe.png");
        Image giraffeImage = new Image(giraffeFile.toURI().toString());
        giraffeImageView.setImage(giraffeImage);
    }
    public void login(ActionEvent event)
    {

        if(enterUsernameField.getText().isBlank()==false && enterPasswordField.getText().isBlank()==false)
        {
            validateLogin();
            ///loginMessageLabel.setText("Ai incercat sa te autentifici");
        }
        else
        {
            loginMessageLabel.setText("Te rog introdu numele de utilizator si parola!");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void validateLogin() {

    }
}