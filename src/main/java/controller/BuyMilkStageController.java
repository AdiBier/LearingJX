package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import service.ThreeClickButtonService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BuyMilkStageController implements Initializable, ThreeClickButtonService {

    @FXML
    private Button buttonBuy;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent buyMilkStageParent = FXMLLoader.load(getClass().getResource("/BuyMilkStage.fxml"));
        Scene buyMilkStageScene = new Scene(buyMilkStageParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(buyMilkStageScene);
        window.show();
    }

    @Override
    public void changeScreenButtonPushed2(ActionEvent event) throws IOException {

    }

    @Override
    public void changeScreenButtonPushed3(ActionEvent event) throws IOException {

    }
}
