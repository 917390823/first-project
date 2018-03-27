package com.service.firstproject.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFirstproject {

        FirstprojectDelegate firstprojectDelegate = new FirstprojectDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = firstprojectDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}