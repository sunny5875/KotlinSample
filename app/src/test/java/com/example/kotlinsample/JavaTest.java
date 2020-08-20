package com.example.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {
    @Test
    public void test1(){
        Assert.assertEquals(4,2+2);
    }

    @Test
    public void testGetterSetter(){
        PersonJava personJava= new PersonJava("subin");
        personJava.setAge(20);

        Assert.assertEquals(20,personJava.getAge());
        Assert.assertEquals("subin",personJava.getName());



        Person personKotlin= new Person("subin");
        personKotlin.setAge(20);

        Assert.assertEquals(20,personKotlin.getAge());
        Assert.assertEquals("subin",personKotlin.getName());

    }
}
