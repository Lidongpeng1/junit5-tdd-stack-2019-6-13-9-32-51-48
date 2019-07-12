package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {
    @Test
    public void give_1_should_return_1() {
        //given
        Integer number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("1"));
    }

    @Test
    public void give_2_should_return_2() {
        //given
        Integer number = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("2"));
    }

    @Test
    public void give_3_should_return_Fizz() {
        //given
        Integer number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void give_6_should_return_Fizz() {
        //given
        Integer number = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void give_5_should_return_Buzz() {
        //given
        Integer number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Buzz"));
    }
}
