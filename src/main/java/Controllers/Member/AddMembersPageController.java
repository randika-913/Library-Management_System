package Controllers.Member;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddMembersPageController {

    @FXML
    private Button btnAddMembers;

    @FXML
    private Button btnDashBoard;

    @FXML
    private Button btnViewMembers;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFullName;

    @FXML
    private TextField txtMemberID;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    void btnAddMembersOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashBoardOnAction(ActionEvent event) {

        Stage currentStage = (Stage) btnDashBoard.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/main_dashboard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

    @FXML
    void btnViewMembersOnAction(ActionEvent event) {
        Stage currentStage = (Stage) btnViewMembers.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view_member_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

}
