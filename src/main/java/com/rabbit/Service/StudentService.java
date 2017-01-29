package com.rabbit.Service;

import com.rabbit.Dao.StudentDao;
import com.rabbit.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by yaweihu on 26/1/17.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.studentDao.deleteStudentById(id);
    }
}
