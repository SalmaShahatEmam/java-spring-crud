package com.spring.wev.Controller;

import com.spring.wev.Models.ApiResponse;
import com.spring.wev.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.spring.wev.Models.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    private ApiResponse apiResponse;

    @PostMapping("/Store")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher)
    {
        teacherService.addTeacher(teacher);
        return ResponseEntity.ok(teacher);
    }

    @GetMapping("/GetTeachet")
    public ResponseEntity<Teacher> getTeacher(@RequestParam("teacherId") Long id)
    {
        Teacher teacher = teacherService.getTeacher(id);
        return ResponseEntity.ok(teacher);

    }

    @GetMapping("/GetTeachers")
    public ResponseEntity<List<Teacher>> getTeacher()
    {
        List<Teacher> teachers = teacherService.getAllTeacher();
        return ResponseEntity.ok(teachers);

    }

    @PutMapping("/UpdateTeacher")
    public ResponseEntity<Teacher> updateTeacher( @RequestBody Teacher teacher)
    {
        Teacher newTeacher = teacherService.update(teacher);
        return ResponseEntity.ok(newTeacher);
    }

    @GetMapping("allTeacher")

  public List<Teacher> getteachersall()
    {
       return  teacherService.getteachersall();

    }


    @DeleteMapping("/deleteTeacher")
    public String DeleteTeacher(@RequestParam("teacherId") Long id)
    {
       teacherService.deleteTeacher(id);
        return "Deleted Successfully";

    }

}
