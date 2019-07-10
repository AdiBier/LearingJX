package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginStageController implements Initializable {

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

        buttonArrow.setOnAction(event -> {
            buttonArrow.getClass().getResource("/HomeStage.fxml");
        });
    }
}
