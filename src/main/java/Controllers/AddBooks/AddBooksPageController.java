package Controllers.AddBooks;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddBooksPageController {

    @FXML
    private Button btnAddBook;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDashBoard;

    @FXML
    private ComboBox<String> cmbCategory;

        @FXML
        public void initialize(){
            cmbCategory.getItems().addAll(
                    "Educational",
                    "Novel",
                    "Technology",
                    "Science",
                    "History"
            );

            cmbCategory.setPromptText("Select Category");
        }

    @FXML
    private TextField lblAuthor;

    @FXML
    private TextField lblBookID;

    @FXML
    private TextField lblBookTitle;

    @FXML
    private TextField lblPublishedYear;

    @FXML
    private TextField lblQuantity;

    @FXML
    void btnAddBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        lblBookID.clear();
        lblBookTitle.clear();
        lblAuthor.clear();
        cmbCategory.getSelectionModel().clearSelection();
        lblPublishedYear.clear();
        lblQuantity.clear();
        lblBookID.requestFocus();
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

}
