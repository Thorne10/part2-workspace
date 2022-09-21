package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private static final double SALARY = 85_000;
  private static final double TOLERANCE = 0.001;
  private static final double TAX = SALARY * TaxPayer.SALARIED_TAX_RATE;
  private SalariedEmployee emp;

  @Before
  public void setup() {
    emp = new SalariedEmployee("Steve Jobs", new Date(120, 2, 15),85000.0);
  }


  @Test
  public void testPay() {
    assertEquals(85000.0,emp.pay(),0.001);

  }

  @Test
  public void testPayTaxes() {
    assertEquals(
  }
}