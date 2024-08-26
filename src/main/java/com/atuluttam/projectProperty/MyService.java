package com.atuluttam.projectProperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
@PropertySource("classpath:myfile.properties")
public class MyService {

    @Value("${message}")
    private String msg;

     @Value("${name}")
     private String name;

     @Value("${roll}")
     private int roll;

     @Value("${Course}")
     private String Course;

     public void show()
     {
         System.out.println("Name "+name);
         System.out.println("Roll "+roll);
         System.out.println("Course "+Course);
     }

    public String printMSG()
    {
        return msg;
    }


}
