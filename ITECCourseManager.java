package com.Brendon;

public class ITECCourseManager {

    public static void main(String[] args) {

        // Micro Computer class
        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 3020, 20); // modified for room number

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        // Data Communications
        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 3030, 30); // modified for room number

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.removeStudent("Dave");
        datacomCourse.removeStudent("Mike");

        datacomCourse.writeCourseInfo();

        // new class
        ITECCourse test = new ITECCourse("Infotech Concepts", 1100, 3010, 30);

        test.addStudent("Nancy");
        test.addStudent("Max");
        test.addStudent("Orson");

        test.writeCourseInfo();


    }
}

