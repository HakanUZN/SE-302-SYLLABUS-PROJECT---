package com.example.se302syllabusproject.Components;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FourthPageController {

    @FXML
    public TextArea SemesterNum1;
    @FXML
    public TextArea SemesterNum2;
    @FXML
    public TextArea SemesterNum3;
    @FXML
    public TextArea SemesterNum4;
    @FXML
    public TextArea SemesterNum5;
    @FXML
    public TextArea SemesterNum6;
    @FXML
    public TextArea SemesterNum7;
    @FXML
    public TextArea SemesterNum8;
    @FXML
    public TextArea SemesterNum9;
    @FXML
    public TextArea SemesterNum10;
    @FXML
    public TextArea SemesterNum11;
    @FXML
    public TextArea SemesterNum12;
    @FXML
    public TextArea SemesterDuration1;
    @FXML
    public TextArea SemesterDuration2;
    @FXML
    public TextArea SemesterDuration3;
    @FXML
    public TextArea SemesterDuration4;
    @FXML
    public TextArea SemesterDuration5;
    @FXML
    public TextArea SemesterDuration6;
    @FXML
    public TextArea SemesterDuration7;
    @FXML
    public TextArea SemesterDuration8;
    @FXML
    public TextArea SemesterDuration9;
    @FXML
    public TextArea SemesterDuration10;
    @FXML
    public TextArea SemesterDuration11;
    @FXML
    public TextArea SemesterDuration12;
    @FXML
    public TextArea SemesterWorkload1;
    @FXML
    public TextArea SemesterWorkload2;
    @FXML
    public TextArea SemesterWorkload3;
    @FXML
    public TextArea SemesterWorkload4;
    @FXML
    public TextArea SemesterWorkload5;
    @FXML
    public TextArea SemesterWorkload6;
    @FXML
    public TextArea SemesterWorkload7;
    @FXML
    public TextArea SemesterWorkload8;
    @FXML
    public TextArea SemesterWorkload9;
    @FXML
    public TextArea SemesterWorkload10;
    @FXML
    public TextArea SemesterWorkload11;
    @FXML
    public TextArea SemesterWorkload12;
    @FXML
    public TextArea SemesterTotal;
    @FXML
    public Button page4to5;
    @FXML
    public Button page4to3;

    @FXML
    public void page4GetText(ActionEvent event)throws IOException, IOException {

        try {
            int courseHoursNum  = Integer.parseInt(SemesterNum1.getText());
            int laboratoryNum   = Integer.parseInt(SemesterNum2.getText());
            int studyHoursNum   = Integer.parseInt(SemesterNum3.getText());
            int fieldWorkNum    = Integer.parseInt(SemesterNum4.getText());
            int quizNum         = Integer.parseInt(SemesterNum5.getText());
            int homeworkNum     = Integer.parseInt(SemesterNum6.getText());
            int presentationNum = Integer.parseInt(SemesterNum7.getText());
            int projectNum      = Integer.parseInt(SemesterNum8.getText());
            int seminarNum      = Integer.parseInt(SemesterNum9.getText());
            int oralExamNum     = Integer.parseInt(SemesterNum10.getText());
            int midtermNum      = Integer.parseInt(SemesterNum11.getText());
            int finalNum        = Integer.parseInt(SemesterNum12.getText());

            int courseHoursDuration   = Integer.parseInt(SemesterDuration1.getText());
            int laboratoryDuration    = Integer.parseInt(SemesterDuration2.getText());
            int studyHoursDuration    = Integer.parseInt(SemesterDuration3.getText());
            int fieldWorkDuration     = Integer.parseInt(SemesterDuration4.getText());
            int quizDuration          = Integer.parseInt(SemesterDuration5.getText());
            int homeworkDuration      = Integer.parseInt(SemesterDuration6.getText());
            int presentationDuration  = Integer.parseInt(SemesterDuration7.getText());
            int projectDuration       = Integer.parseInt(SemesterDuration8.getText());
            int seminarDuration       = Integer.parseInt(SemesterDuration9.getText());
            int oralExamDuration      = Integer.parseInt(SemesterDuration10.getText());
            int midtermDuration       = Integer.parseInt(SemesterDuration11.getText());
            int finalDuration         = Integer.parseInt(SemesterDuration12.getText());

            int courseHoursWorkload    = Integer.parseInt(SemesterWorkload1.getText());
            int laboratoryWorkload     = Integer.parseInt(SemesterWorkload2.getText());
            int studyHoursWorkload     = Integer.parseInt(SemesterWorkload3.getText());
            int fieldWorkWorkload      = Integer.parseInt(SemesterWorkload4.getText());
            int quizWorkload           = Integer.parseInt(SemesterWorkload5.getText());
            int homeworkWorkload       = Integer.parseInt(SemesterWorkload6.getText());
            int presentationWorkload   = Integer.parseInt(SemesterWorkload7.getText());
            int projectWorkload        = Integer.parseInt(SemesterWorkload8.getText());
            int seminarWorkload        = Integer.parseInt(SemesterWorkload9.getText());
            int oralExamWorkload       = Integer.parseInt(SemesterWorkload10.getText());
            int midtermWorkload        = Integer.parseInt(SemesterWorkload11.getText());
            int finalWorkload          = Integer.parseInt(SemesterWorkload12.getText());

            int workloadTableTotal     =Integer.parseInt(SemesterTotal.getText());
        }
        catch (NumberFormatException e){
            return;
        }


    }

}
