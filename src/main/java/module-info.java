module com.example.javafx26 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx26 to javafx.fxml;
    exports com.example.javafx26;
}