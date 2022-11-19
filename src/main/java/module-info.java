module com.example.hellodemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellodemo to javafx.fxml;
    exports com.example.hellodemo;
}