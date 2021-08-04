package com.example.androidkotlintestrobolectric

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correct password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Amina",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun `username already exist returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }



}