package com.Brendon;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        ArrayList<ITECCourse> courseList = new ArrayList<ITECCourse>();


        // Micro Computer class
        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 3020, 20); // modified for room number

        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        courseList.add(maintenanceCourse);


        // Data Communications
        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 3030, 30); // modified for room number

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        //datacomCourse.removeStudent("Dave");
        //datacomCourse.removeStudent("Mike");

        courseList.add(datacomCourse);


        // new class
        ITECCourse infoTech = new ITECCourse("Infotech Concepts", 1100, 3010, 30);

        infoTech.addStudent("Nancy");
        infoTech.addStudent("Max");
        infoTech.addStudent("Orson");

        courseList.add(infoTech);

        // Goes over the list and prints out class name and number of open spots.
        for (ITECCourse item : courseList) {

            ITECCourse temp = item;
            temp.classFreeSpots();
            System.out.println();

        }

    }
}

