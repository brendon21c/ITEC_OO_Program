package com.Brendon;

import java.util.ArrayList;


public class ITECCourse {

    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private int roomNumber;

    public String getCourseNAME() {
        return this.name;
    }

    public void setCourseName(String newName) {

        this.name = newName;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ITECCourse(String courseName, int courseCode, int courseRoom, int courseMaxSudent) {

        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxSudent;
        this.roomNumber = courseRoom;
    }


    public void addStudent(String studentName) {

        //don't need to check if students ArrayList is null –
        //we know that the constructor set it up

        students.add(studentName);
    }

    public void removeStudent(String studentName) {

        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was removed from " + this.name);

        } else {

            System.out.println(studentName + " was not enrolled in " + this.name);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Course is in room " + this.roomNumber);
        System.out.println("Students enrolled:");

        for (String student : this.students) {
            System.out.println(student);
        }

        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }


}
