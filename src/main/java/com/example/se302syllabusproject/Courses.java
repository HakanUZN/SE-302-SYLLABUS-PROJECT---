package com.example.se302syllabusproject;

import com.example.se302syllabusproject.DataModel.Syllabus;

import java.util.ArrayList;

public class Courses {
    private String courseName;
    private String courseCode;
    private String courseLanguage;
    private Syllabus syllabus;


    private Courses courses;

    ArrayList<Courses> courseList=new ArrayList<>();
    public void addCourse(Courses newCourse){
        courseList.add(newCourse);
        System.out.println(newCourse.courseName+ "has been added!");
    }

    public void deleteCourse(Courses deleteCourse){
        courseList.remove(deleteCourse);
        System.out.println(deleteCourse.courseName+ "has been deleted!");
    }

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

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }


    public Syllabus getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(Syllabus syllabus) {
        this.syllabus = syllabus;
    }
}
