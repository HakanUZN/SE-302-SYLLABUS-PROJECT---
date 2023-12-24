module com.example.se302syllabusproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;
    requires com.fasterxml.jackson.databind;


    opens com.example.se302syllabusproject to javafx.fxml;
    exports com.example.se302syllabusproject;
    exports com.example.se302syllabusproject.DataModel;
    opens com.example.se302syllabusproject.DataModel to javafx.fxml;
}