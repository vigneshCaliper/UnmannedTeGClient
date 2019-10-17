// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/play-workspace/unmannedapp/conf/routes
// @DATE:Tue Oct 15 09:40:59 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:7
  UnmannedController_1: controllers.UnmannedController,
  // @LINE:12
  UnmannedClientController_0: controllers.UnmannedClientController,
  // @LINE:21
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:7
    UnmannedController_1: controllers.UnmannedController,
    // @LINE:12
    UnmannedClientController_0: controllers.UnmannedClientController,
    // @LINE:21
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_3, UnmannedController_1, UnmannedClientController_0, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, UnmannedController_1, UnmannedClientController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play/getToken""", """controllers.UnmannedController.unmannnedApi"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play/getTare""", """controllers.UnmannedController.getTare(bound:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play/getGross""", """controllers.UnmannedController.getGross(bound:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play/getTokenData""", """controllers.UnmannedController.getToken(bound:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/0.1/read/avery/getTare""", """controllers.UnmannedClientController.getTare(bound:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/0.1/read/avery/getGross""", """controllers.UnmannedClientController.getGross(bound:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/0.1/read/avery/getTokenData""", """controllers.UnmannedClientController.getToken(bound:String ?= "0")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/0.1/write/avery/CreateToken""", """controllers.UnmannedClientController.CreateToken"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/0.1/write/avery/updateToken""", """controllers.UnmannedClientController.updateToken"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play/CreateToken""", """controllers.UnmannedController.CreateToken(request:play.mvc.Http.Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play/updateToken""", """controllers.UnmannedController.updateToken(request:play.mvc.Http.Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UnmannedController_unmannnedApi1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play/getToken")))
  )
  private[this] lazy val controllers_UnmannedController_unmannnedApi1_invoker = createInvoker(
    UnmannedController_1.unmannnedApi,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedController",
      "unmannnedApi",
      Nil,
      "GET",
      this.prefix + """play/getToken""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UnmannedController_getTare2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play/getTare")))
  )
  private[this] lazy val controllers_UnmannedController_getTare2_invoker = createInvoker(
    UnmannedController_1.getTare(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedController",
      "getTare",
      Seq(classOf[String]),
      "GET",
      this.prefix + """play/getTare""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UnmannedController_getGross3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play/getGross")))
  )
  private[this] lazy val controllers_UnmannedController_getGross3_invoker = createInvoker(
    UnmannedController_1.getGross(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedController",
      "getGross",
      Seq(classOf[String]),
      "GET",
      this.prefix + """play/getGross""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UnmannedController_getToken4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play/getTokenData")))
  )
  private[this] lazy val controllers_UnmannedController_getToken4_invoker = createInvoker(
    UnmannedController_1.getToken(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedController",
      "getToken",
      Seq(classOf[String]),
      "GET",
      this.prefix + """play/getTokenData""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UnmannedClientController_getTare5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/0.1/read/avery/getTare")))
  )
  private[this] lazy val controllers_UnmannedClientController_getTare5_invoker = createInvoker(
    UnmannedClientController_0.getTare(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedClientController",
      "getTare",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/0.1/read/avery/getTare""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UnmannedClientController_getGross6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/0.1/read/avery/getGross")))
  )
  private[this] lazy val controllers_UnmannedClientController_getGross6_invoker = createInvoker(
    UnmannedClientController_0.getGross(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedClientController",
      "getGross",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/0.1/read/avery/getGross""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UnmannedClientController_getToken7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/0.1/read/avery/getTokenData")))
  )
  private[this] lazy val controllers_UnmannedClientController_getToken7_invoker = createInvoker(
    UnmannedClientController_0.getToken(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedClientController",
      "getToken",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/0.1/read/avery/getTokenData""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UnmannedClientController_CreateToken8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/0.1/write/avery/CreateToken")))
  )
  private[this] lazy val controllers_UnmannedClientController_CreateToken8_invoker = createInvoker(
    UnmannedClientController_0.CreateToken,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedClientController",
      "CreateToken",
      Nil,
      "POST",
      this.prefix + """api/0.1/write/avery/CreateToken""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UnmannedClientController_updateToken9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/0.1/write/avery/updateToken")))
  )
  private[this] lazy val controllers_UnmannedClientController_updateToken9_invoker = createInvoker(
    UnmannedClientController_0.updateToken,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedClientController",
      "updateToken",
      Nil,
      "POST",
      this.prefix + """api/0.1/write/avery/updateToken""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UnmannedController_CreateToken10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play/CreateToken")))
  )
  private[this] lazy val controllers_UnmannedController_CreateToken10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UnmannedController_1.CreateToken(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedController",
      "CreateToken",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """play/CreateToken""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UnmannedController_updateToken11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play/updateToken")))
  )
  private[this] lazy val controllers_UnmannedController_updateToken11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      UnmannedController_1.updateToken(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UnmannedController",
      "updateToken",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """play/updateToken""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:7
    case controllers_UnmannedController_unmannnedApi1_route(params@_) =>
      call { 
        controllers_UnmannedController_unmannnedApi1_invoker.call(UnmannedController_1.unmannnedApi)
      }
  
    // @LINE:8
    case controllers_UnmannedController_getTare2_route(params@_) =>
      call(params.fromQuery[String]("bound", Some("0"))) { (bound) =>
        controllers_UnmannedController_getTare2_invoker.call(UnmannedController_1.getTare(bound))
      }
  
    // @LINE:9
    case controllers_UnmannedController_getGross3_route(params@_) =>
      call(params.fromQuery[String]("bound", Some("0"))) { (bound) =>
        controllers_UnmannedController_getGross3_invoker.call(UnmannedController_1.getGross(bound))
      }
  
    // @LINE:10
    case controllers_UnmannedController_getToken4_route(params@_) =>
      call(params.fromQuery[String]("bound", Some("0"))) { (bound) =>
        controllers_UnmannedController_getToken4_invoker.call(UnmannedController_1.getToken(bound))
      }
  
    // @LINE:12
    case controllers_UnmannedClientController_getTare5_route(params@_) =>
      call(params.fromQuery[String]("bound", Some("0"))) { (bound) =>
        controllers_UnmannedClientController_getTare5_invoker.call(UnmannedClientController_0.getTare(bound))
      }
  
    // @LINE:13
    case controllers_UnmannedClientController_getGross6_route(params@_) =>
      call(params.fromQuery[String]("bound", Some("0"))) { (bound) =>
        controllers_UnmannedClientController_getGross6_invoker.call(UnmannedClientController_0.getGross(bound))
      }
  
    // @LINE:14
    case controllers_UnmannedClientController_getToken7_route(params@_) =>
      call(params.fromQuery[String]("bound", Some("0"))) { (bound) =>
        controllers_UnmannedClientController_getToken7_invoker.call(UnmannedClientController_0.getToken(bound))
      }
  
    // @LINE:15
    case controllers_UnmannedClientController_CreateToken8_route(params@_) =>
      call { 
        controllers_UnmannedClientController_CreateToken8_invoker.call(UnmannedClientController_0.CreateToken)
      }
  
    // @LINE:16
    case controllers_UnmannedClientController_updateToken9_route(params@_) =>
      call { 
        controllers_UnmannedClientController_updateToken9_invoker.call(UnmannedClientController_0.updateToken)
      }
  
    // @LINE:18
    case controllers_UnmannedController_CreateToken10_route(params@_) =>
      call { 
        controllers_UnmannedController_CreateToken10_invoker.call(
          req => UnmannedController_1.CreateToken(req))
      }
  
    // @LINE:19
    case controllers_UnmannedController_updateToken11_route(params@_) =>
      call { 
        controllers_UnmannedController_updateToken11_invoker.call(
          req => UnmannedController_1.updateToken(req))
      }
  
    // @LINE:21
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
