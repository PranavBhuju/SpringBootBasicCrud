package com.example.demo.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("get")
    public List<Teacher> GetData(){
        return teacherService.getTeachers();
    }

    @PostMapping("post")
    public void addTeacher(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);

    }

    @DeleteMapping(path="{teacherID}")
    public void deleteTeacher(@PathVariable("teacherID")Long id){
        teacherService.deleteTeacher(id);
    }

}
