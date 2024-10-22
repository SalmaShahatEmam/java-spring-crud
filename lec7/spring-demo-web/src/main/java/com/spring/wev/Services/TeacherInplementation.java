package com.spring.wev.Services;


import com.spring.wev.Dao.TeacherDao;
import com.spring.wev.Models.Teacher;
import jakarta.transaction.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherInplementation implements TeacherService{

    @Autowired
    private TeacherDao teacherDao;


    @Override
    public void addTeacher(Teacher teacher){
        teacherDao.save(teacher);
    }

    @Override
    public Teacher getTeacher(Long id) //throws SystemException
    {
       // if( (boolean)id){
            return teacherDao.findById(id).get();
    //    }
     //   throw new SystemException("id must has valide value");
    }

    /* the correct way but advanced


    public Teacher getTeacher(Long id) throws SystemException {
    if (id != null && id > 0) {
        return teacherDao.findById(id).orElseThrow(() -> new SystemException("Teacher not found with id: " + id));
    }
    throw new SystemException("ID must have a valid value");
}

     */

    @Override
    public List<Teacher> getAllTeacher()
    {
        return teacherDao.findAll();
    }

    @Override
    public void deleteTeacher(Long id){
         teacherDao.deleteById(id);
    }


    public Teacher update(Teacher teacher){
       return teacherDao.save(teacher);
    }

    public List<Teacher> getteachersall()
    {
        return teacherDao.getteachersall();
    }
}
