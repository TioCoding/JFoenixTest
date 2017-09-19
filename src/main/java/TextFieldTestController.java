import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

/**
 * Created by continue-juan on 19/09/17.
 */
public class TextFieldTestController {

    @FXML
    JFXTextField txtTest;
    @FXML
    JFXButton btnTest;

    @FXML
    public void initialize() {

        // PROBLEM
//        txtTest.focusedProperty().addListener((o, oldVal, newVal) -> {
//            if (!newVal) {
//                txtTest.validate();
//            }
//        });
//
//        btnTest.setOnAction(e -> {
//            txtTest.resetValidation();
//            txtTest.requestFocus();
//        });

        // PROBLEM IN FIRST PRESS BUTTON

        btnTest.setOnAction(e -> {
            txtTest.resetValidation();
            txtTest.validate();
            txtTest.requestFocus();
        });

    }

}
