package com.example;

import org.junit.test;
import static org.junit.Assert.assertEquals;


public class AppTest{

  App calc=new App();

  @Test
  public void testAddition(){
    assertEquals(15,calc.add(10,5));

  }
  @Test
  public void testSubtraction(){
    assertEquals(5,calc.subtract(10,5));
      }


  @Test
  public void testMulti(){
    assertEquals(50,calc.multiply(10,5));
      }

  @Test
  public void testDiv(){
    assertEquals(2,calc.divide(10,5));
      }


