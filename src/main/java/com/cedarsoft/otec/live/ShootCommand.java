package com.cedarsoft.otec.live;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class ShootCommand implements Command {
  @Override
  public void execute() {
    System.out.println( "Shooting" );
  }
}