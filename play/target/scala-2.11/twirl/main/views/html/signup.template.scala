
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(studentForm: Form[models.User]
  ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.4*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Oats")/*6.14*/ {_display_(Seq[Any](format.raw/*6.16*/("""
	
	"""),format.raw/*8.2*/("""<div class="jumbotron">
      <form class="form-signin" action=register method="post" >
        <h2 class="form-signin-heading">Sign up</h2>
        
       
        <div class="col-sm-10">
         """),_display_(/*14.11*/input(studentForm("name"))/*14.37*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*14.70*/("""
        """),format.raw/*15.9*/("""<input type="text" 
             class="form-control" 
             id=""""),_display_(/*17.19*/id),format.raw/*17.21*/("""" 
             name=""""),_display_(/*18.21*/name),format.raw/*18.25*/("""" 
             value=""""),_display_(/*19.22*/value),format.raw/*19.27*/(""""
             placeholder="Enter a name" />
         </div>
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""<div class="col-sm-10">
        """),_display_(/*24.10*/input(studentForm("email"))/*24.37*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*24.70*/("""
        """),format.raw/*25.9*/("""<input type="text" 
             class="form-control" 
             id=""""),_display_(/*27.19*/id),format.raw/*27.21*/("""" 
             name=""""),_display_(/*28.21*/name),format.raw/*28.25*/("""" 
             value=""""),_display_(/*29.22*/value),format.raw/*29.27*/(""""
             placeholder="Enter an email" />
         </div>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""<div class="col-sm-10">
        """),_display_(/*34.10*/input(studentForm("password"))/*34.40*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*34.73*/("""
        """),format.raw/*35.9*/("""<input type="password" 
             class="form-control" 
             id=""""),_display_(/*37.19*/id),format.raw/*37.21*/("""" 
             name=""""),_display_(/*38.21*/name),format.raw/*38.25*/("""" 
             value=""""),_display_(/*39.22*/value),format.raw/*39.27*/(""""
             placeholder="Enter a strong password" />
         </div>
        """)))}),format.raw/*42.10*/("""
        
        """),format.raw/*44.9*/("""<div class="col-sm-10" >
    """),_display_(/*45.6*/input(studentForm("gender"))/*45.34*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*45.67*/("""
      """),format.raw/*46.7*/("""<label class="radio-inline">
        <input
          type="radio"
          name=""""),_display_(/*49.18*/name),format.raw/*49.22*/(""""
          id=""""),_display_(/*50.16*/id),format.raw/*50.18*/(""""
          value="M"
          />
        Male
      </label>
      <input
          type="radio"
          name=""""),_display_(/*57.18*/name),format.raw/*57.22*/(""""
          id="id"
          value="F"
          />
        Female
      </label>
   
      <span class="help-block">Choose a gender</span>
      <span class="help-block"></span>
    </div>
        """)))}),format.raw/*67.10*/("""
        
        
        """),format.raw/*70.9*/("""<div class="col-sm-10">
        """),_display_(/*71.10*/input(studentForm("age"))/*71.35*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*71.68*/("""
      """),format.raw/*72.7*/("""<select
        class="form-control"
        id=""""),_display_(/*74.14*/id),format.raw/*74.16*/("""">
      
          <option id=""""),_display_(/*76.24*/name),format.raw/*76.28*/("""" value="10" >10 to 13</option>
          <option id=""""),_display_(/*77.24*/name),format.raw/*77.28*/("""" value="14" >14 to 17</option>
          <option id=""""),_display_(/*78.24*/name),format.raw/*78.28*/("""" value="18" >18 to 25</option>
          <option id=""""),_display_(/*79.24*/name),format.raw/*79.28*/("""" value="26" >26 to 35</option>
          <option id=""""),_display_(/*80.24*/name),format.raw/*80.28*/("""" value="35" >35+</option>
       
      </select>
      <span class="help-block">Choose your age</span>
      <span class="help-block"></span>
    </div>
    	""")))}),format.raw/*86.7*/("""
    	"""),format.raw/*87.6*/("""<div class="col-sm-10">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
       </div>
        
        
    </div>
    """),_display_(/*93.6*/if(flash.containsKey("error"))/*93.36*/ {_display_(Seq[Any](format.raw/*93.38*/("""
  		"""),format.raw/*94.5*/("""<div class="well">
    	<div id="error-message" class="text-danger">
      """),_display_(/*96.8*/flash/*96.13*/.get("error")),format.raw/*96.26*/("""
      """)))}),format.raw/*97.8*/("""

""")))}))
      }
    }
  }

  def render(studentForm:Form[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)

  def f:((Form[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => apply(studentForm)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/signup.scala.html
                  HASH: 653b58558e3b6519ffce0fa566965054e118910d
                  MATRIX: 758->1|902->36|930->55|957->57|977->69|1016->71|1046->75|1273->275|1308->301|1379->334|1415->343|1515->416|1538->418|1588->441|1613->445|1664->469|1690->474|1791->544|1827->553|1887->586|1923->613|1994->646|2030->655|2130->728|2153->730|2203->753|2228->757|2279->781|2305->786|2408->858|2444->867|2504->900|2543->930|2614->963|2650->972|2754->1049|2777->1051|2827->1074|2852->1078|2903->1102|2929->1107|3041->1188|3086->1206|3142->1236|3179->1264|3250->1297|3284->1304|3395->1388|3420->1392|3464->1409|3487->1411|3630->1527|3655->1531|3886->1731|3940->1758|4000->1791|4034->1816|4105->1849|4139->1856|4216->1906|4239->1908|4299->1941|4324->1945|4406->2000|4431->2004|4513->2059|4538->2063|4620->2118|4645->2122|4727->2177|4752->2181|4943->2342|4976->2348|5162->2508|5201->2538|5241->2540|5273->2545|5375->2621|5389->2626|5423->2639|5461->2647
                  LINES: 27->1|33->2|35->5|36->6|36->6|36->6|38->8|44->14|44->14|44->14|45->15|47->17|47->17|48->18|48->18|49->19|49->19|52->22|53->23|54->24|54->24|54->24|55->25|57->27|57->27|58->28|58->28|59->29|59->29|62->32|63->33|64->34|64->34|64->34|65->35|67->37|67->37|68->38|68->38|69->39|69->39|72->42|74->44|75->45|75->45|75->45|76->46|79->49|79->49|80->50|80->50|87->57|87->57|97->67|100->70|101->71|101->71|101->71|102->72|104->74|104->74|106->76|106->76|107->77|107->77|108->78|108->78|109->79|109->79|110->80|110->80|116->86|117->87|123->93|123->93|123->93|124->94|126->96|126->96|126->96|127->97
                  -- GENERATED --
              */
          