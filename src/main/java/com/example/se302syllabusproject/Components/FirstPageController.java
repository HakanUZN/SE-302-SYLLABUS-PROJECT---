package com.example.se302syllabusproject.Components;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class FirstPageController {

    //PAGE 1 Attributes
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
    @FXML
    public TextField courseNameEnter;
    @FXML
    public TextField CodeString;
    @FXML
    public Button SpringButton;
    @FXML
    public Button FallButton;
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
    private Button oneToMain;

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

        //
        //Fall and Spring button clicked
        //

        String theory = TheoryHour.getText();
        String application = ApplicationLabHour.getText();
        String localCredits = LocalCredits.getText();
        String ects = ECTS.getText();
        //


        String presequisites = presquisites.getText();
        isCourseLangEngSelected = CourseLanguageEnglish.isSelected();
        isCourseLangTurkishSelected = CourseLanguageTurkish.isSelected();
        isCourseLangSecondForeigngSelected = CourseLanguageSecondForeign.isSelected();
        isCourseTypeReq = TypeRequired.isSelected();
        isCourseTypeElec = TypeElective.isSelected();
        isCourseLevelShort = levelShortCycle.isSelected();
        isCourseLevelFirst = LevelFirstCycle.isSelected();
        isCourseLevelSecondCycle = LevelSecondCycle.isSelected();
        isCourseLevelThirdCycle = LevelThirdCycle.isSelected();
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

        isCoreCourse = CoreCourse.isSelected();
        isMajorAreaCourse = MajorAreaCourse.isSelected();
        isSupportiveCourse = SupportiveCourse.isSelected();
        isCommunicationCourse = CommunicationCourse.isSelected();
        isTransferableCourse = TransferableSkillCourse.isSelected();
        //

        //bitmedi  SyllabusPage1 syllabusPage1=new SyllabusPage1(courseName,courseCode,theory,application,localCredits,ects,presequisites,)
    }


}
