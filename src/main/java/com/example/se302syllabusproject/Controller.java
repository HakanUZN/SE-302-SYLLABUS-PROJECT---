//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.se302syllabusproject;

import java.io.CharConversionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.example.se302syllabusproject.DataModel.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Controller implements SyllabusOperations{
    public boolean isCrossAddedFall = false;
    public boolean isCrossAddedSpring = false;
    public boolean isCourseLangEngSelected = false;
    public boolean isCourseLangTurkishSelected = false;
    public boolean isCourseLangSecondForeigngSelected = false;
    public boolean isCourseTypeReq = false;
    public boolean isCourseTypeElec = false;
    public boolean isCourseLevelShort = false;
    public boolean isCourseLevelFirst = false;
    public boolean isCourseLevelSecondCycle = false;
    public boolean isCourseLevelThirdCycle = false;
    public boolean isCoreCourse = false;
    public boolean isMajorAreaCourse = false;
    public boolean isSupportiveCourse = false;
    public boolean isCommunicationCourse = false;
    public boolean isTransferableCourse = false;
    public boolean  isContribution11=false;
    public boolean  isContribution12=false;
    public boolean  isContribution13=false;
    public boolean  isContribution14=false;
    public boolean  isContribution15=false;

    public boolean  isContribution21=false;
    public boolean  isContribution22=false;
    public boolean  isContribution23=false;
    public boolean  isContribution24=false;
    public boolean  isContribution25=false;

    public boolean  isContribution31=false;
    public boolean  isContribution32=false;
    public boolean  isContribution33=false;
    public boolean  isContribution34=false;
    public boolean  isContribution35=false;

    public boolean  isContribution41=false;
    public boolean  isContribution42=false;
    public boolean  isContribution43=false;
    public boolean  isContribution44=false;
    public boolean  isContribution45=false;

    public boolean  isContribution51=false;
    public boolean  isContribution52=false;
    public boolean  isContribution53=false;
    public boolean  isContribution54=false;
    public boolean  isContribution55=false;

    public boolean  isContribution61=false;
    public boolean  isContribution62=false;
    public boolean  isContribution63=false;
    public boolean  isContribution64=false;
    public boolean  isContribution65=false;

    public boolean  isContribution71=false;
    public boolean  isContribution72=false;
    public boolean  isContribution73=false;
    public boolean  isContribution74=false;
    public boolean  isContribution75=false;

    public boolean  isContribution81=false;
    public boolean  isContribution82=false;
    public boolean  isContribution83=false;
    public boolean  isContribution84=false;
    public boolean  isContribution85=false;

    public boolean  isContribution91=false;
    public boolean  isContribution92=false;
    public boolean  isContribution93=false;
    public boolean  isContribution94=false;
    public boolean  isContribution95=false;

    public boolean  isContribution101=false;
    public boolean  isContribution102=false;
    public boolean  isContribution103=false;
    public boolean  isContribution104=false;
    public boolean  isContribution105=false;

    public boolean  isContribution111=false;
    public boolean  isContribution112=false;
    public boolean  isContribution113=false;
    public boolean  isContribution114=false;
    public boolean  isContribution115=false;

    public boolean  isContribution121=false;
    public boolean  isContribution122=false;
    public boolean  isContribution123=false;
    public boolean  isContribution124=false;
    public boolean  isContribution125=false;

    public boolean  isContribution131=false;
    public boolean  isContribution132=false;
    public boolean  isContribution133=false;
    public boolean  isContribution134=false;
    public boolean  isContribution135=false;

    //PAGE Main
    @FXML
    public Button oneToMain;
    @FXML
    public Button exitButton;

    //PAGE 1 Attributes
    @FXML
    public TextField courseNameEnter;
    @FXML
    public TextField CodeString;
    @FXML
    public CheckBox SpringButton;
    @FXML
    public CheckBox FallButton;
    @FXML
    public TextField TheoryHour;
    @FXML
    public TextField ApplicationLabHour;
    @FXML
    public TextField LocalCredits;
    @FXML
    public TextField ECTS;
    @FXML
    public TextField presquisites;
    @FXML
    public CheckBox CourseLanguageEnglish;
    @FXML
    public CheckBox CourseLanguageTurkish;
    @FXML
    public CheckBox CourseLanguageSecondForeign;
    @FXML
    public CheckBox TypeElective;
    @FXML
    public CheckBox TypeRequired;
    @FXML
    public CheckBox levelShortCycle;
    @FXML
    public CheckBox LevelFirstCycle;
    @FXML
    public CheckBox LevelSecondCycle;
    @FXML
    public CheckBox LevelThirdCycle;
    @FXML
    public TextArea teachingMethods;
    @FXML
    public TextField CourseCoordinator;
    @FXML
    public TextField CourseLecturer;
    @FXML
    public TextField CourseAssistants;
    @FXML
    public TextArea courseObjectives;
    @FXML
    public TextArea learningOutcomes;
    @FXML
    public TextArea courseDescription;
    @FXML
    public CheckBox CoreCourse;
    @FXML
    public CheckBox MajorAreaCourse;
    @FXML
    public CheckBox SupportiveCourse;
    @FXML
    public CheckBox CommunicationCourse;
    @FXML
    public CheckBox TransferableSkillCourse;
    @FXML
    public Button pageMainto1;
    @FXML
    public Button page1to2;

    @FXML
    public Button trButton;
    @FXML
    public Button enButton;



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


    //PAGE 4 Attributes
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

    //PAGE 5 Attributes
    @FXML
    public TextArea outcomes1;
    @FXML
    public TextArea outcomes2;
    @FXML
    public TextArea outcomes3;
    @FXML
    public TextArea outcomes4;
    @FXML
    public TextArea outcomes5;
    @FXML
    public TextArea outcomes6;
    @FXML
    public TextArea outcomes7;
    @FXML
    public TextArea outcomes8;
    @FXML
    public TextArea outcomes9;
    @FXML
    public TextArea outcomes10;
    @FXML
    public TextArea outcomes11;
    @FXML
    public TextArea outcomes12;
    @FXML
    public TextArea outcomes13;

    @FXML
    public CheckBox contribution11;
    @FXML
    public CheckBox contribution12;
    @FXML
    public CheckBox contribution13;
    @FXML
    public CheckBox contribution14;
    @FXML
    public CheckBox contribution15;
    @FXML
    public CheckBox contribution21;
    @FXML
    public CheckBox contribution22;
    @FXML
    public CheckBox contribution23;
    @FXML
    public CheckBox contribution24;
    @FXML
    public CheckBox contribution25;
    @FXML
    public CheckBox contribution31;
    @FXML
    public CheckBox contribution32;
    @FXML
    public CheckBox contribution33;
    @FXML
    public CheckBox contribution34;
    @FXML
    public CheckBox contribution35;
    @FXML
    public CheckBox contribution41;
    @FXML
    public CheckBox contribution42;
    @FXML
    public CheckBox contribution43;
    @FXML
    public CheckBox contribution44;
    @FXML
    public CheckBox contribution45;
    @FXML
    public CheckBox contribution51;
    @FXML
    public CheckBox contribution52;
    @FXML
    public CheckBox contribution53;
    @FXML
    public CheckBox contribution54;
    @FXML
    public CheckBox contribution55;
    @FXML
    public CheckBox contribution61;
    @FXML
    public CheckBox contribution62;
    @FXML
    public CheckBox contribution63;
    @FXML
    public CheckBox contribution64;
    @FXML
    public CheckBox contribution65;
    @FXML
    public CheckBox contribution71;
    @FXML
    public CheckBox contribution72;
    @FXML
    public CheckBox contribution73;
    @FXML
    public CheckBox contribution74;
    @FXML
    public CheckBox contribution75;
    @FXML
    public CheckBox contribution81;
    @FXML
    public CheckBox contribution82;
    @FXML
    public CheckBox contribution83;
    @FXML
    public CheckBox contribution84;
    @FXML
    public CheckBox contribution85;
    @FXML
    public CheckBox contribution91;
    @FXML
    public CheckBox contribution92;
    @FXML
    public CheckBox contribution93;
    @FXML
    public CheckBox contribution94;
    @FXML
    public CheckBox contribution95;
    @FXML
    public CheckBox contribution101;
    @FXML
    public CheckBox contribution102;
    @FXML
    public CheckBox contribution103;
    @FXML
    public CheckBox contribution104;
    @FXML
    public CheckBox contribution105;
    @FXML
    public CheckBox contribution111;
    @FXML
    public CheckBox contribution112;
    @FXML
    public CheckBox contribution113;
    @FXML
    public CheckBox contribution114;
    @FXML
    public CheckBox contribution115;
    @FXML
    public CheckBox contribution121;
    @FXML
    public CheckBox contribution122;
    @FXML
    public CheckBox contribution123;
    @FXML
    public CheckBox contribution124;
    @FXML
    public CheckBox contribution125;
    @FXML
    public CheckBox contribution131;
    @FXML
    public CheckBox contribution132;
    @FXML
    public CheckBox contribution133;
    @FXML
    public CheckBox contribution134;
    @FXML
    public CheckBox contribution135;
    @FXML
    public TextArea contributionLO1;
    @FXML
    public TextArea contributionLO2;
    @FXML
    public TextArea contributionLO3;
    @FXML
    public TextArea contributionLO4;
    @FXML
    public TextArea contributionLO5;
    @FXML
    public TextArea contributionLO6;
    @FXML
    public TextArea contributionLO7;
    @FXML
    public TextArea contributionLO8;
    @FXML
    public TextArea contributionLO9;
    @FXML
    public TextArea contributionLO10;
    @FXML
    public TextArea contributionLO11;
    @FXML
    public TextArea contributionLO12;
    @FXML
    public TextArea contributionLO13;
    @FXML
    public Button saveSyllabusButton;

    //PAGE1
    @FXML
    private void Page1CourseLanguageCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox, Arrays.asList(CourseLanguageEnglish,CourseLanguageTurkish,CourseLanguageSecondForeign));
    }

    @FXML
    private void Page1CourseTypeCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox, Arrays.asList(TypeRequired,TypeElective));

    }

    @FXML
    private void Page1CourseLevelCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(levelShortCycle,LevelFirstCycle,LevelSecondCycle,LevelThirdCycle));

    }


    @FXML
    private void Page1CourseCategoryCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox, Arrays.asList(CoreCourse,MajorAreaCourse,SupportiveCourse,CommunicationCourse,TransferableSkillCourse));
    }
   @FXML
   private void Page5OutcomesFirstRowCheckBox(ActionEvent event){
       CheckBox selectedCheckBox = (CheckBox) event.getSource();
       checkerMethod(selectedCheckBox,Arrays.asList(contribution11,contribution12,contribution13,contribution14,contribution15));
   }
    @FXML
    private void Page5OutcomesSecondRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution21,contribution22,contribution23,contribution24,contribution25));
    }
    @FXML
    private void Page5OutcomesThirdRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution31,contribution32,contribution33,contribution34,contribution35));
    }
    @FXML
    private void Page5OutcomesFourthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution41,contribution42,contribution43,contribution44,contribution45));
    }
    @FXML
    private void Page5OutcomesFifthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution51,contribution52,contribution53,contribution54,contribution55));
    }
    @FXML
    private void Page5OutcomesSixthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution61,contribution62,contribution63,contribution64,contribution65));
    }
    @FXML
    private void Page5OutcomesSeventhRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution71,contribution72,contribution73,contribution74,contribution75));
    }
    @FXML
    private void Page5OutcomesEighthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution81,contribution82,contribution83,contribution84,contribution85));
    }
    @FXML
    private void Page5OutcomesNinthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution91,contribution92,contribution93,contribution94,contribution95));
    }
    @FXML
    private void Page5OutcomesTenthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution101,contribution102,contribution103,contribution104,contribution105));
    }
    @FXML
    private void Page5OutcomesEleventhRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution111,contribution112,contribution113,contribution114,contribution115));
    }
    @FXML
    private void Page5OutcomesTwelfthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution121,contribution122,contribution123,contribution124,contribution125));
    }
    @FXML
    private void Page5OutcomesThirteenthRowCheckBox(ActionEvent event){
        CheckBox selectedCheckBox = (CheckBox) event.getSource();
        checkerMethod(selectedCheckBox,Arrays.asList(contribution131,contribution132, contribution133 ,contribution134 ,contribution135));
    }



    @FXML
    //This method uses as a checker method that checker provides control.
    private void checkerMethod(CheckBox selectedCheckBox, List<CheckBox> checkBoxes){
        Iterator<CheckBox> iteratorCheckbox = checkBoxes.iterator();
        while(iteratorCheckbox.hasNext()){
            CheckBox checker = iteratorCheckbox.next();
            if(checker != selectedCheckBox){
                checker.setSelected(false);
            }
        }

    }




    //PAGE 1 getText Methods
    @FXML
    public void page1GetText(ActionEvent event)throws IOException, IOException {

        if (courseNameEnter.getText().isEmpty() || courseNameEnter.getText().isEmpty() || TheoryHour.getText().isEmpty()|| ApplicationLabHour.getText().isEmpty() ||
                LocalCredits.getText().isEmpty() || ECTS.getText().isEmpty() || presquisites.getText().isEmpty() ||
                teachingMethods.getText().isEmpty()||CourseCoordinator.getText().isEmpty()||CourseLecturer.getText().isEmpty()||
                CourseAssistants.getText().isEmpty()||courseObjectives.getText().isEmpty()||learningOutcomes.getText().isEmpty()||
                courseDescription.getText().isEmpty())
        {
            return;
        }

        String courseName = courseNameEnter.getText();
        String courseCode = CodeString.getText();



        isCrossAddedFall=FallButton.isSelected();
        isCrossAddedSpring=SpringButton.isSelected();


        int theory = Integer.parseInt(TheoryHour.getText());
        int application = Integer.parseInt(ApplicationLabHour.getText());
        int localCredits = Integer.parseInt(LocalCredits.getText());
        int ects = Integer.parseInt(ECTS.getText());
        //


        String presequisites = presquisites.getText();

        String courseLanguage="";
        if (isCourseLangEngSelected = CourseLanguageEnglish.isSelected()){
             courseLanguage="English";
        } else if (isCourseLangTurkishSelected = CourseLanguageTurkish.isSelected()) {
             courseLanguage="Turkish";
        } else if (isCourseLangSecondForeigngSelected = CourseLanguageSecondForeign.isSelected()) {
            courseLanguage="Second Foreign Language";
        }



        String courseType="";
        if (isCourseTypeReq = TypeRequired.isSelected()){
            courseType="Required";
        }else if (isCourseTypeElec = TypeElective.isSelected()){
            courseType="Elective";
        }

        String courseLevel="";
        if (isCourseLevelShort = levelShortCycle.isSelected()){
            courseLevel="Short Cycle";
        } else if (isCourseLevelFirst = LevelFirstCycle.isSelected()) {
            courseLevel="First Cycle";
        } else if (isCourseLevelSecondCycle = LevelSecondCycle.isSelected()) {
            courseLevel="Second Cycle";
        } else if (isCourseLevelThirdCycle = LevelThirdCycle.isSelected()) {
            courseLevel="Third Cycle";
        }
        //

        String teachingMethod = teachingMethods.getText();
        String courseCoordinator = CourseCoordinator.getText();
        String courseLecturer = CourseLecturer.getText();
        String assistans = CourseAssistants.getText();
        //

        String CourseObjectives = courseObjectives.getText();
        String LearningOutcomes = learningOutcomes.getText();
        String CourseDescription = courseDescription.getText();
        //

        String courseCategory="";
        if (isCoreCourse = CoreCourse.isSelected()){
            courseCategory="Core Course";
        } else if (isMajorAreaCourse = MajorAreaCourse.isSelected()) {
            courseCategory="Major Area Course";
        } else if (isSupportiveCourse = SupportiveCourse.isSelected()) {
            courseCategory="Supportive Course";
        } else if (isCommunicationCourse = CommunicationCourse.isSelected()) {
            courseCategory="Communication and Management Skills Course";
        } else if (isTransferableCourse = TransferableSkillCourse.isSelected()) {
            courseCategory="Transferable Skill Course";
        }

        GeneralInformation generalInformation=new GeneralInformation(courseName,courseCode,isCrossAddedFall,
                isCrossAddedSpring,theory,application,localCredits,ects,presequisites,courseLanguage,
                courseType,courseLevel,teachingMethod,courseCoordinator,courseLecturer,assistans,CourseObjectives,LearningOutcomes
                ,CourseDescription,courseCategory);


        //




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


        Assessments assessments;
        try {
            int participationNum = Integer.parseInt(numParticipation.getText());
            int labNum = Integer.parseInt(numLab.getText());
            int fieldWorkNum = Integer.parseInt(numFieldWork.getText());
            int quizNum = Integer.parseInt(numQuiz.getText());
            int homeworkNum= Integer.parseInt(numHomework.getText());
            int presentationNum = Integer.parseInt(numPresentation.getText());
            int projectNum = Integer.parseInt(numProject.getText());
            int seminarNum = Integer.parseInt(numSeminar.getText());
            int oralNum = Integer.parseInt(numOral.getText());
            int midtermNum = Integer.parseInt(numMidterm.getText());
            int finalNum= Integer.parseInt(numFinal.getText());
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

            assessments =new Assessments(participationNum,participationWeight,participationLO1,participationLO2,participationLO3
            ,participationLO4,participationLO5,labNum,labWeight,labLO1,labLO2,labLO3,labLO4,labLO5,fieldWorkNum,fieldWorkWeight
            ,fieldWorkLO1,fieldWorkLO2,fieldWorkLO3,fieldWorkLO4,fieldWorkLO5,quizNum,quizWeight,quizLO1,quizLO2,quizLO3,quizLO4
            ,quizLO5,homeworkNum,homeworkWeight,homeworkLO1,homeworkLO2,homeworkLO3,homeworkLO4,homeworkLO5,presentationNum,presentationWeight
            ,presentationLO1,presentationLO2,presentationLO3,presentationLO4,presentationLO5,projectNum,projectWeight,projectLO1
            ,projectLO2,projectLO3,projectLO4,projectLO5,seminarNum,seminarWeight,seminarLO1,seminarLO2,seminarLO3,seminarLO4,
                    seminarLO5,oralNum,oralWeight,oralLO1,oralLO2,oralLO3,oralLO4, oralLO5,midtermNum,midtermWeight,midtermLO1
            ,midtermLO2,midtermLO3,midtermLO4,midtermLO5,finalNum,finalWeight,finalLO1,finalLO2,finalLO3,finalLO4,finalLO5,totalNum
            ,totalWeight,totalLO1,totalLO2,totalLO3,totalLO4,totalLO5,weightFnl1,weightFnl2,weightEndFnl1,weightEndFnl2,assessmentTotal1,assessmentTotal2);
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }

             assessments =new Assessments();
//
        //


        WorkloadTable workloadTable;
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

            workloadTable =new WorkloadTable(courseHoursNum,courseHoursDuration,courseHoursWorkload,laboratoryNum,laboratoryDuration,
                    laboratoryWorkload,studyHoursNum,studyHoursDuration,studyHoursWorkload,fieldWorkNum,fieldWorkDuration,fieldWorkDuration
            ,quizNum,quizDuration,quizWorkload,homeworkNum,homeworkDuration,homeworkWorkload,presentationNum,presentationDuration
            ,presentationWorkload,projectNum,projectDuration,projectWorkload,seminarNum,seminarDuration,seminarWorkload
            ,oralExamNum,oralExamDuration,oralExamWorkload,midtermNum,midtermDuration,midtermWorkload,finalNum,finalDuration,finalWorkload,workloadTableTotal);
        }
        catch (NumberFormatException e){
            return;
        }


         workloadTable =new WorkloadTable();



        String programOutcomes1  = outcomes1.getText();
        String programOutcomes2  = outcomes2.getText();
        String programOutcomes3  = outcomes3.getText();
        String programOutcomes4  = outcomes4.getText();
        String programOutcomes5  = outcomes5.getText();
        String programOutcomes6  = outcomes6.getText();
        String programOutcomes7  = outcomes7.getText();
        String programOutcomes8  = outcomes8.getText();
        String programOutcomes9  = outcomes9.getText();
        String programOutcomes10 = outcomes10.getText();
        String programOutcomes11 = outcomes11.getText();
        String programOutcomes12 = outcomes12.getText();
        String programOutcomes13 = outcomes13.getText();



        isContribution11=contribution11.isSelected();
        isContribution12=contribution12.isSelected();
        isContribution13=contribution13.isSelected();
        isContribution14=contribution14.isSelected();
        isContribution15=contribution15.isSelected();


        isContribution21=contribution21.isSelected();
        isContribution22=contribution22.isSelected();
        isContribution23=contribution23.isSelected();
        isContribution24=contribution24.isSelected();
        isContribution25=contribution25.isSelected();

        isContribution31=contribution31.isSelected();
        isContribution32=contribution32.isSelected();
        isContribution33=contribution33.isSelected();
        isContribution34=contribution34.isSelected();
        isContribution35=contribution35.isSelected();

        isContribution41=contribution41.isSelected();
        isContribution42=contribution42.isSelected();
        isContribution43=contribution43.isSelected();
        isContribution44=contribution44.isSelected();
        isContribution45=contribution45.isSelected();

        isContribution51=contribution51.isSelected();
        isContribution52=contribution52.isSelected();
        isContribution53=contribution53.isSelected();
        isContribution54=contribution54.isSelected();
        isContribution55=contribution55.isSelected();

        isContribution61=contribution61.isSelected();
        isContribution62=contribution62.isSelected();
        isContribution63=contribution63.isSelected();
        isContribution64=contribution64.isSelected();
        isContribution65=contribution65.isSelected();

        isContribution71=contribution71.isSelected();
        isContribution72=contribution72.isSelected();
        isContribution73=contribution73.isSelected();
        isContribution74=contribution74.isSelected();
        isContribution75=contribution75.isSelected();

        isContribution81=contribution81.isSelected();
        isContribution82=contribution82.isSelected();
        isContribution83=contribution83.isSelected();
        isContribution84=contribution84.isSelected();
        isContribution85=contribution85.isSelected();

        isContribution91=contribution91.isSelected();
        isContribution92=contribution92.isSelected();
        isContribution93=contribution93.isSelected();
        isContribution94=contribution94.isSelected();
        isContribution95=contribution95.isSelected();

        isContribution101=contribution101.isSelected();
        isContribution102=contribution102.isSelected();
        isContribution103=contribution103.isSelected();
        isContribution104=contribution104.isSelected();
        isContribution105=contribution105.isSelected();

        isContribution111=contribution111.isSelected();
        isContribution112=contribution112.isSelected();
        isContribution113=contribution113.isSelected();
        isContribution114=contribution114.isSelected();
        isContribution115=contribution115.isSelected();

        isContribution121=contribution121.isSelected();
        isContribution122=contribution122.isSelected();
        isContribution123=contribution123.isSelected();
        isContribution124=contribution124.isSelected();
        isContribution125=contribution125.isSelected();

        isContribution131=contribution131.isSelected();
        isContribution132=contribution132.isSelected();
        isContribution133=contribution133.isSelected();
        isContribution134=contribution134.isSelected();
        isContribution135=contribution135.isSelected();


        String contributionLevelLO1  = contributionLO1.getText();
        String contributionLevelLO2  = contributionLO2.getText();
        String contributionLevelLO3  = contributionLO3.getText();
        String contributionLevelLO4  = contributionLO4.getText();
        String contributionLevelLO5  = contributionLO5.getText();
        String contributionLevelLO6  = contributionLO6.getText();
        String contributionLevelLO7  = contributionLO7.getText();
        String contributionLevelLO8  = contributionLO8.getText();
        String contributionLevelLO9  = contributionLO9.getText();
        String contributionLevelLO10 = contributionLO10.getText();
        String contributionLevelLO11 = contributionLO11.getText();
        String contributionLevelLO12 = contributionLO12.getText();
        String contributionLevelLO13 = contributionLO13.getText();



    }




    //Page 5 getText Methods
 /*   @FXML
    public void page5GetText(ActionEvent event) throws Exception {
        List<String> programOutcomes = new ArrayList<>();
        List<List<CheckBox>> isContribution = new ArrayList<>();
        List<String> contributionLevel = new ArrayList<>();
        try {
            for (int i = 0; i < 13; i++) {
                programOutcomes.add(((TextField) this.getClass().getDeclaredField("outcomes" + (i + 1)).get(this)).getText());
                List<CheckBox> contributions = new ArrayList<>();
                for (int j = 0; j < 5; j++) {
                    CheckBox checkBox = (CheckBox) this.getClass().getDeclaredField("contribution" + (i + 1) + (j + 1)).get(this);
                    contributions.add(checkBox);
                }
                isContribution.add(contributions);
                contributionLevel.add(((TextField) this.getClass().getDeclaredField("contributionLevelLo" + (i + 1)).get(this)).getText());

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        SyllabusPage5 syllabusPage5=new SyllabusPage5();
    }*/
   /* @FXML
    public void page5GetText(ActionEvent event)throws IOException, IOException {




    }*/




    @FXML
    private void changeTrButton(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FormTR.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void changeEnButton(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Form.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void pageMainto1(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Form.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void pageOneToMain(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Main.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void exitButton(ActionEvent event) throws IOException, IOException {
        Platform.exit();
    }


    Syllabus syllabus=new Syllabus();
    @Override
    public void addSyllabus(Syllabus addSyllabus) {
        syllabus.syllabusList.add(addSyllabus);
    }

    @Override
    public void editSyllabus(Syllabus syllabus){
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        syllabus.version++;
    }

    @Override
    public void deleteSyllabus(Syllabus deleteSyllabus){
        if (syllabus.syllabusList.contains(deleteSyllabus)){
            syllabus.syllabusList.remove(deleteSyllabus);
        }else {
            return;//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }

    }

    @Override
    public void searchSyllabus(String searchSyllabus) {
        for (int i = 0; i < syllabus.syllabusList.size(); i++) {
            if (syllabus.syllabusList.get(i).getSyllabusPage1().getCourseCode() == searchSyllabus){
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            }

        }


    }
}
