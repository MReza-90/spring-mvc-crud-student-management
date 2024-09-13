package com.code2go.spring_mvc_crud.controller;

import com.code2go.spring_mvc_crud.dao.StudentRepository;
import com.code2go.spring_mvc_crud.entity.Student;
import com.code2go.spring_mvc_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;
    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentService studentService,
                             StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/list")
    public String studentList(Model model){

        //get the students list from database
        List<Student> students=studentService.findAll();

        //add the students list to the spring model
        model.addAttribute("studentsList",students);

        return "students/list-students";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){

        //create model attribute to bind form data
        Student theStudent=new Student();
        model.addAttribute("student",theStudent);

        return "students/student-form";
    }

    @GetMapping("/showFormforUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int theId, Model model){

        // get the student from the service
        Student theStudent=studentService.findById(theId);

        //set employee in the model to populate teh form
        model.addAttribute("student",theStudent);

        //send over to the form
        return "students/student-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student theStudent){

        //save the student
        studentService.save(theStudent);

        //use a redirect to prevent duplicate submission
        return "redirect:/students/list";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") int studentId){

        //delete the student
        studentService.deleteById(studentId);

        //use a redirect to prevent duplicate submission
        return "redirect:/students/list";

    }

}
