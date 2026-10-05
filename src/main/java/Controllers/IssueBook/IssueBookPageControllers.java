package Controllers.IssueBook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;

public class IssueBookPageControllers {

    @FXML
    private Button btnDashBoard;

    @FXML
    private Button btnIssueBook;

    @FXML
    private ComboBox<?> cmbSelectBook;

    @FXML
    private ComboBox<?> cmbSelectMember;

    @FXML
    private DatePicker dtpDueDate;

    @FXML
    private DatePicker dtpIssueDate;

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
    void btnIssueBookOnAction(ActionEvent event) {

    }



}
