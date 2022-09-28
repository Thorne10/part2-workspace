/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Map;

public class EmployeeFactory {

  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }

  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String, String> inputMap)
      throws IllegalArgumentException {
    // return value
    Employee emp = null;
    
    String type = inputMap.get("type");
    // TODO: 9/26/2022 if type is not equal to he/se then throw illegalargumentexception. 
    // TODO: 9/26/2022 Read the name and hire date from imput MAP. (Remember: All of the value in the map are Strings.  
    // TODO: 9/26/2022 the map are Strings, but hireDate is java.sql.Date.) 
    // TODO: 9/26/2022 If type is equal to "SE, then read(and Parse) salary from inputMap.
    // TODO: 9/26/2022 Create and return on instance of HourlyEmployee or SalariedEmployee, with
    //the values read from inputMap.


    return emp;
  }
}