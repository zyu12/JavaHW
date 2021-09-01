package com.example.course.test;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public void print() {
        int i = 1 / 0;  // this line is to create exception to test "AfterThrow"
        System.out.println("this is teacher service impl");
    }
}
