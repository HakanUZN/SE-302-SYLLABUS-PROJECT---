package com.example.se302syllabusproject.DataModel;

import java.util.ArrayList;
import java.util.List;

public class Syllabus {



    private double version ;
    private boolean syllabusLanguage; //if 1 English
    private String courseCode;

    //General Information
    private String courseName;
    private boolean isFall;
    private boolean isSpring;
    private int theoryHours;
    private int labHours;
    private int localCredits;
    private int ECTS;
    private String prerequisities;

    public String getPrerequisities() {
        return prerequisities;
    }

    public void setPrerequisities(String prerequisities) {
        this.prerequisities = prerequisities;
    }

    private String courseLanguage;
    private String courseType;
    private String courseLevel;
    private String teachingMethods;
    private String courseCoordinator;
    private String courseLecturers;
    private String assistants;
    private String courseObjectives;
    private String learningOutcomes;
    private String courseDescriptions;
    private String courseCategory;


    //Subjects And Materials

    private String weekSub1;
    private String weekReq1;
    private String weekSub2;
    private String weekReq2;
    private String weekSub3;
    private String weekReq3;
    private String weekSub4;
    private String weekReq4;
    private String weekSub5;
    private String weekReq5;
    private String weekSub6;
    private String weekReq6;
    private String weekSub7;
    private String weekReq7;
    private String weekSub8;
    private String weekReq8;
    private String weekSub9;
    private String weekReq9;
    private String weekSub10;
    private String weekReq10;
    private String weekSub11;
    private String weekReq11;
    private String weekSub12;
    private String weekReq12;
    private String weekSub13;
    private String weekReq13;
    private String weekSub14;
    private String weekReq14;
    private String weekSub15;
    private String weekReq15;
    private String weekSub16;
    private String weekReq16;

    public ArrayList<String> weekSubjects = new ArrayList<>();

    public ArrayList<String> weekRequiredMat = new ArrayList<>();

    private String courseNotes;
    private String suggestedReadings;

    //Assessments
    private String activityName;
    private int participationNo_3;
    private int participationWeight_3;
    private int participationLO1_3;
    private int participationLO2_3;
    private int participationLO3_3;
    private int participationLO4_3;
    private int participationLO5_3;
    private int lab_AppNo_3;
    private int lab_AppWeight_3;
    private int lab_AppLO1_3;
    private int lab_AppLO2_3;
    private int lab_AppLO3_3;
    private int lab_AppLO4_3;
    private int lab_AppLO5_3;
    private int fieldWorkNo_3;
    private int fieldWorkWeight_3;
    private int fieldWorkLO1_3;
    private int fieldWorkLO2_3;
    private int fieldWorkLO3_3;
    private int fieldWorkLO4_3;
    private int fieldWorkLO5_3;
    private int quiz_StudioCritiqueNo_3;
    private int quiz_StudioCritiqueWeight_3;
    private int quiz_StudioCritiqueLO1_3;
    private int quiz_StudioCritiqueLO2_3;
    private int quiz_StudioCritiqueLO3_3;
    private int quiz_StudioCritiqueLO4_3;
    private int quiz_StudioCritiqueLO5_3;
    private int homework_AssignmentNo_3;
    private int homework_AssignmentWeight_3;
    private int homework_AssignmentLO1_3;
    private int homework_AssignmentLO2_3;
    private int homework_AssignmentLO3_3;
    private int homework_AssignmentLO4_3;
    private int homework_AssignmentLO5_3;
    private int presentation_JuryNo_3;
    private int presentation_JuryWeight_3;
    private int presentation_JuryLO1_3;
    private int presentation_JuryLO2_3;
    private int presentation_JuryLO3_3;
    private int presentation_JuryLO4_3;
    private int presentation_JuryLO5_3;
    private int projectNo_3;
    private int projectWeight_3;
    private int projectLO1_3;
    private int projectLO2_3;
    private int projectLO3_3;
    private int projectLO4_3;
    private int projectLO5_3;
    private int seminar_WorkshopNo_3;
    private int seminar_WorkshopWeight_3;
    private int seminar_WorkshopLO1_3;
    private int seminar_WorkshopLO2_3;
    private int seminar_WorkshopLO3_3;
    private int seminar_WorkshopLO4_3;
    private int seminar_WorkshopLO5_3;
    private int oralExamNo_3;
    private int oralExamWeight_3;
    private int oralExamLO1_3;
    private int oralExamLO2_3;
    private int oralExamLO3_3;
    private int oralExamLO4_3;
    private int oralExamLO5_3;
    private int midtermNo_3;
    private int midtermWeight_3;
    private int midtermLO1_3;
    private int midtermLO2_3;
    private int midtermLO3_3;
    private int midtermLO4_3;
    private int midtermLO5_3;
    private int finalExamNo_3;
    private int finalExamWeight_3;
    private int finalExamLO1_3;
    private int finalExamLO2_3;
    private int finalExamLO3_3;
    private int finalExamLO4_3;
    private int finalExamLO5_3;
    private int totalNo_3;
    private int totalWeight_3;
    private int totalLO1_3;
    private int totalLO2_3;
    private int totalLO3_3;
    private int totalLO4_3;
    private int totalLO5_3;
    private int weightingOfSemesterActivities_1;
    private int weightingOfSemesterActivities_2;
    private int weightingOf_EndOf_SemesterActivities_1;
    private int weightingOf_EndOf_SemesterActivities_2;
    private int activityTotal_1;
    private int activityTotal_2;

    public ArrayList<Integer> numberOfActivity = new ArrayList<>();
    public ArrayList<Integer> activityWeight = new ArrayList<>();
    public ArrayList<Integer> learningOutcome1 = new ArrayList<>();
    public ArrayList<Integer> learningOutcome2 = new ArrayList<>();
    public ArrayList<Integer> learningOutcome3 = new ArrayList<>();
    public ArrayList<Integer> learningOutcome4 = new ArrayList<>();
    public ArrayList<Integer> learningOutcome5 = new ArrayList<>();



    //Workload Table
    private int courseHoursNo_4;
    private int courseHoursDuration_4;
    private int courseHoursWorkload_4;
    private int lab_AppHoursNo_4;
    private int lab_AppHoursDuration_4;
    private int lab_AppHoursWorkload_4;
    private int studyHoursNo_4;
    private int studyHoursDuration_4;
    private int studyHoursWorkload_4;
    private int fieldWorkNo_4;
    private int fieldWorkDuration_4;
    private int fieldWorkWorkload_4;
    private int quiz_StudioCritiqueNo_4;
    private int quiz_StudioCritiqueDuration_4;
    private int quiz_StudioCritiqueWorkload_4;
    private int homework_AssignmentsNo_4;
    private int homework_AssignmentsDuration_4;
    private int homework_AssignmentsWorkload_4;
    private int presentation_JuryNo_4;
    private int presentation_JuryDuration_4;
    private int presentation_JuryWorkload_4;
    private int projectNo_4;
    private int projectDuration_4;
    private int projectWorkload_4;
    private int seminar_WorkshopNo_4;
    private int seminar_WorkshopDuration_4;
    private int seminar_WorkshopWorkload_4;
    private int oralExamNo_4;
    private int oralExamDuration_4;
    private int oralExamWorkload_4;
    private int midtermNo_4;
    private int midtermDuration_4;
    private int midtermWorkload_4;
    private int finalExamNo_4;
    private int finalExamDuration_4;
    private int finalExamWorkload_4;
    private int total_page4;

    //workload table
    public ArrayList<String> semesterActivityName=new ArrayList<>();
    public ArrayList<Integer> semesterActivityNumber=new ArrayList<>();
    public ArrayList<Integer> semesterActivityWeight=new ArrayList<>();
    public ArrayList<Integer> semesterActivityLO1=new ArrayList<>();
    public ArrayList<Integer> semesterActivityLO2=new ArrayList<>();
    public ArrayList<Integer> semesterActivityLO3=new ArrayList<>();
    public ArrayList<Integer> semesterActivityLO4=new ArrayList<>();
    public ArrayList<Integer> semesterActivityLO5=new ArrayList<>();



    //Workload
    private String semesterActivity1;
    private String semesterActivity2;
    private String semesterActivity3;
    private String semesterActivity4;
    private String semesterActivity5;
    private String semesterActivity6;
    private String semesterActivity7;
    private String semesterActivity8;
    private String semesterActivity9;
    private String semesterActivity10;
    private String semesterActivity11;
    private String semesterActivity12;
    public ArrayList<String> semesterActivity = new ArrayList<>();
    //
    private int SemesterNum1;
    private int SemesterNum2;
    private int SemesterNum3;
    private int SemesterNum4;
    private int SemesterNum5;
    private int SemesterNum6;
    private int SemesterNum7;
    private int SemesterNum8;
    private int SemesterNum9;
    private int SemesterNum10;
    private int SemesterNum11;
    private int SemesterNum12;

    public ArrayList<Integer> semesterNumbers = new ArrayList<>();


    private int SemesterDuration1;
    private int SemesterDuration2;
    private int SemesterDuration3;
    private int SemesterDuration4;
    private int SemesterDuration5;
    private int SemesterDuration6;
    private int SemesterDuration7;
    private int SemesterDuration8;
    private int SemesterDuration9;
    private int SemesterDuration10;
    private int SemesterDuration11;
    private int SemesterDuration12;

    public ArrayList<Integer> semesterDuration = new ArrayList<>();


    private int SemesterWorkload1;
    private int SemesterWorkload2;
    private int SemesterWorkload3;
    private int SemesterWorkload4;
    private int SemesterWorkload5;
    private int SemesterWorkload6;
    private int SemesterWorkload7;
    private int SemesterWorkload8;
    private int SemesterWorkload9;
    private int SemesterWorkload10;
    private int SemesterWorkload11;
    private int SemesterWorkload12;

    public ArrayList<Integer> semesterWorkload = new ArrayList<>();


    //Workload END

    //Outcome Matrix
    private String programCompetencies_Outcomes_1;
    private int contributionLevel_1;
    private String LO_1;
    private String programCompetencies_Outcomes_2;
    private int contributionLevel_2;
    private String LO_2;
    private String programCompetencies_Outcomes_3;
    private int contributionLevel_3;
    private String LO_3;
    private String programCompetencies_Outcomes_4;
    private int contributionLevel_4;
    private String LO_4;
    private String programCompetencies_Outcomes_5;
    private int contributionLevel_5;
    private String LO_5;
    private String programCompetencies_Outcomes_6;
    private int contributionLevel_6;
    private String LO_6;
    private String programCompetencies_Outcomes_7;
    private int contributionLevel_7;
    private String LO_7;
    private String programCompetencies_Outcomes_8;
    private int contributionLevel_8;
    private String LO_8;
    private String programCompetencies_Outcomes_9;
    private int contributionLevel_9;
    private String LO_9;
    private String programCompetencies_Outcomes_10;
    private int contributionLevel_10;
    private String LO_10;
    private String programCompetencies_Outcomes_11;
    private int contributionLevel_11;
    private String LO_11;
    private String programCompetencies_Outcomes_12;
    private int contributionLevel_12;
    private String LO_12;
    private String programCompetencies_Outcomes_13;
    private int contributionLevel_13;
    private String LO_13;
    public ArrayList<String> competentiesOutcomes = new ArrayList<>();
    public ArrayList<Boolean> contributionLevel1 = new ArrayList<>();
    public ArrayList<Boolean> contributionLevel2 = new ArrayList<>();
    public ArrayList<Boolean> contributionLevel3 = new ArrayList<>();
    public ArrayList<Boolean> contributionLevel4 = new ArrayList<>();
    public ArrayList<Boolean> contributionLevel5 = new ArrayList<>();

    public ArrayList<String> learnOutcomesForm = new ArrayList<>();



    private List<String> weekSub;
    private List<String> weekReq;


 //   private List<SubjectsAndMaterials> subjectsAndMaterialsList;

    public ArrayList<Syllabus> syllabusList = new ArrayList<>();


    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getTeachingMethods() {
        return teachingMethods;
    }

    public void setTeachingMethods(String teachingMethods) {
        this.teachingMethods = teachingMethods;
    }

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public boolean isFall() {
        if (isFall){
            return  true;
        }else {
            return false;
        }
    }

    public void setFall(boolean fall) {
        if (fall){
            this.isFall=true;
        }else {
            this.isFall=false;
        }
    }

    public boolean isSpring() {
        if (isSpring){
            return  true;
        }else {
            return false;
        }
    }

    public void setSpring(boolean spring) {
        if (spring){
            this.isSpring=true;
        }else {
            this.isSpring=false;
        }
    }

    public int getTheoryHours() {
        return theoryHours;
    }

    public void setTheoryHours(int theoryHours) {
        this.theoryHours = theoryHours;
    }

    public int getLocalCredits() {
        return localCredits;
    }

    public void setLocalCredits(int localCredits) {
        this.localCredits = localCredits;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public int getLabHours() {
        return labHours;
    }

    public void setLabHours(int labHours) {
        this.labHours = labHours;
    }

    public String getCourseCoordinator() {
        return courseCoordinator;
    }

    public void setCourseCoordinator(String courseCoordinator) {
        this.courseCoordinator = courseCoordinator;
    }

    public String getCourseLecturers() {
        return courseLecturers;
    }

    public void setCourseLecturers(String courseLecturers) {
        this.courseLecturers = courseLecturers;
    }

    public String getAssistants() {
        return assistants;
    }

    public void setAssistants(String assistants) {
        this.assistants = assistants;
    }

    public String getCourseObjectives() {
        return courseObjectives;
    }

    public void setCourseObjectives(String courseObjectives) {
        this.courseObjectives = courseObjectives;
    }

    public String getLearningOutcomes() {
        return learningOutcomes;
    }

    public void setLearningOutcomes(String learningOutcomes) {
        this.learningOutcomes = learningOutcomes;
    }

    public String getCourseDescriptions() {
        return courseDescriptions;
    }

    public void setCourseDescriptions(String courseDescriptions) {
        this.courseDescriptions = courseDescriptions;
    }


    public List<String> getWeekSub() {
        return weekSub;
    }

    public void setWeekSub(List<String> weekSub) {
        this.weekSub = weekSub;
    }

    public List<String> getWeekReq() {
        return weekReq;
    }

    public void setWeekReq(List<String> weekReq) {
        this.weekReq = weekReq;
    }

    public String getSuggestedReadings() {
        return suggestedReadings;
    }

    public void setSuggestedReadings(String suggestedReadings) {
        this.suggestedReadings = suggestedReadings;
    }

    public String getCourseNotes() {
        return courseNotes;
    }

    public void setCourseNotes(String courseNotes) {
        this.courseNotes = courseNotes;
    }

    public String getWeekSub1() {
        return weekSub1;
    }

    public void setWeekSub1(String weekSub1) {
        this.weekSub1 = weekSub1;
    }

    public String getWeekReq1() {
        return weekReq1;
    }

    public void setWeekReq1(String weekReq1) {
        this.weekReq1 = weekReq1;
    }

    public String getWeekSub2() {
        return weekSub2;
    }

    public void setWeekSub2(String weekSub2) {
        this.weekSub2 = weekSub2;
    }

    public String getWeekReq2() {
        return weekReq2;
    }

    public void setWeekReq2(String weekReq2) {
        this.weekReq2 = weekReq2;
    }

    public String getWeekSub3() {
        return weekSub3;
    }

    public void setWeekSub3(String weekSub3) {
        this.weekSub3 = weekSub3;
    }

    public String getWeekReq3() {
        return weekReq3;
    }

    public void setWeekReq3(String weekReq3) {
        this.weekReq3 = weekReq3;
    }

    public String getWeekSub4() {
        return weekSub4;
    }

    public void setWeekSub4(String weekSub4) {
        this.weekSub4 = weekSub4;
    }

    public String getWeekReq4() {
        return weekReq4;
    }

    public void setWeekReq4(String weekReq4) {
        this.weekReq4 = weekReq4;
    }

    public String getWeekSub5() {
        return weekSub5;
    }

    public void setWeekSub5(String weekSub5) {
        this.weekSub5 = weekSub5;
    }

    public String getWeekReq5() {
        return weekReq5;
    }

    public void setWeekReq5(String weekReq5) {
        this.weekReq5 = weekReq5;
    }

    public String getWeekSub6() {
        return weekSub6;
    }

    public void setWeekSub6(String weekSub6) {
        this.weekSub6 = weekSub6;
    }

    public String getWeekReq6() {
        return weekReq6;
    }

    public void setWeekReq6(String weekReq6) {
        this.weekReq6 = weekReq6;
    }

    public String getWeekSub7() {
        return weekSub7;
    }

    public void setWeekSub7(String weekSub7) {
        this.weekSub7 = weekSub7;
    }

    public String getWeekReq7() {
        return weekReq7;
    }

    public void setWeekReq7(String weekReq7) {
        this.weekReq7 = weekReq7;
    }

    public String getWeekSub8() {
        return weekSub8;
    }

    public void setWeekSub8(String weekSub8) {
        this.weekSub8 = weekSub8;
    }

    public String getWeekReq8() {
        return weekReq8;
    }

    public void setWeekReq8(String weekReq8) {
        this.weekReq8 = weekReq8;
    }

    public String getWeekSub9() {
        return weekSub9;
    }

    public void setWeekSub9(String weekSub9) {
        this.weekSub9 = weekSub9;
    }

    public String getWeekReq9() {
        return weekReq9;
    }

    public void setWeekReq9(String weekReq9) {
        this.weekReq9 = weekReq9;
    }

    public String getWeekSub10() {
        return weekSub10;
    }

    public void setWeekSub10(String weekSub10) {
        this.weekSub10 = weekSub10;
    }

    public String getWeekReq10() {
        return weekReq10;
    }

    public void setWeekReq10(String weekReq10) {
        this.weekReq10 = weekReq10;
    }

    public String getWeekSub11() {
        return weekSub11;
    }

    public void setWeekSub11(String weekSub11) {
        this.weekSub11 = weekSub11;
    }

    public String getWeekReq11() {
        return weekReq11;
    }

    public void setWeekReq11(String weekReq11) {
        this.weekReq11 = weekReq11;
    }

    public String getWeekSub12() {
        return weekSub12;
    }

    public void setWeekSub12(String weekSub12) {
        this.weekSub12 = weekSub12;
    }

    public String getWeekReq12() {
        return weekReq12;
    }

    public void setWeekReq12(String weekReq12) {
        this.weekReq12 = weekReq12;
    }

    public String getWeekSub13() {
        return weekSub13;
    }

    public void setWeekSub13(String weekSub13) {
        this.weekSub13 = weekSub13;
    }

    public String getWeekReq13() {
        return weekReq13;
    }

    public void setWeekReq13(String weekReq13) {
        this.weekReq13 = weekReq13;
    }

    public String getWeekSub14() {
        return weekSub14;
    }

    public void setWeekSub14(String weekSub14) {
        this.weekSub14 = weekSub14;
    }

    public String getWeekReq14() {
        return weekReq14;
    }

    public void setWeekReq14(String weekReq14) {
        this.weekReq14 = weekReq14;
    }

    public String getWeekSub15() {
        return weekSub15;
    }

    public void setWeekSub15(String weekSub15) {
        this.weekSub15 = weekSub15;
    }

    public String getWeekReq15() {
        return weekReq15;
    }

    public void setWeekReq15(String weekReq15) {
        this.weekReq15 = weekReq15;
    }

    public String getWeekSub16() {
        return weekSub16;
    }

    public void setWeekSub16(String weekSub16) {
        this.weekSub16 = weekSub16;
    }

    public String getWeekReq16() {
        return weekReq16;
    }

    public void setWeekReq16(String weekReq16) {
        this.weekReq16 = weekReq16;
    }

    public int getSemesterDuration1() {
        return SemesterDuration1;
    }

    public void setSemesterDuration1(int semesterDuration1) {
        SemesterDuration1 = semesterDuration1;
    }

    public int getSemesterDuration2() {
        return SemesterDuration2;
    }

    public void setSemesterDuration2(int semesterDuration2) {
        SemesterDuration2 = semesterDuration2;
    }

    public int getSemesterDuration3() {
        return SemesterDuration3;
    }

    public void setSemesterDuration3(int semesterDuration3) {
        SemesterDuration3 = semesterDuration3;
    }

    public int getSemesterDuration4() {
        return SemesterDuration4;
    }

    public void setSemesterDuration4(int semesterDuration4) {
        SemesterDuration4 = semesterDuration4;
    }

    public int getSemesterDuration5() {
        return SemesterDuration5;
    }

    public void setSemesterDuration5(int semesterDuration5) {
        SemesterDuration5 = semesterDuration5;
    }

    public int getSemesterDuration6() {
        return SemesterDuration6;
    }

    public void setSemesterDuration6(int semesterDuration6) {
        SemesterDuration6 = semesterDuration6;
    }

    public int getSemesterDuration7() {
        return SemesterDuration7;
    }

    public void setSemesterDuration7(int semesterDuration7) {
        SemesterDuration7 = semesterDuration7;
    }

    public int getSemesterDuration8() {
        return SemesterDuration8;
    }

    public void setSemesterDuration8(int semesterDuration8) {
        SemesterDuration8 = semesterDuration8;
    }

    public int getSemesterDuration9() {
        return SemesterDuration9;
    }

    public void setSemesterDuration9(int semesterDuration9) {
        SemesterDuration9 = semesterDuration9;
    }

    public int getSemesterDuration10() {
        return SemesterDuration10;
    }

    public void setSemesterDuration10(int semesterDuration10) {
        SemesterDuration10 = semesterDuration10;
    }

    public int getSemesterDuration11() {
        return SemesterDuration11;
    }

    public void setSemesterDuration11(int semesterDuration11) {
        SemesterDuration11 = semesterDuration11;
    }

    public int getSemesterDuration12() {
        return SemesterDuration12;
    }

    public void setSemesterDuration12(int semesterDuration12) {
        SemesterDuration12 = semesterDuration12;
    }

    public int getSemesterWorkload1() {
        return SemesterWorkload1;
    }

    public void setSemesterWorkload1(int semesterWorkload1) {
        SemesterWorkload1 = semesterWorkload1;
    }

    public int getSemesterWorkload2() {
        return SemesterWorkload2;
    }

    public void setSemesterWorkload2(int semesterWorkload2) {
        SemesterWorkload2 = semesterWorkload2;
    }

    public int getSemesterWorkload3() {
        return SemesterWorkload3;
    }

    public void setSemesterWorkload3(int semesterWorkload3) {
        SemesterWorkload3 = semesterWorkload3;
    }

    public int getSemesterWorkload4() {
        return SemesterWorkload4;
    }

    public void setSemesterWorkload4(int semesterWorkload4) {
        SemesterWorkload4 = semesterWorkload4;
    }

    public int getSemesterWorkload5() {
        return SemesterWorkload5;
    }

    public void setSemesterWorkload5(int semesterWorkload5) {
        SemesterWorkload5 = semesterWorkload5;
    }

    public int getSemesterWorkload6() {
        return SemesterWorkload6;
    }

    public void setSemesterWorkload6(int semesterWorkload6) {
        SemesterWorkload6 = semesterWorkload6;
    }

    public int getSemesterWorkload7() {
        return SemesterWorkload7;
    }

    public void setSemesterWorkload7(int semesterWorkload7) {
        SemesterWorkload7 = semesterWorkload7;
    }

    public int getSemesterWorkload8() {
        return SemesterWorkload8;
    }

    public void setSemesterWorkload8(int semesterWorkload8) {
        SemesterWorkload8 = semesterWorkload8;
    }

    public int getSemesterWorkload9() {
        return SemesterWorkload9;
    }

    public void setSemesterWorkload9(int semesterWorkload9) {
        SemesterWorkload9 = semesterWorkload9;
    }

    public int getSemesterWorkload10() {
        return SemesterWorkload10;
    }

    public void setSemesterWorkload10(int semesterWorkload10) {
        SemesterWorkload10 = semesterWorkload10;
    }

    public int getSemesterWorkload11() {
        return SemesterWorkload11;
    }

    public void setSemesterWorkload11(int semesterWorkload11) {
        SemesterWorkload11 = semesterWorkload11;
    }

    public int getSemesterWorkload12() {
        return SemesterWorkload12;
    }

    public void setSemesterWorkload12(int semesterWorkload12) {
        SemesterWorkload12 = semesterWorkload12;
    }

    public int getSemesterNum1() {
        return SemesterNum1;
    }

    public void setSemesterNum1(int semesterNum1) {
        SemesterNum1 = semesterNum1;
    }

    public int getSemesterNum2() {
        return SemesterNum2;
    }

    public void setSemesterNum2(int semesterNum2) {
        SemesterNum2 = semesterNum2;
    }

    public int getSemesterNum3() {
        return SemesterNum3;
    }

    public void setSemesterNum3(int semesterNum3) {
        SemesterNum3 = semesterNum3;
    }

    public int getSemesterNum4() {
        return SemesterNum4;
    }

    public void setSemesterNum4(int semesterNum4) {
        SemesterNum4 = semesterNum4;
    }

    public int getSemesterNum5() {
        return SemesterNum5;
    }

    public void setSemesterNum5(int semesterNum5) {
        SemesterNum5 = semesterNum5;
    }

    public int getSemesterNum6() {
        return SemesterNum6;
    }

    public void setSemesterNum6(int semesterNum6) {
        SemesterNum6 = semesterNum6;
    }

    public int getSemesterNum7() {
        return SemesterNum7;
    }

    public void setSemesterNum7(int semesterNum7) {
        SemesterNum7 = semesterNum7;
    }

    public int getSemesterNum8() {
        return SemesterNum8;
    }

    public void setSemesterNum8(int semesterNum8) {
        SemesterNum8 = semesterNum8;
    }

    public int getSemesterNum9() {
        return SemesterNum9;
    }

    public void setSemesterNum9(int semesterNum9) {
        SemesterNum9 = semesterNum9;
    }

    public int getSemesterNum10() {
        return SemesterNum10;
    }

    public void setSemesterNum10(int semesterNum10) {
        SemesterNum10 = semesterNum10;
    }

    public int getSemesterNum11() {
        return SemesterNum11;
    }

    public void setSemesterNum11(int semesterNum11) {
        SemesterNum11 = semesterNum11;
    }

    public int getSemesterNum12() {
        return SemesterNum12;
    }

    public void setSemesterNum12(int semesterNum12) {
        SemesterNum12 = semesterNum12;
    }

    public String getSemesterActivity1() {
        return semesterActivity1;
    }

    public void setSemesterActivity1(String semesterActivity1) {
        this.semesterActivity1 = semesterActivity1;
    }

    public String getSemesterActivity2() {
        return semesterActivity2;
    }

    public void setSemesterActivity2(String semesterActivity2) {
        this.semesterActivity2 = semesterActivity2;
    }

    public String getSemesterActivity3() {
        return semesterActivity3;
    }

    public void setSemesterActivity3(String semesterActivity3) {
        this.semesterActivity3 = semesterActivity3;
    }

    public String getSemesterActivity4() {
        return semesterActivity4;
    }

    public void setSemesterActivity4(String semesterActivity4) {
        this.semesterActivity4 = semesterActivity4;
    }

    public String getSemesterActivity5() {
        return semesterActivity5;
    }

    public void setSemesterActivity5(String semesterActivity5) {
        this.semesterActivity5 = semesterActivity5;
    }

    public String getSemesterActivity6() {
        return semesterActivity6;
    }

    public void setSemesterActivity6(String semesterActivity6) {
        this.semesterActivity6 = semesterActivity6;
    }

    public String getSemesterActivity7() {
        return semesterActivity7;
    }

    public void setSemesterActivity7(String semesterActivity7) {
        this.semesterActivity7 = semesterActivity7;
    }

    public String getSemesterActivity8() {
        return semesterActivity8;
    }

    public void setSemesterActivity8(String semesterActivity8) {
        this.semesterActivity8 = semesterActivity8;
    }

    public String getSemesterActivity9() {
        return semesterActivity9;
    }

    public void setSemesterActivity9(String semesterActivity9) {
        this.semesterActivity9 = semesterActivity9;
    }

    public String getSemesterActivity10() {
        return semesterActivity10;
    }

    public void setSemesterActivity10(String semesterActivity10) {
        this.semesterActivity10 = semesterActivity10;
    }

    public String getSemesterActivity11() {
        return semesterActivity11;
    }

    public void setSemesterActivity11(String semesterActivity11) {
        this.semesterActivity11 = semesterActivity11;
    }

    public String getSemesterActivity12() {
        return semesterActivity12;
    }

    public void setSemesterActivity12(String semesterActivity12) {
        this.semesterActivity12 = semesterActivity12;
    }

    public ArrayList<String> getSemesterActivity() {
        return semesterActivity;
    }

    public void setSemesterActivity(ArrayList<String> semesterActivity) {
        this.semesterActivity = semesterActivity;
    }

    public String getProgramCompetencies_Outcomes_1() {
        return programCompetencies_Outcomes_1;
    }

    public void setProgramCompetencies_Outcomes_1(String programCompetencies_Outcomes_1) {
        this.programCompetencies_Outcomes_1 = programCompetencies_Outcomes_1;
    }

    public int getContributionLevel_1() {
        return contributionLevel_1;
    }

    public void setContributionLevel_1(int contributionLevel_1) {
        this.contributionLevel_1 = contributionLevel_1;
    }

    public String getLO_1() {
        return LO_1;
    }

    public void setLO_1(String LO_1) {
        this.LO_1 = LO_1;
    }

    public String getProgramCompetencies_Outcomes_2() {
        return programCompetencies_Outcomes_2;
    }

    public void setProgramCompetencies_Outcomes_2(String programCompetencies_Outcomes_2) {
        this.programCompetencies_Outcomes_2 = programCompetencies_Outcomes_2;
    }

    public int getContributionLevel_2() {
        return contributionLevel_2;
    }

    public void setContributionLevel_2(int contributionLevel_2) {
        this.contributionLevel_2 = contributionLevel_2;
    }

    public String getLO_2() {
        return LO_2;
    }

    public void setLO_2(String LO_2) {
        this.LO_2 = LO_2;
    }

    public String getProgramCompetencies_Outcomes_3() {
        return programCompetencies_Outcomes_3;
    }

    public void setProgramCompetencies_Outcomes_3(String programCompetencies_Outcomes_3) {
        this.programCompetencies_Outcomes_3 = programCompetencies_Outcomes_3;
    }

    public int getContributionLevel_3() {
        return contributionLevel_3;
    }

    public void setContributionLevel_3(int contributionLevel_3) {
        this.contributionLevel_3 = contributionLevel_3;
    }

    public String getLO_3() {
        return LO_3;
    }

    public void setLO_3(String LO_3) {
        this.LO_3 = LO_3;
    }

    public String getProgramCompetencies_Outcomes_4() {
        return programCompetencies_Outcomes_4;
    }

    public void setProgramCompetencies_Outcomes_4(String programCompetencies_Outcomes_4) {
        this.programCompetencies_Outcomes_4 = programCompetencies_Outcomes_4;
    }

    public int getContributionLevel_4() {
        return contributionLevel_4;
    }

    public void setContributionLevel_4(int contributionLevel_4) {
        this.contributionLevel_4 = contributionLevel_4;
    }

    public String getLO_4() {
        return LO_4;
    }

    public void setLO_4(String LO_4) {
        this.LO_4 = LO_4;
    }

    public String getProgramCompetencies_Outcomes_5() {
        return programCompetencies_Outcomes_5;
    }

    public void setProgramCompetencies_Outcomes_5(String programCompetencies_Outcomes_5) {
        this.programCompetencies_Outcomes_5 = programCompetencies_Outcomes_5;
    }

    public int getContributionLevel_5() {
        return contributionLevel_5;
    }

    public void setContributionLevel_5(int contributionLevel_5) {
        this.contributionLevel_5 = contributionLevel_5;
    }

    public String getLO_5() {
        return LO_5;
    }

    public void setLO_5(String LO_5) {
        this.LO_5 = LO_5;
    }

    public String getProgramCompetencies_Outcomes_6() {
        return programCompetencies_Outcomes_6;
    }

    public void setProgramCompetencies_Outcomes_6(String programCompetencies_Outcomes_6) {
        this.programCompetencies_Outcomes_6 = programCompetencies_Outcomes_6;
    }

    public int getContributionLevel_6() {
        return contributionLevel_6;
    }

    public void setContributionLevel_6(int contributionLevel_6) {
        this.contributionLevel_6 = contributionLevel_6;
    }

    public String getLO_6() {
        return LO_6;
    }

    public void setLO_6(String LO_6) {
        this.LO_6 = LO_6;
    }

    public String getProgramCompetencies_Outcomes_7() {
        return programCompetencies_Outcomes_7;
    }

    public void setProgramCompetencies_Outcomes_7(String programCompetencies_Outcomes_7) {
        this.programCompetencies_Outcomes_7 = programCompetencies_Outcomes_7;
    }

    public int getContributionLevel_7() {
        return contributionLevel_7;
    }

    public void setContributionLevel_7(int contributionLevel_7) {
        this.contributionLevel_7 = contributionLevel_7;
    }

    public String getLO_7() {
        return LO_7;
    }

    public void setLO_7(String LO_7) {
        this.LO_7 = LO_7;
    }

    public String getProgramCompetencies_Outcomes_8() {
        return programCompetencies_Outcomes_8;
    }

    public void setProgramCompetencies_Outcomes_8(String programCompetencies_Outcomes_8) {
        this.programCompetencies_Outcomes_8 = programCompetencies_Outcomes_8;
    }

    public int getContributionLevel_8() {
        return contributionLevel_8;
    }

    public void setContributionLevel_8(int contributionLevel_8) {
        this.contributionLevel_8 = contributionLevel_8;
    }

    public String getLO_8() {
        return LO_8;
    }

    public void setLO_8(String LO_8) {
        this.LO_8 = LO_8;
    }

    public String getProgramCompetencies_Outcomes_9() {
        return programCompetencies_Outcomes_9;
    }

    public void setProgramCompetencies_Outcomes_9(String programCompetencies_Outcomes_9) {
        this.programCompetencies_Outcomes_9 = programCompetencies_Outcomes_9;
    }

    public int getContributionLevel_9() {
        return contributionLevel_9;
    }

    public void setContributionLevel_9(int contributionLevel_9) {
        this.contributionLevel_9 = contributionLevel_9;
    }

    public String getLO_9() {
        return LO_9;
    }

    public void setLO_9(String LO_9) {
        this.LO_9 = LO_9;
    }

    public String getProgramCompetencies_Outcomes_10() {
        return programCompetencies_Outcomes_10;
    }

    public void setProgramCompetencies_Outcomes_10(String programCompetencies_Outcomes_10) {
        this.programCompetencies_Outcomes_10 = programCompetencies_Outcomes_10;
    }

    public int getContributionLevel_10() {
        return contributionLevel_10;
    }

    public void setContributionLevel_10(int contributionLevel_10) {
        this.contributionLevel_10 = contributionLevel_10;
    }

    public String getLO_10() {
        return LO_10;
    }

    public void setLO_10(String LO_10) {
        this.LO_10 = LO_10;
    }

    public String getProgramCompetencies_Outcomes_11() {
        return programCompetencies_Outcomes_11;
    }

    public void setProgramCompetencies_Outcomes_11(String programCompetencies_Outcomes_11) {
        this.programCompetencies_Outcomes_11 = programCompetencies_Outcomes_11;
    }

    public int getContributionLevel_11() {
        return contributionLevel_11;
    }

    public void setContributionLevel_11(int contributionLevel_11) {
        this.contributionLevel_11 = contributionLevel_11;
    }

    public String getLO_11() {
        return LO_11;
    }

    public void setLO_11(String LO_11) {
        this.LO_11 = LO_11;
    }

    public String getProgramCompetencies_Outcomes_12() {
        return programCompetencies_Outcomes_12;
    }

    public void setProgramCompetencies_Outcomes_12(String programCompetencies_Outcomes_12) {
        this.programCompetencies_Outcomes_12 = programCompetencies_Outcomes_12;
    }

    public int getContributionLevel_12() {
        return contributionLevel_12;
    }

    public void setContributionLevel_12(int contributionLevel_12) {
        this.contributionLevel_12 = contributionLevel_12;
    }

    public String getLO_12() {
        return LO_12;
    }

    public void setLO_12(String LO_12) {
        this.LO_12 = LO_12;
    }

    public String getProgramCompetencies_Outcomes_13() {
        return programCompetencies_Outcomes_13;
    }

    public void setProgramCompetencies_Outcomes_13(String programCompetencies_Outcomes_13) {
        this.programCompetencies_Outcomes_13 = programCompetencies_Outcomes_13;
    }

    public int getContributionLevel_13() {
        return contributionLevel_13;
    }

    public void setContributionLevel_13(int contributionLevel_13) {
        this.contributionLevel_13 = contributionLevel_13;
    }

    public String getLO_13() {
        return LO_13;
    }

    public void setLO_13(String LO_13) {
        this.LO_13 = LO_13;
    }

    public ArrayList<String> getCompetentiesOutcomes() {
        return competentiesOutcomes;
    }

    public void setCompetentiesOutcomes(ArrayList<String> competentiesOutcomes) {
        this.competentiesOutcomes = competentiesOutcomes;
    }

    public ArrayList<String> getLearnOutcomesForm() {
        return learnOutcomesForm;
    }

    public void setLearnOutcomesForm(ArrayList<String> learnOutcomesForm) {
        this.learnOutcomesForm = learnOutcomesForm;
    }

    public ArrayList<Integer> getNumberOfActivity() {
        return numberOfActivity;
    }

    public void setNumberOfActivity(ArrayList<Integer> numberOfActivity) {
        this.numberOfActivity = numberOfActivity;
    }

    public ArrayList<Integer> getLearningOutcome1() {
        return learningOutcome1;
    }

    public void setLearningOutcome1(ArrayList<Integer> learningOutcome1) {
        this.learningOutcome1 = learningOutcome1;
    }

    public ArrayList<Integer> getLearningOutcome2() {
        return learningOutcome2;
    }

    public void setLearningOutcome2(ArrayList<Integer> learningOutcome2) {
        this.learningOutcome2 = learningOutcome2;
    }

    public ArrayList<Integer> getLearningOutcome3() {
        return learningOutcome3;
    }

    public void setLearningOutcome3(ArrayList<Integer> learningOutcome3) {
        this.learningOutcome3 = learningOutcome3;
    }

    public ArrayList<Integer> getLearningOutcome4() {
        return learningOutcome4;
    }

    public void setLearningOutcome4(ArrayList<Integer> learningOutcome4) {
        this.learningOutcome4 = learningOutcome4;
    }

    public ArrayList<Integer> getLearningOutcome5() {
        return learningOutcome5;
    }

    public void setLearningOutcome5(ArrayList<Integer> learningOutcome5) {
        this.learningOutcome5 = learningOutcome5;
    }

    public ArrayList<Integer> getActivityWeight() {
        return activityWeight;
    }

    public void setActivityWeight(ArrayList<Integer> activityWeight) {
        this.activityWeight = activityWeight;
    }

    public ArrayList<Boolean> getContributionLevel1() {
        return contributionLevel1;
    }

    public void setContributionLevel1(ArrayList<Boolean> contributionLevel1) {
        this.contributionLevel1 = contributionLevel1;
    }

    public ArrayList<Boolean> getContributionLevel2() {
        return contributionLevel2;
    }

    public void setContributionLevel2(ArrayList<Boolean> contributionLevel2) {
        this.contributionLevel2 = contributionLevel2;
    }

    public ArrayList<Boolean> getContributionLevel3() {
        return contributionLevel3;
    }

    public void setContributionLevel3(ArrayList<Boolean> contributionLevel3) {
        this.contributionLevel3 = contributionLevel3;
    }

    public ArrayList<Boolean> getContributionLevel4() {
        return contributionLevel4;
    }

    public void setContributionLevel4(ArrayList<Boolean> contributionLevel4) {
        this.contributionLevel4 = contributionLevel4;
    }

    public ArrayList<Boolean> getContributionLevel5() {
        return contributionLevel5;
    }

    public void setContributionLevel5(ArrayList<Boolean> contributionLevel5) {
        this.contributionLevel5 = contributionLevel5;
    }

    public ArrayList<String> getWeekSubjects() {
        return weekSubjects;
    }

    public void setWeekSubjects(ArrayList<String> weekSubjects) {
        this.weekSubjects = weekSubjects;
    }

    public ArrayList<String> getWeekRequiredMat() {
        return weekRequiredMat;
    }

    public void setWeekRequiredMat(ArrayList<String> weekRequiredMat) {
        this.weekRequiredMat = weekRequiredMat;
    }

    public int getParticipationNo_3() {
        return participationNo_3;
    }

    public void setParticipationNo_3(int participationNo_3) {
        this.participationNo_3 = participationNo_3;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
