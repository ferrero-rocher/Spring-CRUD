package com.example.demo.Entities.ServicesImp;

import com.example.demo.Entities.Interface.StudentInterface;
import com.example.demo.Entities.Models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService implements StudentInterface {

    @Override
    public List<Student> getStudents(){


        List<Student> list = new ArrayList<>();
        Student student1 = new Student(1,"shaun","shaun@lewis.com",19);
        Student student2 = new Student(2,"lewis","shaun@lewis.com",29);
        list.add(student1);
        list.add(student2);

        return list;
    }

}
