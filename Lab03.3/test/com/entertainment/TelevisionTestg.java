package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTestg {
  Television tv1 = new Television("HP", 60,DisplayType.LED);


  @Test
  public void testSetVolume() {
    assertEquals(60,tv1.getVolume());

  }
  @Test(expected = IllegalArgumentException.class)
  public void testVolumeIllegalArgumentException() throws IllegalArgumentException{
    tv1.setVolume(10);
  }

  @Test
  public void testChangeChannel() throws InvalidChannelException {
    assertEquals(25, tv1.changeChannel());
  }
  @Test(expected = InvalidChannelException.class)
  public void testChangeChannelInvalidChannelException() {
    tv1.ChangeChannel();

  }


  @Test
  public void testCompareTo() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }
}