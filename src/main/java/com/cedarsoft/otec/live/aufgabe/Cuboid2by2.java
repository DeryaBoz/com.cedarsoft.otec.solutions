package com.cedarsoft.otec.live.aufgabe;

import java.awt.Color;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class Cuboid2by2 extends AbstractBrick {
  public Cuboid2by2( Color color ) {
    super( color );
  }

  @Override
  public String getDescription() {
    return "8888";
  }

  @Override
  public void accept( BrickVisitor visitor ) {
    visitor.visit( this );
  }
}
