package com.levelup.remote;


import com.levelup.view.UserService;
import com.levelup.view.UserServiceImpl;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

/**
 * Created by java on 17.10.2015.
 */
public class RemoteServiceImpl implements UserService {

    private String name;
    private String age;
    private UserService userService;
    public static final String url = "http://localhost:8080/view?userName=Oleg&age=34";
    private HttpClient client;
    private HttpGet request;


    public RemoteServiceImpl() {
        client = HttpClientBuilder.create().build();
        request = new HttpGet(url);
    }


    @Override
    public String getAge() throws IOException {
        if (userService == null) {
            userService = new UserServiceImpl(name, age);
        }
        if (userService.getAge() == null) {
            HttpResponse response = null;
            response = client.execute(request);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));
            String line = null;
            StringBuffer result = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                age = line;
            }
            userService.setAge(age);
        }
        return userService.getAge();
    }

    @Override
    public String getName() throws IOException {
        if (userService == null) {
            userService = new UserServiceImpl(name, age);
        }
        if (userService.getName() == null) {
            HttpResponse response = null;
            response = client.execute(request);
            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));
            String line = null;
            while ((line = rd.readLine()) != null) {
                name = line;
                break;
            }
            userService.setName(name);
        }
        return userService.getName();
    }

    @Override
    public void setAge(String age) {

    }

    @Override
    public void setName(String name) {

    }
}
