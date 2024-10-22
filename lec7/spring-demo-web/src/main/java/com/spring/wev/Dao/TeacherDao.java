package com.spring.wev.Dao;

import com.spring.wev.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao extends JpaRepository<Teacher,Long> {


    @Query(value = "select * from teacher" , nativeQuery = true)
   // @Query("SELECT FROM teacher")
    List<Teacher> getteachersall();

}
