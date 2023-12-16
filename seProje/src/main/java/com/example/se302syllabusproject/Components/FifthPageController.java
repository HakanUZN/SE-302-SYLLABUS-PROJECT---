package com.example.se302syllabusproject.Components;

import com.example.se302syllabusproject.DataModel.OutcomeMatrix;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class FifthPageController {

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
        OutcomeMatrix outcomeMatrix =new OutcomeMatrix();
    }
}
