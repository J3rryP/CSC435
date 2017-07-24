
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Oats</title>
    <!-- Bootstrap core CSS -->
    <link href=""""),_display_(/*10.18*/routes/*10.24*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*10.74*/("""" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">
    <style> /* copied from bootstrap-starter template */
    
    body """),format.raw/*14.10*/("""{"""),format.raw/*14.11*/("""
  """),format.raw/*15.3*/("""padding-top: 40px;
  padding-bottom: 40px;
  background-color: #eee;
  font-family: 'Indie Flower', cursive;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/(""".form-signin """),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""
  """),format.raw/*22.3*/("""max-width: 330px;
  padding: 15px;
  margin: 0 auto;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
"""),format.raw/*26.1*/(""".form-signin .form-signin-heading,
.form-signin .checkbox """),format.raw/*27.24*/("""{"""),format.raw/*27.25*/("""
  """),format.raw/*28.3*/("""margin-bottom: 10px;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
"""),format.raw/*30.1*/(""".form-signin .checkbox """),format.raw/*30.24*/("""{"""),format.raw/*30.25*/("""
  """),format.raw/*31.3*/("""font-weight: normal;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/(""".form-signin .form-control """),format.raw/*33.28*/("""{"""),format.raw/*33.29*/("""
  """),format.raw/*34.3*/("""position: relative;
  height: auto;
  -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
          box-sizing: border-box;
  padding: 10px;
  font-size: 16px;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""
"""),format.raw/*42.1*/(""".form-signin .form-control:focus """),format.raw/*42.34*/("""{"""),format.raw/*42.35*/("""
  """),format.raw/*43.3*/("""z-index: 2;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
"""),format.raw/*45.1*/(""".form-signin input[type="email"] """),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""
  """),format.raw/*46.3*/("""margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""
"""),format.raw/*50.1*/(""".form-signin input[type="password"] """),format.raw/*50.37*/("""{"""),format.raw/*50.38*/("""
  """),format.raw/*51.3*/("""margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""
    """),format.raw/*55.5*/("""</style>
  </head>
  <body>
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle"
            data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Oats v1</a>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="starter-template">
        <h1>"""),_display_(/*74.14*/title),format.raw/*74.19*/("""</h1>
        <div class="container">
            """),_display_(/*76.14*/content),format.raw/*76.21*/("""
        """),format.raw/*77.9*/("""</div>
      </div>
    </div><!-- /.container -->
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script
     src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*85.74*/(""""></script>
  </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/main.scala.html
                  HASH: f779d483037d839232b062698c7ceae328add373
                  MATRIX: 748->1|873->31|900->32|1200->305|1215->311|1286->361|1493->540|1522->541|1552->544|1688->653|1716->654|1745->656|1786->669|1815->670|1845->673|1925->726|1953->727|1981->728|2067->786|2096->787|2126->790|2174->811|2202->812|2230->813|2281->836|2310->837|2340->840|2388->861|2416->862|2444->863|2499->890|2528->891|2558->894|2759->1068|2787->1069|2815->1070|2876->1103|2905->1104|2935->1107|2974->1119|3002->1120|3030->1121|3091->1154|3120->1155|3150->1158|3263->1244|3291->1245|3319->1246|3383->1282|3412->1283|3442->1286|3549->1366|3577->1367|3609->1372|4306->2042|4332->2047|4410->2098|4438->2105|4474->2114|4835->2448|4850->2454|4920->2503
                  LINES: 27->1|32->1|33->2|41->10|41->10|41->10|45->14|45->14|46->15|50->19|50->19|52->21|52->21|52->21|53->22|56->25|56->25|57->26|58->27|58->27|59->28|60->29|60->29|61->30|61->30|61->30|62->31|63->32|63->32|64->33|64->33|64->33|65->34|72->41|72->41|73->42|73->42|73->42|74->43|75->44|75->44|76->45|76->45|76->45|77->46|80->49|80->49|81->50|81->50|81->50|82->51|85->54|85->54|86->55|105->74|105->74|107->76|107->76|108->77|116->85|116->85|116->85
                  -- GENERATED --
              */
          