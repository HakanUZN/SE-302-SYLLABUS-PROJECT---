package com.example.se302syllabusproject.DataModel;

import java.util.ArrayList;

public class Syllabus {
    private GeneralInformation generalInformation;
    private SubjectsAndMaterials subjectsAndMaterials;
    private Assessments assessments;
    private WorkloadTable workloadTable;
    private OutcomeMatrix outcomeMatrix;
    public double version;

     public ArrayList<Syllabus> syllabusList = new ArrayList<>();
    public Syllabus(GeneralInformation generalInformation, SubjectsAndMaterials subjectsAndMaterials, Assessments assessments, WorkloadTable workloadTable, OutcomeMatrix outcomeMatrix) {
        this.setSyllabusPage1(generalInformation);
        this.setSyllabusPage2(subjectsAndMaterials);
        this.setSyllabusPage3(assessments);
        this.setSyllabusPage4(workloadTable);
        this.setSyllabusPage5(outcomeMatrix);
    }

    public Syllabus() {
    }


    public GeneralInformation getSyllabusPage1() {
        return generalInformation;
    }

    public void setSyllabusPage1(GeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
    }

    public SubjectsAndMaterials getSyllabusPage2() {
        return subjectsAndMaterials;
    }

    public void setSyllabusPage2(SubjectsAndMaterials subjectsAndMaterials) {
        this.subjectsAndMaterials = subjectsAndMaterials;
    }

    public Assessments getSyllabusPage3() {
        return assessments;
    }

    public void setSyllabusPage3(Assessments assessments) {
        this.assessments = assessments;
    }

    public WorkloadTable getSyllabusPage4() {
        return workloadTable;
    }

    public void setSyllabusPage4(WorkloadTable workloadTable) {
        this.workloadTable = workloadTable;
    }

    public OutcomeMatrix getSyllabusPage5() {
        return outcomeMatrix;
    }

    public void setSyllabusPage5(OutcomeMatrix outcomeMatrix) {
        this.outcomeMatrix = outcomeMatrix;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
