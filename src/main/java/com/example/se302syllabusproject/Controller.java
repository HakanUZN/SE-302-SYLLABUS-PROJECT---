//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.se302syllabusproject;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.example.se302syllabusproject.DataModel.*;
import com.fasterxml.jackson.databind.JsonNode;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

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
    public TextField versionTextField;
    @FXML
    public Button oneToMain;
    @FXML
    public Button exitButton;

    @FXML
    public Button editSyllabusButton;

    //Search

    @FXML
    public Button importButton;
    @FXML
    public Button exportToJsonButton;
    @FXML
    public Button previousVersion;
    @FXML
    public Button nextVersion;
    @FXML
    public Button deleteButton;
    @FXML
    public Button searchButton;
    @FXML
    public TextField searchTextField;
    @FXML
    public Button searchToMain;
    @FXML
    public Button searchHelp;
    @FXML
    public Label searchHelpLabel;

    public boolean helpLabelVisible = false;


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
    public TextField prerequisites;
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
    public String courseCategory;
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

    @FXML
    private GridPane semesterGridPane;

    @FXML
    private GridPane assessmentGridpane;

    @FXML
    private Button switchErrorOk;

    //
    //
    Syllabus syllabus=new Syllabus();



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
        checkerMethod(selectedCheckBox, Arrays.asList(getCoreCourse(), getMajorAreaCourse(), getSupportiveCourse(), getCommunicationCourse(), getTransferableSkillCourse()));
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
    private void checkerMethod(CheckBox selectedCheckBox, List<CheckBox> checkBoxes){
        Iterator<CheckBox> iteratorCheckbox = checkBoxes.iterator();
        while(iteratorCheckbox.hasNext()){
            CheckBox checker = iteratorCheckbox.next();
            if(checker != selectedCheckBox){
                checker.setSelected(false);
            }
        }

    }



    public void exportToJson(ActionEvent event) throws IOException {
        String courseCode = CodeString.getText();
        double selectedVersion = Double.parseDouble(versionTextField.getText());

        if (courseCode != null) {
            Map<String, Object> exportedData = new LinkedHashMap<>();
            String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

            try (Connection connection = DriverManager.getConnection(DB_URL)) {
                String[] tablesToExport = {
                        "Course",
                        "CourseHours",
                        "CourseDetails",
                        "CourseInstructors",
                        "CourseObjective",
                        "CourseCategory",
                        "WeeklySubjectsMaterials",
                        "CourseMaterials",
                        "WorkloadTable",
                        "SemesterActivities",
                        "OutcomeMatrix"
                };

                for (String tableName : tablesToExport) {
                    List<Map<String, Object>> tableData = fetchDataFromTable(connection, tableName, courseCode, selectedVersion);
                    exportedData.put(tableName, tableData);
                }

                exportToJson(exportedData, courseNameEnter.getText() + "v" + versionTextField.getText() + ".json");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Course code is null.");
        }
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("exportSuccessful.fxml"));
        Parent root = (Parent)loader.load();
        Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        Stage newStage = new Stage();
        newStage.setScene(scene);

        newStage.setResizable(false);
        newStage.centerOnScreen();
        newStage.setTitle("Exported!");
        newStage.show();
    }






    private List<Map<String, Object>> fetchDataFromTable(Connection connection, String tableName, String courseCode, double version) {
        List<Map<String, Object>> tableDataList = new ArrayList<>();

        String sql = "SELECT * FROM " + tableName + " WHERE course_code = ? AND version = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, courseCode);
            preparedStatement.setDouble(2, version);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                while (resultSet.next()) {
                    Map<String, Object> row = new LinkedHashMap<>(); // LinkedHashMap kullanarak sÄ±ra korunur
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = metaData.getColumnName(i);
                        Object value = resultSet.getObject(i);
                        row.put(columnName, value);
                    }
                    tableDataList.add(row);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableDataList;
    }
    private void exportToJson(Map<String, Object> data, String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), data);

            System.out.println("Data has been exported to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleFileSelect(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose File");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Json Files", "*.json"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null && selectedFile.canRead()) {
            System.out.println("Choosen File: " + selectedFile.getAbsolutePath());
            try (InputStream inputStream = new FileInputStream(selectedFile)) {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(inputStream);
                JsonNode courseNode = jsonNode.path("Course").get(0);
                JsonNode courseHoursNode = jsonNode.path("CourseHours");
                JsonNode courseDetailsNode = jsonNode.path("CourseDetails");
                JsonNode courseInstructorsNode = jsonNode.path("CourseInstructors");
                JsonNode courseObjectiveNode = jsonNode.path("CourseObjective");
                JsonNode courseCategoryNode = jsonNode.path("CourseCategory");
                JsonNode weeklySubjectsMaterialsNode = jsonNode.path("WeeklySubjectsMaterials");
                JsonNode courseMaterialsNode = jsonNode.path("CourseMaterials");
                JsonNode workloadTableNode = jsonNode.path("WorkloadTable");
                JsonNode semesterActivitiesNode = jsonNode.path("SemesterActivities");
                JsonNode outcomeMatrixNode = jsonNode.path("OutcomeMatrix");


                if (courseNode.isMissingNode() || courseHoursNode.isMissingNode() || !courseHoursNode.isArray() || courseHoursNode.size() == 0) {
                    System.out.println("Invalid JSON structure. Check the format of your JSON file.");
                    return;
                }

                String courseCode = courseNode.path("course_code").asText();
                String courseName = courseNode.path("course_name").asText();
                Double version = courseNode.path("version").asDouble();
                Double versionHours = courseHoursNode.get(0).path("version").asDouble();
                Boolean fall = courseHoursNode.get(0).path("is_fall").asBoolean();
                Boolean spring = courseHoursNode.get(0).path("is_spring").asBoolean();
                int theory = courseHoursNode.get(0).path("theory").asInt();
                int labApplication = courseHoursNode.get(0).path("lab_application").asInt();
                int localCredits = courseHoursNode.get(0).path("local_credits").asInt();
                int ects = courseHoursNode.get(0).has("ects") ? courseHoursNode.get(0).path("ects").asInt() : 0;
                String notexTextbooks = courseMaterialsNode.get(0).path("notes_textbooks").toString();
                String suggestedReadings = courseMaterialsNode.get(0).path("suggested_readings").toString();
                String prerequisities = courseDetailsNode.get(0).path("prerequisites").asText();
                String courseLanguage = courseDetailsNode.get(0).path("course_language").asText();
                String courseType = courseDetailsNode.get(0).path("course_type").asText();
                String courseLevel = courseDetailsNode.get(0).path("course_level").asText();
                String teachingMethods = courseDetailsNode.get(0).path("teaching_methods").asText();
                String courseCordinator = courseInstructorsNode.get(0).path("course_coordinator").asText();
                String courseLecturers = courseInstructorsNode.get(0).path("course_lecturers").asText();
                String courseAssistants = courseInstructorsNode.get(0).path("assistants").asText();
                String courseObjectives = courseObjectiveNode.get(0).path("course_objectives").asText();
                String learningOutcomeObjectives = courseObjectiveNode.get(0).path("learning_outcomes").asText();
                String courseObjectiveDescription = courseObjectiveNode.get(0).path("course_description").asText();
                String courseCategory = courseCategoryNode.get(0).path("course_category").asText();
                List<Map<String, Object>> weeklySubjectsMaterialsList = new ArrayList<>();
                weeklySubjectsMaterialsNode = jsonNode.path("WeeklySubjectsMaterials");
                if (weeklySubjectsMaterialsNode.isArray()) {
                    for (JsonNode weeklyMaterialNode : weeklySubjectsMaterialsNode) {
                        Map<String, Object> weeklyMaterial = new HashMap<>();
                        weeklyMaterial.put("week", weeklyMaterialNode.path("week").asInt());
                        weeklyMaterial.put("subjects", weeklyMaterialNode.path("subjects").asText());
                        weeklyMaterial.put("requiredMaterials", weeklyMaterialNode.path("required_materials").asText());
                        weeklySubjectsMaterialsList.add(weeklyMaterial);
                    }
                }
                List<Map<String, Object>> workLoadTableList = new ArrayList<>();
                workloadTableNode = jsonNode.path("WorkloadTable");
                if (workloadTableNode.isArray()) {
                    for (JsonNode workloadTablesNode : workloadTableNode) {
                        Map<String, Object> workLoad = new HashMap<>();
                        workLoad.put("semester_activities", workloadTablesNode.path("semester_activities").asText());
                        workLoad.put("numb_of_activites", workloadTablesNode.path("numb_of_activites").asInt());
                        workLoad.put("duration_of_activities", workloadTablesNode.path("duration_of_activities").asInt());
                        workLoad.put("workload_of_activities", workloadTablesNode.path("workload_of_activities").asInt());
                        workLoadTableList.add(workLoad);
                    }
                }
                List<Map<String,Object>> semesterActivitiesList = new ArrayList<>();
                semesterActivitiesNode = jsonNode.path("SemesterActivities");
                if(semesterActivitiesNode.isArray()){
                    for (JsonNode semesterActivityTables :semesterActivitiesNode ){
                        Map<String, Object> semesterActivityObject = new HashMap<>();
                        semesterActivityObject.put("activity_name",semesterActivityTables.path("activity_name").asText());
                        semesterActivityObject.put("numb_of_activity",semesterActivityTables.path("numb_of_activity").asInt());
                        semesterActivityObject.put("activity_weight",semesterActivityTables.path("activity_weight").asInt());
                        semesterActivityObject.put("is_lo1",semesterActivityTables.path("is_lo1").asInt());
                        semesterActivityObject.put("is_lo2",semesterActivityTables.path("is_lo2").asInt());
                        semesterActivityObject.put("is_lo3",semesterActivityTables.path("is_lo3").asInt());
                        semesterActivityObject.put("is_lo4",semesterActivityTables.path("is_lo4").asInt());
                        semesterActivityObject.put("is_lo5",semesterActivityTables.path("is_lo5").asInt());
                        semesterActivityObject.put("is_lo6",semesterActivityTables.path("is_lo6").asBoolean());
                        semesterActivityObject.put("is_lo7",semesterActivityTables.path("is_lo7").asBoolean());
                        semesterActivityObject.put("is_lo8",semesterActivityTables.path("is_lo8").asBoolean());
                        semesterActivitiesList.add(semesterActivityObject);

                    }
                }
                List<Map<String, Object>> outcomeMatrixList = new ArrayList<>();
                outcomeMatrixNode = jsonNode.path("OutcomeMatrix");
                if(outcomeMatrixNode.isArray()){
                    for (JsonNode outcomeMatrix :outcomeMatrixNode ){
                        Map<String, Object> outcomeMatrixObject = new HashMap<>();
                        outcomeMatrixObject.put("outcome_no",outcomeMatrix.path("outcome_no").intValue());
                        outcomeMatrixObject.put("outcome_description",outcomeMatrix.path("outcome_description").asText());
                        outcomeMatrixObject.put("contribution_level1",outcomeMatrix.path("contribution_level1").asBoolean());
                        outcomeMatrixObject.put("contribution_level2",outcomeMatrix.path("contribution_level2").asBoolean());
                        outcomeMatrixObject.put("contribution_level3",outcomeMatrix.path("contribution_level3").asBoolean());
                        outcomeMatrixObject.put("contribution_level4",outcomeMatrix.path("contribution_level4").asBoolean());
                        outcomeMatrixObject.put("contribution_level5",outcomeMatrix.path("contribution_level5").asBoolean());
                        outcomeMatrixObject.put("lo#",outcomeMatrix.path("lo#").asText());
                        outcomeMatrixList.add(outcomeMatrixObject);
                    }

                }



                if (courseCode != null && courseName != null && version != null) {
                    System.out.println("Inside the if statement");
                    String DB_URL = "jdbc:sqlite:Syllabus_DB.db";
                    try (Connection connection = DriverManager.getConnection(DB_URL)) {
                        String selectSql = "SELECT MAX(version) as maxVersion FROM Course WHERE course_code = ?";
                        try (PreparedStatement selectStatement = connection.prepareStatement(selectSql)) {
                            selectStatement.setString(1, courseCode);
                            ResultSet resultSet = selectStatement.executeQuery();

                            if (resultSet.next()) {
                                double currentVersion = resultSet.getDouble("maxVersion");
                                double newVersion = currentVersion + 1;

                                String insertSql = "INSERT INTO Course (course_code, course_name, version) VALUES (?, ?, ?)";
                                try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                                    insertStatement.setString(1, courseCode);
                                    insertStatement.setString(2, courseName);
                                    insertStatement.setDouble(3, newVersion);
                                    insertStatement.executeUpdate();
                                    System.out.println("Data has been added to the Course table.");
                                }
                                String courseHoursQuery = "INSERT INTO CourseHours (course_code, version, is_fall, is_spring, theory, lab_application, local_credits, ects) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementHours = connection.prepareStatement(courseHoursQuery)) {
                                    preparedStatementHours.setString(1, courseCode);
                                    preparedStatementHours.setDouble(2, newVersion);
                                    preparedStatementHours.setBoolean(3, fall);
                                    preparedStatementHours.setBoolean(4, spring);
                                    preparedStatementHours.setInt(5, theory);
                                    preparedStatementHours.setInt(6, labApplication);
                                    preparedStatementHours.setInt(7, localCredits);
                                    preparedStatementHours.setInt(8, ects);
                                    preparedStatementHours.executeUpdate();
                                    System.out.println("Data has been added to the Hours table.");

                                }
                                String courseDetailQuery = "INSERT INTO CourseDetails (course_code, version, prerequisites, course_language, course_type, course_level, teaching_methods) VALUES (?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementDetail = connection.prepareStatement(courseDetailQuery)) {
                                    preparedStatementDetail.setString(1, courseCode);
                                    preparedStatementDetail.setDouble(2, newVersion);
                                    preparedStatementDetail.setString(3, prerequisities);
                                    preparedStatementDetail.setString(4, courseLanguage != null ? courseLanguage : "");
                                    preparedStatementDetail.setString(5, courseType != null ? courseType : "");
                                    preparedStatementDetail.setString(6, courseLevel);
                                    preparedStatementDetail.setString(7, teachingMethods);
                                    preparedStatementDetail.executeUpdate();
                                    System.out.println("Data has been added to the Details table.");

                                }
                                String courseInstructorsQuery = "INSERT INTO CourseInstructors (course_code, version,course_coordinator,course_lecturers,assistants) VALUES (?,?,?,?,?)";
                                try (PreparedStatement preparedStatementInstructors = connection.prepareStatement(courseInstructorsQuery)) {
                                    preparedStatementInstructors.setString(1, courseCode);
                                    preparedStatementInstructors.setDouble(2, newVersion);
                                    preparedStatementInstructors.setString(3, courseCordinator);
                                    preparedStatementInstructors.setString(4, courseLecturers);
                                    preparedStatementInstructors.setString(5, courseAssistants);
                                    preparedStatementInstructors.executeUpdate();
                                    System.out.println("Data has been added to the Instructors table.");

                                }

                                String courseMaterialsQuery = "INSERT INTO CourseMaterials (course_code, version,notes_textbooks,suggested_readings) VALUES (?,?,?, ?)";
                                try (PreparedStatement preparedStatementMaterials = connection.prepareStatement(courseMaterialsQuery)) {

                                    preparedStatementMaterials.setString(1, courseCode);
                                    preparedStatementMaterials.setDouble(2,newVersion);
                                    preparedStatementMaterials.setString(3, notexTextbooks);
                                    preparedStatementMaterials.setString(4, suggestedReadings);
                                    preparedStatementMaterials.executeUpdate();
                                    System.out.println("Data has been added to the CourseMaterials table.");
                                }
                                String courseObjectiveQuery = "INSERT INTO CourseObjective (course_code, version,course_objectives,learning_outcomes,course_description) VALUES (?,?,?,?,?)";
                                try (PreparedStatement preparedStatementObjectives = connection.prepareStatement(courseObjectiveQuery)) {
                                    preparedStatementObjectives.setString(1, courseCode);
                                    preparedStatementObjectives.setDouble(2, newVersion);
                                    preparedStatementObjectives.setString(3, courseObjectives);
                                    preparedStatementObjectives.setString(4, learningOutcomeObjectives);
                                    preparedStatementObjectives.setString(5, courseObjectiveDescription);
                                    preparedStatementObjectives.executeUpdate();
                                    System.out.println("Data has been added to the Objectıve table.");

                                }
                                String courseCategoryQuery = "INSERT INTO CourseCategory (course_code, version, course_category) VALUES (?, ?, ?)";
                                try (PreparedStatement preparedStatementCategory = connection.prepareStatement(courseCategoryQuery)) {
                                    preparedStatementCategory.setString(1, courseCode);
                                    preparedStatementCategory.setDouble(2, newVersion);
                                    preparedStatementCategory.setString(3, courseCategory);
                                    preparedStatementCategory.executeUpdate();
                                    System.out.println("Data has been added to the Category table.");

                                }
                                String weeklyMaterialsQuery = "INSERT INTO WeeklySubjectsMaterials (course_code, version, week, subjects, required_materials) VALUES (?,?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementMaterials = connection.prepareStatement(weeklyMaterialsQuery)) {
                                    for (Map<String, Object> weeklyMaterial : weeklySubjectsMaterialsList) {
                                        preparedStatementMaterials.setString(1, courseCode);
                                        preparedStatementMaterials.setDouble(2, newVersion);
                                        preparedStatementMaterials.setInt(3, (int) weeklyMaterial.get("week"));
                                        preparedStatementMaterials.setString(4, (String) weeklyMaterial.get("subjects"));
                                        preparedStatementMaterials.setString(5, (String) weeklyMaterial.get("requiredMaterials"));
                                        preparedStatementMaterials.executeUpdate();
                                    }
                                    System.out.println("Data has been added to the WeeklySubjectsMaterials table.");
                                }
                                String workLoadTableQuery = "INSERT INTO WorkloadTable (course_code, version, semester_activities, numb_of_activites, duration_of_activities, workload_of_activities) VALUES (?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementWorkload = connection.prepareStatement(workLoadTableQuery)) {
                                    for (Map<String, Object> workLoadTables : workLoadTableList) {
                                        preparedStatementWorkload.setString(1, courseCode);
                                        preparedStatementWorkload.setDouble(2, newVersion);
                                        preparedStatementWorkload.setString(3, workLoadTables.get("semester_activities").toString());
                                        preparedStatementWorkload.setInt(4, (int) workLoadTables.get("numb_of_activites"));
                                        preparedStatementWorkload.setInt(5, (int) workLoadTables.get("duration_of_activities"));
                                        preparedStatementWorkload.setInt(6, (int) workLoadTables.get("workload_of_activities"));
                                        preparedStatementWorkload.executeUpdate();
                                    }
                                    System.out.println("Data has been added to the Workload table.");
                                }
                                String semesterActivitiesTable = "INSERT INTO SemesterActivities(course_code, version, activity_name, numb_of_activity, activity_weight, is_lo1, is_lo2, is_lo3, is_lo4, is_lo5, is_lo6, is_lo7, is_lo8) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";

                                try (PreparedStatement preparedStatementsemesterActivity = connection.prepareStatement(semesterActivitiesTable)) {
                                    for (Map<String, Object> activityObject : semesterActivitiesList) {
                                        try {
                                            preparedStatementsemesterActivity.setString(1, courseCode);
                                            preparedStatementsemesterActivity.setDouble(2, newVersion);
                                            preparedStatementsemesterActivity.setString(3, activityObject.get("activity_name").toString());
                                            preparedStatementsemesterActivity.setInt(4, (int) activityObject.get("numb_of_activity"));
                                            preparedStatementsemesterActivity.setInt(5, (int) activityObject.get("activity_weight"));
                                            preparedStatementsemesterActivity.setInt(6, (int) activityObject.get("is_lo1"));
                                            preparedStatementsemesterActivity.setInt(7, (int) activityObject.get("is_lo2"));
                                            preparedStatementsemesterActivity.setInt(8, (int) activityObject.get("is_lo3"));
                                            preparedStatementsemesterActivity.setInt(9, (int) activityObject.get("is_lo4"));
                                            preparedStatementsemesterActivity.setInt(10, (int) activityObject.get("is_lo5"));
                                            preparedStatementsemesterActivity.setBoolean(11, (Boolean) activityObject.get("is_lo6"));
                                            preparedStatementsemesterActivity.setBoolean(12, (Boolean) activityObject.get("is_lo7"));
                                            preparedStatementsemesterActivity.setBoolean(13, (Boolean) activityObject.get("is_lo8"));
                                            preparedStatementsemesterActivity.executeUpdate();
                                        } catch (SQLException e) {
                                            e.printStackTrace();
                                            System.out.println("Hata Olan activityObject: " + activityObject);
                                        }
                                    }
                                    System.out.println("Data has been added to the SemesterActivity table.");
                                }
                                String outcomeMatrixQuery = "INSERT INTO OutcomeMatrix (course_code, version, outcome_no, outcome_description, " +
                                        "contribution_level1, contribution_level2, contribution_level3, contribution_level4, " +
                                        "contribution_level5, \"lo#\") " +
                                        "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementOutcomeMatrix = connection.prepareStatement(outcomeMatrixQuery)) {
                                    for (Map<String, Object> outcomeMatrixs : outcomeMatrixList) {
                                        preparedStatementOutcomeMatrix.setString(1, courseCode);
                                        preparedStatementOutcomeMatrix.setDouble(2, newVersion);
                                        preparedStatementOutcomeMatrix.setInt(3, (int )outcomeMatrixs.get("outcome_no"));
                                        preparedStatementOutcomeMatrix.setString(4,outcomeMatrixs.get("outcome_description").toString());
                                        preparedStatementOutcomeMatrix.setBoolean(5,(Boolean) outcomeMatrixs.get("contribution_level1"));
                                        preparedStatementOutcomeMatrix.setBoolean(6,(Boolean) outcomeMatrixs.get("contribution_level2"));
                                        preparedStatementOutcomeMatrix.setBoolean(7,(Boolean) outcomeMatrixs.get("contribution_level3"));
                                        preparedStatementOutcomeMatrix.setBoolean(8,(Boolean) outcomeMatrixs.get("contribution_level4"));
                                        preparedStatementOutcomeMatrix.setBoolean(9,(Boolean) outcomeMatrixs.get("contribution_level5"));
                                        preparedStatementOutcomeMatrix.setString(10,outcomeMatrixs.get("lo#").toString());
                                        preparedStatementOutcomeMatrix.executeUpdate();

                                    }
                                    System.out.println("Data has been added to the OutcomeMatrix table.");

                                }

                            }

                            else {
                                // İlgili course_code'a ait herhangi bir kayıt yok, yeni bir kayıt ekle
                                String insertSql = "INSERT INTO Course (course_code, course_name, version) VALUES (?, ?, ?)";
                                try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                                    insertStatement.setString(1, courseCode);
                                    insertStatement.setString(2, courseName);
                                    insertStatement.setDouble(3, version);
                                    insertStatement.executeUpdate();
                                    System.out.println("Data has been added to the Course table.");
                                }
                                String courseHoursQuery = "INSERT INTO CourseHours (course_code, version, is_fall, is_spring, theory, lab_application, local_credits, ects) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementHours = connection.prepareStatement(courseHoursQuery)) {
                                    preparedStatementHours.setString(1, courseCode);
                                    preparedStatementHours.setDouble(2, version);
                                    preparedStatementHours.setBoolean(3, fall);
                                    preparedStatementHours.setBoolean(4, spring);
                                    preparedStatementHours.setInt(5, theory);
                                    preparedStatementHours.setInt(6, labApplication);
                                    preparedStatementHours.setInt(7, localCredits);
                                    preparedStatementHours.setInt(8, ects);
                                    preparedStatementHours.executeUpdate();
                                    System.out.println("Data has been added to the Hours table.");

                                }
                                String courseDetailQuery = "INSERT INTO CourseDetails (course_code, version, prerequisites, course_language, course_type, course_level, teaching_methods) VALUES (?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementDetail = connection.prepareStatement(courseDetailQuery)) {
                                    preparedStatementDetail.setString(1, courseCode);
                                    preparedStatementDetail.setDouble(2, version);
                                    preparedStatementDetail.setString(3, prerequisities);
                                    preparedStatementDetail.setString(4, courseLanguage != null ? courseLanguage : "");
                                    preparedStatementDetail.setString(5, courseType != null ? courseType : "");
                                    preparedStatementDetail.setString(6, courseLevel);
                                    preparedStatementDetail.setString(7, teachingMethods);
                                    preparedStatementDetail.executeUpdate();
                                    System.out.println("Data has been added to the Details table.");

                                }
                                String courseInstructorsQuery = "INSERT INTO CourseInstructors (course_code, version,course_coordinator,course_lecturers,assistants) VALUES (?,?,?,?,?)";
                                try (PreparedStatement preparedStatementInstructors = connection.prepareStatement(courseInstructorsQuery)) {
                                    preparedStatementInstructors.setString(1, courseCode);
                                    preparedStatementInstructors.setDouble(2, version);
                                    preparedStatementInstructors.setString(3, courseCordinator);
                                    preparedStatementInstructors.setString(4, courseLecturers);
                                    preparedStatementInstructors.setString(5, courseAssistants);
                                    preparedStatementInstructors.executeUpdate();
                                    System.out.println("Data has been added to the Instructors table.");

                                }

                                String courseMaterialsQuery = "INSERT INTO CourseMaterials (course_code, version,notes_textbooks,suggested_readings) VALUES (?,?,?, ?)";
                                try (PreparedStatement preparedStatementMaterials = connection.prepareStatement(courseMaterialsQuery)) {

                                    preparedStatementMaterials.setString(1, courseCode);
                                    preparedStatementMaterials.setDouble(2,version);
                                    preparedStatementMaterials.setString(3, notexTextbooks);
                                    preparedStatementMaterials.setString(4, suggestedReadings);
                                    preparedStatementMaterials.executeUpdate();
                                    System.out.println("Data has been added to the CourseMaterials table.");
                                }
                                String courseObjectiveQuery = "INSERT INTO CourseObjective (course_code, version,course_objectives,learning_outcomes,course_description) VALUES (?,?,?,?,?)";
                                try (PreparedStatement preparedStatementObjectives = connection.prepareStatement(courseObjectiveQuery)) {
                                    preparedStatementObjectives.setString(1, courseCode);
                                    preparedStatementObjectives.setDouble(2, version);
                                    preparedStatementObjectives.setString(3, courseObjectives);
                                    preparedStatementObjectives.setString(4, learningOutcomeObjectives);
                                    preparedStatementObjectives.setString(5, courseObjectiveDescription);
                                    preparedStatementObjectives.executeUpdate();
                                    System.out.println("Data has been added to the Objectıve table.");

                                }
                                String courseCategoryQuery = "INSERT INTO CourseCategory (course_code, version, course_category) VALUES (?, ?, ?)";
                                try (PreparedStatement preparedStatementCategory = connection.prepareStatement(courseCategoryQuery)) {
                                    preparedStatementCategory.setString(1, courseCode);
                                    preparedStatementCategory.setDouble(2, version);
                                    preparedStatementCategory.setString(3, courseCategory);
                                    preparedStatementCategory.executeUpdate();
                                    System.out.println("Data has been added to the Category table.");

                                }
                                String weeklyMaterialsQuery = "INSERT INTO WeeklySubjectsMaterials (course_code, version, week, subjects, required_materials) VALUES (?,?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementMaterials = connection.prepareStatement(weeklyMaterialsQuery)) {
                                    for (Map<String, Object> weeklyMaterial : weeklySubjectsMaterialsList) {
                                        preparedStatementMaterials.setString(1, courseCode);
                                        preparedStatementMaterials.setDouble(2, version);
                                        preparedStatementMaterials.setInt(3, (int) weeklyMaterial.get("week"));
                                        preparedStatementMaterials.setString(4, (String) weeklyMaterial.get("subjects"));
                                        preparedStatementMaterials.setString(5, (String) weeklyMaterial.get("requiredMaterials"));
                                        preparedStatementMaterials.executeUpdate();
                                    }
                                    System.out.println("Data has been added to the WeeklySubjectsMaterials table.");
                                }
                                String workLoadTableQuery = "INSERT INTO WorkloadTable (course_code, version, semester_activities, numb_of_activites, duration_of_activities, workload_of_activities) VALUES (?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementWorkload = connection.prepareStatement(workLoadTableQuery)) {
                                    for (Map<String, Object> workLoadTables : workLoadTableList) {
                                        preparedStatementWorkload.setString(1, courseCode);
                                        preparedStatementWorkload.setDouble(2, version);
                                        preparedStatementWorkload.setString(3, workLoadTables.get("semester_activities").toString());
                                        preparedStatementWorkload.setInt(4, (int) workLoadTables.get("numb_of_activites"));
                                        preparedStatementWorkload.setInt(5, (int) workLoadTables.get("duration_of_activities"));
                                        preparedStatementWorkload.setInt(6, (int) workLoadTables.get("workload_of_activities"));
                                        preparedStatementWorkload.executeUpdate();
                                    }
                                    System.out.println("Data has been added to the Workload table.");
                                }
                                String semesterActivitiesTable = "INSERT INTO SemesterActivities(course_code, version, activity_name, numb_of_activity, activity_weight, is_lo1, is_lo2, is_lo3, is_lo4, is_lo5,is_lo6,is_lo7,is_lo8) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?)";
                                try (PreparedStatement preparedStatementsemesterActivity = connection.prepareStatement(semesterActivitiesTable)) {
                                    for (Map<String, Object> activityObject : semesterActivitiesList) {
                                        preparedStatementsemesterActivity.setString(1, courseCode);
                                        preparedStatementsemesterActivity.setDouble(2, version);
                                        preparedStatementsemesterActivity.setString(3, activityObject.get("activity_name").toString());
                                        preparedStatementsemesterActivity.setInt(4, (int) activityObject.get("numb_of_activity"));
                                        preparedStatementsemesterActivity.setInt(5, (int) activityObject.get("activity_weight"));
                                        preparedStatementsemesterActivity.setInt(6,  (int) activityObject.get("is_lo1"));
                                        preparedStatementsemesterActivity.setInt(7, (int)  activityObject.get("is_lo2"));
                                        preparedStatementsemesterActivity.setInt(8,  (int) activityObject.get("is_lo3"));
                                        preparedStatementsemesterActivity.setInt(9, (int)  activityObject.get("is_lo4"));
                                        preparedStatementsemesterActivity.setInt(10,  (int) activityObject.get("is_lo5"));
                                        preparedStatementsemesterActivity.setInt(11,  (int) activityObject.get("is_lo6"));
                                        preparedStatementsemesterActivity.setInt(12,  (int) activityObject.get("is_lo7"));
                                        preparedStatementsemesterActivity.setInt(13,  (int) activityObject.get("is_lo8"));
                                        preparedStatementsemesterActivity.executeUpdate();

                                    }
                                    System.out.println("Data has been added to the SemesterActivity table.");

                                }
                                String outcomeMatrixQuery = "INSERT INTO OutcomeMatrix (course_code, version, outcome_no, outcome_description, " +
                                        "contribution_level1, contribution_level2, contribution_level3, contribution_level4, " +
                                        "contribution_level5, \"lo#\") " +
                                        "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement preparedStatementOutcomeMatrix = connection.prepareStatement(outcomeMatrixQuery)) {
                                    for (Map<String, Object> outcomeMatrixs : outcomeMatrixList) {
                                        preparedStatementOutcomeMatrix.setString(1, courseCode);
                                        preparedStatementOutcomeMatrix.setDouble(2, version);
                                        preparedStatementOutcomeMatrix.setInt(3, (int )outcomeMatrixs.get("outcome_no"));
                                        preparedStatementOutcomeMatrix.setString(4,outcomeMatrixs.get("outcome_description").toString());
                                        preparedStatementOutcomeMatrix.setBoolean(5,(Boolean) outcomeMatrixs.get("contribution_level1"));
                                        preparedStatementOutcomeMatrix.setBoolean(6,(Boolean) outcomeMatrixs.get("contribution_level2"));
                                        preparedStatementOutcomeMatrix.setBoolean(7,(Boolean) outcomeMatrixs.get("contribution_level3"));
                                        preparedStatementOutcomeMatrix.setBoolean(8,(Boolean) outcomeMatrixs.get("contribution_level4"));
                                        preparedStatementOutcomeMatrix.setBoolean(9,(Boolean) outcomeMatrixs.get("contribution_level5"));
                                        preparedStatementOutcomeMatrix.setString(10,outcomeMatrixs.get("lo#").toString());
                                        preparedStatementOutcomeMatrix.executeUpdate();

                                    }
                                    System.out.println("Data has been added to the OutcomeMatrix table.");

                                }

                            }
                        }

                        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("importSuccessful.fxml"));
                        Parent root = (Parent)loader.load();
                        Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        Stage newStage = new Stage();
                        newStage.setScene(scene);

                        newStage.setResizable(false);
                        newStage.centerOnScreen();
                        newStage.setTitle("Imported!");
                        newStage.show();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    // Sorun nerede anlamak için bu durumu kontrol edin
                    System.out.println("courseCode, courseName, or version is null.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





    //PAGE 1 getText Methods
    @FXML
    public void saveSyllabusButton(ActionEvent event) throws Exception {

        String courseName = courseNameEnter.getText();
        String courseCode = CodeString.getText().toUpperCase(Locale.ROOT);
        syllabus.setCourseCode(courseCode);
        syllabus.setCourseName(courseName);

        // General Information
        String teachingMethod = teachingMethods.getText();

        String prerequisities = prerequisites.getText();

        // Course Type
        String courseLanguage = "";
        if (CourseLanguageEnglish.isSelected()) {
            courseLanguage = "English";
        } else if (CourseLanguageTurkish.isSelected()) {
            courseLanguage = "Turkish";
        } else if (CourseLanguageSecondForeign.isSelected()) {
            courseLanguage = "Second Foreign Language";
        } else {
            courseLanguage = "";
        }

        // Course Type
        String courseType = "";
        if (TypeRequired.isSelected()) {
            courseType = "Required";
        } else if (TypeElective.isSelected()) {
            courseType = "Elective";
        } else {
            courseType = "";
        }

        // Course Level
        String courseLevel = "";
        if (levelShortCycle.isSelected()) {
            courseLevel = "Short Cycle";
        } else if (LevelFirstCycle.isSelected()) {
            courseLevel = "First Cycle";
        } else if (LevelSecondCycle.isSelected()) {
            courseLevel = "Second Cycle";
        } else if (LevelThirdCycle.isSelected()) {
            courseLevel = "Third Cycle";
        } else {
            courseLevel = "";
        }



        //Course category table
        String courseCategory = "empty";

        if (getCoreCourse().isSelected()) {
            courseCategory = "Core Course";
        } else if (getMajorAreaCourse().isSelected()) {
            courseCategory = "Major Area Course";
        } else if (getSupportiveCourse().isSelected()) {
            courseCategory = "Supportive Course";
        } else if (getCommunicationCourse().isSelected()) {
            courseCategory = "Communication and Management Skills Course";
        } else if (getTransferableSkillCourse().isSelected()) {
            courseCategory = "Transferable Skill Course";
        } else {
            courseCategory = "";
        }
        String fallButton = "";
        //

        //CourseHours Table

        int theory = 0;
        int laboratory = 0;
        int credits = 0;
        int ects = 0;
        try {
            if (TheoryHour.getText() != "") {
                theory = Integer.parseInt(TheoryHour.getText());
            }
            if (ApplicationLabHour.getText() != "") {
                laboratory = Integer.parseInt(ApplicationLabHour.getText());
            }
            if (LocalCredits.getText() != "") {
                credits = Integer.parseInt(LocalCredits.getText());
            }
            if (ECTS.getText() != "") {
                ects = Integer.parseInt(ECTS.getText());
            }


        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String courseCordinator = CourseCoordinator.getText();
        String courseLecturers = CourseLecturer.getText();
        String courseAsistans = CourseAssistants.getText();

        String courseObjective = courseObjectives.getText();
        String learningOutcome = learningOutcomes.getText();
        String courseDescriptions = courseDescription.getText();

        String subject1 = sub1.getText();
        String subject2 = sub2.getText();
        String subject3 = sub3.getText();
        String subject4 = sub4.getText();
        String subject5 = sub5.getText();
        String subject6 = sub6.getText();
        String subject7 = sub7.getText();
        String subject8 = sub8.getText();
        String subject9 = sub9.getText();
        String subject10 = sub10.getText();
        String subject11 = sub11.getText();
        String subject12 = sub12.getText();
        String subject13 = sub13.getText();
        String subject14 = sub14.getText();
        String subject15 = sub15.getText();
        String subject16 = sub16.getText();

        syllabus.getWeekSubjects().add(subject1);
        syllabus.getWeekSubjects().add(subject2);
        syllabus.getWeekSubjects().add(subject3);
        syllabus.getWeekSubjects().add(subject4);
        syllabus.getWeekSubjects().add(subject5);
        syllabus.getWeekSubjects().add(subject6);
        syllabus.getWeekSubjects().add(subject7);
        syllabus.getWeekSubjects().add(subject8);
        syllabus.getWeekSubjects().add(subject9);
        syllabus.getWeekSubjects().add(subject10);
        syllabus.getWeekSubjects().add(subject11);
        syllabus.getWeekSubjects().add(subject12);
        syllabus.getWeekSubjects().add(subject13);
        syllabus.getWeekSubjects().add(subject14);
        syllabus.getWeekSubjects().add(subject15);
        syllabus.getWeekSubjects().add(subject16);


        String requiredMaterials1 = reqM1.getText();
        String requiredMaterials2 = reqM2.getText();
        String requiredMaterials3 = reqM3.getText();
        String requiredMaterials4 = reqM4.getText();
        String requiredMaterials5 = reqM5.getText();
        String requiredMaterials6 = reqM6.getText();
        String requiredMaterials7 = reqM7.getText();
        String requiredMaterials8 = reqM8.getText();
        String requiredMaterials9 = reqM9.getText();
        String requiredMaterials10 = reqM10.getText();
        String requiredMaterials11 = reqM11.getText();
        String requiredMaterials12 = reqM12.getText();
        String requiredMaterials13 = reqM13.getText();
        String requiredMaterials14 = reqM14.getText();
        String requiredMaterials15 = reqM15.getText();
        String requiredMaterials16 = reqM16.getText();

        syllabus.getWeekRequiredMat().add(requiredMaterials1);
        syllabus.getWeekRequiredMat().add(requiredMaterials2);
        syllabus.getWeekRequiredMat().add(requiredMaterials3);
        syllabus.getWeekRequiredMat().add(requiredMaterials4);
        syllabus.getWeekRequiredMat().add(requiredMaterials5);
        syllabus.getWeekRequiredMat().add(requiredMaterials6);
        syllabus.getWeekRequiredMat().add(requiredMaterials7);
        syllabus.getWeekRequiredMat().add(requiredMaterials8);
        syllabus.getWeekRequiredMat().add(requiredMaterials9);
        syllabus.getWeekRequiredMat().add(requiredMaterials10);
        syllabus.getWeekRequiredMat().add(requiredMaterials11);
        syllabus.getWeekRequiredMat().add(requiredMaterials12);
        syllabus.getWeekRequiredMat().add(requiredMaterials13);
        syllabus.getWeekRequiredMat().add(requiredMaterials14);
        syllabus.getWeekRequiredMat().add(requiredMaterials15);
        syllabus.getWeekRequiredMat().add(requiredMaterials16);

        String courseNotes = CourseNotes1.getText();
        String suggestedReadings = SuggestedReadings1.getText();


        int semesterNumber1 = 0;
        if (SemesterNum1.getText() != "") {
            semesterNumber1 = Integer.parseInt(SemesterNum1.getText());
            if (semesterNumber1 < 0) {
                semesterNumber1 = 0;
            }
        } else {
            semesterNumber1 = 0;
        }

        int semesterNumber2 = 0;
        if (SemesterNum2.getText() != "") {
            semesterNumber2 = Integer.parseInt(SemesterNum2.getText());
            if (semesterNumber2 < 0) {
                semesterNumber2 = 0;
            }
        } else {
            semesterNumber2 = 0;
        }

        int semesterNumber3 = 0;
        if (SemesterNum3.getText() != "") {
            semesterNumber3 = Integer.parseInt(SemesterNum3.getText());
            if (semesterNumber3 < 0) {
                semesterNumber3 = 0;
            }
        } else {
            semesterNumber3 = 0;
        }

        int semesterNumber4 = 0;
        if (SemesterNum4.getText() != "") {
            semesterNumber4 = Integer.parseInt(SemesterNum4.getText());
            if (semesterNumber4 < 0) {
                semesterNumber4 = 0;
            }
        } else {
            semesterNumber4 = 0;
        }

        int semesterNumber5 = 0;
        if (SemesterNum5.getText() != "") {
            semesterNumber5 = Integer.parseInt(SemesterNum5.getText());
            if (semesterNumber5 < 0) {
                semesterNumber5 = 0;
            }
        } else {
            semesterNumber5 = 0;
        }

        int semesterNumber6 = 0;
        if (SemesterNum6.getText() != "") {
            semesterNumber6 = Integer.parseInt(SemesterNum6.getText());
            if (semesterNumber6 < 0) {
                semesterNumber6 = 0;
            }
        } else {
            semesterNumber6 = 0;
        }

        int semesterNumber7 = 0;
        if (SemesterNum7.getText() != "") {
            semesterNumber7 = Integer.parseInt(SemesterNum7.getText());
            if (semesterNumber7 < 0) {
                semesterNumber7 = 0;
            }
        } else {
            semesterNumber7 = 0;
        }
        int semesterNumber8 = 0;
        if (SemesterNum8.getText() != "") {
            semesterNumber8 = Integer.parseInt(SemesterNum8.getText());
            if (semesterNumber8 < 0) {
                semesterNumber8 = 0;
            }
        } else {
            semesterNumber8 = 0;
        }


        int semesterNumber9 = 0;
        if (SemesterNum9.getText() != "") {
            semesterNumber9 = Integer.parseInt(SemesterNum9.getText());
            if (semesterNumber9 < 0) {
                semesterNumber9 = 0;
            }
        } else {
            semesterNumber9 = 0;
        }


        int semesterNumber10 = 0;
        if (SemesterNum10.getText() != "") {
            semesterNumber10 = Integer.parseInt(SemesterNum10.getText());
            if (semesterNumber10 < 0) {
                semesterNumber10 = 0;
            }
        } else {
            semesterNumber10 = 0;
        }
        int semesterNumber11 = 0;
        if (SemesterNum11.getText() != "") {
            semesterNumber11 = Integer.parseInt(SemesterNum11.getText());
            if (semesterNumber11 < 0) {
                semesterNumber11 = 0;
            }
        } else {
            semesterNumber11 = 0;
        }

        int semesterNumber12 = 0;
        if (SemesterNum12.getText() != "") {
            semesterNumber12 = Integer.parseInt(SemesterNum12.getText());
            if (semesterNumber12 < 0) {
                semesterNumber12 = 0;
            }
        } else {
            semesterNumber12 = 0;
        }


        syllabus.semesterNumbers.add(semesterNumber1);
        syllabus.semesterNumbers.add(semesterNumber2);
        syllabus.semesterNumbers.add(semesterNumber3);
        syllabus.semesterNumbers.add(semesterNumber4);
        syllabus.semesterNumbers.add(semesterNumber5);
        syllabus.semesterNumbers.add(semesterNumber6);
        syllabus.semesterNumbers.add(semesterNumber7);
        syllabus.semesterNumbers.add(semesterNumber8);
        syllabus.semesterNumbers.add(semesterNumber9);
        syllabus.semesterNumbers.add(semesterNumber10);
        syllabus.semesterNumbers.add(semesterNumber11);
        syllabus.semesterNumbers.add(semesterNumber12);


        //
        //


        int semesterDuration1 = 0;
        if (SemesterDuration1.getText() != "") {
            semesterDuration1 = Integer.parseInt(SemesterDuration1.getText());
            if (semesterDuration1<0){
                semesterDuration1=0;
            }
        }else {
            semesterDuration1=0;
        }

        int semesterDuration2 = 0;
        if (SemesterDuration2.getText() != "") {
            semesterDuration2 = Integer.parseInt(SemesterDuration2.getText());
            if (semesterDuration2<0){
                semesterDuration2=0;
            }
        }else {
            semesterDuration2=0;
        }


        int semesterDuration3 = 0;
        if (SemesterDuration3.getText() != "") {
            semesterDuration3 = Integer.parseInt(SemesterDuration3.getText());
            if (semesterDuration3<0){
                semesterDuration3=0;
            }
        }else {
            semesterDuration3=0;
        }

        int semesterDuration4 = 0;
        if (SemesterDuration4.getText() != "") {
            semesterDuration4 = Integer.parseInt(SemesterDuration4.getText());
            if (semesterDuration4<0){
                semesterDuration4=0;
            }
        }else {
            semesterDuration4=0;
        }


        int semesterDuration5 = 0;
        if (SemesterDuration5.getText() != "") {
            semesterDuration5 = Integer.parseInt(SemesterDuration5.getText());
            if (semesterDuration5<0){
                semesterDuration5=0;
            }
        }else {
            semesterDuration5=0;
        }

        int semesterDuration6 = 0;
        if (SemesterDuration6.getText() != "") {
            semesterDuration6 = Integer.parseInt(SemesterDuration6.getText());
            if (semesterDuration6<0){
                semesterDuration6=0;
            }
        }else {
            semesterDuration6=0;
        }


        int semesterDuration7 = 0;
        if (SemesterDuration7.getText() != "") {
            semesterDuration7 = Integer.parseInt(SemesterDuration7.getText());
            if (semesterDuration7<0){
                semesterDuration7=0;
            }
        }else {
            semesterDuration7=0;
        }


        int semesterDuration8 = 0;
        if (SemesterDuration8.getText() != "") {
            semesterDuration8 = Integer.parseInt(SemesterDuration8.getText());
            if (semesterDuration8<0){
                semesterDuration8=0;
            }
        }else {
            semesterDuration8=0;
        }


        int semesterDuration9 = 0;
        if (SemesterDuration9.getText() != "") {
            semesterDuration9 = Integer.parseInt(SemesterDuration9.getText());
            if (semesterDuration9<0){
                semesterDuration9=0;
            }
        }else {
            semesterDuration9=0;
        }


        int semesterDuration10 = 0;
        if (SemesterDuration10.getText() != "") {
            semesterDuration10 = Integer.parseInt(SemesterDuration10.getText());
            if (semesterDuration10<0){
                semesterDuration10=0;
            }
        }else {
            semesterDuration10=0;
        }


        int semesterDuration11 = 0;
        if (SemesterDuration11.getText() != "") {
            semesterDuration11 = Integer.parseInt(SemesterDuration11.getText());
            if (semesterDuration11<0){
                semesterDuration11=0;
            }
        }else {
            semesterDuration11=0;
        }


        int semesterDuration12 = 0;
        if (SemesterDuration12.getText() != "") {
            semesterDuration12 = Integer.parseInt(SemesterDuration12.getText());
            if (semesterDuration12<0){
                semesterDuration12=0;
            }
        }else {
            semesterDuration12=0;
        }


        syllabus.semesterDuration.add(semesterDuration1);
        syllabus.semesterDuration.add(semesterDuration2);
        syllabus.semesterDuration.add(semesterDuration3);
        syllabus.semesterDuration.add(semesterDuration4);
        syllabus.semesterDuration.add(semesterDuration5);
        syllabus.semesterDuration.add(semesterDuration6);
        syllabus.semesterDuration.add(semesterDuration7);
        syllabus.semesterDuration.add(semesterDuration8);
        syllabus.semesterDuration.add(semesterDuration9);
        syllabus.semesterDuration.add(semesterDuration10);
        syllabus.semesterDuration.add(semesterDuration11);
        syllabus.semesterDuration.add(semesterDuration12);


        int semesterWorkload1 = Integer.parseInt(String.valueOf(syllabus.semesterNumbers.get(0) * syllabus.semesterDuration.get(0)));
        int semesterWorkload2 = Integer.parseInt(String.valueOf(syllabus.semesterNumbers.get(1) * syllabus.semesterDuration.get(1)));


        int semesterWorkload3 = semesterNumber3 * semesterDuration3;
        int semesterWorkload4 = semesterNumber4 * semesterDuration4;
        int semesterWorkload5 = semesterNumber5 * semesterDuration5;
        int semesterWorkload6 = semesterNumber6 * semesterDuration6;
        int semesterWorkload7 = semesterNumber7 * semesterDuration7;
        int semesterWorkload8 = semesterNumber8 * semesterDuration8;
        int semesterWorkload9 = semesterNumber9 * semesterDuration9;
        int semesterWorkload10 = semesterNumber10 * semesterDuration10;
        int semesterWorkload11 = semesterNumber11 * semesterDuration11;
        int semesterWorkload12 = semesterNumber12 * semesterDuration11;


        syllabus.semesterWorkload.add(semesterWorkload1);
        syllabus.semesterWorkload.add(semesterWorkload2);
        syllabus.semesterWorkload.add(semesterWorkload3);
        syllabus.semesterWorkload.add(semesterWorkload4);
        syllabus.semesterWorkload.add(semesterWorkload5);
        syllabus.semesterWorkload.add(semesterWorkload6);
        syllabus.semesterWorkload.add(semesterWorkload7);
        syllabus.semesterWorkload.add(semesterWorkload8);
        syllabus.semesterWorkload.add(semesterWorkload9);
        syllabus.semesterWorkload.add(semesterWorkload10);
        syllabus.semesterWorkload.add(semesterWorkload11);
        syllabus.semesterWorkload.add(semesterWorkload12);


        String programOutcomes1 = outcomes1.getText();
        String programOutcomes2 = outcomes2.getText();
        String programOutcomes3 = outcomes3.getText();
        String programOutcomes4 = outcomes4.getText();
        String programOutcomes5 = outcomes5.getText();
        String programOutcomes6 = outcomes6.getText();
        String programOutcomes7 = outcomes7.getText();
        String programOutcomes8 = outcomes8.getText();
        String programOutcomes9 = outcomes9.getText();
        String programOutcomes10 = outcomes10.getText();
        String programOutcomes11 = outcomes11.getText();
        String programOutcomes12 = outcomes12.getText();
        String programOutcomes13 = outcomes13.getText();

        syllabus.competentiesOutcomes.add(programOutcomes1);
        syllabus.competentiesOutcomes.add(programOutcomes2);
        syllabus.competentiesOutcomes.add(programOutcomes3);
        syllabus.competentiesOutcomes.add(programOutcomes4);
        syllabus.competentiesOutcomes.add(programOutcomes5);
        syllabus.competentiesOutcomes.add(programOutcomes6);
        syllabus.competentiesOutcomes.add(programOutcomes7);
        syllabus.competentiesOutcomes.add(programOutcomes8);
        syllabus.competentiesOutcomes.add(programOutcomes9);
        syllabus.competentiesOutcomes.add(programOutcomes10);
        syllabus.competentiesOutcomes.add(programOutcomes11);
        syllabus.competentiesOutcomes.add(programOutcomes11);
        syllabus.competentiesOutcomes.add(programOutcomes12);

        isContribution11 = contribution11.isSelected();
        isContribution12 = contribution12.isSelected();
        isContribution13 = contribution13.isSelected();
        isContribution14 = contribution14.isSelected();
        isContribution15 = contribution15.isSelected();


        isContribution21 = contribution21.isSelected();
        isContribution22 = contribution22.isSelected();
        isContribution23 = contribution23.isSelected();
        isContribution24 = contribution24.isSelected();
        isContribution25 = contribution25.isSelected();

        isContribution31 = contribution31.isSelected();
        isContribution32 = contribution32.isSelected();
        isContribution33 = contribution33.isSelected();
        isContribution34 = contribution34.isSelected();
        isContribution35 = contribution35.isSelected();

        isContribution41 = contribution41.isSelected();
        isContribution42 = contribution42.isSelected();
        isContribution43 = contribution43.isSelected();
        isContribution44 = contribution44.isSelected();
        isContribution45 = contribution45.isSelected();

        isContribution51 = contribution51.isSelected();
        isContribution52 = contribution52.isSelected();
        isContribution53 = contribution53.isSelected();
        isContribution54 = contribution54.isSelected();
        isContribution55 = contribution55.isSelected();

        isContribution61 = contribution61.isSelected();
        isContribution62 = contribution62.isSelected();
        isContribution63 = contribution63.isSelected();
        isContribution64 = contribution64.isSelected();
        isContribution65 = contribution65.isSelected();

        isContribution71 = contribution71.isSelected();
        isContribution72 = contribution72.isSelected();
        isContribution73 = contribution73.isSelected();
        isContribution74 = contribution74.isSelected();
        isContribution75 = contribution75.isSelected();

        isContribution81 = contribution81.isSelected();
        isContribution82 = contribution82.isSelected();
        isContribution83 = contribution83.isSelected();
        isContribution84 = contribution84.isSelected();
        isContribution85 = contribution85.isSelected();

        isContribution91 = contribution91.isSelected();
        isContribution92 = contribution92.isSelected();
        isContribution93 = contribution93.isSelected();
        isContribution94 = contribution94.isSelected();
        isContribution95 = contribution95.isSelected();

        isContribution101 = contribution101.isSelected();
        isContribution102 = contribution102.isSelected();
        isContribution103 = contribution103.isSelected();
        isContribution104 = contribution104.isSelected();
        isContribution105 = contribution105.isSelected();

        isContribution111 = contribution111.isSelected();
        isContribution112 = contribution112.isSelected();
        isContribution113 = contribution113.isSelected();
        isContribution114 = contribution114.isSelected();
        isContribution115 = contribution115.isSelected();

        isContribution121 = contribution121.isSelected();
        isContribution122 = contribution122.isSelected();
        isContribution123 = contribution123.isSelected();
        isContribution124 = contribution124.isSelected();
        isContribution125 = contribution125.isSelected();

        isContribution131 = contribution131.isSelected();
        isContribution132 = contribution132.isSelected();
        isContribution133 = contribution133.isSelected();
        isContribution134 = contribution134.isSelected();
        isContribution135 = contribution135.isSelected();

        syllabus.contributionLevel1.add(isContribution11);
        syllabus.contributionLevel1.add(isContribution21);
        syllabus.contributionLevel1.add(isContribution31);
        syllabus.contributionLevel1.add(isContribution41);
        syllabus.contributionLevel1.add(isContribution51);
        syllabus.contributionLevel1.add(isContribution61);
        syllabus.contributionLevel1.add(isContribution71);
        syllabus.contributionLevel1.add(isContribution81);
        syllabus.contributionLevel1.add(isContribution91);
        syllabus.contributionLevel1.add(isContribution101);
        syllabus.contributionLevel1.add(isContribution111);
        syllabus.contributionLevel1.add(isContribution121);
        syllabus.contributionLevel1.add(isContribution131);

        syllabus.contributionLevel2.add(isContribution12);
        syllabus.contributionLevel2.add(isContribution22);
        syllabus.contributionLevel2.add(isContribution32);
        syllabus.contributionLevel2.add(isContribution42);
        syllabus.contributionLevel2.add(isContribution42);
        syllabus.contributionLevel2.add(isContribution52);
        syllabus.contributionLevel2.add(isContribution62);
        syllabus.contributionLevel2.add(isContribution72);
        syllabus.contributionLevel2.add(isContribution82);
        syllabus.contributionLevel2.add(isContribution92);
        syllabus.contributionLevel2.add(isContribution102);
        syllabus.contributionLevel2.add(isContribution112);
        syllabus.contributionLevel2.add(isContribution122);
        syllabus.contributionLevel2.add(isContribution132);

        syllabus.contributionLevel3.add(isContribution13);
        syllabus.contributionLevel3.add(isContribution23);
        syllabus.contributionLevel3.add(isContribution33);
        syllabus.contributionLevel3.add(isContribution43);
        syllabus.contributionLevel3.add(isContribution53);
        syllabus.contributionLevel3.add(isContribution63);
        syllabus.contributionLevel3.add(isContribution73);
        syllabus.contributionLevel3.add(isContribution83);
        syllabus.contributionLevel3.add(isContribution93);
        syllabus.contributionLevel3.add(isContribution103);
        syllabus.contributionLevel3.add(isContribution113);
        syllabus.contributionLevel3.add(isContribution123);
        syllabus.contributionLevel3.add(isContribution133);

        syllabus.contributionLevel4.add(isContribution14);
        syllabus.contributionLevel4.add(isContribution24);
        syllabus.contributionLevel4.add(isContribution34);
        syllabus.contributionLevel4.add(isContribution44);
        syllabus.contributionLevel4.add(isContribution54);
        syllabus.contributionLevel4.add(isContribution64);
        syllabus.contributionLevel4.add(isContribution74);
        syllabus.contributionLevel4.add(isContribution84);
        syllabus.contributionLevel4.add(isContribution94);
        syllabus.contributionLevel4.add(isContribution104);
        syllabus.contributionLevel4.add(isContribution114);
        syllabus.contributionLevel4.add(isContribution124);
        syllabus.contributionLevel4.add(isContribution134);

        syllabus.contributionLevel5.add(isContribution15);
        syllabus.contributionLevel5.add(isContribution25);
        syllabus.contributionLevel5.add(isContribution35);
        syllabus.contributionLevel5.add(isContribution45);
        syllabus.contributionLevel5.add(isContribution55);
        syllabus.contributionLevel5.add(isContribution65);
        syllabus.contributionLevel5.add(isContribution75);
        syllabus.contributionLevel5.add(isContribution85);
        syllabus.contributionLevel5.add(isContribution95);
        syllabus.contributionLevel5.add(isContribution105);
        syllabus.contributionLevel5.add(isContribution115);
        syllabus.contributionLevel5.add(isContribution125);
        syllabus.contributionLevel5.add(isContribution135);


        String contributionLevelLO1 = contributionLO1.getText();
        String contributionLevelLO2 = contributionLO2.getText();
        String contributionLevelLO3 = contributionLO3.getText();
        String contributionLevelLO4 = contributionLO4.getText();
        String contributionLevelLO5 = contributionLO5.getText();
        String contributionLevelLO6 = contributionLO6.getText();
        String contributionLevelLO7 = contributionLO7.getText();
        String contributionLevelLO8 = contributionLO8.getText();
        String contributionLevelLO9 = contributionLO9.getText();
        String contributionLevelLO10 = contributionLO10.getText();
        String contributionLevelLO11 = contributionLO11.getText();
        String contributionLevelLO12 = contributionLO12.getText();
        String contributionLevelLO13 = contributionLO13.getText();

        syllabus.learnOutcomesForm.add(contributionLevelLO1);
        syllabus.learnOutcomesForm.add(contributionLevelLO2);
        syllabus.learnOutcomesForm.add(contributionLevelLO3);
        syllabus.learnOutcomesForm.add(contributionLevelLO4);
        syllabus.learnOutcomesForm.add(contributionLevelLO5);
        syllabus.learnOutcomesForm.add(contributionLevelLO6);
        syllabus.learnOutcomesForm.add(contributionLevelLO7);
        syllabus.learnOutcomesForm.add(contributionLevelLO8);
        syllabus.learnOutcomesForm.add(contributionLevelLO9);
        syllabus.learnOutcomesForm.add(contributionLevelLO10);
        syllabus.learnOutcomesForm.add(contributionLevelLO11);
        syllabus.learnOutcomesForm.add(contributionLevelLO12);
        syllabus.learnOutcomesForm.add(contributionLevelLO13);


        if (numParticipation.getText() != "") {
            int no = Integer.parseInt(numParticipation.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }


        if (numLab.getText() != "") {
            int no = Integer.parseInt(numLab.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }


        if (numFieldWork.getText() != "") {
            int no = Integer.parseInt(numFieldWork.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }

        if (numQuiz.getText() != "") {
            int no = Integer.parseInt(numQuiz.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }


        if (numHomework.getText() != "") {
            int no = Integer.parseInt(numHomework.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }


        if (numPresentation.getText() != "") {
            int no = Integer.parseInt(numPresentation.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }

        if (numProject.getText() != "") {
            int no = Integer.parseInt(numProject.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }


        if (numSeminar.getText() != "") {
            int no = Integer.parseInt(numSeminar.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }

        if (numOral.getText() != "") {
            int no = Integer.parseInt(numOral.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }

        if (numMidterm.getText() != "") {
            int no = Integer.parseInt(numMidterm.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }

        if (numFinal.getText() != "") {
            int no = Integer.parseInt(numFinal.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.numberOfActivity.add(no);
        } else {
            syllabus.numberOfActivity.add(0);
        }


//
        //
        //


        if (weightParticipation.getText() != "") {
            int no = Integer.parseInt(weightParticipation.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }

        if (weightLab.getText() != "") {
            int no = Integer.parseInt(weightLab.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        if (weightFieldWork.getText() != "") {
            int no = Integer.parseInt(weightFieldWork.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        if (weightQuiz.getText() != "") {
            int no = Integer.parseInt(weightQuiz.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        if (weightHomework.getText() != "") {
            int no = Integer.parseInt(weightHomework.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        if (weightPresentation.getText() != "") {
            int no = Integer.parseInt(weightPresentation.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        if (weightProject.getText() != "") {
            int no = Integer.parseInt(weightProject.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        if (weightSeminar.getText() != "") {
            int no = Integer.parseInt(weightSeminar.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }

        if (weightOral.getText() != "") {
            int no = Integer.parseInt(weightOral.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }

        if (weightMidterm.getText() != "") {
            int no = Integer.parseInt(weightMidterm.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }

        if (weightFinal.getText() != "") {
            int no = Integer.parseInt(weightFinal.getText());
            if (no < 0) {
                no = 0;
            }
            syllabus.activityWeight.add(no);
        } else {
            syllabus.activityWeight.add(0);
        }


        //

        if (lo1Participation.getText() != "") {
            int no = Integer.parseInt(lo1Participation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }


        if (lo1Lab.getText() != "") {
            int no = Integer.parseInt(lo1Lab.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }


        if (lo1FieldWork.getText() != "") {
            int no = Integer.parseInt(lo1FieldWork.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }


        if (lo1Quiz.getText() != "") {
            int no = Integer.parseInt(lo1Quiz.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }


        if (lo1Homework.getText() != "") {
            int no = Integer.parseInt(lo1Homework.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }

        if (lo1Presentation.getText() != "") {
            int no = Integer.parseInt(lo1Presentation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }

        if (lo1Project.getText() != "") {
            int no = Integer.parseInt(lo1Project.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }


        if (lo1Seminar.getText() != "") {
            int no = Integer.parseInt(lo1Seminar.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }

        if (lo1Oral.getText() != "") {
            int no = Integer.parseInt(lo1Oral.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }

        if (lo1Midterm.getText() != "") {
            int no = Integer.parseInt(lo1Midterm.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }


        if (lo1Final.getText() != "") {
            int no = Integer.parseInt(lo1Final.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome1.add(no);
        } else {
            syllabus.learningOutcome1.add(0);
        }

        //


        if (lo2Participation.getText() != "") {
            int no = Integer.parseInt(lo2Participation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }


        if (lo2Lab.getText() != "") {
            int no = Integer.parseInt(lo2Lab.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }


        if (lo2FieldWork.getText() != "") {
            int no = Integer.parseInt(lo2FieldWork.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }


        if (lo2Quiz.getText() != "") {
            int no = Integer.parseInt(lo2Quiz.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }


        if (lo2Homework.getText() != "") {
            int no = Integer.parseInt(lo2Homework.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }


        if (lo2Presentation.getText() != "") {
            int no = Integer.parseInt(lo2Presentation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }

        if (lo2Project.getText() != "") {
            int no = Integer.parseInt(lo2Project.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }


        if (lo2Seminar.getText() != "") {
            int no = Integer.parseInt(lo2Seminar.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }

        if (lo2Oral.getText() != "") {
            int no = Integer.parseInt(lo2Oral.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }

        if (lo2Midterm.getText() != "") {
            int no = Integer.parseInt(lo2Midterm.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }

        if (lo2Final.getText() != "") {
            int no = Integer.parseInt(lo2Final.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome2.add(no);
        } else {
            syllabus.learningOutcome2.add(0);
        }

        //


        if (lo3Participation.getText() != "") {
            int no = Integer.parseInt(lo3Participation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }


        if (lo3Lab.getText() != "") {
            int no = Integer.parseInt(lo3Lab.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }


        if (lo3FieldWork.getText() != "") {
            int no = Integer.parseInt(lo3FieldWork.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }


        if (lo3Quiz.getText() != "") {
            int no = Integer.parseInt(lo3Quiz.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }


        if (lo3Homework.getText() != "") {
            int no = Integer.parseInt(lo3Homework.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }


        if (lo3Presentation.getText() != "") {
            int no = Integer.parseInt(lo3Presentation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }

        if (lo3Project.getText() != "") {
            int no = Integer.parseInt(lo3Project.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }

        if (lo3Seminar.getText() != "") {
            int no = Integer.parseInt(lo3Seminar.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }

        if (lo3Oral.getText() != "") {
            int no = Integer.parseInt(lo3Oral.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }

        if (lo3Midterm.getText() != "") {
            int no = Integer.parseInt(lo3Midterm.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }

        if (lo3Final.getText() != "") {
            int no = Integer.parseInt(lo3Final.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome3.add(no);
        } else {
            syllabus.learningOutcome3.add(0);
        }
        //


        if (lo4Participation.getText() != "") {
            int no = Integer.parseInt(lo4Participation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }


        if (lo4Lab.getText() != "") {
            int no = Integer.parseInt(lo4Lab.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }


        if (lo4FieldWork.getText() != "") {
            int no = Integer.parseInt(lo4FieldWork.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }


        if (lo4Quiz.getText() != "") {
            int no = Integer.parseInt(lo4Quiz.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }
        if (lo4Homework.getText() != "") {
            int no = Integer.parseInt(lo4Homework.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }
        if (lo4Presentation.getText() != "") {
            int no = Integer.parseInt(lo4Presentation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }

        if (lo4Project.getText() != "") {
            int no = Integer.parseInt(lo4Project.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }


        if (lo4Seminar.getText() != "") {
            int no = Integer.parseInt(lo4Seminar.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }

        if (lo4Oral.getText() != "") {
            int no = Integer.parseInt(lo4Oral.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }

        if (lo4Midterm.getText() != "") {
            int no = Integer.parseInt(lo4Midterm.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }

        if (lo4Final.getText() != "") {
            int no = Integer.parseInt(lo4Final.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome4.add(no);
        } else {
            syllabus.learningOutcome4.add(0);
        }

        //


        if (lo5Participation.getText() != "") {
            int no = Integer.parseInt(lo5Participation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }

        if (lo5Lab.getText() != "") {
            int no = Integer.parseInt(lo5Lab.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }
        if (lo5FieldWork.getText() != "") {
            int no = Integer.parseInt(lo5FieldWork.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }
        if (lo5Quiz.getText() != "") {
            int no = Integer.parseInt(lo5Quiz.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }
        if (lo5Homework.getText() != "") {
            int no = Integer.parseInt(lo5Homework.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }
        if (lo5Presentation.getText() != "") {
            int no = Integer.parseInt(lo5Presentation.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }

        if (lo5Project.getText() != "") {
            int no = Integer.parseInt(lo5Project.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }
        if (lo5Seminar.getText() != "") {
            int no = Integer.parseInt(lo5Seminar.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }

        if (lo5Oral.getText() != "") {
            int no = Integer.parseInt(lo5Oral.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }

        if (lo5Midterm.getText() != "") {
            int no = Integer.parseInt(lo5Midterm.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }

        if (lo5Final.getText() != "") {
            int no = Integer.parseInt(lo5Final.getText());
            if (no < 0) {
                no = 0;
            } else if (no > 1) {
                no = 1;
            }
            syllabus.learningOutcome5.add(no);
        } else {
            syllabus.learningOutcome5.add(0);
        }


        // Create a Syllabus object with the gathered information
        syllabus.setCourseCode(courseCode);
        syllabus.setCourseName(courseName);
        syllabus.setPrerequisities(prerequisities);
        syllabus.setCourseLanguage(courseLanguage);
        syllabus.setCourseType(courseType);
        syllabus.setCourseLevel(courseLevel);
        syllabus.setTeachingMethods(teachingMethod);
        syllabus.setCourseCategory(courseCategory);
        if (SpringButton.isSelected()) {
            isCrossAddedSpring = true;
        } else {
            isCrossAddedSpring = false;
        }

        syllabus.setSpring(isCrossAddedSpring);

        if (FallButton.isSelected()) {
            isCrossAddedFall = true;
        } else {
            isCrossAddedFall = false;
        }
        syllabus.setFall(isCrossAddedFall);
        syllabus.setTheoryHours(theory);
        syllabus.setLabHours(laboratory);
        syllabus.setLocalCredits(credits);
        syllabus.setECTS(ects);
        syllabus.setCourseCoordinator(courseCordinator);
        syllabus.setCourseLecturers(courseLecturers);
        syllabus.setAssistants(courseAsistans);
        syllabus.setCourseObjectives(courseObjective);
        syllabus.setLearningOutcomes(learningOutcome);
        syllabus.setCourseDescriptions(courseDescriptions);
        syllabus.setWeekSub1(subject1);
        syllabus.setWeekSub2(subject2);
        syllabus.setWeekSub3(subject3);
        syllabus.setWeekSub4(subject4);
        syllabus.setWeekSub5(subject5);
        syllabus.setWeekSub6(subject6);
        syllabus.setWeekSub7(subject7);
        syllabus.setWeekSub8(subject8);
        syllabus.setWeekSub9(subject9);
        syllabus.setWeekSub10(subject10);
        syllabus.setWeekSub11(subject11);
        syllabus.setWeekSub12(subject12);
        syllabus.setWeekSub13(subject13);
        syllabus.setWeekSub14(subject14);
        syllabus.setWeekSub15(subject15);
        syllabus.setWeekSub16(subject16);
        syllabus.setWeekReq1(requiredMaterials1);
        syllabus.setWeekReq2(requiredMaterials2);
        syllabus.setWeekReq3(requiredMaterials3);
        syllabus.setWeekReq4(requiredMaterials4);
        syllabus.setWeekReq5(requiredMaterials5);
        syllabus.setWeekReq6(requiredMaterials6);
        syllabus.setWeekReq7(requiredMaterials7);
        syllabus.setWeekReq8(requiredMaterials8);
        syllabus.setWeekReq9(requiredMaterials9);
        syllabus.setWeekReq10(requiredMaterials10);
        syllabus.setWeekReq11(requiredMaterials11);
        syllabus.setWeekReq12(requiredMaterials12);
        syllabus.setWeekReq13(requiredMaterials13);
        syllabus.setWeekReq14(requiredMaterials14);
        syllabus.setWeekReq15(requiredMaterials15);
        syllabus.setWeekReq16(requiredMaterials16);
        syllabus.setSuggestedReadings(suggestedReadings);
        syllabus.setCourseNotes(courseNotes);

        syllabus.setVersion(countSyllabus(syllabus.getCourseCode()) + 1.0);


        // Add the syllabus to the database
        addSyllabus(syllabus);

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("saveSuccessful.fxml"));
        Parent root = (Parent)loader.load();
        Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        Stage newStage = new Stage();
        newStage.setScene(scene);

        newStage.setResizable(false);
        newStage.centerOnScreen();
        newStage.setTitle("Saved!");
        newStage.show();
    }

    public void openForm(String courseCode,double version) throws Exception {
        Syllabus syllabus1=new Syllabus();

        // JDBC bağlantısı
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {

            // Veritabanına bağlan

            // Örnek bir sorgu: "SELECT * FROM Course WHERE course_code = ?;"
            String sql = "SELECT * FROM Course WHERE course_code = ? AND version=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Parametreleri ayarla
                statement.setString(1, courseCode);
                statement.setDouble(2,version);

                // Sorguyu çalıştır ve sonucu al
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Veritabanından gelen veriyi kullan


                        // GeneralInformation içindeki tüm attribute'ları set et

                        syllabus1.setCourseName(resultSet.getString("course_name"));
                        syllabus1.setCourseCode(resultSet.getString("course_code"));

                    }
                }
            }
            String courseCategoryTable = "SELECT * FROM CourseCategory WHERE course_code =? AND version=?";
            try (PreparedStatement categoryStatement = connection.prepareStatement(courseCategoryTable)) {
                categoryStatement.setString(1, courseCode);
                categoryStatement.setDouble(2,version);
                try (ResultSet resultSet = categoryStatement.executeQuery()) {
                    if (resultSet.next()) {
                        String courseCategory = resultSet.getString("course_category");

                        syllabus1.setCourseCategory(courseCategory);
                    }
                }
            }


            String courseDetailsTable="SELECT * FROM CourseDetails WHERE course_code =? AND version=?";
            try (PreparedStatement detailsStatement = connection.prepareStatement(courseDetailsTable)){
                detailsStatement.setString(1, courseCode);
                detailsStatement.setDouble(2,version);
                try (ResultSet resultSet = detailsStatement.executeQuery()) {
                    if (resultSet.next()){
                        syllabus1.setPrerequisities(resultSet.getString("prerequisites"));
                        syllabus1.setCourseLanguage(resultSet.getString("course_language"));
                        syllabus1.setCourseType(resultSet.getString("course_type"));
                        syllabus1.setCourseLevel(resultSet.getString("course_level"));
                        syllabus1.setTeachingMethods(resultSet.getString("teaching_methods"));
                    }
                }
            }



            String courseHoursTable="SELECT * FROM CourseHours WHERE course_code =? AND version=?";
            try (PreparedStatement hoursStatement = connection.prepareStatement(courseHoursTable)){
                hoursStatement.setString(1, courseCode);
                hoursStatement.setDouble(2,version);
                try (ResultSet resultSet = hoursStatement.executeQuery()) {
                    if (resultSet.next()){


                        syllabus1.setFall(resultSet.getBoolean("is_fall"));
                        syllabus1.setSpring(resultSet.getBoolean("is_spring"));
                        syllabus1.setTheoryHours(resultSet.getInt("theory"));
                        syllabus1.setLabHours(resultSet.getInt("lab_application"));
                        syllabus1.setLocalCredits(resultSet.getInt("local_credits"));
                        syllabus1.setECTS(resultSet.getInt("ects"));
                    }
                }
            }
            String courseObjectiveTables="SELECT * FROM CourseObjective WHERE course_code =? AND version=?";
            try (PreparedStatement objectiveStatement = connection.prepareStatement(courseObjectiveTables)){
                objectiveStatement.setString(1, courseCode);
                objectiveStatement.setDouble(2,version);
                try (ResultSet resultSet = objectiveStatement.executeQuery()) {
                    if(resultSet.next()){

                        syllabus1.setCourseObjectives(resultSet.getString("course_objectives"));
                        syllabus1.setLearningOutcomes(resultSet.getString("learning_outcomes"));
                        syllabus1.setCourseDescriptions(resultSet.getString("course_description"));
                    }

                }
            }
            String courseInstructorTable = "SELECT * FROM CourseInstructors  WHERE course_code =? AND version=?";
            try (PreparedStatement instructorsStatement = connection.prepareStatement(courseInstructorTable)) {
                instructorsStatement.setString(1, courseCode);
                instructorsStatement.setDouble(2,version);
                try (ResultSet resultSet = instructorsStatement.executeQuery()) {
                    if (resultSet.next()) {
                        syllabus1.setCourseCoordinator(resultSet.getString("course_coordinator"));
                        syllabus1.setCourseLecturers(resultSet.getString("course_lecturers"));
                        syllabus1.setAssistants(resultSet.getString("assistants"));
                    }
                }
            }

            String courseCourseMaterials = "SELECT * FROM CourseMaterials WHERE course_code =? AND version=? ";
            try (PreparedStatement courseMaterialsStatement = connection.prepareStatement(courseCourseMaterials)) {
                courseMaterialsStatement.setString(1, courseCode);
                courseMaterialsStatement.setDouble(2,version);
                try (ResultSet resultSet = courseMaterialsStatement.executeQuery()) {
                    if (resultSet.next()) {
                     syllabus1.setCourseNotes(resultSet.getString("notes_textbooks"));
                     syllabus1.setSuggestedReadings(resultSet.getString("suggested_readings"));
                    }
                }
            }

            String courseSubjectMaterials = "SELECT * FROM WeeklySubjectsMaterials WHERE course_code = ? AND week = ? AND version=?";
            try (PreparedStatement courseSubjectStatement = connection.prepareStatement(courseSubjectMaterials)) {
                for (int i = 1; i <= 16; i++) {
                    courseSubjectStatement.setString(1, courseCode);
                    courseSubjectStatement.setString(2, String.valueOf(i));
                    courseSubjectStatement.setDouble(3,version);

                    try (ResultSet resultSet = courseSubjectStatement.executeQuery()) {

                    if (resultSet.next()) {

                        syllabus1.weekSubjects.add(resultSet.getString("subjects"));
                        syllabus1.weekRequiredMat.add(resultSet.getString("required_materials"));


                    }}}}


            //table4
            String courseWorkloadTable = "SELECT * FROM WorkloadTable WHERE course_code = ? AND semester_activities=? AND version=?";

            syllabus1.semesterActivity.add("Course Hours(Including exam week: 16 x total hours)");
            syllabus1.semesterActivity.add("Laboratory/Application Hours(Including exam week: 16 x total hours)");
            syllabus1.semesterActivity.add("Study Hours out of Class");
            syllabus1.semesterActivity.add("Field Work");
            syllabus1.semesterActivity.add("Quiz/Studio Critique");
            syllabus1.semesterActivity.add("Homework/Assignments");
            syllabus1.semesterActivity.add("Presentation/Jury");
            syllabus1.semesterActivity.add("Project");
            syllabus1.semesterActivity.add("Seminar/Workshop");
            syllabus1.semesterActivity.add("Oral Exam");
            syllabus1.semesterActivity.add("Midterm");
            syllabus1.semesterActivity.add("Final Exam");
            try (PreparedStatement courseWorkloadTableStatement = connection.prepareStatement(courseWorkloadTable)) {
                for (int i = 0; i < syllabus1.semesterActivity.size(); i++) {
                    courseWorkloadTableStatement.setString(1, courseCode);
                    courseWorkloadTableStatement.setString(2,syllabus1.semesterActivity.get(i));
                    courseWorkloadTableStatement.setDouble(3,version);

                    try (ResultSet resultSet = courseWorkloadTableStatement.executeQuery()) {

                        if (resultSet.next()) {

                            syllabus1.semesterNumbers.add(resultSet.getInt("numb_of_activites"));
                            syllabus1.semesterDuration.add(resultSet.getInt("duration_of_activities"));
                            syllabus1.semesterWorkload.add(resultSet.getInt("workload_of_activities"));


                        }
                    }
                }
            }
            String outcomeMatrixTable = "SELECT * FROM OutcomeMatrix WHERE course_code = ? AND outcome_no= ? AND version=?";
            try (PreparedStatement courseoutcomeMatrixStatement = connection.prepareStatement(outcomeMatrixTable)) {
                int outcomeNo;
                for (int i = 0; i < 13; i++) {
                    courseoutcomeMatrixStatement.setString(1, courseCode);
                    courseoutcomeMatrixStatement.setInt(2,(i+1));
                    courseoutcomeMatrixStatement.setDouble(3,version);
                    try (ResultSet resultSet = courseoutcomeMatrixStatement.executeQuery()) {

                        if (resultSet.next()) {
                               syllabus1.competentiesOutcomes.add(resultSet.getString("outcome_description"));
                               syllabus1.contributionLevel1.add(resultSet.getBoolean("contribution_level1"));
                               syllabus1.contributionLevel2.add(resultSet.getBoolean("contribution_level2"));
                               syllabus1.contributionLevel3.add(resultSet.getBoolean("contribution_level3"));
                               syllabus1.contributionLevel4.add(resultSet.getBoolean("contribution_level4"));
                               syllabus1.contributionLevel5.add(resultSet.getBoolean("contribution_level5"));
                               syllabus1.learnOutcomesForm.add(resultSet.getString("lo#"));
                        }
                    }
                }
            }


            String semesterActivitiesTable= "SELECT * FROM SemesterActivities WHERE course_code = ? AND activity_name=? AND version=?";

            syllabus1.semesterActivityName.add("Participation");
            syllabus1.semesterActivityName.add("Laboratory/Application");
            syllabus1.semesterActivityName.add("Field Work");
            syllabus1.semesterActivityName.add("Quiz/Studio Critique");
            syllabus1.semesterActivityName.add("Homework/Assignment");
            syllabus1.semesterActivityName.add("Presentation/Jury");
            syllabus1.semesterActivityName.add("Project");
            syllabus1.semesterActivityName.add("Seminar/Workshop");
            syllabus1.semesterActivityName.add("Oral Exam");
            syllabus1.semesterActivityName.add("Midterm");
            syllabus1.semesterActivityName.add("Final Exam");

            try (PreparedStatement semesterActivityStatement = connection.prepareStatement(semesterActivitiesTable)) {
                for (int i = 0; i < syllabus1.semesterActivityName.size(); i++) {
                    semesterActivityStatement.setString(1, courseCode);
                    semesterActivityStatement.setString(2, syllabus1.semesterActivityName.get(i));
                    semesterActivityStatement.setDouble(3,version);

                    try (ResultSet resultSet = semesterActivityStatement.executeQuery()) {

                        if (resultSet.next()) {

                          syllabus1.semesterActivityNumber.add(resultSet.getInt("numb_of_activity"));
                          syllabus1.semesterActivityWeight.add(resultSet.getInt("activity_weight") );
                          syllabus1.semesterActivityLO1.add(resultSet.getInt("is_lo1"));
                            syllabus1.semesterActivityLO2.add(resultSet.getInt("is_lo2"));
                            syllabus1.semesterActivityLO3.add(resultSet.getInt("is_lo3"));
                            syllabus1.semesterActivityLO4.add(resultSet.getInt("is_lo4"));
                            syllabus1.semesterActivityLO5.add(resultSet.getInt("is_lo5"));


                        }
                    }
                }
            }

        } catch (SQLException e) {
        }

        if (syllabus1 != null) {
            // Eğer Syllabus bulunduysa, Form'u aç ve verileri set et
           FXMLLoader loader = new FXMLLoader(getClass().getResource("SearchForm.fxml"));
            Parent root = loader.load();

            // Controller içindeki setCode ve setOtherFields metodlarını kullanarak TextField'lara değerleri ata
            Controller controller = loader.getController();
            controller.courseNameEnter.setText(syllabus1.getCourseName());
            controller.CodeString.setText(syllabus1.getCourseCode());

            controller.FallButton.setSelected(syllabus1.isFall());

            controller.SpringButton.setSelected(syllabus1.isSpring());



            controller.TheoryHour.setText(String.valueOf(syllabus1.getTheoryHours()));
            controller.ApplicationLabHour.setText(String.valueOf(syllabus1.getLabHours()));
            controller.LocalCredits.setText(String.valueOf(syllabus1.getLocalCredits()));
            controller.ECTS.setText(String.valueOf(syllabus1.getECTS()));


            //course category
            if ("Supportive Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.SupportiveCourse.setSelected(true);
            } else if ("Major Area Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.MajorAreaCourse.setSelected(true);
            } else if ("Communication and Management Skills Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.CommunicationCourse.setSelected(true);
            } else if ("Transferable Skill Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.TransferableSkillCourse.setSelected(true);
            } else if ("Core Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.CoreCourse.setSelected(true);
            }else {
                controller.SupportiveCourse.setSelected(false);
                controller.MajorAreaCourse.setSelected(false);
                controller.CommunicationCourse.setSelected(false);
                controller.TransferableSkillCourse.setSelected(false);
                controller.CoreCourse.setSelected(false);
            }


            //course details
            controller.prerequisites.setText(syllabus1.getPrerequisities());

            if ("Turkish".equalsIgnoreCase(syllabus1.getCourseLanguage())){
                controller.CourseLanguageTurkish.setSelected(true);
            }else if ("English".equalsIgnoreCase(syllabus1.getCourseLanguage())){
                controller.CourseLanguageEnglish.setSelected(true);
            } else if ("Second Foreign Language".equalsIgnoreCase(syllabus1.getCourseLanguage())) {
                controller.CourseLanguageSecondForeign.setSelected(true);
            }else {
                controller.CourseLanguageTurkish.setSelected(false);
                controller.CourseLanguageEnglish.setSelected(false);
                controller.CourseLanguageSecondForeign.setSelected(false);
            }

            controller.teachingMethods.setText(syllabus1.getTeachingMethods());

            if ("Required".equalsIgnoreCase(syllabus1.getCourseType())){
                controller.TypeRequired.setSelected(true);
            }else if ("Elective".equalsIgnoreCase(syllabus1.getCourseType())){
                controller.TypeElective.setSelected(true);
            }else {
                controller.TypeRequired.setSelected(false);
                controller.TypeElective.setSelected(false);
            }

            if ("Short Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())){
                controller.levelShortCycle.setSelected(true);
            }else if ("First Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())){
                controller.LevelFirstCycle.setSelected(true);
            } else if ("Second Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())) {
                controller.LevelSecondCycle.setSelected(true);
            }else if ("Third Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())) {
                controller.LevelThirdCycle.setSelected(true);
            }else {
                controller.levelShortCycle.setSelected(false);
                controller.LevelFirstCycle.setSelected(false);
                controller.LevelSecondCycle.setSelected(false);
                controller.LevelThirdCycle.setSelected(false);
            }
            controller.courseObjectives.setText(syllabus1.getCourseObjectives());
            controller.learningOutcomes.setText(syllabus1.getLearningOutcomes());
            controller.courseDescription.setText(syllabus1.getCourseDescriptions());
            controller.CourseCoordinator.setText(syllabus1.getCourseCoordinator());
            controller.CourseLecturer.setText(syllabus1.getCourseLecturers());
            controller.CourseAssistants.setText(syllabus1.getAssistants());
            controller.SuggestedReadings1.setText(syllabus1.getSuggestedReadings());
            controller.CourseNotes1.setText(syllabus1.getCourseNotes());

            // WeeklySubjectsMaterials
            //subject Material
            if (!syllabus1.weekSubjects.isEmpty()) {
                controller.sub1.setText(syllabus1.weekSubjects.get(0));
                controller.sub2.setText(syllabus1.weekSubjects.get(1));
                controller.sub3.setText(syllabus1.weekSubjects.get(2));
                controller.sub4.setText(syllabus1.weekSubjects.get(3));
                controller.sub5.setText(syllabus1.weekSubjects.get(4));
                controller.sub6.setText(syllabus1.weekSubjects.get(5));
                controller.sub7.setText(syllabus1.weekSubjects.get(6));
                controller.sub8.setText(syllabus1.weekSubjects.get(7));
                controller.sub9.setText(syllabus1.weekSubjects.get(8));
                controller.sub10.setText(syllabus1.weekSubjects.get(9));
                controller.sub11.setText(syllabus1.weekSubjects.get(10));
                controller.sub12.setText(syllabus1.weekSubjects.get(11));
                controller.sub13.setText(syllabus1.weekSubjects.get(12));
                controller.sub14.setText(syllabus1.weekSubjects.get(13));
                controller.sub15.setText(syllabus1.weekSubjects.get(14));
                controller.sub16.setText(syllabus1.weekSubjects.get(15));
            }

            ///RequiredMaterial
            if (!syllabus1.weekSubjects.isEmpty()) {
                controller.reqM1.setText(syllabus1.weekRequiredMat.get(0));
                controller.reqM2.setText(syllabus1.weekRequiredMat.get(1));
                controller.reqM3.setText(syllabus1.weekRequiredMat.get(2));
                controller.reqM4.setText(syllabus1.weekRequiredMat.get(3));
                controller.reqM5.setText(syllabus1.weekRequiredMat.get(4));
                controller.reqM6.setText(syllabus1.weekRequiredMat.get(5));
                controller.reqM7.setText(syllabus1.weekRequiredMat.get(6));
                controller.reqM8.setText(syllabus1.weekRequiredMat.get(7));
                controller.reqM9.setText(syllabus1.weekRequiredMat.get(8));
                controller.reqM10.setText(syllabus1.weekRequiredMat.get(9));
                controller.reqM11.setText(syllabus1.weekRequiredMat.get(10));
                controller.reqM12.setText(syllabus1.weekRequiredMat.get(11));
                controller.reqM13.setText(syllabus1.weekRequiredMat.get(12));
                controller.reqM14.setText(syllabus1.weekRequiredMat.get(13));
                controller.reqM15.setText(syllabus1.weekRequiredMat.get(14));
                controller.reqM16.setText(syllabus1.weekRequiredMat.get(15));
            }

            //WorkloadTable
            if (!syllabus1.semesterNumbers.isEmpty()) {

                for (int i = 0; i < syllabus1.semesterNumbers.size(); i++) {
                    int semesterNumber = syllabus1.semesterNumbers.get(i);


                    String text = (semesterNumber == 0) ? "" : String.valueOf(semesterNumber);


                    switch (i) {
                        case 0:
                            controller.SemesterNum1.setText(text);
                            break;
                        case 1:
                            controller.SemesterNum2.setText(text);
                            break;
                        case 2:
                            controller.SemesterNum3.setText(text);
                            break;
                        case 3:
                            controller.SemesterNum4.setText(text);
                            break;
                        case 4:
                            controller.SemesterNum5.setText(text);
                            break;
                        case 5:
                            controller.SemesterNum6.setText(text);
                            break;
                        case 6:
                            controller.SemesterNum7.setText(text);
                            break;
                        case 7:
                            controller.SemesterNum8.setText(text);
                            break;
                        case 8:
                            controller.SemesterNum9.setText(text);
                            break;
                        case 9:
                            controller.SemesterNum10.setText(text);
                            break;
                        case 10:
                            controller.SemesterNum11.setText(text);
                            break;
                        case 11:
                            controller.SemesterNum12.setText(text);
                            break;

                    }
                }

               /* controller.SemesterNum1.setText(String.valueOf(syllabus1.semesterNumbers.get(0)));
                controller.SemesterNum2.setText(String.valueOf(syllabus1.semesterNumbers.get(1)));
                controller.SemesterNum3.setText(String.valueOf(syllabus1.semesterNumbers.get(2)));
                controller.SemesterNum4.setText(String.valueOf(syllabus1.semesterNumbers.get(3)));
                controller.SemesterNum5.setText(String.valueOf(syllabus1.semesterNumbers.get(4)));
                controller.SemesterNum6.setText(String.valueOf(syllabus1.semesterNumbers.get(5)));
                controller.SemesterNum7.setText(String.valueOf(syllabus1.semesterNumbers.get(6)));
                controller.SemesterNum8.setText(String.valueOf(syllabus1.semesterNumbers.get(7)));
                controller.SemesterNum9.setText(String.valueOf(syllabus1.semesterNumbers.get(8)));
                controller.SemesterNum10.setText(String.valueOf(syllabus1.semesterNumbers.get(9)));
                controller.SemesterNum11.setText(String.valueOf(syllabus1.semesterNumbers.get(10)));
                controller.SemesterNum12.setText(String.valueOf(syllabus1.semesterNumbers.get(11)));*/
            }

            if (!syllabus1.semesterDuration.isEmpty()) {
                for (int i = 0; i < syllabus1.semesterDuration.size(); i++) {
                    int semesterDurationValue = syllabus1.semesterDuration.get(i);


                    String text = (semesterDurationValue == 0) ? "" : String.valueOf(semesterDurationValue);


                    switch (i) {
                        case 0:
                            controller.SemesterDuration1.setText(text);
                            break;
                        case 1:
                            controller.SemesterDuration2.setText(text);
                            break;
                        case 2:
                            controller.SemesterDuration3.setText(text);
                            break;
                        case 3:
                            controller.SemesterDuration4.setText(text);
                            break;
                        case 4:
                            controller.SemesterDuration5.setText(text);
                            break;
                        case 5:
                            controller.SemesterDuration6.setText(text);
                            break;
                        case 6:
                            controller.SemesterDuration7.setText(text);
                            break;
                        case 7:
                            controller.SemesterDuration8.setText(text);
                            break;
                        case 8:
                            controller.SemesterDuration9.setText(text);
                            break;
                        case 9:
                            controller.SemesterDuration10.setText(text);
                            break;
                        case 10:
                            controller.SemesterDuration11.setText(text);
                            break;
                        case 11:
                            controller.SemesterDuration12.setText(text);
                            break;

                    }
                }
              /*  controller.SemesterDuration1.setText(String.valueOf(syllabus1.semesterDuration.get(0)));
                controller.SemesterDuration2.setText(String.valueOf(syllabus1.semesterDuration.get(1)));
                controller.SemesterDuration3.setText(String.valueOf(syllabus1.semesterDuration.get(2)));
                controller.SemesterDuration4.setText(String.valueOf(syllabus1.semesterDuration.get(3)));
                controller.SemesterDuration5.setText(String.valueOf(syllabus1.semesterDuration.get(4)));
                controller.SemesterDuration6.setText(String.valueOf(syllabus1.semesterDuration.get(5)));
                controller.SemesterDuration7.setText(String.valueOf(syllabus1.semesterDuration.get(6)));
                controller.SemesterDuration8.setText(String.valueOf(syllabus1.semesterDuration.get(7)));
                controller.SemesterDuration9.setText(String.valueOf(syllabus1.semesterDuration.get(8)));
                controller.SemesterDuration10.setText(String.valueOf(syllabus1.semesterDuration.get(9)));
                controller.SemesterDuration11.setText(String.valueOf(syllabus1.semesterDuration.get(10)));
                controller.SemesterDuration12.setText(String.valueOf(syllabus1.semesterDuration.get(11)));*/
            }

            if (!syllabus1.semesterWorkload.isEmpty()) {

                for (int i = 0; i < syllabus1.semesterWorkload.size(); i++) {
                    int semesterNumber = syllabus1.semesterNumbers.get(i);
                    int semesterDuration = syllabus1.semesterDuration.get(i);
                    int semesterWorkloadValue = syllabus1.semesterWorkload.get(i);


                    String text = (semesterNumber * semesterDuration == 0) ? "" : String.valueOf(semesterWorkloadValue);


                    switch (i) {
                        case 0:
                            controller.SemesterWorkload1.setText(text);
                            break;
                        case 1:
                            controller.SemesterWorkload2.setText(text);
                            break;
                        case 2:
                            controller.SemesterWorkload3.setText(text);
                            break;
                        case 3:
                            controller.SemesterWorkload4.setText(text);
                            break;
                        case 4:
                            controller.SemesterWorkload5.setText(text);
                            break;
                        case 5:
                            controller.SemesterWorkload6.setText(text);
                            break;
                        case 6:
                            controller.SemesterWorkload7.setText(text);
                            break;
                        case 7:
                            controller.SemesterWorkload8.setText(text);
                            break;
                        case 8:
                            controller.SemesterWorkload9.setText(text);
                            break;
                        case 9:
                            controller.SemesterWorkload10.setText(text);
                            break;
                        case 10:
                            controller.SemesterWorkload11.setText(text);
                            break;
                        case 11:
                            controller.SemesterWorkload12.setText(text);
                            break;

                    }
                }

               /* controller.SemesterWorkload1.setText(String.valueOf(String.valueOf(syllabus1.semesterNumbers.get(0)*syllabus1.semesterDuration.get(0))));
                controller.SemesterWorkload2.setText(String.valueOf(syllabus1.semesterNumbers.get(1)*syllabus1.semesterDuration.get(1)));
                controller.SemesterWorkload3.setText(String.valueOf(syllabus1.semesterWorkload.get(2)));
                controller.SemesterWorkload4.setText(String.valueOf(syllabus1.semesterWorkload.get(3)));
                controller.SemesterWorkload5.setText(String.valueOf(syllabus1.semesterWorkload.get(4)));
                controller.SemesterWorkload6.setText(String.valueOf(syllabus1.semesterWorkload.get(5)));
                controller.SemesterWorkload7.setText(String.valueOf(syllabus1.semesterWorkload.get(6)));
                controller.SemesterWorkload8.setText(String.valueOf(syllabus1.semesterWorkload.get(7)));
                controller.SemesterWorkload9.setText(String.valueOf(syllabus1.semesterWorkload.get(8)));
                controller.SemesterWorkload10.setText(String.valueOf(syllabus1.semesterWorkload.get(9)));
                controller.SemesterWorkload11.setText(String.valueOf(syllabus1.semesterWorkload.get(10)));
                controller.SemesterWorkload12.setText(String.valueOf(syllabus1.semesterWorkload.get(11)));*/
            }

            int totalWorkload=0;
            for (int i = 0; i < syllabus1.semesterWorkload.size(); i++) {
                totalWorkload+=syllabus1.semesterWorkload.get(i);
            }

            controller.SemesterTotal.setText(String.valueOf(totalWorkload));

            //OutcomeMatrix

            if (!syllabus1.competentiesOutcomes.isEmpty()) {
                controller.outcomes1.setText(syllabus1.competentiesOutcomes.get(0));
                controller.outcomes2.setText(syllabus1.competentiesOutcomes.get(1));
                controller.outcomes3.setText(syllabus1.competentiesOutcomes.get(2));
                controller.outcomes4.setText(syllabus1.competentiesOutcomes.get(3));
                controller.outcomes5.setText(syllabus1.competentiesOutcomes.get(4));
                controller.outcomes6.setText(syllabus1.competentiesOutcomes.get(5));
                controller.outcomes7.setText(syllabus1.competentiesOutcomes.get(6));
                controller.outcomes8.setText(syllabus1.competentiesOutcomes.get(7));
                controller.outcomes9.setText(syllabus1.competentiesOutcomes.get(8));
                controller.outcomes10.setText(syllabus1.competentiesOutcomes.get(9));
                controller.outcomes11.setText(syllabus1.competentiesOutcomes.get(10));
                controller.outcomes12.setText(syllabus1.competentiesOutcomes.get(11));
                controller.outcomes13.setText(syllabus1.competentiesOutcomes.get(12));
            }



            if (!syllabus1.learnOutcomesForm.isEmpty()) {
                controller.contributionLO1.setText(syllabus1.learnOutcomesForm.get(0));
                controller.contributionLO2.setText(syllabus1.learnOutcomesForm.get(1));
                controller.contributionLO3.setText(syllabus1.learnOutcomesForm.get(2));
                controller.contributionLO4.setText(syllabus1.learnOutcomesForm.get(3));
                controller.contributionLO5.setText(syllabus1.learnOutcomesForm.get(4));
                controller.contributionLO6.setText(syllabus1.learnOutcomesForm.get(5));
                controller.contributionLO7.setText(syllabus1.learnOutcomesForm.get(6));
                controller.contributionLO8.setText(syllabus1.learnOutcomesForm.get(7));
                controller.contributionLO9.setText(syllabus1.learnOutcomesForm.get(8));
                controller.contributionLO10.setText(syllabus1.learnOutcomesForm.get(9));
                controller.contributionLO11.setText(syllabus1.learnOutcomesForm.get(10));
                controller.contributionLO12.setText(syllabus1.learnOutcomesForm.get(11));
                controller.contributionLO13.setText(syllabus1.learnOutcomesForm.get(12));
            }




            if (!syllabus1.contributionLevel1.isEmpty()){
                if (syllabus1.contributionLevel1.get(0)){
                    controller.contribution11.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(0)) {
                    controller.contribution12.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(0)) {
                    controller.contribution13.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(0)) {
                    controller.contribution14.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(0)) {
                    controller.contribution15.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(1)){
                    controller.contribution21.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(1)) {
                    controller.contribution22.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(1)) {
                    controller.contribution23.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(1)) {
                    controller.contribution24.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(1)) {
                    controller.contribution25.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(2)){
                    controller.contribution31.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(2)) {
                    controller.contribution32.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(2)) {
                    controller.contribution33.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(2)) {
                    controller.contribution34.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(2)) {
                    controller.contribution35.setSelected(true);
                }


                if (syllabus1.contributionLevel1.get(3)){
                    controller.contribution41.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(3)) {
                    controller.contribution42.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(3)) {
                    controller.contribution43.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(3)) {
                    controller.contribution44.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(3)) {
                    controller.contribution45.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(4)){
                    controller.contribution51.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(4)) {
                    controller.contribution52.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(4)) {
                    controller.contribution53.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(4)) {
                    controller.contribution54.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(4)) {
                    controller.contribution55.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(5)){
                    controller.contribution61.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(5)) {
                    controller.contribution62.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(5)) {
                    controller.contribution63.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(5)) {
                    controller.contribution64.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(5)) {
                    controller.contribution65.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(6)){
                    controller.contribution71.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(6)) {
                    controller.contribution72.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(6)) {
                    controller.contribution73.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(6)) {
                    controller.contribution74.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(6)) {
                    controller.contribution75.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(7)){
                    controller.contribution81.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(7)) {
                    controller.contribution82.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(7)) {
                    controller.contribution83.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(7)) {
                    controller.contribution84.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(7)) {
                    controller.contribution85.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(8)){
                    controller.contribution91.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(8)) {
                    controller.contribution92.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(8)) {
                    controller.contribution93.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(8)) {
                    controller.contribution94.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(8)) {
                    controller.contribution95.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(9)){
                    controller.contribution101.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(9)) {
                    controller.contribution102.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(9)) {
                    controller.contribution103.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(9)) {
                    controller.contribution104.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(9)) {
                    controller.contribution105.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(10)){
                    controller.contribution111.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(10)) {
                    controller.contribution112.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(10)) {
                    controller.contribution113.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(10)) {
                    controller.contribution114.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(10)) {
                    controller.contribution115.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(11)){
                    controller.contribution121.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(11)) {
                    controller.contribution122.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(11)) {
                    controller.contribution123.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(11)) {
                    controller.contribution124.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(11)) {
                    controller.contribution125.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(12)){
                    controller.contribution131.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(12)) {
                    controller.contribution132.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(12)) {
                    controller.contribution133.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(12)) {
                    controller.contribution134.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(12)) {
                    controller.contribution135.setSelected(true);
                }
            }





            //Assessment
            if (!syllabus1.semesterActivityNumber.isEmpty()){
                for (int i = 0; i < syllabus1.semesterActivityNumber.size(); i++) {
                    int activityNumber = syllabus1.semesterActivityNumber.get(i);
                    String text = (activityNumber == 0) ? "" : String.valueOf(activityNumber);


                    switch (i) {
                        case 0:
                            controller.numParticipation.setText(text);
                            break;
                        case 1:
                            controller.numLab.setText(text);
                            break;
                        case 2:
                            controller.numFieldWork.setText(text);
                            break;
                        case 3:
                            controller.numQuiz.setText(text);
                            break;
                        case 4:
                            controller.numHomework.setText(text);
                            break;
                        case 5:
                            controller.numPresentation.setText(text);
                            break;
                        case 6:
                            controller.numProject.setText(text);
                            break;
                        case 7:
                            controller.numSeminar.setText(text);
                            break;
                        case 8:
                            controller.numOral.setText(text);
                            break;
                        case 9:
                            controller.numMidterm.setText(text);
                            break;
                        case 10:
                            controller.numFinal.setText(text);
                            break;

                    }
                }


            }

            if (!syllabus1.semesterActivityWeight.isEmpty()){
                for (int i = 0; i < syllabus1.semesterActivityWeight.size(); i++) {
                    int activityWeight = syllabus1.semesterActivityWeight.get(i);
                    String text = (activityWeight == 0) ? "" : String.valueOf(activityWeight);


                    switch (i) {
                        case 0:
                            controller.weightParticipation.setText(text);
                            break;
                        case 1:
                            controller.weightLab.setText(text);
                            break;
                        case 2:
                            controller.weightFieldWork.setText(text);
                            break;
                        case 3:
                            controller.weightQuiz.setText(text);
                            break;
                        case 4:
                            controller.weightHomework.setText(text);
                            break;
                        case 5:
                            controller.weightPresentation.setText(text);
                            break;
                        case 6:
                            controller.weightProject.setText(text);
                            break;
                        case 7:
                            controller.weightSeminar.setText(text);
                            break;
                        case 8:
                            controller.weightOral.setText(text);
                            break;
                        case 9:
                            controller.weightMidterm.setText(text);
                            break;
                        case 10:
                            controller.weightFinal.setText(text);
                            break;

                    }
                }
            }

            if (!syllabus1.semesterActivityLO1.isEmpty()){
                for (int i = 0; i < syllabus1.semesterActivityLO1.size(); i++) {
                    int lo1Value = syllabus1.semesterActivityLO1.get(i);
                    String text = (lo1Value == 0) ? "" : String.valueOf(lo1Value);


                    switch (i) {
                        case 0:
                            controller.lo1Participation.setText(text);
                            break;
                        case 1:
                            controller.lo1Lab.setText(text);
                            break;
                        case 2:
                            controller.lo1FieldWork.setText(text);
                            break;
                        case 3:
                            controller.lo1Quiz.setText(text);
                            break;
                        case 4:
                            controller.lo1Homework.setText(text);
                            break;
                        case 5:
                            controller.lo1Presentation.setText(text);
                            break;
                        case 6:
                            controller.lo1Project.setText(text);
                            break;
                        case 7:
                            controller.lo1Seminar.setText(text);
                            break;
                        case 8:
                            controller.lo1Oral.setText(text);
                            break;
                        case 9:
                            controller.lo1Midterm.setText(text);
                            break;
                        case 10:
                            controller.lo1Final.setText(text);
                            break;

                    }
                }
            }
            if (!syllabus1.semesterActivityLO2.isEmpty()){

                for (int i = 0; i < syllabus1.semesterActivityLO2.size(); i++) {
                    int lo2Value = syllabus1.semesterActivityLO2.get(i);
                    String text = (lo2Value == 0) ? "" : String.valueOf(lo2Value);


                    switch (i) {
                        case 0:
                            controller.lo2Participation.setText(text);
                            break;
                        case 1:
                            controller.lo2Lab.setText(text);
                            break;
                        case 2:
                            controller.lo2FieldWork.setText(text);
                            break;
                        case 3:
                            controller.lo2Quiz.setText(text);
                            break;
                        case 4:
                            controller.lo2Homework.setText(text);
                            break;
                        case 5:
                            controller.lo2Presentation.setText(text);
                            break;
                        case 6:
                            controller.lo2Project.setText(text);
                            break;
                        case 7:
                            controller.lo2Seminar.setText(text);
                            break;
                        case 8:
                            controller.lo2Oral.setText(text);
                            break;
                        case 9:
                            controller.lo2Midterm.setText(text);
                            break;
                        case 10:
                            controller.lo2Final.setText(text);
                            break;
                    }
                }
            }

            if (!syllabus1.semesterActivityLO3.isEmpty()){

                for (int i = 0; i < syllabus1.semesterActivityLO3.size(); i++) {
                    int lo3Value = syllabus1.semesterActivityLO3.get(i);
                    String text = (lo3Value == 0) ? "" : String.valueOf(lo3Value);

                    switch (i) {
                        case 0:
                            controller.lo3Participation.setText(text);
                            break;
                        case 1:
                            controller.lo3Lab.setText(text);
                            break;
                        case 2:
                            controller.lo3FieldWork.setText(text);
                            break;
                        case 3:
                            controller.lo3Quiz.setText(text);
                            break;
                        case 4:
                            controller.lo3Homework.setText(text);
                            break;
                        case 5:
                            controller.lo3Presentation.setText(text);
                            break;
                        case 6:
                            controller.lo3Project.setText(text);
                            break;
                        case 7:
                            controller.lo3Seminar.setText(text);
                            break;
                        case 8:
                            controller.lo3Oral.setText(text);
                            break;
                        case 9:
                            controller.lo3Midterm.setText(text);
                            break;
                        case 10:
                            controller.lo3Final.setText(text);
                            break;

                    }
                }
            }

            if (!syllabus1.semesterActivityLO4.isEmpty()){

                for (int i = 0; i < syllabus1.semesterActivityLO4.size(); i++) {
                    int lo4Value = syllabus1.semesterActivityLO4.get(i);
                    String text = (lo4Value == 0) ? "" : String.valueOf(lo4Value);


                    switch (i) {
                        case 0:
                            controller.lo4Participation.setText(text);
                            break;
                        case 1:
                            controller.lo4Lab.setText(text);
                            break;
                        case 2:
                            controller.lo4FieldWork.setText(text);
                            break;
                        case 3:
                            controller.lo4Quiz.setText(text);
                            break;
                        case 4:
                            controller.lo4Homework.setText(text);
                            break;
                        case 5:
                            controller.lo4Presentation.setText(text);
                            break;
                        case 6:
                            controller.lo4Project.setText(text);
                            break;
                        case 7:
                            controller.lo4Seminar.setText(text);
                            break;
                        case 8:
                            controller.lo4Oral.setText(text);
                            break;
                        case 9:
                            controller.lo4Midterm.setText(text);
                            break;
                        case 10:
                            controller.lo4Final.setText(text);
                            break;

                    }
                }
            }

            if (!syllabus1.semesterActivityLO5.isEmpty()){

                for (int i = 0; i < syllabus1.semesterActivityLO5.size(); i++) {
                    int lo5Value = syllabus1.semesterActivityLO5.get(i);
                    String text = (lo5Value == 0) ? "" : String.valueOf(lo5Value);

                    // İlgili kontrol değerini güncelle
                    switch (i) {
                        case 0:
                            controller.lo5Participation.setText(text);
                            break;
                        case 1:
                            controller.lo5Lab.setText(text);
                            break;
                        case 2:
                            controller.lo5FieldWork.setText(text);
                            break;
                        case 3:
                            controller.lo5Quiz.setText(text);
                            break;
                        case 4:
                            controller.lo5Homework.setText(text);
                            break;
                        case 5:
                            controller.lo5Presentation.setText(text);
                            break;
                        case 6:
                            controller.lo5Project.setText(text);
                            break;
                        case 7:
                            controller.lo5Seminar.setText(text);
                            break;
                        case 8:
                            controller.lo5Oral.setText(text);
                            break;
                        case 9:
                            controller.lo5Midterm.setText(text);
                            break;
                        case 10:
                            controller.lo5Final.setText(text);
                            break;
                        // Diğer durumlar için gerekirse ek case'ler ekleyebilirsiniz.
                    }
                }
            }

            if (!syllabus1.semesterActivityNumber.isEmpty()) {
                int totalParticipation = 0, totalWeight = 0, lo1 = 0, lo2 = 0, lo3 = 0, lo4 = 0, lo5 = 0;
                for (int i = 0; i <= 10; i++) {
                    totalParticipation += syllabus1.semesterActivityNumber.get(i);
                    totalWeight += syllabus1.semesterActivityWeight.get(i);
                    lo1 += syllabus1.semesterActivityLO1.get(i);
                    lo2 += syllabus1.semesterActivityLO2.get(i);
                    lo3 += syllabus1.semesterActivityLO3.get(i);
                    lo4 += syllabus1.semesterActivityLO4.get(i);
                    lo5 += syllabus1.semesterActivityLO5.get(i);
                }


                controller.numTotal.setText(String.valueOf(totalParticipation));
                controller.weightTotal.setText(String.valueOf(totalWeight));
                
                controller.weightFinal1.setText(String.valueOf(totalParticipation));
                controller.weightFinal2.setText(String.valueOf(totalWeight));
                controller.weightEndFinal1.setText(String.valueOf(syllabus1.semesterActivityNumber.get(10)));
                controller.weightEndFinal2.setText(String.valueOf(syllabus1.semesterActivityWeight.get(10)));
                controller.total1.setText(String.valueOf(Integer.parseInt(controller.weightFinal1.getText()) + Integer.parseInt(controller.weightEndFinal1.getText())));
                controller.total2.setText(String.valueOf(Integer.parseInt(controller.weightFinal2.getText()) + Integer.parseInt(controller.weightEndFinal2.getText())));

                controller.lo1Total.setText(String.valueOf(lo1));
                controller.lo2Total.setText(String.valueOf(lo2));
                controller.lo3Total.setText(String.valueOf(lo3));
                controller.lo4Total.setText(String.valueOf(lo4));
                controller.lo5Total.setText(String.valueOf(lo5));
            }
            controller.versionTextField.setText(String.valueOf(version));


            Scene scene = new Scene(root);

            // Mevcut pencerenin referansını al


     //       Stage currentStage = (Stage) searchButton.getScene().getWindow();


            // Yeni bir Stage oluştur
            Stage newStage = new Stage();
            newStage.setScene(scene);

            // Mevcut pencereyi kapat

       //        currentStage.close();

            // Yeni pencereyi göster
            newStage.show();


        }else {
            // Aranan veri bulunamadı
            Platform.exit();
        }

    }


    @FXML
    private void editButton(ActionEvent event) throws Exception {

        System.out.println("edit");


        System.out.println(CodeString.getText()+ " "+countSyllabus(CodeString.getText()));

        editSyllabus(CodeString.getText());

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchForm.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.close();
    }

    @FXML
    private void editToSearch(ActionEvent event) throws IOException {
        searchFormBack(event);
    }

    @FXML
    private void openSearchPage(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchSyllabus.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void searchToMain(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Main.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void searchFormBack(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchSyllabus.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }


    @FXML
    private void errorClose(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("notFoundError.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.close();
    }


    @FXML
    private void searchButton(ActionEvent event) throws Exception {

        System.out.println("search");
        String search;
        search=searchTextField.getText().toUpperCase(Locale.ROOT);
        //upper case eklenecek
        if (countSyllabus(search)>0) {
            searchSyllabus(search);

            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchSyllabus.fxml"));
            Parent root = (Parent) loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.close();
        }else {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("notFoundError.fxml"));
            Parent root = (Parent)loader.load();
            Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);

            newStage.setResizable(false);
            newStage.centerOnScreen();
            newStage.setTitle("Course Not Found!");
            newStage.show();

        }
    }


    @FXML
    private void searchHelpButton(ActionEvent event)throws IOException, IOException{
        helpLabelVisible = !helpLabelVisible;
        searchHelpLabel.setVisible(helpLabelVisible);
    }

    @FXML
    private void openNextVersion(ActionEvent event) throws Exception {

        double version=getVersionTextFieldValue()+1.0;
        if (Double.parseDouble(versionTextField.getText())< getMaxVersion(CodeString.getText())) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchForm.fxml"));
            Parent root = (Parent)loader.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.close();

            openForm(getCourseCode(), version);
        }else {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("pageSwitchError.fxml"));
            Parent root = (Parent)loader.load();
            Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);

            newStage.setResizable(false);
            newStage.centerOnScreen();
            newStage.setTitle("Version Not Found!");
            newStage.show();
        }
    }
    @FXML
    private void openPrevVersion(ActionEvent event) throws Exception {

        double version=getVersionTextFieldValue()-1.0;
        if (Double.parseDouble(versionTextField.getText())>getMinVersion(CodeString.getText())) {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchForm.fxml"));
            Parent root = (Parent)loader.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.close();
            openForm(getCourseCode(), version);

        }else {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("pageSwitchError.fxml"));
            Parent root = (Parent)loader.load();
            Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);

            newStage.setResizable(false);
            newStage.centerOnScreen();
            newStage.setTitle("Version Not Found!");
            newStage.show();
        }


    }

    @FXML
    private void pageMainto1(ActionEvent event) throws  IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Form.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void pageOneToMain(ActionEvent event) throws  IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Main.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    private void exitButton(ActionEvent event) throws IOException {
        Platform.exit();
    }


    @Override
    public void addSyllabus(Syllabus addSyllabus) throws Exception {
        // JDBC bağlantısı
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";
        int tableCount=0;

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            double courseVersion=countSyllabus(addSyllabus.getCourseCode());

            addSyllabus.setVersion(courseVersion+1.0);


            // Course Table'e ekleme
            String courseQuery = "INSERT INTO Course (course_code, version, course_name) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(courseQuery)) {
                if (addSyllabus.getCourseCode()!="" || addSyllabus.getCourseCode()!=null){
                statement.setString(1, addSyllabus.getCourseCode());
                statement.setDouble(2,addSyllabus.getVersion());
                statement.setString(3, addSyllabus.getCourseName());

                int affectedRows = statement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Müfredat başarıyla eklendi (Course Table).");
                } else {
                    System.out.println("Müfredat eklenirken bir hata oluştu.");
                }
            }else {
                    //errror
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            String courseDetailQuery = "INSERT INTO CourseDetails (course_code, version, prerequisites, course_language, course_type, course_level, teaching_methods) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatementDetail = connection.prepareStatement(courseDetailQuery)) {
                preparedStatementDetail.setString(1, addSyllabus.getCourseCode());
                preparedStatementDetail.setDouble(2,addSyllabus.getVersion());
                preparedStatementDetail.setString(3, addSyllabus.getPrerequisities());
                preparedStatementDetail.setString(4, addSyllabus.getCourseLanguage() );
                preparedStatementDetail.setString(5, addSyllabus.getCourseType() );
                preparedStatementDetail.setString(6, addSyllabus.getCourseLevel());
                preparedStatementDetail.setString(7, addSyllabus.getTeachingMethods());

                int affectedRows = preparedStatementDetail.executeUpdate();
                if (affectedRows >= 0) {
                    System.out.println("Müfredat başarıyla eklendi (Course Detail Table).");
                } else {
                    System.out.println("Müfredat eklenirken bir hata oluştu (Course Detail Table).");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("course detail hata try");
            }

            String courseCategoryQuery = "INSERT INTO CourseCategory (course_code, version, course_category) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatementCategory = connection.prepareStatement(courseCategoryQuery)) {

                    preparedStatementCategory.setString(1, addSyllabus.getCourseCode());
                    preparedStatementCategory.setDouble(2, addSyllabus.getVersion());
                    preparedStatementCategory.setString(3, addSyllabus.getCourseCategory());

                    int affectedRows = preparedStatementCategory.executeUpdate();
                    if (affectedRows > 0) {
                        System.out.println("Müfredat başarıyla eklendi (Course Category Table).");
                    } else {
                        System.out.println("Müfredat eklenirken bir hata oluştu (Course Category Table).");
                    }



            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Course category try hata");
            }

            String courseHoursQuery = "INSERT INTO CourseHours (course_code, version, is_fall, is_spring, theory, lab_application, local_credits, ects) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatementHours = connection.prepareStatement(courseHoursQuery)) {
                preparedStatementHours.setString(1, addSyllabus.getCourseCode());
                preparedStatementHours.setDouble(2,addSyllabus.getVersion());
                preparedStatementHours.setBoolean(3, addSyllabus.isFall());
                preparedStatementHours.setBoolean(4, addSyllabus.isSpring());
                preparedStatementHours.setInt(5, addSyllabus.getTheoryHours());
                preparedStatementHours.setInt(6, addSyllabus.getLabHours());
                preparedStatementHours.setInt(7, addSyllabus.getLocalCredits());
                preparedStatementHours.setInt(8, addSyllabus.getECTS());

                int affectedRows = preparedStatementHours.executeUpdate();
                if (affectedRows >= 0) {
                    System.out.println("Müfredat başarıyla eklendi (Course Hours Table).");
                } else {
                    System.out.println("Müfredat eklenirken bir hata oluştu (Course Hours Table).");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String courseInstructorsQuery = "INSERT INTO CourseInstructors (course_code, version,course_coordinator,course_lecturers,assistants) VALUES (?,?,?,?,?)";
            try (PreparedStatement preparedStatementInstructors = connection.prepareStatement(courseInstructorsQuery)) {
                preparedStatementInstructors.setString(1, addSyllabus.getCourseCode());
                preparedStatementInstructors.setDouble(2,addSyllabus.getVersion());
                preparedStatementInstructors.setString(3, addSyllabus.getCourseCoordinator());
                preparedStatementInstructors.setString(4, addSyllabus.getCourseLecturers());
                preparedStatementInstructors.setString(5, addSyllabus.getAssistants());

                int affectedRows = preparedStatementInstructors.executeUpdate();
                if (affectedRows >= 0) {
                    System.out.println("Müfredat başarıyla eklendi (Course Instructors Table).");
                } else {
                    System.out.println("Müfredat eklenirken bir hata oluştu (Course Instructors Table).");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String courseObjectiveQuery = "INSERT INTO CourseObjective (course_code, version,course_objectives,learning_outcomes,course_description) VALUES (?,?,?,?,?)";
            try (PreparedStatement preparedStatementObjectives = connection.prepareStatement(courseObjectiveQuery)) {
                preparedStatementObjectives.setString(1, addSyllabus.getCourseCode());
                preparedStatementObjectives.setDouble(2,addSyllabus.getVersion());
                preparedStatementObjectives.setString(3, addSyllabus.getCourseObjectives());
                preparedStatementObjectives.setString(4, addSyllabus.getLearningOutcomes());
                preparedStatementObjectives.setString(5, addSyllabus.getCourseDescriptions());

                int affectedRows = preparedStatementObjectives.executeUpdate();
                if (affectedRows >= 0) {
                    System.out.println("Müfredat başarıyla eklendi (Course Objective Table).");
                } else {
                    System.out.println("Müfredat eklenirken bir hata oluştu (Course Objective Table).");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String query = "INSERT INTO WeeklySubjectsMaterials (course_code, version, week, subjects, required_materials) VALUES (?,?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                for (int week = 0; week < 16; week++) {

                    preparedStatement.setString(1, addSyllabus.getCourseCode());
                    preparedStatement.setDouble(2,addSyllabus.getVersion());
                    preparedStatement.setInt(3, week + 1);
                    //düzelt
                    if (!addSyllabus.weekSubjects.isEmpty() && !addSyllabus.weekRequiredMat.isEmpty()) {
                        preparedStatement.setString(4, addSyllabus.getWeekSubjects().get(week));
                        preparedStatement.setString(5, addSyllabus.getWeekRequiredMat().get(week));
                    }

                    // SQL sorgusunu çalıştır
                    int affectedRows = preparedStatement.executeUpdate();

                    if (affectedRows >= 0) {
                        System.out.println("Müfredat başarıyla eklendi (Weekly subjects materials Table).");
                    } else {
                        System.out.println("Müfredat eklenirken bir hata oluştu (Weekly subjects materials Table).");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            String courseMaterialsQuery = "INSERT INTO CourseMaterials (course_code, version,notes_textbooks,suggested_readings) VALUES (?,?,?, ?)";
            try (PreparedStatement preparedStatementMaterials = connection.prepareStatement(courseMaterialsQuery)) {


                preparedStatementMaterials.setString(1, addSyllabus.getCourseCode());
                preparedStatementMaterials.setDouble(2,addSyllabus.getVersion());
                preparedStatementMaterials.setString(3, addSyllabus.getCourseNotes());
                preparedStatementMaterials.setString(4, addSyllabus.getSuggestedReadings());

                int affectedRows = preparedStatementMaterials.executeUpdate();
                if (affectedRows >= 0) {
                    System.out.println("Müfredat başarıyla eklendi (Course materials Table).");
                } else {
                    System.out.println("Müfredat eklenirken bir hata oluştu (Course materials Table).");
                }
            }


            String workLoadTableQuery = "INSERT INTO WorkloadTable (course_code, version,semester_activities,numb_of_activites,duration_of_activities,workload_of_activities) VALUES (?,?,?,?,?,?)";
            try (PreparedStatement preparedStatementWorkload = connection.prepareStatement(workLoadTableQuery)) {
                for (int semesterAcvtyNumber = 1; semesterAcvtyNumber <= 12; semesterAcvtyNumber++) {
                    Pane semesterActivityPane = (Pane) semesterGridPane.lookup("#semesterActivity" + semesterAcvtyNumber);
                    Text textNode = (Text) semesterActivityPane.lookup("Text");

                    String activityText = textNode.getText();

                    preparedStatementWorkload.setString(1, addSyllabus.getCourseCode());
                    preparedStatementWorkload.setDouble(2,addSyllabus.getVersion());
                    preparedStatementWorkload.setString(3, activityText);
                    preparedStatementWorkload.setInt(4, addSyllabus.semesterNumbers.get(semesterAcvtyNumber - 1));
                    preparedStatementWorkload.setInt(5, addSyllabus.semesterDuration.get(semesterAcvtyNumber - 1));
                    preparedStatementWorkload.setInt(6, addSyllabus.semesterWorkload.get(semesterAcvtyNumber - 1));

                    int affectedRows = preparedStatementWorkload.executeUpdate();

                    if (affectedRows > 0) {
                        System.out.println("Veri başarıyla eklendi.");
                    } else {
                        System.out.println("Veri eklenirken bir hata oluştu.");
                    }
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
                System.out.println("workload try hata");
            }
            String outcomeMatrixQuery = "INSERT INTO OutcomeMatrix (course_code, version, outcome_no, outcome_description, " +
                    "contribution_level1, contribution_level2, contribution_level3, contribution_level4, " +
                    "contribution_level5, \"lo#\") " +
                    "VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatementOutcomeMatrix = connection.prepareStatement(outcomeMatrixQuery)) {
                if (!addSyllabus.competentiesOutcomes.isEmpty()){
                    for (int i = 0; i < addSyllabus.getCompetentiesOutcomes().size(); i++) {
                        preparedStatementOutcomeMatrix.setString(1, addSyllabus.getCourseCode());
                        preparedStatementOutcomeMatrix.setDouble(2,addSyllabus.getVersion());
                        preparedStatementOutcomeMatrix.setInt(3, i + 1);
                        preparedStatementOutcomeMatrix.setString(4, addSyllabus.getCompetentiesOutcomes().get(i));
                        preparedStatementOutcomeMatrix.setBoolean(5, addSyllabus.getContributionLevel1().get(i));
                        preparedStatementOutcomeMatrix.setBoolean(6, addSyllabus.getContributionLevel2().get(i));
                        preparedStatementOutcomeMatrix.setBoolean(7, addSyllabus.getContributionLevel3().get(i));
                        preparedStatementOutcomeMatrix.setBoolean(8, addSyllabus.getContributionLevel4().get(i));
                        preparedStatementOutcomeMatrix.setBoolean(9, addSyllabus.getContributionLevel5().get(i));
                        preparedStatementOutcomeMatrix.setString(10, addSyllabus.getLearnOutcomesForm().get(i));

                        int affectedRows = preparedStatementOutcomeMatrix.executeUpdate();

                        if (affectedRows > 0) {
                            System.out.println("OutcomeMatrix verisi başarıyla eklendi.");
                        } else {
                            System.out.println("OutcomeMatrix verisi eklenirken bir hata oluştu.");
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }



            String semesterActivitiesTable = "INSERT INTO SemesterActivities(course_code, version, activity_name, numb_of_activity, activity_weight, is_lo1, is_lo2, is_lo3, is_lo4, is_lo5) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatementsemesterActivity = connection.prepareStatement(semesterActivitiesTable)) {
                for (int activityName = 1; activityName <= 11; activityName++) {
                    Pane semesterActivityNamePane = (Pane) assessmentGridpane.lookup("#semesterDefinition" + activityName);
                    if (semesterActivityNamePane != null) {
                        Text textNode = findTextInChildren(semesterActivityNamePane);
                        if (textNode != null) {
                            String activityNameText = textNode.getText();

                            preparedStatementsemesterActivity.setString(1, addSyllabus.getCourseCode());
                            preparedStatementsemesterActivity.setDouble(2,addSyllabus.getVersion());
                            preparedStatementsemesterActivity.setString(3, activityNameText);
                            preparedStatementsemesterActivity.setInt(4, addSyllabus.numberOfActivity.get(activityName - 1));
                            preparedStatementsemesterActivity.setInt(5, addSyllabus.activityWeight.get(activityName - 1));
                            preparedStatementsemesterActivity.setInt(6, addSyllabus.learningOutcome1.get(activityName - 1));
                            preparedStatementsemesterActivity.setInt(7, addSyllabus.learningOutcome2.get(activityName - 1));
                            preparedStatementsemesterActivity.setInt(8, addSyllabus.learningOutcome3.get(activityName - 1));
                            preparedStatementsemesterActivity.setInt(9, addSyllabus.learningOutcome4.get(activityName - 1));
                            preparedStatementsemesterActivity.setInt(10, addSyllabus.learningOutcome5.get(activityName - 1));


                            int affectedRows = preparedStatementsemesterActivity.executeUpdate();


                            if (affectedRows > 0) {
                                System.out.println("semesterActivitiesTable verisi başarıyla eklendi.");
                            } else {
                                System.out.println("semesterActivitiesTable verisi eklenirken bir hata oluştu.");
                            }
                        }
                    }
                }
            }

            //add successful buraya pop up
        }
            catch(SQLException e){
                        e.printStackTrace();
                    }
                }

    private TextArea getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == column) {
                if (node instanceof TextArea) {
                    return (TextArea) node;
                }
            }
        }
        return null;
    }

    private Text findTextInChildren(Pane pane) {
        for (Node node : pane.getChildren()) {
            if (node instanceof Text) {
                return (Text) node;
            }
        }
        return null;
    }




    @Override
    public void editSyllabus(String courseCode) throws Exception {
        openEditableForm(courseCode,getMaxVersion(courseCode));
    }



    @FXML
    public void deleteSyllabus(ActionEvent event) throws IOException {
        String courseCode = CodeString.getText();
        double version= Double.parseDouble(versionTextField.getText());

        if (syllabus != null && courseCode != null) {
            String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

            try (Connection connection = DriverManager.getConnection(DB_URL)) {
                String[] tablesToDeleteFrom = {"Course", "CourseDetails", "CourseCategory", "CourseHours", "CourseInstructors",
                        "CourseObjective", "WeeklySubjectsMaterials", "CourseMaterials", "WorkloadTable", "OutcomeMatrix", "SemesterActivities"};

                for (String tableName : tablesToDeleteFrom) {
                    String sql = "DELETE FROM " + tableName + " WHERE course_code = ? AND version=?";
                    String updateSql = "UPDATE " + tableName + " SET version = version - 1 WHERE course_code = ? AND version > ?";

                    try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
                        preparedStatement.setString(1, courseCode);
                        preparedStatement.setDouble(2,version);
                        preparedStatement.executeUpdate();

                        updateStatement.setString(1, courseCode);
                        updateStatement.setDouble(2, version);
                        updateStatement.executeUpdate();
                        System.out.println("Records related to " + courseCode +"  v"+version+ " have been deleted from " + tableName + ".");
                    } catch (SQLException e) {
                        e.printStackTrace();
                        connection.rollback();
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
         else {
            System.out.println("Invalid syllabus or course code is null.");
        }

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SearchSyllabus.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }



    public double getMinVersion(String courseCode) throws Exception {
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String sql = "SELECT MIN(version) FROM Course WHERE course_code = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, courseCode);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        double minVersion = resultSet.getDouble(1);
                        return minVersion;
                    } else {
                        // Kayıt bulunamadıysa veya versiyon bilgisi yoksa bir değer döndür
                        return 0;
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public double getMaxVersion(String courseCode) throws Exception {
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String sql = "SELECT MAX(version) FROM Course WHERE course_code = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, courseCode);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        double maxVersion = resultSet.getDouble(1);
                        return maxVersion;
                    } else {
                        // Kayıt bulunamadıysa veya versiyon bilgisi yoksa bir değer döndür
                        return 0;
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public double countSyllabus(String courseCode) throws Exception {
        // JDBC bağlantısı
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            // Veritabanına bağlan

            // Örnek bir sorgu: "SELECT COUNT(*) FROM Course WHERE course_code = ?;"
            String sql = "SELECT COUNT(*) FROM Course WHERE course_code = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Parametreleri ayarla
                statement.setString(1, courseCode);

                // Sorguyu çalıştır ve sonucu al
                try (ResultSet resultSet = statement.executeQuery()) {
                    // COUNT(*) sonucunu al
                    if (resultSet.next()) {
                        int rowCount = resultSet.getInt(1);
                        return rowCount;
                    } else {
                        // COUNT(*) değeri alınamadı
                        throw new RuntimeException("Failed to get row count");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }


    @Override
    public void searchSyllabus(String searchSyllabus) throws Exception {
        // JDBC bağlantısı
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            // Veritabanına bağlan

            // Örnek bir sorgu: "SELECT * FROM Course WHERE course_code = ?;"
            //düzenlenicek
            String sql = "SELECT * FROM Course WHERE course_code = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Parametreleri ayarla
                statement.setString(1, searchSyllabus);

                // Sorguyu çalıştır ve sonucu al
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Veritabanından gelen veriyi kullan
                        String courseCode = resultSet.getString("course_code");
                        // Diğer veri alanlarına göre işlemleri yapabilirsiniz
                        System.out.println(courseCode);
                        openForm(courseCode,getMaxVersion(courseCode));

                    } else {
                        // Aranan veri bulunamadı
                        System.out.println("not found");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

    public CheckBox getCoreCourse() {
        return CoreCourse;
    }

    public void setCoreCourse(CheckBox coreCourse) {
        CoreCourse = coreCourse;
    }

    public CheckBox getMajorAreaCourse() {
        return MajorAreaCourse;
    }

    public void setMajorAreaCourse(CheckBox majorAreaCourse) {
        MajorAreaCourse = majorAreaCourse;
    }

    public CheckBox getSupportiveCourse() {
        return SupportiveCourse;
    }

    public void setSupportiveCourse(CheckBox supportiveCourse) {
        SupportiveCourse = supportiveCourse;
    }

    public CheckBox getCommunicationCourse() {
        return CommunicationCourse;
    }

    public void setCommunicationCourse(CheckBox communicationCourse) {
        CommunicationCourse = communicationCourse;
    }

    public CheckBox getTransferableSkillCourse() {
        return TransferableSkillCourse;
    }

    public void setTransferableSkillCourse(CheckBox transferableSkillCourse) {
        TransferableSkillCourse = transferableSkillCourse;
    }


    public double getVersionTextFieldValue() {
        return Double.parseDouble(versionTextField.getText());
    }

    public String getCourseCode() {
        return CodeString.getText();
    }



    public void openEditableForm(String courseCode,double version) throws Exception {
        Syllabus syllabus1=new Syllabus();

        // JDBC bağlantısı
        String DB_URL = "jdbc:sqlite:Syllabus_DB.db";

        try (Connection connection = DriverManager.getConnection(DB_URL)) {

            // Veritabanına bağlan

            // Örnek bir sorgu: "SELECT * FROM Course WHERE course_code = ?;"
            String sql = "SELECT * FROM Course WHERE course_code = ? AND version=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Parametreleri ayarla
                statement.setString(1, courseCode);
                statement.setDouble(2,version);

                // Sorguyu çalıştır ve sonucu al
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Veritabanından gelen veriyi kullan


                        // GeneralInformation içindeki tüm attribute'ları set et

                        syllabus1.setCourseName(resultSet.getString("course_name"));
                        syllabus1.setCourseCode(resultSet.getString("course_code"));

                    }
                }
            }
            String courseCategoryTable = "SELECT * FROM CourseCategory WHERE course_code =? AND version=?";
            try (PreparedStatement categoryStatement = connection.prepareStatement(courseCategoryTable)) {
                categoryStatement.setString(1, courseCode);
                categoryStatement.setDouble(2,version);
                try (ResultSet resultSet = categoryStatement.executeQuery()) {
                    if (resultSet.next()) {
                        String courseCategory = resultSet.getString("course_category");

                        syllabus1.setCourseCategory(courseCategory);
                    }
                }
            }


            String courseDetailsTable="SELECT * FROM CourseDetails WHERE course_code =? AND version=?";
            try (PreparedStatement detailsStatement = connection.prepareStatement(courseDetailsTable)){
                detailsStatement.setString(1, courseCode);
                detailsStatement.setDouble(2,version);
                try (ResultSet resultSet = detailsStatement.executeQuery()) {
                    if (resultSet.next()){
                        syllabus1.setPrerequisities(resultSet.getString("prerequisites"));
                        syllabus1.setCourseLanguage(resultSet.getString("course_language"));
                        syllabus1.setCourseType(resultSet.getString("course_type"));
                        syllabus1.setCourseLevel(resultSet.getString("course_level"));
                        syllabus1.setTeachingMethods(resultSet.getString("teaching_methods"));
                    }
                }
            }



            String courseHoursTable="SELECT * FROM CourseHours WHERE course_code =? AND version=?";
            try (PreparedStatement hoursStatement = connection.prepareStatement(courseHoursTable)){
                hoursStatement.setString(1, courseCode);
                hoursStatement.setDouble(2,version);
                try (ResultSet resultSet = hoursStatement.executeQuery()) {
                    if (resultSet.next()){


                        syllabus1.setFall(resultSet.getBoolean("is_fall"));
                        syllabus1.setSpring(resultSet.getBoolean("is_spring"));
                        syllabus1.setTheoryHours(resultSet.getInt("theory"));
                        syllabus1.setLabHours(resultSet.getInt("lab_application"));
                        syllabus1.setLocalCredits(resultSet.getInt("local_credits"));
                        syllabus1.setECTS(resultSet.getInt("ects"));
                    }
                }
            }
            String courseObjectiveTables="SELECT * FROM CourseObjective WHERE course_code =? AND version=?";
            try (PreparedStatement objectiveStatement = connection.prepareStatement(courseObjectiveTables)){
                objectiveStatement.setString(1, courseCode);
                objectiveStatement.setDouble(2,version);
                try (ResultSet resultSet = objectiveStatement.executeQuery()) {
                    if(resultSet.next()){

                        syllabus1.setCourseObjectives(resultSet.getString("course_objectives"));
                        syllabus1.setLearningOutcomes(resultSet.getString("learning_outcomes"));
                        syllabus1.setCourseDescriptions(resultSet.getString("course_description"));
                    }

                }
            }
            String courseInstructorTable = "SELECT * FROM CourseInstructors  WHERE course_code =? AND version=?";
            try (PreparedStatement instructorsStatement = connection.prepareStatement(courseInstructorTable)) {
                instructorsStatement.setString(1, courseCode);
                instructorsStatement.setDouble(2,version);
                try (ResultSet resultSet = instructorsStatement.executeQuery()) {
                    if (resultSet.next()) {
                        syllabus1.setCourseCoordinator(resultSet.getString("course_coordinator"));
                        syllabus1.setCourseLecturers(resultSet.getString("course_lecturers"));
                        syllabus1.setAssistants(resultSet.getString("assistants"));
                    }
                }
            }

            String courseCourseMaterials = "SELECT * FROM CourseMaterials WHERE course_code =? AND version=? ";
            try (PreparedStatement courseMaterialsStatement = connection.prepareStatement(courseCourseMaterials)) {
                courseMaterialsStatement.setString(1, courseCode);
                courseMaterialsStatement.setDouble(2,version);
                try (ResultSet resultSet = courseMaterialsStatement.executeQuery()) {
                    if (resultSet.next()) {
                        syllabus1.setCourseNotes(resultSet.getString("notes_textbooks"));
                        syllabus1.setSuggestedReadings(resultSet.getString("suggested_readings"));
                    }
                }
            }

            String courseSubjectMaterials = "SELECT * FROM WeeklySubjectsMaterials WHERE course_code = ? AND week = ? AND version=?";
            try (PreparedStatement courseSubjectStatement = connection.prepareStatement(courseSubjectMaterials)) {
                for (int i = 1; i <= 16; i++) {
                    courseSubjectStatement.setString(1, courseCode);
                    courseSubjectStatement.setString(2, String.valueOf(i));
                    courseSubjectStatement.setDouble(3,version);

                    try (ResultSet resultSet = courseSubjectStatement.executeQuery()) {

                        if (resultSet.next()) {

                            syllabus1.weekSubjects.add(resultSet.getString("subjects"));
                            syllabus1.weekRequiredMat.add(resultSet.getString("required_materials"));


                        }}}}


            //table4
            String courseWorkloadTable = "SELECT * FROM WorkloadTable WHERE course_code = ? AND semester_activities=? AND version=?";

            syllabus1.semesterActivity.add("Course Hours(Including exam week: 16 x total hours)");
            syllabus1.semesterActivity.add("Laboratory/Application Hours(Including exam week: 16 x total hours)");
            syllabus1.semesterActivity.add("Study Hours out of Class");
            syllabus1.semesterActivity.add("Field Work");
            syllabus1.semesterActivity.add("Quiz/Studio Critique");
            syllabus1.semesterActivity.add("Homework/Assignments");
            syllabus1.semesterActivity.add("Presentation/Jury");
            syllabus1.semesterActivity.add("Project");
            syllabus1.semesterActivity.add("Seminar/Workshop");
            syllabus1.semesterActivity.add("Oral Exam");
            syllabus1.semesterActivity.add("Midterm");
            syllabus1.semesterActivity.add("Final Exam");
            try (PreparedStatement courseWorkloadTableStatement = connection.prepareStatement(courseWorkloadTable)) {
                for (int i = 0; i < syllabus1.semesterActivity.size(); i++) {
                    courseWorkloadTableStatement.setString(1, courseCode);
                    courseWorkloadTableStatement.setString(2,syllabus1.semesterActivity.get(i));
                    courseWorkloadTableStatement.setDouble(3,version);

                    try (ResultSet resultSet = courseWorkloadTableStatement.executeQuery()) {

                        if (resultSet.next()) {

                            syllabus1.semesterNumbers.add(resultSet.getInt("numb_of_activites"));
                            syllabus1.semesterDuration.add(resultSet.getInt("duration_of_activities"));
                            syllabus1.semesterWorkload.add(resultSet.getInt("workload_of_activities"));


                        }
                    }
                }
            }
            String outcomeMatrixTable = "SELECT * FROM OutcomeMatrix WHERE course_code = ? AND outcome_no= ? AND version=?";
            try (PreparedStatement courseoutcomeMatrixStatement = connection.prepareStatement(outcomeMatrixTable)) {
                int outcomeNo;
                for (int i = 0; i < 13; i++) {
                    courseoutcomeMatrixStatement.setString(1, courseCode);
                    courseoutcomeMatrixStatement.setInt(2,(i+1));
                    courseoutcomeMatrixStatement.setDouble(3,version);
                    try (ResultSet resultSet = courseoutcomeMatrixStatement.executeQuery()) {

                        if (resultSet.next()) {
                            syllabus1.competentiesOutcomes.add(resultSet.getString("outcome_description"));
                            syllabus1.contributionLevel1.add(resultSet.getBoolean("contribution_level1"));
                            syllabus1.contributionLevel2.add(resultSet.getBoolean("contribution_level2"));
                            syllabus1.contributionLevel3.add(resultSet.getBoolean("contribution_level3"));
                            syllabus1.contributionLevel4.add(resultSet.getBoolean("contribution_level4"));
                            syllabus1.contributionLevel5.add(resultSet.getBoolean("contribution_level5"));
                            syllabus1.learnOutcomesForm.add(resultSet.getString("lo#"));
                        }
                    }
                }
            }


            String semesterActivitiesTable= "SELECT * FROM SemesterActivities WHERE course_code = ? AND activity_name=? AND version=?";

            syllabus1.semesterActivityName.add("Participation");
            syllabus1.semesterActivityName.add("Laboratory/Application");
            syllabus1.semesterActivityName.add("Field Work");
            syllabus1.semesterActivityName.add("Quiz/Studio Critique");
            syllabus1.semesterActivityName.add("Homework/Assignment");
            syllabus1.semesterActivityName.add("Presentation/Jury");
            syllabus1.semesterActivityName.add("Project");
            syllabus1.semesterActivityName.add("Seminar/Workshop");
            syllabus1.semesterActivityName.add("Oral Exam");
            syllabus1.semesterActivityName.add("Midterm");
            syllabus1.semesterActivityName.add("Final Exam");

            try (PreparedStatement semesterActivityStatement = connection.prepareStatement(semesterActivitiesTable)) {
                for (int i = 0; i < syllabus1.semesterActivityName.size(); i++) {
                    semesterActivityStatement.setString(1, courseCode);
                    semesterActivityStatement.setString(2, syllabus1.semesterActivityName.get(i));
                    semesterActivityStatement.setDouble(3,version);

                    try (ResultSet resultSet = semesterActivityStatement.executeQuery()) {

                        if (resultSet.next()) {

                            syllabus1.semesterActivityNumber.add(resultSet.getInt("numb_of_activity"));
                            syllabus1.semesterActivityWeight.add(resultSet.getInt("activity_weight") );
                            syllabus1.semesterActivityLO1.add(resultSet.getInt("is_lo1"));
                            syllabus1.semesterActivityLO2.add(resultSet.getInt("is_lo2"));
                            syllabus1.semesterActivityLO3.add(resultSet.getInt("is_lo3"));
                            syllabus1.semesterActivityLO4.add(resultSet.getInt("is_lo4"));
                            syllabus1.semesterActivityLO5.add(resultSet.getInt("is_lo5"));


                        }
                    }
                }
            }

        } catch (SQLException e) {
        }

        if (syllabus1 != null) {
            // Eğer Syllabus bulunduysa, Form'u aç ve verileri set et
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EditForm.fxml"));
            Parent root = loader.load();

            // Controller içindeki setCode ve setOtherFields metodlarını kullanarak TextField'lara değerleri ata
            Controller controller = loader.getController();
            controller.courseNameEnter.setText(syllabus1.getCourseName());
            controller.CodeString.setText(syllabus1.getCourseCode());

            controller.FallButton.setSelected(syllabus1.isFall());

            controller.SpringButton.setSelected(syllabus1.isSpring());
            controller.TheoryHour.setText(String.valueOf(syllabus1.getTheoryHours()));
            controller.ApplicationLabHour.setText(String.valueOf(syllabus1.getLabHours()));
            controller.LocalCredits.setText(String.valueOf(syllabus1.getLocalCredits()));
            controller.ECTS.setText(String.valueOf(syllabus1.getECTS()));


            //course category
            if ("Supportive Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.SupportiveCourse.setSelected(true);
            } else if ("Major Area Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.MajorAreaCourse.setSelected(true);
            } else if ("Communication and Management Skills Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.CommunicationCourse.setSelected(true);
            } else if ("Transferable Skill Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.TransferableSkillCourse.setSelected(true);
            } else if ("Core Course".equalsIgnoreCase(syllabus1.getCourseCategory())) {
                controller.CoreCourse.setSelected(true);
            }else {
                controller.SupportiveCourse.setSelected(false);
                controller.MajorAreaCourse.setSelected(false);
                controller.CommunicationCourse.setSelected(false);
                controller.TransferableSkillCourse.setSelected(false);
                controller.CoreCourse.setSelected(false);
            }


            //course details
            controller.prerequisites.setText(syllabus1.getPrerequisities());

            if ("Turkish".equalsIgnoreCase(syllabus1.getCourseLanguage())){
                controller.CourseLanguageTurkish.setSelected(true);
            }else if ("English".equalsIgnoreCase(syllabus1.getCourseLanguage())){
                controller.CourseLanguageEnglish.setSelected(true);
            } else if ("Second Foreign Language".equalsIgnoreCase(syllabus1.getCourseLanguage())) {
                controller.CourseLanguageSecondForeign.setSelected(true);
            }else {
                controller.CourseLanguageTurkish.setSelected(false);
                controller.CourseLanguageEnglish.setSelected(false);
                controller.CourseLanguageSecondForeign.setSelected(false);
            }

            controller.teachingMethods.setText(syllabus1.getTeachingMethods());

            if ("Required".equalsIgnoreCase(syllabus1.getCourseType())){
                controller.TypeRequired.setSelected(true);
            }else if ("Elective".equalsIgnoreCase(syllabus1.getCourseType())){
                controller.TypeElective.setSelected(true);
            }else {
                controller.TypeRequired.setSelected(false);
                controller.TypeElective.setSelected(false);
            }

            if ("Short Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())){
                controller.levelShortCycle.setSelected(true);
            }else if ("First Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())){
                controller.LevelFirstCycle.setSelected(true);
            } else if ("Second Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())) {
                controller.LevelSecondCycle.setSelected(true);
            }else if ("Third Cycle".equalsIgnoreCase(syllabus1.getCourseLevel())) {
                controller.LevelThirdCycle.setSelected(true);
            }else {
                controller.levelShortCycle.setSelected(false);
                controller.LevelFirstCycle.setSelected(false);
                controller.LevelSecondCycle.setSelected(false);
                controller.LevelThirdCycle.setSelected(false);
            }
            controller.courseObjectives.setText(syllabus1.getCourseObjectives());
            controller.learningOutcomes.setText(syllabus1.getLearningOutcomes());
            controller.courseDescription.setText(syllabus1.getCourseDescriptions());
            controller.CourseCoordinator.setText(syllabus1.getCourseCoordinator());
            controller.CourseLecturer.setText(syllabus1.getCourseLecturers());
            controller.CourseAssistants.setText(syllabus1.getAssistants());
            controller.SuggestedReadings1.setText(syllabus1.getSuggestedReadings());
            controller.CourseNotes1.setText(syllabus1.getCourseNotes());

            // WeeklySubjectsMaterials
            //subject Material
            if (!syllabus1.weekSubjects.isEmpty()) {
                controller.sub1.setText(syllabus1.weekSubjects.get(0));
                controller.sub2.setText(syllabus1.weekSubjects.get(1));
                controller.sub3.setText(syllabus1.weekSubjects.get(2));
                controller.sub4.setText(syllabus1.weekSubjects.get(3));
                controller.sub5.setText(syllabus1.weekSubjects.get(4));
                controller.sub6.setText(syllabus1.weekSubjects.get(5));
                controller.sub7.setText(syllabus1.weekSubjects.get(6));
                controller.sub8.setText(syllabus1.weekSubjects.get(7));
                controller.sub9.setText(syllabus1.weekSubjects.get(8));
                controller.sub10.setText(syllabus1.weekSubjects.get(9));
                controller.sub11.setText(syllabus1.weekSubjects.get(10));
                controller.sub12.setText(syllabus1.weekSubjects.get(11));
                controller.sub13.setText(syllabus1.weekSubjects.get(12));
                controller.sub14.setText(syllabus1.weekSubjects.get(13));
                controller.sub15.setText(syllabus1.weekSubjects.get(14));
                controller.sub16.setText(syllabus1.weekSubjects.get(15));
            }

            ///RequiredMaterial
            if (!syllabus1.weekSubjects.isEmpty()) {
                controller.reqM1.setText(syllabus1.weekRequiredMat.get(0));
                controller.reqM2.setText(syllabus1.weekRequiredMat.get(1));
                controller.reqM3.setText(syllabus1.weekRequiredMat.get(2));
                controller.reqM4.setText(syllabus1.weekRequiredMat.get(3));
                controller.reqM5.setText(syllabus1.weekRequiredMat.get(4));
                controller.reqM6.setText(syllabus1.weekRequiredMat.get(5));
                controller.reqM7.setText(syllabus1.weekRequiredMat.get(6));
                controller.reqM8.setText(syllabus1.weekRequiredMat.get(7));
                controller.reqM9.setText(syllabus1.weekRequiredMat.get(8));
                controller.reqM10.setText(syllabus1.weekRequiredMat.get(9));
                controller.reqM11.setText(syllabus1.weekRequiredMat.get(10));
                controller.reqM12.setText(syllabus1.weekRequiredMat.get(11));
                controller.reqM13.setText(syllabus1.weekRequiredMat.get(12));
                controller.reqM14.setText(syllabus1.weekRequiredMat.get(13));
                controller.reqM15.setText(syllabus1.weekRequiredMat.get(14));
                controller.reqM16.setText(syllabus1.weekRequiredMat.get(15));
            }

            //WorkloadTable
            if (!syllabus1.semesterNumbers.isEmpty()) {
                controller.SemesterNum1.setText(String.valueOf(syllabus1.semesterNumbers.get(0)));
                controller.SemesterNum2.setText(String.valueOf(syllabus1.semesterNumbers.get(1)));
                controller.SemesterNum3.setText(String.valueOf(syllabus1.semesterNumbers.get(2)));
                controller.SemesterNum4.setText(String.valueOf(syllabus1.semesterNumbers.get(3)));
                controller.SemesterNum5.setText(String.valueOf(syllabus1.semesterNumbers.get(4)));
                controller.SemesterNum6.setText(String.valueOf(syllabus1.semesterNumbers.get(5)));
                controller.SemesterNum7.setText(String.valueOf(syllabus1.semesterNumbers.get(6)));
                controller.SemesterNum8.setText(String.valueOf(syllabus1.semesterNumbers.get(7)));
                controller.SemesterNum9.setText(String.valueOf(syllabus1.semesterNumbers.get(8)));
                controller.SemesterNum10.setText(String.valueOf(syllabus1.semesterNumbers.get(9)));
                controller.SemesterNum11.setText(String.valueOf(syllabus1.semesterNumbers.get(10)));
                controller.SemesterNum12.setText(String.valueOf(syllabus1.semesterNumbers.get(11)));
            }

            if (!syllabus1.semesterDuration.isEmpty()) {
                controller.SemesterDuration1.setText(String.valueOf(syllabus1.semesterDuration.get(0)));
                controller.SemesterDuration2.setText(String.valueOf(syllabus1.semesterDuration.get(1)));
                controller.SemesterDuration3.setText(String.valueOf(syllabus1.semesterDuration.get(2)));
                controller.SemesterDuration4.setText(String.valueOf(syllabus1.semesterDuration.get(3)));
                controller.SemesterDuration5.setText(String.valueOf(syllabus1.semesterDuration.get(4)));
                controller.SemesterDuration6.setText(String.valueOf(syllabus1.semesterDuration.get(5)));
                controller.SemesterDuration7.setText(String.valueOf(syllabus1.semesterDuration.get(6)));
                controller.SemesterDuration8.setText(String.valueOf(syllabus1.semesterDuration.get(7)));
                controller.SemesterDuration9.setText(String.valueOf(syllabus1.semesterDuration.get(8)));
                controller.SemesterDuration10.setText(String.valueOf(syllabus1.semesterDuration.get(9)));
                controller.SemesterDuration11.setText(String.valueOf(syllabus1.semesterDuration.get(10)));
                controller.SemesterDuration12.setText(String.valueOf(syllabus1.semesterDuration.get(11)));
            }

            if (!syllabus1.semesterWorkload.isEmpty()) {
                controller.SemesterWorkload1.setText(String.valueOf(String.valueOf(syllabus1.semesterNumbers.get(0)*syllabus1.semesterDuration.get(0))));
                controller.SemesterWorkload2.setText(String.valueOf(syllabus1.semesterNumbers.get(1)*syllabus1.semesterDuration.get(1)));
                controller.SemesterWorkload3.setText(String.valueOf(syllabus1.semesterWorkload.get(2)));
                controller.SemesterWorkload4.setText(String.valueOf(syllabus1.semesterWorkload.get(3)));
                controller.SemesterWorkload5.setText(String.valueOf(syllabus1.semesterWorkload.get(4)));
                controller.SemesterWorkload6.setText(String.valueOf(syllabus1.semesterWorkload.get(5)));
                controller.SemesterWorkload7.setText(String.valueOf(syllabus1.semesterWorkload.get(6)));
                controller.SemesterWorkload8.setText(String.valueOf(syllabus1.semesterWorkload.get(7)));
                controller.SemesterWorkload9.setText(String.valueOf(syllabus1.semesterWorkload.get(8)));
                controller.SemesterWorkload10.setText(String.valueOf(syllabus1.semesterWorkload.get(9)));
                controller.SemesterWorkload11.setText(String.valueOf(syllabus1.semesterWorkload.get(10)));
                controller.SemesterWorkload12.setText(String.valueOf(syllabus1.semesterWorkload.get(11)));
            }

            int totalWorkload=0;
            for (int i = 0; i < syllabus1.semesterWorkload.size(); i++) {
                totalWorkload+=syllabus1.semesterWorkload.get(i);
            }

            controller.SemesterTotal.setText(String.valueOf(totalWorkload));

            //OutcomeMatrix

            if (!syllabus1.competentiesOutcomes.isEmpty()) {
                controller.outcomes1.setText(syllabus1.competentiesOutcomes.get(0));
                controller.outcomes2.setText(syllabus1.competentiesOutcomes.get(1));
                controller.outcomes3.setText(syllabus1.competentiesOutcomes.get(2));
                controller.outcomes4.setText(syllabus1.competentiesOutcomes.get(3));
                controller.outcomes5.setText(syllabus1.competentiesOutcomes.get(4));
                controller.outcomes6.setText(syllabus1.competentiesOutcomes.get(5));
                controller.outcomes7.setText(syllabus1.competentiesOutcomes.get(6));
                controller.outcomes8.setText(syllabus1.competentiesOutcomes.get(7));
                controller.outcomes9.setText(syllabus1.competentiesOutcomes.get(8));
                controller.outcomes10.setText(syllabus1.competentiesOutcomes.get(9));
                controller.outcomes11.setText(syllabus1.competentiesOutcomes.get(10));
                controller.outcomes12.setText(syllabus1.competentiesOutcomes.get(11));
                controller.outcomes13.setText(syllabus1.competentiesOutcomes.get(12));
            }



            if (!syllabus1.learnOutcomesForm.isEmpty()) {
                controller.contributionLO1.setText(syllabus1.learnOutcomesForm.get(0));
                controller.contributionLO2.setText(syllabus1.learnOutcomesForm.get(1));
                controller.contributionLO3.setText(syllabus1.learnOutcomesForm.get(2));
                controller.contributionLO4.setText(syllabus1.learnOutcomesForm.get(3));
                controller.contributionLO5.setText(syllabus1.learnOutcomesForm.get(4));
                controller.contributionLO6.setText(syllabus1.learnOutcomesForm.get(5));
                controller.contributionLO7.setText(syllabus1.learnOutcomesForm.get(6));
                controller.contributionLO8.setText(syllabus1.learnOutcomesForm.get(7));
                controller.contributionLO9.setText(syllabus1.learnOutcomesForm.get(8));
                controller.contributionLO10.setText(syllabus1.learnOutcomesForm.get(9));
                controller.contributionLO11.setText(syllabus1.learnOutcomesForm.get(10));
                controller.contributionLO12.setText(syllabus1.learnOutcomesForm.get(11));
                controller.contributionLO13.setText(syllabus1.learnOutcomesForm.get(12));
            }




            if (!syllabus1.contributionLevel1.isEmpty()){
                if (syllabus1.contributionLevel1.get(0)){
                    controller.contribution11.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(0)) {
                    controller.contribution12.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(0)) {
                    controller.contribution13.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(0)) {
                    controller.contribution14.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(0)) {
                    controller.contribution15.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(1)){
                    controller.contribution21.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(1)) {
                    controller.contribution22.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(1)) {
                    controller.contribution23.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(1)) {
                    controller.contribution24.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(1)) {
                    controller.contribution25.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(2)){
                    controller.contribution31.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(2)) {
                    controller.contribution32.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(2)) {
                    controller.contribution33.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(2)) {
                    controller.contribution34.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(2)) {
                    controller.contribution35.setSelected(true);
                }


                if (syllabus1.contributionLevel1.get(3)){
                    controller.contribution41.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(3)) {
                    controller.contribution42.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(3)) {
                    controller.contribution43.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(3)) {
                    controller.contribution44.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(3)) {
                    controller.contribution45.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(4)){
                    controller.contribution51.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(4)) {
                    controller.contribution52.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(4)) {
                    controller.contribution53.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(4)) {
                    controller.contribution54.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(4)) {
                    controller.contribution55.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(5)){
                    controller.contribution61.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(5)) {
                    controller.contribution62.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(5)) {
                    controller.contribution63.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(5)) {
                    controller.contribution64.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(5)) {
                    controller.contribution65.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(6)){
                    controller.contribution71.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(6)) {
                    controller.contribution72.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(6)) {
                    controller.contribution73.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(6)) {
                    controller.contribution74.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(6)) {
                    controller.contribution75.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(7)){
                    controller.contribution81.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(7)) {
                    controller.contribution82.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(7)) {
                    controller.contribution83.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(7)) {
                    controller.contribution84.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(7)) {
                    controller.contribution85.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(8)){
                    controller.contribution91.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(8)) {
                    controller.contribution92.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(8)) {
                    controller.contribution93.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(8)) {
                    controller.contribution94.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(8)) {
                    controller.contribution95.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(9)){
                    controller.contribution101.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(9)) {
                    controller.contribution102.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(9)) {
                    controller.contribution103.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(9)) {
                    controller.contribution104.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(9)) {
                    controller.contribution105.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(10)){
                    controller.contribution111.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(10)) {
                    controller.contribution112.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(10)) {
                    controller.contribution113.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(10)) {
                    controller.contribution114.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(10)) {
                    controller.contribution115.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(11)){
                    controller.contribution121.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(11)) {
                    controller.contribution122.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(11)) {
                    controller.contribution123.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(11)) {
                    controller.contribution124.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(11)) {
                    controller.contribution125.setSelected(true);
                }

                if (syllabus1.contributionLevel1.get(12)){
                    controller.contribution131.setSelected(true);
                } else if (syllabus1.contributionLevel2.get(12)) {
                    controller.contribution132.setSelected(true);
                } else if (syllabus1.contributionLevel3.get(12)) {
                    controller.contribution133.setSelected(true);
                } else if (syllabus1.contributionLevel4.get(12)) {
                    controller.contribution134.setSelected(true);
                } else if (syllabus1.contributionLevel5.get(12)) {
                    controller.contribution135.setSelected(true);
                }
            }





            //Assessment
            if (!syllabus1.semesterActivityNumber.isEmpty()){
                controller.numParticipation.setText(String.valueOf(syllabus1.semesterActivityNumber.get(0)));
                controller.numLab.setText(String.valueOf(syllabus1.semesterActivityNumber.get(1)));
                controller.numFieldWork.setText(String.valueOf(syllabus1.semesterActivityNumber.get(2)));
                controller.numQuiz.setText(String.valueOf(syllabus1.semesterActivityNumber.get(3)));
                controller.numHomework.setText(String.valueOf(syllabus1.semesterActivityNumber.get(4)));
                controller.numPresentation.setText(String.valueOf(syllabus1.semesterActivityNumber.get(5)));
                controller.numProject.setText(String.valueOf(syllabus1.semesterActivityNumber.get(6)));
                controller.numSeminar.setText(String.valueOf(syllabus1.semesterActivityNumber.get(7)));
                controller.numOral.setText(String.valueOf(syllabus1.semesterActivityNumber.get(8)));
                controller.numMidterm.setText(String.valueOf(syllabus1.semesterActivityNumber.get(9)));
                controller.numFinal.setText(String.valueOf(syllabus1.semesterActivityNumber.get(10)));
            }

            if (!syllabus1.semesterActivityWeight.isEmpty()){
                controller.weightParticipation.setText(String.valueOf(syllabus1.semesterActivityWeight.get(0)));
                controller.weightLab.setText(String.valueOf(syllabus1.semesterActivityWeight.get(1)));
                controller.weightFieldWork.setText(String.valueOf(syllabus1.semesterActivityWeight.get(2)));
                controller.weightQuiz.setText(String.valueOf(syllabus1.semesterActivityWeight.get(3)));
                controller.weightHomework.setText(String.valueOf(syllabus1.semesterActivityWeight.get(4)));
                controller.weightPresentation.setText(String.valueOf(syllabus1.semesterActivityWeight.get(5)));
                controller.weightProject.setText(String.valueOf(syllabus1.semesterActivityWeight.get(6)));
                controller.weightSeminar.setText(String.valueOf(syllabus1.semesterActivityWeight.get(7)));
                controller.weightOral.setText(String.valueOf(syllabus1.semesterActivityWeight.get(8)));
                controller.weightMidterm.setText(String.valueOf(syllabus1.semesterActivityWeight.get(9)));
                controller.weightFinal.setText(String.valueOf(syllabus1.semesterActivityWeight.get(10)));
            }

            if (!syllabus1.semesterActivityLO1.isEmpty()){
                controller.lo1Participation.setText(String.valueOf(syllabus1.semesterActivityLO1.get(0)));
                controller.lo1Lab.setText(String.valueOf(syllabus1.semesterActivityLO1.get(1)));
                controller.lo1FieldWork.setText(String.valueOf(syllabus1.semesterActivityLO1.get(2)));
                controller.lo1Quiz.setText(String.valueOf(syllabus1.semesterActivityLO1.get(3)));
                controller.lo1Homework.setText(String.valueOf(syllabus1.semesterActivityLO1.get(4)));
                controller.lo1Presentation.setText(String.valueOf(syllabus1.semesterActivityLO1.get(5)));
                controller.lo1Project.setText(String.valueOf(syllabus1.semesterActivityLO1.get(6)));
                controller.lo1Seminar.setText(String.valueOf(syllabus1.semesterActivityLO1.get(7)));
                controller.lo1Oral.setText(String.valueOf(syllabus1.semesterActivityLO1.get(8)));
                controller.lo1Midterm.setText(String.valueOf(syllabus1.semesterActivityLO1.get(9)));
                controller.lo1Final.setText(String.valueOf(syllabus1.semesterActivityLO1.get(10)));
            }
            if (!syllabus1.semesterActivityLO2.isEmpty()){
                controller.lo2Participation.setText(String.valueOf(syllabus1.semesterActivityLO2.get(0)));
                controller.lo2Lab.setText(String.valueOf(syllabus1.semesterActivityLO2.get(1)));
                controller.lo2FieldWork.setText(String.valueOf(syllabus1.semesterActivityLO2.get(2)));
                controller.lo2Quiz.setText(String.valueOf(syllabus1.semesterActivityLO2.get(3)));
                controller.lo2Homework.setText(String.valueOf(syllabus1.semesterActivityLO2.get(4)));
                controller.lo2Presentation.setText(String.valueOf(syllabus1.semesterActivityLO2.get(5)));
                controller.lo2Project.setText(String.valueOf(syllabus1.semesterActivityLO2.get(6)));
                controller.lo2Seminar.setText(String.valueOf(syllabus1.semesterActivityLO2.get(7)));
                controller.lo2Oral.setText(String.valueOf(syllabus1.semesterActivityLO2.get(8)));
                controller.lo2Midterm.setText(String.valueOf(syllabus1.semesterActivityLO2.get(9)));
                controller.lo2Final.setText(String.valueOf(syllabus1.semesterActivityLO2.get(10)));
            }

            if (!syllabus1.semesterActivityLO3.isEmpty()){
                controller.lo3Participation.setText(String.valueOf(syllabus1.semesterActivityLO3.get(0)));
                controller.lo3Lab.setText(String.valueOf(syllabus1.semesterActivityLO3.get(1)));
                controller.lo3FieldWork.setText(String.valueOf(syllabus1.semesterActivityLO3.get(2)));
                controller.lo3Quiz.setText(String.valueOf(syllabus1.semesterActivityLO3.get(3)));
                controller.lo3Homework.setText(String.valueOf(syllabus1.semesterActivityLO3.get(4)));
                controller.lo3Presentation.setText(String.valueOf(syllabus1.semesterActivityLO3.get(5)));
                controller.lo3Project.setText(String.valueOf(syllabus1.semesterActivityLO3.get(6)));
                controller.lo3Seminar.setText(String.valueOf(syllabus1.semesterActivityLO3.get(7)));
                controller.lo3Oral.setText(String.valueOf(syllabus1.semesterActivityLO3.get(8)));
                controller.lo3Midterm.setText(String.valueOf(syllabus1.semesterActivityLO3.get(9)));
                controller.lo3Final.setText(String.valueOf(syllabus1.semesterActivityLO3.get(10)));
            }

            if (!syllabus1.semesterActivityLO4.isEmpty()){
                controller.lo4Participation.setText(String.valueOf(syllabus1.semesterActivityLO4.get(0)));
                controller.lo4Lab.setText(String.valueOf(syllabus1.semesterActivityLO4.get(1)));
                controller.lo4FieldWork.setText(String.valueOf(syllabus1.semesterActivityLO4.get(2)));
                controller.lo4Quiz.setText(String.valueOf(syllabus1.semesterActivityLO4.get(3)));
                controller.lo4Homework.setText(String.valueOf(syllabus1.semesterActivityLO4.get(4)));
                controller.lo4Presentation.setText(String.valueOf(syllabus1.semesterActivityLO4.get(5)));
                controller.lo4Project.setText(String.valueOf(syllabus1.semesterActivityLO4.get(6)));
                controller.lo4Seminar.setText(String.valueOf(syllabus1.semesterActivityLO4.get(7)));
                controller.lo4Oral.setText(String.valueOf(syllabus1.semesterActivityLO4.get(8)));
                controller.lo4Midterm.setText(String.valueOf(syllabus1.semesterActivityLO4.get(9)));
                controller.lo4Final.setText(String.valueOf(syllabus1.semesterActivityLO4.get(10)));
            }

            if (!syllabus1.semesterActivityLO5.isEmpty()){
                controller.lo5Participation.setText(String.valueOf(syllabus1.semesterActivityLO5.get(0)));
                controller.lo5Lab.setText(String.valueOf(syllabus1.semesterActivityLO5.get(1)));
                controller.lo5FieldWork.setText(String.valueOf(syllabus1.semesterActivityLO5.get(2)));
                controller.lo5Quiz.setText(String.valueOf(syllabus1.semesterActivityLO5.get(3)));
                controller.lo5Homework.setText(String.valueOf(syllabus1.semesterActivityLO5.get(4)));
                controller.lo5Presentation.setText(String.valueOf(syllabus1.semesterActivityLO5.get(5)));
                controller.lo5Project.setText(String.valueOf(syllabus1.semesterActivityLO5.get(6)));
                controller.lo5Seminar.setText(String.valueOf(syllabus1.semesterActivityLO5.get(7)));
                controller.lo5Oral.setText(String.valueOf(syllabus1.semesterActivityLO5.get(8)));
                controller.lo5Midterm.setText(String.valueOf(syllabus1.semesterActivityLO5.get(9)));
                controller.lo5Final.setText(String.valueOf(syllabus1.semesterActivityLO5.get(10)));
            }

            if (!syllabus1.semesterActivityNumber.isEmpty()) {
                int totalParticipation = 0, totalWeight = 0, lo1 = 0, lo2 = 0, lo3 = 0, lo4 = 0, lo5 = 0;
                for (int i = 0; i < 10; i++) {
                    totalParticipation += syllabus1.semesterActivityNumber.get(i);
                    totalWeight += syllabus1.semesterActivityWeight.get(i);
                    lo1 += syllabus1.semesterActivityLO1.get(i);
                    lo2 += syllabus1.semesterActivityLO2.get(i);
                    lo3 += syllabus1.semesterActivityLO3.get(i);
                    lo4 += syllabus1.semesterActivityLO4.get(i);
                    lo5 += syllabus1.semesterActivityLO5.get(i);
                }


                controller.numTotal.setText(String.valueOf(totalParticipation));
                controller.weightTotal.setText(String.valueOf(totalWeight));

                controller.weightFinal1.setText(String.valueOf(totalParticipation));
                controller.weightFinal2.setText(String.valueOf(totalWeight));
                controller.weightEndFinal1.setText(String.valueOf(syllabus1.semesterActivityNumber.get(10)));
                controller.weightEndFinal2.setText(String.valueOf(syllabus1.semesterActivityWeight.get(10)));
                controller.total1.setText(String.valueOf(Integer.parseInt(controller.weightFinal1.getText()) + Integer.parseInt(controller.weightEndFinal1.getText())));
                controller.total2.setText(String.valueOf(Integer.parseInt(controller.weightFinal2.getText()) + Integer.parseInt(controller.weightEndFinal2.getText())));
            }



            Scene scene = new Scene(root);

            // Mevcut pencerenin referansını al


            //       Stage currentStage = (Stage) searchButton.getScene().getWindow();


            // Yeni bir Stage oluştur
            Stage newStage = new Stage();
            newStage.setScene(scene);

            // Mevcut pencereyi kapat

            //        currentStage.close();

            // Yeni pencereyi göster
            newStage.show();


        }else {
            // Aranan veri bulunamadı
            Platform.exit();
        }

    }
}
