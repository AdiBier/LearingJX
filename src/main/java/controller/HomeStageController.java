package controller;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeStageController implements Initializable {

    @FXML
    private JFXHamburger ham1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        HamburgerBasicCloseTransition basicClose = new HamburgerBasicCloseTransition(ham1);
        basicClose.setRate(-1);
        ham1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->{
            basicClose.setRate(basicClose.getRate()*-1);
            basicClose.play();
        });


    }
}
