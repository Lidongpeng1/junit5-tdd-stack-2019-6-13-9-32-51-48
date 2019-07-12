package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_number_is_1() {
        //given
        Integer number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_2_when_number_is_2() {
        //given
        Integer number = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("2"));
    }

    @Test
    public void should_return_fizz_when_number_is_3() {
        //given
        Integer number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_when_number_is_6() {
        //given
        Integer number = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_buzz_when_number_is_5() {
        //given
        Integer number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_buzz_when_number_is_10() {
        //given
        Integer number = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_whizz_when_number_is_7() {
        //given
        Integer number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Whizz"));
    }

    @Test
    public void should_return_whizz_when_number_is_14() {
        //given
        Integer number = 14;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.getResult(number);

        //then
        assertThat(result, is("Whizz"));
    }
}
