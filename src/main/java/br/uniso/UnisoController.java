package br.uniso;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UnisoController {

    ArrayList<Student> students = new ArrayList<>();
    @PostMapping("/createStudent")
    public boolean createStudent(@RequestBody Student student){
        students.add(student);
        return true;
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestParam("name") String a, @RequestParam("age") String b){
        return "Hello " + a + " Idade: " + b;
    }

    @GetMapping("/students")
    public ArrayList<Student> getStudent() { return students;   }
}
