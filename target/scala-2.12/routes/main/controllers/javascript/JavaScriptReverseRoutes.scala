// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/play-workspace/unmannedapp/conf/routes
// @DATE:Tue Oct 15 09:40:59 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:7
  class ReverseUnmannedController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def updateToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedController.updateToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/updateToken"})
        }
      """
    )
  
    // @LINE:7
    def unmannnedApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedController.unmannnedApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/getToken"})
        }
      """
    )
  
    // @LINE:10
    def getToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedController.getToken",
      """
        function(bound0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/getTokenData" + _qS([(bound0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bound", bound0))])})
        }
      """
    )
  
    // @LINE:18
    def CreateToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedController.CreateToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/CreateToken"})
        }
      """
    )
  
    // @LINE:9
    def getGross: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedController.getGross",
      """
        function(bound0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/getGross" + _qS([(bound0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bound", bound0))])})
        }
      """
    )
  
    // @LINE:8
    def getTare: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedController.getTare",
      """
        function(bound0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/getTare" + _qS([(bound0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bound", bound0))])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUnmannedClientController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def getToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedClientController.getToken",
      """
        function(bound0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/0.1/read/avery/getTokenData" + _qS([(bound0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bound", bound0))])})
        }
      """
    )
  
    // @LINE:16
    def updateToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedClientController.updateToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/0.1/write/avery/updateToken"})
        }
      """
    )
  
    // @LINE:13
    def getGross: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedClientController.getGross",
      """
        function(bound0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/0.1/read/avery/getGross" + _qS([(bound0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bound", bound0))])})
        }
      """
    )
  
    // @LINE:12
    def getTare: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedClientController.getTare",
      """
        function(bound0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/0.1/read/avery/getTare" + _qS([(bound0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("bound", bound0))])})
        }
      """
    )
  
    // @LINE:15
    def CreateToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UnmannedClientController.CreateToken",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/0.1/write/avery/CreateToken"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
