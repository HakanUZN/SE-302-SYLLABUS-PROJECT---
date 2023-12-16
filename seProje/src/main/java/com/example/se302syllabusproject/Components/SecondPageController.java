package com.example.se302syllabusproject.Components;

import com.example.se302syllabusproject.DataModel.SubjectsAndMaterials;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SecondPageController {

    //PAGE 2 Attributes
    @FXML
    public TextField sub1;
    @FXML
    public TextField sub2;
    @FXML
    public TextField sub3;
    @FXML
    public TextField sub4;
    @FXML
    public TextField sub5;
    @FXML
    public TextField sub6;
    @FXML
    public TextField sub7;
    @FXML
    public TextField sub8;
    @FXML
    public TextField sub9;
    @FXML
    public TextField sub10;
    @FXML
    public TextField sub11;
    @FXML
    public TextField sub12;
    @FXML
    public TextField sub13;
    @FXML
    public TextField sub14;
    @FXML
    public TextField sub15;
    @FXML
    public TextField sub16;
    @FXML
    public TextField reqM1;
    @FXML
    public TextField reqM2;
    @FXML
    public TextField reqM3;
    @FXML
    public TextField reqM4;
    @FXML
    public TextField reqM5;
    @FXML
    public TextField reqM6;
    @FXML
    public TextField reqM7;
    @FXML
    public TextField reqM8;
    @FXML
    public TextField reqM9;
    @FXML
    public TextField reqM10;
    @FXML
    public TextField reqM11;
    @FXML
    public TextField reqM12;
    @FXML
    public TextField reqM13;
    @FXML
    public TextField reqM14;
    @FXML
    public TextField reqM15;
    @FXML
    public TextField reqM16;
    @FXML
    public TextArea CourseNotes1;
    @FXML
    public TextArea SuggestedReadings1;
    @FXML
    public Button page2to3;
    @FXML
    public Button page2to1;

    //page 2 getText methods
    @FXML
    public void page2GetText(ActionEvent event)throws IOException, IOException {
        String subject1  = sub1.getText();
        String subject2  = sub2.getText();
        String subject3  = sub3.getText();
        String subject4  = sub4.getText();
        String subject5  = sub5.getText();
        String subject6  = sub6.getText();
        String subject7  = sub7.getText();
        String subject8  = sub8.getText();
        String subject9  = sub9.getText();
        String subject10 = sub10.getText();
        String subject11 = sub11.getText();
        String subject12 = sub12.getText();
        String subject13 = sub13.getText();
        String subject14 = sub14.getText();
        String subject15 = sub15.getText();
        String subject16 = sub16.getText();

        String requiredMaterials1  = reqM1.getText();
        String requiredMaterials2  = reqM2.getText();
        String requiredMaterials3  = reqM3.getText();
        String requiredMaterials4  = reqM4.getText();
        String requiredMaterials5  = reqM5.getText();
        String requiredMaterials6  = reqM6.getText();
        String requiredMaterials7  = reqM7.getText();
        String requiredMaterials8  = reqM8.getText();
        String requiredMaterials9  = reqM9.getText();
        String requiredMaterials10 = reqM10.getText();
        String requiredMaterials11 = reqM11.getText();
        String requiredMaterials12 = reqM12.getText();
        String requiredMaterials13 = reqM13.getText();
        String requiredMaterials14 = reqM14.getText();
        String requiredMaterials15 = reqM15.getText();
        String requiredMaterials16 = reqM16.getText();

        String courseNotes       = CourseNotes1.getText();
        String suggestedReadings = SuggestedReadings1.getText();

        SubjectsAndMaterials subjectsAndMaterials =new SubjectsAndMaterials(subject1,requiredMaterials1,subject2,requiredMaterials2,subject3,requiredMaterials3,
                subject4,requiredMaterials4,subject5,requiredMaterials5,subject6,requiredMaterials6,subject7,requiredMaterials7,
                subject8,requiredMaterials8,subject9,requiredMaterials9,subject10,requiredMaterials10,subject11,requiredMaterials11,
                subject12,requiredMaterials12,subject13,requiredMaterials13,subject14,requiredMaterials14,subject15,requiredMaterials15,subject16,requiredMaterials16
                ,courseNotes,suggestedReadings);
    }


}
