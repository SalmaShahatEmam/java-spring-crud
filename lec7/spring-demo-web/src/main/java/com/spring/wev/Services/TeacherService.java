package com.spring.wev.Services;

import com.spring.wev.Models.Teacher;
import jakarta.transaction.SystemException;

import java.util.List;

public interface TeacherService {

    public void addTeacher(Teacher teacher);
    public Teacher getTeacher(Long id) ;//throws SystemException;
    public List<Teacher> getAllTeacher();
    public Teacher update(Teacher teacher);
    public List<Teacher> getteachersall() ;

    public void deleteTeacher(Long id);
}
