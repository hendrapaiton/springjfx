package id.web.hikmasoft;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class SceneController {

    @FXML
    private Label txtLabel;

    @Value("${appname}")
    private String appname;

    @FXML
    private void initialize() {
        txtLabel.setText(appname);
    }

}
