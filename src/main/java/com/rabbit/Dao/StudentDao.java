package com.rabbit.Dao;

import com.rabbit.Entity.Student;

import java.util.Collection;

/**
 * Created by yaweihu on 29/1/17.
 */
public interface StudentDao {
    Collection<Student> getAllStudent();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
