package com.levelup.view;

/**
 * Created by java on 17.10.2015.
 */
public class UserServiceImpl implements UserService {

    private User user;

    public UserServiceImpl() {
        //user = new User("Teodor", "34");
    }

    public UserServiceImpl(String name, String age) {
        user = new User(name,age);
    }

    @Override
    public String getAge() {
        return user.getAge();
    }

    @Override
    public String getName() {
        return user.getName();
    }

    public void setName(String name){
        user.setName(name);
    }

    public void setAge(String age){
        user.setAge(age);
    }

}
