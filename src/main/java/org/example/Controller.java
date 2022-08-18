package org.example;

import com.google.gson.Gson;
import org.example.mapper.StudentMapper;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    StudentMapper studentMapper;

    private Gson gson = new Gson();

    @GetMapping("/test")
    public String test() {
        List<Student> students = studentMapper.selectList(null);
        return gson.toJson(students);
    }

    @PostMapping("/update")
    public void del(@RequestBody Student student){
        studentMapper.updateById(student);
    }
}
