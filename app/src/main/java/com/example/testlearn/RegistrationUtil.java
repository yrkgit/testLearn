package com.example.testlearn;

public class RegistrationUtil {

    private String[] existingUsers = {"Peter", "Carl"};
    private String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    public boolean validateRegInput(String userName, String password, String confirmedPassword) {
        if (userName.isEmpty() || password.isEmpty()) {
            return false;
        }
        if (existingUsers[0].equals(userName)||existingUsers[1].equals(userName)){
            return false;
        }if(!password.equals(confirmedPassword)){
            return false;
        }
        else return true;
    }
}
