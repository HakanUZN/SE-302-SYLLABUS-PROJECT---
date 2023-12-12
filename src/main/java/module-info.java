module com.example.se302syllabusproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;



    opens com.example.se302syllabusproject to javafx.fxml;
    exports com.example.se302syllabusproject;
}