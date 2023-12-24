package com.example.se302syllabusproject;

import com.example.se302syllabusproject.DataModel.Syllabus;

import java.io.IOException;
import java.sql.SQLException;

public interface SyllabusOperations {

    public void addSyllabus(Syllabus syllabus) throws Exception;
    public void editSyllabus(String courseCode)throws Exception;
    public void searchSyllabus(String searchSyllabus) throws Exception;

}
