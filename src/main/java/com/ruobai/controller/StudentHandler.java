package com.ruobai.controller;

import com.ruobai.entity.Student;
import com.ruobai.repostitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.getById(id);
    }
    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }
    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentRepository.save(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void delteById(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }
}
