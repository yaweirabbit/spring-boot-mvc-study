package com.rabbit.Dao;

import com.rabbit.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaweihu on 26/1/17.
 */

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Alex", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };
    }

    public Collection<Student> getAllStudent() {
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

}
