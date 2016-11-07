package com.mysite.selenium;
import org.junit.Test;


public class exeptc {
    @Test(expected=ArithmeticException.class)
    public void devideByZero(){
        int e = 1/0;
    }
    @Test
    public void devideByZero1(){
        int e= 1/0;
    }
}

