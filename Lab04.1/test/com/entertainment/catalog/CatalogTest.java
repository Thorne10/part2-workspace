/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Map;
import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {

  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void testFindByBrandNoMatches() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void testFindByBrandWithMatches() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
    assertTrue(!tvs.isEmpty());
    assertEquals(7, tvs.size());

  }
  @Test
  public void testFindByBrandsNoBrands() {
    Map<String, Collection <Television>> selections = Catalog.findByBrands();
    assertNotNull(selections);
    assertTrue(selections.isEmpty());

  }
  @Test
  public void testFindByBrandsSomeBrands() {
    var = Catalog.findByBrands("Sony, ")



  }

}