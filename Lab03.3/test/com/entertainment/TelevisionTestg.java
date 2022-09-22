package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTestg {

  private final Television tv1 = new Television("HP", 60, DisplayType.LED);


  @Test
  public void testSetVolume() {
    int volume = (Television.MAX_VOLUME + Television.MAX_VOLUME) / 3;
    tv1.setVolume(volume);
    assertEquals(volume, tv1.getVolume());

  }

      @Test(expected = IllegalArgumentException.class)
      public void testVolumeIllegalArgumentException () {
        tv1.setVolume(Television.MIN_VOLUME - 3);
      }

      @Test
      public void testChangeChannel () throws InvalidChannelException {
      int oldChannel = tv1.getCurrentChannel();
      int channel = Television.MAX_CHANNEL + 1;
      try {
        tv1.changeChannel(channel);
        fail();

      }catch(InvalidChannelException e) {
        assertEquals(oldChannel, tv1.getCurrentChannel());

      }
        }

      @Test
      public void testCompareTo () {
      Television tv2 = new Television("LG");
      assertTrue(tv1.compareTo(tv2)< 0);
      Television tv3 = new Television("Hitachi");
      assertTrue(tv1.compareTo(tv3) < 1);
      }

      @Test
      public void testHashCode () {
      Television tv2 = new Television("HP",  3,DisplayType.LED);
      assertEquals(tv1.hashCode(),tv2.hashCode());
      Television tv3 = new Television ("HP",3,DisplayType.LCD);
      assertNotEquals(tv1.hashCode(),tv3.hashCode());
      }

      @Test
      public void testEquals () {
      Television tv2 = new Television("HP", 1, DisplayType.LED);
      assertNotEquals(tv1,tv2);
      Television tv3 = new Television("HP",1,DisplayType.LED);
      }
    }