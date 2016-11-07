package com.mysite.selenium;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoringMe {

    @Ignore("Not ready yet")
    @Test
    public void notReadyTest(){
        System.out.println("Don't execute me,plz");
    }

    @Test
    public void readyOne(){
        System.out.println("It's time to execute me");
    }
}
