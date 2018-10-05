package com.homedepot.sm.checkstyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckStyleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckStyleApplication.class, args);
    }

    public void lon() { }  //violates rule method name length > 3

    public void tooLongMethod() {    //violates rule method length <= 5 lines
        //to show
        //line violation
        //checkstyle
        //rule
        String tooLongLine = "This line is too loooooooooooooooooooooooooooooooooooooooooooong";
    }
}
