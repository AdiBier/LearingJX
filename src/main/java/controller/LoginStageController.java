package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import service.ButtonService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginStageController implements Initializable, ButtonService {

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonArrow;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("To jest handler");
            }
        };

        buttonLogin.addEventHandler(ActionEvent.ACTION, handler);

        EventHandler<MouseEvent> mouseEventEventHandler = event -> {
            System.out.println("To jest mouse handler");
        };
        buttonLogin.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseEventEventHandler);

        buttonLogin.setOnAction(event -> {
            System.out.println("To jest handler on");
            buttonLogin.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseEventEventHandler);
        });

//        buttonArrow.setOnAction(event -> {
//            buttonArrow.getClass().getResource("/HomeStage.fxml");
//        });
    }

    @Override
    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent homeStageParent = FXMLLoader.load(getClass().getResource("/HomeStage.fxml"));
        Scene homeStageScene = new Scene(homeStageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeStageScene);
        window.show();
    }
}
