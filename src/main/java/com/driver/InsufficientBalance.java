package com.driver;

public class InsufficientBalance extends Exception{

    InsufficientBalance(String message){
        super (message);
    }
}
