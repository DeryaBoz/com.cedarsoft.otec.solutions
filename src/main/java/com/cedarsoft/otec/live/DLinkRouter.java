package com.cedarsoft.otec.live;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class DLinkRouter implements Router {
  @Override
  public void sendData(String data) {
    System.out.println("sending data <" + data + "> to DLink Router");

    if (data.equals("dlink-password")) {
      System.out.println("DLink Router hacked");
    }
  }

  @Override
  public void accept(RouterVisitor visitor) {
    visitor.visit(this);
  }
}