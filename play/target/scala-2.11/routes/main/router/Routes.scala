
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/conf/routes
// @DATE:Thu May 11 14:28:22 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:14
  RestController_4: controllers.RestController,
  // @LINE:19
  AsyncController_2: controllers.AsyncController,
  // @LINE:22
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:14
    RestController_4: controllers.RestController,
    // @LINE:19
    AsyncController_2: controllers.AsyncController,
    // @LINE:22
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, CountController_0, RestController_4, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, RestController_4, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.postRegister"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.getRegister"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome""", """controllers.HomeController.postLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/puser""", """controllers.RestController.updateUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/users""", """controllers.RestController.getUsers"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/cuser""", """controllers.RestController.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/user/""" + "$" + """id<[^/]+>""", """controllers.RestController.getUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
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
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_postRegister2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_postRegister2_invoker = createInvoker(
    HomeController_1.postRegister,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_getRegister3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_getRegister3_invoker = createInvoker(
    HomeController_1.getRegister,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getRegister",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_postLogin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome")))
  )
  private[this] lazy val controllers_HomeController_postLogin4_invoker = createInvoker(
    HomeController_1.postLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "postLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """welcome"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout5_invoker = createInvoker(
    HomeController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RestController_updateUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/puser")))
  )
  private[this] lazy val controllers_RestController_updateUser6_invoker = createInvoker(
    RestController_4.updateUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "updateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """v1/puser"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RestController_getUsers7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/users")))
  )
  private[this] lazy val controllers_RestController_getUsers7_invoker = createInvoker(
    RestController_4.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """v1/users"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RestController_createUser8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/cuser")))
  )
  private[this] lazy val controllers_RestController_createUser8_invoker = createInvoker(
    RestController_4.createUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "createUser",
      Nil,
      "PUT",
      """""",
      this.prefix + """v1/cuser"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_RestController_getUser9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestController_getUser9_invoker = createInvoker(
    RestController_4.getUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestController",
      "getUser",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """v1/user/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_AsyncController_message10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message10_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:9
    case controllers_HomeController_postRegister2_route(params) =>
      call { 
        controllers_HomeController_postRegister2_invoker.call(HomeController_1.postRegister)
      }
  
    // @LINE:10
    case controllers_HomeController_getRegister3_route(params) =>
      call { 
        controllers_HomeController_getRegister3_invoker.call(HomeController_1.getRegister)
      }
  
    // @LINE:11
    case controllers_HomeController_postLogin4_route(params) =>
      call { 
        controllers_HomeController_postLogin4_invoker.call(HomeController_1.postLogin)
      }
  
    // @LINE:12
    case controllers_HomeController_logout5_route(params) =>
      call { 
        controllers_HomeController_logout5_invoker.call(HomeController_1.logout)
      }
  
    // @LINE:14
    case controllers_RestController_updateUser6_route(params) =>
      call { 
        controllers_RestController_updateUser6_invoker.call(RestController_4.updateUser)
      }
  
    // @LINE:15
    case controllers_RestController_getUsers7_route(params) =>
      call { 
        controllers_RestController_getUsers7_invoker.call(RestController_4.getUsers)
      }
  
    // @LINE:16
    case controllers_RestController_createUser8_route(params) =>
      call { 
        controllers_RestController_createUser8_invoker.call(RestController_4.createUser)
      }
  
    // @LINE:17
    case controllers_RestController_getUser9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RestController_getUser9_invoker.call(RestController_4.getUser(id))
      }
  
    // @LINE:19
    case controllers_AsyncController_message10_route(params) =>
      call { 
        controllers_AsyncController_message10_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:22
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
