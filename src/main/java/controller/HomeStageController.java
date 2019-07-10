package controller;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeStageController implements Initializable {

    @FXML
    private JFXHamburger ham1;

    @FXML
    private Button buttonGoLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        HamburgerBasicCloseTransition basicClose = new HamburgerBasicCloseTransition(ham1);
        basicClose.setRate(-1);
        ham1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->{
            basicClose.setRate(basicClose.getRate()*-1);
            basicClose.play();
        });

    }
    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent loginStageParent = FXMLLoader.load(getClass().getResource("/LoginStage.fxml"));
        Scene loginStageScene = new Scene(loginStageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(loginStageScene);
        window.show();
    }
}
