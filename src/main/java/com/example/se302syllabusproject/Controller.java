//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.se302syllabusproject;

import java.io.IOException;
import java.lang.reflect.Type;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
    private boolean isCrossAddedFall = false;
    private boolean isCrossAddedSpring = false;
    @FXML
    public Button FallButton;
    @FXML
    public Button SpringButton;
    @FXML
    public Button nextButton;
    @FXML
    public Button page2to1;
    @FXML
    public Button pageMainto1;
    @FXML
    public Button oneToMain;
    @FXML
    public Button exitButton;
    @FXML
    public Button page3to2;
    @FXML
    public Button page3to4;
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
    public CheckBox CoreCourse;
    @FXML
    public CheckBox MajorAreaCourse;
    @FXML
    public CheckBox SupportiveCourse;
    @FXML
    public CheckBox CommunicationCourse;
    @FXML
    public CheckBox TransferableSkillCourse;

//PAGE1
    @FXML
    private void Page1CourseLanguageCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();

        if (selectedCheckBox.isSelected()) {
            if (selectedCheckBox == CourseLanguageEnglish) {
                CourseLanguageTurkish.setSelected(false);
                CourseLanguageSecondForeign.setSelected(false);
            } else if (selectedCheckBox == CourseLanguageTurkish) {
                CourseLanguageEnglish.setSelected(false);
                CourseLanguageSecondForeign.setSelected(false);
            } else if (selectedCheckBox == CourseLanguageSecondForeign) {
                CourseLanguageEnglish.setSelected(false);
                CourseLanguageTurkish.setSelected(false);
            }
        }
    }

    @FXML
    private void Page1CourseTypeCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();

        if (selectedCheckBox.isSelected()) {
            if (selectedCheckBox == TypeElective) {
                TypeRequired.setSelected(false);

            } else if (selectedCheckBox == TypeRequired) {
                TypeElective.setSelected(false);
            }
        }
    }

    @FXML
    private void Page1CourseLevelCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();

        // Diğer CheckBox'ları devre dışı bırak
        if (selectedCheckBox.isSelected()) {
            if (selectedCheckBox == levelShortCycle) {
                LevelFirstCycle.setSelected(false);
                LevelSecondCycle.setSelected(false);
                LevelThirdCycle.setSelected(false);

            } else if (selectedCheckBox == LevelFirstCycle) {
                levelShortCycle.setSelected(false);
                LevelSecondCycle.setSelected(false);
            } else if (selectedCheckBox == LevelSecondCycle) {
                LevelFirstCycle.setSelected(false);
                levelShortCycle.setSelected(false);
                LevelThirdCycle.setSelected(false);
            }
            else if (selectedCheckBox == LevelThirdCycle){
                LevelFirstCycle.setSelected(false);
                levelShortCycle.setSelected(false);
                LevelSecondCycle.setSelected(false);

            }
        }
    }

    @FXML
    private void FallButtonClick(ActionEvent event) {
        if (this.isCrossAddedFall) {
            this.FallButton.setGraphic((Node)null);
        } else {
            this.FallButton.setGraphic(new Text("✖"));
        }

        this.isCrossAddedFall = !this.isCrossAddedFall;

    }

    @FXML
    public void SpringButtonClick() {
        if (this.isCrossAddedSpring) {
            this.SpringButton.setGraphic((Node)null);
        } else {
            this.SpringButton.setGraphic(new Text("✖"));
        }

        this.isCrossAddedSpring = !this.isCrossAddedSpring;

    }

    @FXML
    private void Page1CourseCategoryCheckBoxes(ActionEvent event) {
        CheckBox selectedCheckBox = (CheckBox) event.getSource();

        if (selectedCheckBox.isSelected()) {
            if (selectedCheckBox == CoreCourse) {
                MajorAreaCourse.setSelected(false);
                SupportiveCourse.setSelected(false);
                CommunicationCourse.setSelected(false);
                TransferableSkillCourse.setSelected(false);

            } else if (selectedCheckBox == MajorAreaCourse) {
                CoreCourse.setSelected(false);
                SupportiveCourse.setSelected(false);
                CommunicationCourse.setSelected(false);
                TransferableSkillCourse.setSelected(false);

            } else if (selectedCheckBox == SupportiveCourse) {
                MajorAreaCourse.setSelected(false);
                CoreCourse.setSelected(false);
                CommunicationCourse.setSelected(false);
                TransferableSkillCourse.setSelected(false);
            } else if (selectedCheckBox == CommunicationCourse) {
                MajorAreaCourse.setSelected(false);
                SupportiveCourse.setSelected(false);
                CoreCourse.setSelected(false);
                TransferableSkillCourse.setSelected(false);
            } else if (selectedCheckBox == TransferableSkillCourse) {
                MajorAreaCourse.setSelected(false);
                SupportiveCourse.setSelected(false);
                CommunicationCourse.setSelected(false);
                CoreCourse.setSelected(false);
            }

        }

    }



    @FXML
    private void pageOnetoTwo(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Page2.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void pageTwotoOne(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Page1.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void pageTwotoThree(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Page3.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void pageMainto1(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Page1.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void pageOneToMain(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Main.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void exitButton(ActionEvent event) throws IOException, IOException {
        Platform.exit();
    }


    @FXML
    private void pageThreetoTwo(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Page2.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void pageThreetoFour(ActionEvent event) throws IOException, IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Page4.fxml"));
        Parent root = (Parent)loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
