package com.example.se302syllabusproject.DataModel;

public class GeneralInformation {

    private String courseName;
    private String courseCode;
    private boolean isFall;
    private boolean isSpring;
    private int theoryHours;
    private int labHours;
    private int localCredits;
    private int ECTS;
    private String prerequisities;
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

    public GeneralInformation(String courseName, String courseCode, boolean isFall, boolean isSpring, int theoryHours, int labHours, int localCredits, int ECTS, String prerequisities, String courseLanguage, String courseType, String courseLevel, String teachingMethods, String courseCoordinator, String courseLecturers, String assistants, String courseObjectives, String learningOutcomes, String courseDescriptions, String courseCategory) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.isFall = isFall;
        this.isSpring = isSpring;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.localCredits = localCredits;
        this.ECTS = ECTS;
        this.prerequisities = prerequisities;
        this.setCourseLanguage(courseLanguage);
        this.courseType = courseType;
        this.courseLevel = courseLevel;
        this.teachingMethods = teachingMethods;
        this.courseCoordinator = courseCoordinator;
        this.courseLecturers = courseLecturers;
        this.assistants = assistants;
        this.courseObjectives = courseObjectives;
        this.learningOutcomes = learningOutcomes;
        this.courseDescriptions = courseDescriptions;
        this.courseCategory = courseCategory;
    }

    public GeneralInformation() {
    }


 /*  private ArrayList<SyllabusPage1> syllabusList = new ArrayList<>();


    public void addSyllabus(SyllabusPage1 newSyllabus){
        if (!syllabusList.contains(newSyllabus)){
            syllabusList.add(newSyllabus);
            System.out.println("Syllabus of "+ newSyllabus.getCourseCode() +" has been added to database!");
        }else {
            System.out.println("The syllabus has already been added to database!");
        }
    }

    public void deleteSyllabus(SyllabusPage1 deleteSyllabus){
        //olmayan syllabus methodu çalıştırmaz
        // if kısmı controllera gidicek
        if (syllabusList.contains(deleteSyllabus)){
        syllabusList.add(deleteSyllabus);
        System.out.println("Syllabus of "+ deleteSyllabus.getCourseCode() +" has been added to database!");
        }else {
            System.out.println("The syllabus is not in database!");
        }

    }*/


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public boolean isFall() {
        return isFall;
    }
    public void setFall(boolean fall) {
        isFall = fall;
    }

    public boolean isSpring() {
        return isSpring;
    }

    public void setSpring(boolean spring) {
        isSpring = spring;
    }

    public int getTheoryHours() {
        return theoryHours;
    }

    public void setTheoryHours(int theoryHours) {
        this.theoryHours = theoryHours;
    }

    public int getLabHours() {
        return labHours;
    }

    public void setLabHours(int labHours) {
        this.labHours = labHours;
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

    public String getPrerequisities() {
        return prerequisities;
    }

    public void setPrerequisities(String prerequisities) {
        this.prerequisities = prerequisities;
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

    public String getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(String courseCategory) {
        this.courseCategory = courseCategory;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }
}