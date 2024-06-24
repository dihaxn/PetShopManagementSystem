module com.example.petshopmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.petshopmanagementsystem to javafx.fxml;
    exports com.example.petshopmanagementsystem;
}