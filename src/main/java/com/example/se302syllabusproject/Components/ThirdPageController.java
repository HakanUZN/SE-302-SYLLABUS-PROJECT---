package com.example.se302syllabusproject.Components;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;

public class ThirdPageController {


    //PAGE 3 Attributes
    @FXML
    public TextField numParticipation;
    @FXML
    public TextField numLab;
    @FXML
    public TextField numFieldWork;
    @FXML
    public TextField numQuiz;
    @FXML
    public TextField numHomework;
    @FXML
    public TextField numPresentation;
    @FXML
    public TextField numProject;
    @FXML
    public TextField numSeminar;
    @FXML
    public TextField numOral;
    @FXML
    public TextField numMidterm;
    @FXML
    public TextField numFinal;
    @FXML
    public TextField numTotal;
    @FXML
    public TextField weightParticipation;
    @FXML
    public TextField weightLab;
    @FXML
    public TextField weightFieldWork;
    @FXML
    public TextField weightQuiz;
    @FXML
    public TextField weightHomework;
    @FXML
    public TextField weightPresentation;
    @FXML
    public TextField weightProject;
    @FXML
    public TextField weightSeminar;
    @FXML
    public TextField weightOral;
    @FXML
    public TextField weightMidterm;
    @FXML
    public TextField weightFinal;
    @FXML
    public TextField weightTotal;
    @FXML
    public TextField lo1Participation;
    @FXML
    public TextField lo1Lab;
    @FXML
    public TextField lo1FieldWork;
    @FXML
    public TextField lo1Quiz;
    @FXML
    public TextField lo1Homework;
    @FXML
    public TextField lo1Presentation;
    @FXML
    public TextField lo1Project;
    @FXML
    public TextField lo1Seminar;
    @FXML
    public TextField lo1Oral;
    @FXML
    public TextField lo1Midterm;
    @FXML
    public TextField lo1Final;
    @FXML
    public TextField lo1Total;
    @FXML
    public TextField lo2Participation;
    @FXML
    public TextField lo2Lab;
    @FXML
    public TextField lo2FieldWork;
    @FXML
    public TextField lo2Quiz;
    @FXML
    public TextField lo2Homework;
    @FXML
    public TextField lo2Presentation;
    @FXML
    public TextField lo2Project;
    @FXML
    public TextField lo2Seminar;
    @FXML
    public TextField lo2Oral;
    @FXML
    public TextField lo2Midterm;
    @FXML
    public TextField lo2Final;
    @FXML
    public TextField lo2Total;
    @FXML
    public TextField lo3Participation;
    @FXML
    public TextField lo3Lab;
    @FXML
    public TextField lo3FieldWork;
    @FXML
    public TextField lo3Quiz;
    @FXML
    public TextField lo3Homework;
    @FXML
    public TextField lo3Presentation;
    @FXML
    public TextField lo3Project;
    @FXML
    public TextField lo3Seminar;
    @FXML
    public TextField lo3Oral;
    @FXML
    public TextField lo3Midterm;
    @FXML
    public TextField lo3Final;
    @FXML
    public TextField lo3Total;
    @FXML
    public TextField lo4Participation;
    @FXML
    public TextField lo4Lab;
    @FXML
    public TextField lo4FieldWork;
    @FXML
    public TextField lo4Quiz;
    @FXML
    public TextField lo4Homework;
    @FXML
    public TextField lo4Presentation;
    @FXML
    public TextField lo4Project;
    @FXML
    public TextField lo4Seminar;
    @FXML
    public TextField lo4Oral;
    @FXML
    public TextField lo4Midterm;
    @FXML
    public TextField lo4Final;
    @FXML
    public TextField lo4Total;
    @FXML
    public TextField lo5Participation;
    @FXML
    public TextField lo5Lab;
    @FXML
    public TextField lo5FieldWork;
    @FXML
    public TextField lo5Quiz;
    @FXML
    public TextField lo5Homework;
    @FXML
    public TextField lo5Presentation;
    @FXML
    public TextField lo5Project;
    @FXML
    public TextField lo5Seminar;
    @FXML
    public TextField lo5Oral;
    @FXML
    public TextField lo5Midterm;
    @FXML
    public TextField lo5Final;
    @FXML
    public TextField lo5Total;
    @FXML
    public TextField weightFinal1;
    @FXML
    public TextField weightFinal2;
    @FXML
    public TextField weightEndFinal1;
    @FXML
    public TextField weightEndFinal2;
    @FXML
    public TextField total1;
    @FXML
    public TextField total2;
    @FXML
    public Button page3to2;
    @FXML
    public Button page3to4;

    @FXML
    public void page3GetText(ActionEvent event)throws IOException, IOException {

        try {
            int assessmentNum1 = Integer.parseInt(numParticipation.getText());
            int assessmentNum2 = Integer.parseInt(numLab.getText());
            int assessmentNum3 = Integer.parseInt(numFieldWork.getText());
            int assessmentNum4 = Integer.parseInt(numQuiz.getText());
            int assessmentNum5 = Integer.parseInt(numHomework.getText());
            int assessmentNum6 = Integer.parseInt(numPresentation.getText());
            int assessmentNum7 = Integer.parseInt(numProject.getText());
            int assessmentNum8 = Integer.parseInt(numSeminar.getText());
            int assessmentNum9 = Integer.parseInt(numOral.getText());
            int assessmentNum10 = Integer.parseInt(numMidterm.getText());
            int assessmentNum11 = Integer.parseInt(numFinal.getText());
            int totalNum = Integer.parseInt(numTotal.getText());

            int participationWeight = Integer.parseInt(weightParticipation.getText());
            int labWeight = Integer.parseInt(weightLab.getText());
            int fieldWorkWeight = Integer.parseInt(weightFieldWork.getText());
            int quizWeight = Integer.parseInt(weightQuiz.getText());
            int homeworkWeight = Integer.parseInt(weightHomework.getText());
            int presentationWeight = Integer.parseInt(weightPresentation.getText());
            int projectWeight = Integer.parseInt(weightProject.getText());
            int seminarWeight = Integer.parseInt(weightSeminar.getText());
            int oralWeight = Integer.parseInt(weightOral.getText());
            int midtermWeight = Integer.parseInt(weightMidterm.getText());
            int finalWeight = Integer.parseInt(weightFinal.getText());
            int totalWeight = Integer.parseInt(weightTotal.getText());

            int participationLO1 = Integer.parseInt(lo1Participation.getText());
            int labLO1 = Integer.parseInt(lo1Lab.getText());
            int fieldWorkLO1 = Integer.parseInt(lo1FieldWork.getText());
            int quizLO1 = Integer.parseInt(lo1Quiz.getText());
            int homeworkLO1 = Integer.parseInt(lo1Homework.getText());
            int presentationLO1 = Integer.parseInt(lo1Presentation.getText());
            int projectLO1 = Integer.parseInt(lo1Project.getText());
            int seminarLO1 = Integer.parseInt(lo1Seminar.getText());
            int oralLO1 = Integer.parseInt(lo1Oral.getText());
            int midtermLO1 = Integer.parseInt(lo1Midterm.getText());
            int finalLO1 = Integer.parseInt(lo1Final.getText());
            int totalLO1 = Integer.parseInt(lo1Total.getText());

            int participationLO2 = Integer.parseInt(lo2Participation.getText());
            int labLO2 = Integer.parseInt(lo2Lab.getText());
            int fieldWorkLO2 = Integer.parseInt(lo2FieldWork.getText());
            int quizLO2 = Integer.parseInt(lo2Quiz.getText());
            int homeworkLO2 = Integer.parseInt(lo2Homework.getText());
            int presentationLO2 = Integer.parseInt(lo2Presentation.getText());
            int projectLO2 = Integer.parseInt(lo2Project.getText());
            int seminarLO2 = Integer.parseInt(lo2Seminar.getText());
            int oralLO2 = Integer.parseInt(lo2Oral.getText());
            int midtermLO2 = Integer.parseInt(lo2Midterm.getText());
            int finalLO2 = Integer.parseInt(lo2Final.getText());
            int totalLO2 = Integer.parseInt(lo2Total.getText());

            int participationLO3 = Integer.parseInt(lo3Participation.getText());
            int labLO3 = Integer.parseInt(lo3Lab.getText());
            int fieldWorkLO3 = Integer.parseInt(lo3FieldWork.getText());
            int quizLO3 = Integer.parseInt(lo3Quiz.getText());
            int homeworkLO3 = Integer.parseInt(lo3Homework.getText());
            int presentationLO3 = Integer.parseInt(lo3Presentation.getText());
            int projectLO3 = Integer.parseInt(lo3Project.getText());
            int seminarLO3 = Integer.parseInt(lo3Seminar.getText());
            int oralLO3 = Integer.parseInt(lo3Oral.getText());
            int midtermLO3 = Integer.parseInt(lo3Midterm.getText());
            int finalLO3 = Integer.parseInt(lo3Final.getText());
            int totalLO3 = Integer.parseInt(lo3Total.getText());

            int participationLO4 = Integer.parseInt(lo4Participation.getText());
            int labLO4 = Integer.parseInt(lo4Lab.getText());
            int fieldWorkLO4 = Integer.parseInt(lo4FieldWork.getText());
            int quizLO4 = Integer.parseInt(lo4Quiz.getText());
            int homeworkLO4 = Integer.parseInt(lo4Homework.getText());
            int presentationLO4 = Integer.parseInt(lo4Presentation.getText());
            int projectLO4 = Integer.parseInt(lo4Project.getText());
            int seminarLO4 = Integer.parseInt(lo4Seminar.getText());
            int oralLO4 = Integer.parseInt(lo4Oral.getText());
            int midtermLO4 = Integer.parseInt(lo4Midterm.getText());
            int finalLO4 = Integer.parseInt(lo4Final.getText());
            int totalLO4 = Integer.parseInt(lo4Total.getText());

            int participationLO5 = Integer.parseInt(lo5Participation.getText());
            int labLO5 = Integer.parseInt(lo5Lab.getText());
            int fieldWorkLO5 = Integer.parseInt(lo5FieldWork.getText());
            int quizLO5 = Integer.parseInt(lo5Quiz.getText());
            int homeworkLO5 = Integer.parseInt(lo5Homework.getText());
            int presentationLO5 = Integer.parseInt(lo5Presentation.getText());
            int projectLO5 = Integer.parseInt(lo5Project.getText());
            int seminarLO5 = Integer.parseInt(lo5Seminar.getText());
            int oralLO5 = Integer.parseInt(lo5Oral.getText());
            int midtermLO5 = Integer.parseInt(lo5Midterm.getText());
            int finalLO5 = Integer.parseInt(lo5Final.getText());
            int totalLO5 = Integer.parseInt(lo5Total.getText());

            int weightFnl1 = Integer.parseInt(weightFinal1.getText());
            int weightFnl2 = Integer.parseInt(weightFinal2.getText());
            int weightEndFnl1 = Integer.parseInt(weightEndFinal1.getText());
            int weightEndFnl2 = Integer.parseInt(weightEndFinal2.getText());
            int assessmentTotal1 = Integer.parseInt(total1.getText());
            int assessmentTotal2 = Integer.parseInt(total2.getText());
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}
