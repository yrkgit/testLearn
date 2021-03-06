package com.example.testlearn;


import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;


public class RegistrationUtilTest {
    //empty user name returns false
    @Test
    public void testEmpty() {
        boolean value = new RegistrationUtil().validateRegInput(
                "",
                "123",
                "123");
        assertThat(value).isFalse();
    }

    @Test
    public void testCorrect() {
        boolean value = new RegistrationUtil().validateRegInput(
                "Adam",
                "123",
                "123");
        assertThat(value).isTrue();
    }

    @Test
    public void testUserExist() {
        boolean value = new RegistrationUtil().validateRegInput(
                "Carl",
                "123",
                "123");
        assertThat(value).isFalse();
    }

    @Test
    public void testIncorrectPass() {
        boolean value = new RegistrationUtil().validateRegInput(
                "Adam",
                "12345",
                "qwerty");
        assertThat(value).isFalse();
    }

    @Test
    public void testEmptyPass() {
        boolean value = new RegistrationUtil().validateRegInput(
                "Adam",
                "",
                "");
        assertThat(value).isFalse();
    }

//    @Test
//    public void testLessThanTwoDigitsPass() {
//        boolean value = new RegistrationUtil().validateRegInput(
//                "Adam",
//                "asd1",
//                "asd1");
//        com.google.common.truth.Truth.assertThat(value).isFalse();
//    }
}