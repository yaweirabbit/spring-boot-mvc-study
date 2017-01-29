package com.rabbit.Service;

import com.rabbit.Dao.StudentDao;
import com.rabbit.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by yaweihu on 26/1/17.
 */

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao sudentDao;

    public Collection<Student> getAllStudent() {
        return sudentDao.getAllStudent();
    }

    public Student getStudentById(int id) {
        return this.sudentDao.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.sudentDao.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        this.sudentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.sudentDao.insertStudent(student);
    }
}
