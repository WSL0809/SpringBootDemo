package org.example;

import com.google.gson.Gson;

public class Demo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = new Student(121211,"wsl",12);
        System.out.println(gson.toJson(student));
    }
}
