module com.example.clone_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clone_project to javafx.fxml;
    exports com.example.clone_project;
}