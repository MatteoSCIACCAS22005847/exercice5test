module com.example.exercice5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercice5 to javafx.fxml;
    exports com.example.exercice5;
}