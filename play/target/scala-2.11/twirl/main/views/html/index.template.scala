
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(studentForm: Form[models.Login]
  ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Welcome to Oats")/*7.25*/ {_display_(Seq[Any](format.raw/*7.27*/("""
	
	
	"""),format.raw/*10.2*/("""<div class="jumbotron">
      <form class="form-signin" action=welcome method="post" >
        <h2 class="form-signin-heading">Sign in</h2>
        
        <label for="inputEmail" class="sr-only">Email address</label>
        """),_display_(/*15.10*/input(studentForm("email"))/*15.37*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*15.70*/("""
        """),format.raw/*16.9*/("""<input type="email" id=""""),_display_(/*16.34*/id),format.raw/*16.36*/("""" class="form-control" name=""""),_display_(/*16.66*/name),format.raw/*16.70*/("""" value=""""),_display_(/*16.80*/value),format.raw/*16.85*/("""" placeholder="Email address" required autofocus """),_display_(/*16.135*/toHtmlArgs(htmlArgs)),format.raw/*16.155*/(""">
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""<label for="inputPassword" class="sr-only">Password</label>
         """),_display_(/*19.11*/input(studentForm("password"))/*19.41*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*19.74*/("""
        """),format.raw/*20.9*/("""<input type="password" id=""""),_display_(/*20.37*/id),format.raw/*20.39*/("""" class="form-control" name=""""),_display_(/*20.69*/name),format.raw/*20.73*/("""" value=""""),_display_(/*20.83*/value),format.raw/*20.88*/("""" placeholder="Password" required """),_display_(/*20.123*/toHtmlArgs(htmlArgs)),format.raw/*20.143*/(""">
        """)))}),format.raw/*21.10*/("""
        """),format.raw/*22.9*/("""<div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
       
        <br>Don't have an account? <li><a href=""""),_display_(/*29.50*/routes/*29.56*/.HomeController.postRegister),format.raw/*29.84*/("""">Sign up</a></li>
        
    </div>
    """),_display_(/*32.6*/if(flash.containsKey("error"))/*32.36*/ {_display_(Seq[Any](format.raw/*32.38*/("""
  		"""),format.raw/*33.5*/("""<div class="well">
    	<div id="error-message" class="text-danger">
      """),_display_(/*35.8*/flash/*35.13*/.get("error")),format.raw/*35.26*/("""
      """)))}),format.raw/*36.8*/("""
    
""")))}),format.raw/*38.2*/("""



"""))
      }
    }
  }

  def render(studentForm:Form[models.Login]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)

  def f:((Form[models.Login]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => apply(studentForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/index.scala.html
                  HASH: 502a7f3a82dfa7a80b6e24448b042b5dd25600ee
                  MATRIX: 757->2|902->38|930->57|957->59|988->82|1027->84|1060->90|1315->318|1351->345|1422->378|1458->387|1510->412|1533->414|1590->444|1615->448|1652->458|1678->463|1756->513|1798->533|1840->544|1876->553|1973->623|2012->653|2083->686|2119->695|2174->723|2197->725|2254->755|2279->759|2316->769|2342->774|2405->809|2447->829|2489->840|2525->849|2840->1137|2855->1143|2904->1171|2974->1215|3013->1245|3053->1247|3085->1252|3187->1328|3201->1333|3235->1346|3273->1354|3310->1361
                  LINES: 27->2|33->3|35->6|36->7|36->7|36->7|39->10|44->15|44->15|44->15|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|47->18|48->19|48->19|48->19|49->20|49->20|49->20|49->20|49->20|49->20|49->20|49->20|49->20|50->21|51->22|58->29|58->29|58->29|61->32|61->32|61->32|62->33|64->35|64->35|64->35|65->36|67->38
                  -- GENERATED --
              */
          