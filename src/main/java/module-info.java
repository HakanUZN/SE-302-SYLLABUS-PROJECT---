module com.example.se302syllabusproject {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.se302syllabusproject to javafx.fxml;
    exports com.example.se302syllabusproject;
}