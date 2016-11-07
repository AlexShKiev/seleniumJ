package com.mysite.selenium;
import org.junit.Test;
import org.junit.Ignore;


/**
 * Created by alex on 07.11.16.
 */

public class TimeOut {
    @Test
    public void testCaseTime(){
        System.out.println("It's a timeout,dude");
    }
    @Test(timeout = 3000)
    public void timeOutExample(){
        while(true);
    }
}
