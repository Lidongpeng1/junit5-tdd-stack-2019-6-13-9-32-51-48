package com.thoughtworks.tdd;

public class FizzBuzz {
    public String getResult(Integer number) {

        String result = "";

        if (number % 3 == 0) {
            result.concat("Fizz");
        }
        if (number % 5 == 0) {
            result.concat("Buzz");
        }
        if (number % 7 == 0) {
            result.concat("Whizz");
        }
        if (result == ""){
            result = number.toString();
        }

        return result;
    }
}
