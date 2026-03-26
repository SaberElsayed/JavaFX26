module com.example.javafx26 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javafx26 to javafx.fxml;
    exports com.example.javafx26;
}