package com.example.androidkotlintestrobolectric

object RegistrationUtil {

    private val existingUsers = listOf("amos", "peter", "dan")

    /**
    the input is not valid if...
    *... username or password is empty
    *... username is already taken
    *... confirmed password is not same as the real password
    *... password contained less than 2 digits
     **/
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean{

        if(username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }

        if (username in existingUsers){
            return false
        }
        if(password != confirmedPassword){
            return false
        }
        if(password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }
}