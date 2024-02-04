package com.lesson.bank.security;

public class Validation {

    public boolean check(String data, boolean isNumber){
        boolean result = false;
        if(data != null && !data.equals("")) {
            if (isNumber) {
                data = data.replace("-", "");
                data = data.replace(" ", "");
                if (!data.chars().allMatch(Character::isLetter)){
                    result = true;
                }
                return result;
            } else return true;
        } else return false;
    }

}
