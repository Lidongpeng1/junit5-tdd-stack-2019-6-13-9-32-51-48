package com.thoughtworks.tdd;

public class FizzBuzz {
    public String getResult(Integer number){
        if(number % 3 == 0){
            return "Fizz";
        }
        return number.toString();
    }
}
