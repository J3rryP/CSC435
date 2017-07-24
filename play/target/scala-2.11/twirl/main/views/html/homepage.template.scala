
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homepage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.19*/("""




"""),_display_(/*7.2*/main("Welcome")/*7.17*/ {_display_(Seq[Any](format.raw/*7.19*/("""
	
	
	"""),format.raw/*10.2*/("""<div class="jumbotron">

      <form class="form-signin">
        <h2 class="form-signin-heading">Hello """),_display_(/*13.48*/message),format.raw/*13.55*/("""</h2>
        <label for="inputEmail" class="sr-only">Search for a song.</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Search for a song" required autofocus>
        
        
        </div>
        
        <br>Had enough? <li><a href=""""),_display_(/*20.39*/routes/*20.45*/.HomeController.logout),format.raw/*20.67*/("""">Logout</a></li>
      </form>

    </div>

""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object homepage extends homepage_Scope0.homepage
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/homepage.scala.html
                  HASH: ea9090a3cebc8fcc5a1a050b60d50e79c1ce8bca
                  MATRIX: 751->2|863->19|894->25|917->40|956->42|989->48|1121->153|1149->160|1454->438|1469->444|1512->466|1588->512
                  LINES: 27->2|32->2|37->7|37->7|37->7|40->10|43->13|43->13|50->20|50->20|50->20|55->25
                  -- GENERATED --
              */
          