// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/play-workspace/unmannedapp/conf/routes
// @DATE:Tue Oct 15 09:40:59 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:7
  class ReverseUnmannedController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def updateToken(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "play/updateToken")
    }
  
    // @LINE:7
    def unmannnedApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play/getToken")
    }
  
    // @LINE:10
    def getToken(bound:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play/getTokenData" + play.core.routing.queryString(List(if(bound == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bound", bound)))))
    }
  
    // @LINE:18
    def CreateToken(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "play/CreateToken")
    }
  
    // @LINE:9
    def getGross(bound:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play/getGross" + play.core.routing.queryString(List(if(bound == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bound", bound)))))
    }
  
    // @LINE:8
    def getTare(bound:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "play/getTare" + play.core.routing.queryString(List(if(bound == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bound", bound)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseUnmannedClientController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def getToken(bound:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/0.1/read/avery/getTokenData" + play.core.routing.queryString(List(if(bound == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bound", bound)))))
    }
  
    // @LINE:16
    def updateToken(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/0.1/write/avery/updateToken")
    }
  
    // @LINE:13
    def getGross(bound:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/0.1/read/avery/getGross" + play.core.routing.queryString(List(if(bound == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bound", bound)))))
    }
  
    // @LINE:12
    def getTare(bound:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/0.1/read/avery/getTare" + play.core.routing.queryString(List(if(bound == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("bound", bound)))))
    }
  
    // @LINE:15
    def CreateToken(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/0.1/write/avery/CreateToken")
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
