package com.example.se302syllabusproject;

import com.example.se302syllabusproject.DataModel.*;

import java.security.PrivilegedAction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

    private final String databaseURL = "jdbc:sqlite:Syllabus_DB.db";
    private Connection conn;

    public DatabaseHandler() {
        conn = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(databaseURL);

            if (conn != null ) {
                System.out.println("Database Inıtialized.");
            } else {
                System.out.println("Failed to Initialize Database");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void saveGeneralInformation(GeneralInformation generalInformation, SubjectsAndMaterials subjectsAndMaterials, Assessments assessments,
                                       WorkloadTable workloadTable, OutcomeMatrix outcomeMatrix) {
        try {

            String courseQuery = "INSERT INTO Course (course_name, course_code,version) VALUES (?, ?, 1)";
            PreparedStatement preparedStatement = conn.prepareStatement(courseQuery);
            preparedStatement.setString(1, generalInformation.getCourseCode());
            preparedStatement.setString(2,generalInformation.getCourseName());

            String courseCategoryQuery = "INSERT INTO CourseCategory (course_code,version,course_category) VALUES (?, 1,?)";
            PreparedStatement preparedStatementCategory = conn.prepareStatement(courseCategoryQuery);
            preparedStatementCategory.setString(1,generalInformation.getCourseCode());
            preparedStatementCategory.setString(2,generalInformation.getCourseCategory());

            String courseDetailQuery = "INSERT INTO CourseDetails (course_code, version, prerequisites, course_language, course_type, course_level, teaching_methods) VALUES (?, 1, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatementDetail = conn.prepareStatement(courseDetailQuery);
            preparedStatementDetail.setString(1, generalInformation.getCourseCode());
            preparedStatementDetail.setString(2, generalInformation.getPrerequisities());
            preparedStatementDetail.setString(3, generalInformation.getCourseLanguage());
            preparedStatementDetail.setString(4, generalInformation.getCourseType());
            preparedStatementDetail.setString(5, generalInformation.getCourseLevel());
            preparedStatementDetail.setString(6, generalInformation.getTeachingMethods());

            String courseHoursQuery = "INSERT INTO CourseHours (course_code, version, is_fall, is_spring, theory, lab_application, local_credits,ects) VALUES (?, 1, ?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStatementHours = conn.prepareStatement(courseHoursQuery);
            preparedStatementHours.setString(1,generalInformation.getCourseCode());
            preparedStatementHours.setBoolean(2,generalInformation.isFall());
            preparedStatementHours.setBoolean(3,generalInformation.isSpring());
            preparedStatementHours.setInt(4,generalInformation.getTheoryHours());
            preparedStatementHours.setInt(5,generalInformation.getLabHours());
            preparedStatementDetail.setInt(6,generalInformation.getECTS());

            String courseInstructorsQuery = "INSERT INTO CourseInstructors (course_code, version,course_coordinator,course_lecturers,assistants) VALUES (?,1,?,?,?)";
            PreparedStatement preparedStatementInstructors = conn.prepareStatement(courseInstructorsQuery);
            preparedStatementInstructors.setString(1,generalInformation.getCourseCode());
            preparedStatementInstructors.setString(2,generalInformation.getCourseCoordinator());
            preparedStatementInstructors.setString(3,generalInformation.getCourseLecturers());
            preparedStatementInstructors.setString(4,generalInformation.getAssistants());

            String courseMaterialsQuery = "INSERT INTO CourseMaterials (course_code, version,notes_textbooks,suggested_readings) VALUES (?,1,?,?)";
            PreparedStatement preparedStatementMaterials = conn.prepareStatement(courseMaterialsQuery);
            preparedStatementMaterials.setString(1,generalInformation.getCourseCode());
            preparedStatementMaterials.setString(2,subjectsAndMaterials.getCourseNotes());
            preparedStatementMaterials.setString(3,subjectsAndMaterials.getSuggestedReadings());

            String courseObjectiveQuery = "INSERT INTO CourseObjective (course_code, version,course_objectives,learning_outcomes,course_description) VALUES (?,1,?,?,?)";
            PreparedStatement preparedStatementObjective = conn.prepareStatement(courseObjectiveQuery);
            preparedStatementObjective.setString(1,generalInformation.getCourseCode());
            preparedStatementObjective.setString(2,generalInformation.getCourseObjectives());
            preparedStatementObjective.setString(3,generalInformation.getLearningOutcomes());
            preparedStatementObjective.setString(4,generalInformation.getCourseDescriptions());


            String outcomeMatrixQuery = "INSERT INTO OutcomeMatrix (course_code,version,outcome_no,outcome_description,contribution_level1,contribution_level2,contribution_level3,contribution_level4,contribution_level5,lo#) VALUES (?,1,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatementOutcomeMatrix = conn.prepareStatement(outcomeMatrixQuery);
            preparedStatementOutcomeMatrix.setString(1,generalInformation.getCourseCode());
            preparedStatementDetail.setString(3,outcomeMatrix.getProgramCompetencies_Outcomes_1());
            preparedStatementDetail.setString(3,outcomeMatrix.getProgramCompetencies_Outcomes_2());
            preparedStatementDetail.setString(3,outcomeMatrix.getProgramCompetencies_Outcomes_3());



            /* String courseSemesterActivities = "INSERT INTO SemesterActivities (course_code,version,activity_name,numb_of_activity,activity_weight,is_lo1,is_lo2,is_lo3,is_lo4,is_lo5,is_lo6,is_lo7,is_lo8) VALUES (?,1,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatementSemesterActivities = conn.prepareStatement(courseSemesterActivities);
            preparedStatementSemesterActivities.setString(1,generalInformation.getCourseCode());
            preparedStatementSemesterActivities.setString(2,assessments.get);*/






        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
