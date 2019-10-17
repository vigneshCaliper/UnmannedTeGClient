// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/apple/play-workspace/unmannedapp/conf/routes
// @DATE:Tue Oct 15 09:40:59 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
