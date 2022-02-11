package com.github.dieselniu.charpter9.replaceConditinoalWithPolymorphism6;

public class User {

    private UserLevel userLevel;

    public UserLevel getLevel() {
        return userLevel;
    }

    public User(UserLevel userLevel) {
        this.userLevel = userLevel;
    }
}
