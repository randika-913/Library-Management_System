package Controllers.Member;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewMemberPageController {


    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeleteMember;

    @FXML
    private Button btnEditMemberDetails;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtSearch;


    @FXML
    void btnDeleteMemberOnAction(ActionEvent event) {

    }

    @FXML
    void btnEditMemberDetailsOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(ActionEvent event) {
        Stage currentStage = (Stage) btnBack.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/add_memebers_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

}
