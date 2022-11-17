module button.button {
    requires javafx.controls;
    requires javafx.fxml;


    opens button.button to javafx.fxml;
    exports button.button;
}