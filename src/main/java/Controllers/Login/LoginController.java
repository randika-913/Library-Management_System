package Controllers.Login;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class LoginController {
    public static boolean checkUsernameandPassword(String Username, String Password) {
        if (Username.equals("Randika") && Password.equals("1234")) {
            return true;
        }

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Failed");
        alert.setHeaderText(null);
        alert.setContentText("Invalid Username or Password! Please try again.");
        alert.showAndWait();


        return false;
    }
}
