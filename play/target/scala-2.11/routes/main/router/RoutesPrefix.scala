
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/conf/routes
// @DATE:Thu May 11 14:28:22 EDT 2017


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
