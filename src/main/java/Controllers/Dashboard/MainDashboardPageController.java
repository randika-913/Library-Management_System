package Controllers.Dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainDashboardPageController {

    @FXML
    private Button btnBooks;

    @FXML
    private Button btnBorrowHistory;

    @FXML
    private Button btnIssueBook;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMembers;

    @FXML
    private Button btnReturnBook;

    @FXML
    private AnchorPane centerPane;

    @FXML
    private Label lblCurrentlyBorrowedBooks;

    @FXML
    private Label lblOverdueBooks;

    @FXML
    private Label lblTotalBooks;

    @FXML
    private Label lblTotalMembers;

    @FXML
    void btnAddBooksOnAction(ActionEvent event) {

        Stage currentStage = (Stage) btnBooks.getScene().getWindow();
        currentStage.close();

            Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/add_books_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnBorrowHistoryOnAction(ActionEvent event) {
        Stage currentStage = (Stage) btnBorrowHistory.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/borrowing_history_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnIssueBookOnAction(ActionEvent event) {
        Stage currentStage = (Stage) btnIssueBook.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/issue_book_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnMembersOnAction(ActionEvent event) {

        Stage currentStage = (Stage) btnMembers.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/add_memebers_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnReturnBookOnAction(ActionEvent event) {
        Stage currentStage = (Stage) btnReturnBook.getScene().getWindow();
        currentStage.close();

        Stage stage = new Stage();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/return_book_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {
        Stage currentStage = (Stage) btnLogout.getScene().getWindow();
        currentStage.close();
    }

}
