package com.jiutong.bnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource("dubbo-provider.xml")
public class App
{


    public static void main( String[] args )
    {

        SpringApplication.run(App.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
