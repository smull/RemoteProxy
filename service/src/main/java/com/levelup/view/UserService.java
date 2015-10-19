package com.levelup.view;

import java.io.IOException;

/**
 * Created by java on 17.10.2015.
 */
public interface UserService {

    public String getName() throws IOException;
    public String getAge() throws IOException;

    public void setName(String name);
    public void setAge(String age);
}
