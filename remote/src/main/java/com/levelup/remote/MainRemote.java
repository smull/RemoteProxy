package com.levelup.remote;

import com.levelup.view.UserService;
import java.io.IOException;


/**
 * Created by java on 17.10.2015.
 */
public class MainRemote {

    public static void main(String[] args) {
        UserService userService = new RemoteServiceImpl();
        try {
            System.out.println("Name: " + userService.getName());
            System.out.println("Age: " + userService.getAge());


            System.out.println("==========================");
            System.out.println("Name: " + userService.getName());
            System.out.println("Age: " + userService.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
