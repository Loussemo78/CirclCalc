package com.example.circlcalc

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MyCalcTest{
 private lateinit var myCalc: MyCalc

  @Test
  fun calculateCircumference_radiusGiven_returnsCorrectResult(){
   myCalc = MyCalc()
   val result = myCalc.calculateCircumference(2.1)
   assertThat(result).isEqualTo(13.188)
  }

 @Test
 fun calculateCircumference_zeroRadius_returnsCorrectResult(){
  myCalc = MyCalc()
  val result = myCalc.calculateCircumference(0.0)
  assertThat(result).isEqualTo(.00)
 }
 }