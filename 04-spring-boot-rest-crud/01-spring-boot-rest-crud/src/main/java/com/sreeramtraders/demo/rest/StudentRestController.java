package com.sreeramtraders.demo.rest;

import com.sreeramtraders.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> studentList;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();
        studentList.add(new Student("Yagna", "Thiruveedhula"));
        studentList.add(new Student("Sreeram", "Thiruveedhula"));
        studentList.add(new Student("Bhavani", "Muthuluri"));
    }

    //define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        
        return studentList;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        //Just index into the list... keep it simple for now

        //Check the studentId against list size
        if((studentId >= studentList.size() || (studentId <0))){
            throw new StudentNotFoundException("student id not found - "+studentId);
        }


        return studentList.get(studentId);
    }

}












