// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/play-workspace/unmannedapp/conf/routes
// @DATE:Tue Oct 15 09:40:59 IST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUnmannedController UnmannedController = new controllers.ReverseUnmannedController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUnmannedClientController UnmannedClientController = new controllers.ReverseUnmannedClientController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUnmannedController UnmannedController = new controllers.javascript.ReverseUnmannedController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUnmannedClientController UnmannedClientController = new controllers.javascript.ReverseUnmannedClientController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
