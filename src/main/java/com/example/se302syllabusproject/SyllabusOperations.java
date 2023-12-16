package com.example.se302syllabusproject;

import com.example.se302syllabusproject.DataModel.Syllabus;

public interface SyllabusOperations {

    public void addSyllabus(Syllabus syllabus);
    public void editSyllabus(Syllabus syllabus);
    public void deleteSyllabus(Syllabus syllabus);
    public void searchSyllabus(String searchSyllabus);
}
