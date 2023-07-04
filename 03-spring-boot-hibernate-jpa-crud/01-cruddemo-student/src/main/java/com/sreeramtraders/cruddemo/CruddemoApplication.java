package com.sreeramtraders.cruddemo;

import com.sreeramtraders.cruddemo.dao.StudentDAO;
import com.sreeramtraders.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            //createStudent(studentDAO);
            //readStudent(studentDAO);
            queryForStudents(studentDAO);
        };
    }

    private void queryForStudents(StudentDAO studentDAO) {

        //get a list of Students
        List<Student> theStudents = studentDAO.findAll();

        //Display list of Students
        for (Student student: theStudents){
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {

        //create student
        System.out.println("Creating Student");
        Student student1 = new Student("Mihira", "VR", "m@m.com");

        //save Student
        System.out.println("Save Student");
        studentDAO.save(student1);

        //display the saved student id
        System.out.println("Save Student Id: " + student1.getId());

        //retrieve  Student
        Student studentFromDB = studentDAO.findById(student1.getId());
        System.out.println("Retrieving the Student ");
        System.out.println("Found the Student "+studentFromDB);
    }

    private void createStudent(StudentDAO studentDAO) {

        //create the student object
        System.out.println("Creating Student Object...");
        Student tempStudent = new Student("Bhavani", "M", "b@b.com");

        //save the student object
        System.out.println("Saving the Student....");
        studentDAO.save(tempStudent);

        //display id of the saved student
        System.out.println("Saved Student. Generated id: "+tempStudent.getId());
    }
}
