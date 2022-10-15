package com.example.demo.Entities.Controller;

import com.example.demo.Entities.Models.Student;
import com.example.demo.Entities.Interface.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(value="api/v1/students")
public class StudentController {

    @Autowired
   private StudentInterface service ;



    @GetMapping
    public List<Student> getStudents()
    {
//        List<Student> list = new ArrayList<>();
//        Student student1 = new Student(1,"shaun","shaun@lewis.com",19);
//        Student student2 = new Student(2,"lewis","shaun@lewis.com",29);
//        list.add(student1);
//        list.add(student2);

//     StudentInterface serve= new StudentService();
//     return serve.getStudents();


        return this.service.getStudents();


    }
}
