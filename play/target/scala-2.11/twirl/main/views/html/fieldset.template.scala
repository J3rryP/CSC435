
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object fieldset_Scope0 {
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

class fieldset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[views.formdata.UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(studentForm: Form[views.formdata.UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.fields._

Seq[Any](format.raw/*2.46*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<fieldset>
  <!-- Header -->
  <div id="legend">
    <legend>Sign up</legend>
  </div>
"""),_display_(/*11.2*/text(studentForm("name"),
        label = "Username",
        placeholder = "Enter a your name",
        help = "Please enter your first and last name. (required)")),format.raw/*14.68*/("""
        
"""),_display_(/*16.2*/text(studentForm("email"),
        label = "Email",
        placeholder = "Enter a special email",
        help = "Please enter your email. (required)")),format.raw/*19.54*/("""
        
 """),_display_(/*21.3*/password(studentForm("password"),
            label = "Password",
            placeholder = "Enter a strong password",
            help = "Password must be five or more characters. (required)")),format.raw/*24.75*/("""
            
  """),_display_(/*26.4*/radiobutton(studentForm("gender"),
                label = "Level",
                help = "Select your gender preference. (required)")),format.raw/*28.68*/("""
                
  """),_display_(/*30.4*/select(studentForm("age"),
          label = "Age",
          help = "Select your Age. (required)")),format.raw/*32.48*/("""
  
  """),format.raw/*34.3*/("""<div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button id="submit" type="submit" value="Submit" class="btn btn-primary">Submit</button>
      <button id="cancel" class="btn cancel">Cancel</button>
    </div>
  </div>
</fieldset>"""))
      }
    }
  }

  def render(studentForm:Form[views.formdata.UserData]): play.twirl.api.HtmlFormat.Appendable = apply(studentForm)

  def f:((Form[views.formdata.UserData]) => play.twirl.api.HtmlFormat.Appendable) = (studentForm) => apply(studentForm)

  def ref: this.type = this

}


}

/**/
object fieldset extends fieldset_Scope0.fieldset
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/fieldset.scala.html
                  HASH: 5958b442f56ee3665e051003eff3cf0c470b11ad
                  MATRIX: 774->2|939->46|967->76|994->77|1108->165|1293->329|1330->340|1503->492|1541->504|1755->697|1798->714|1954->849|2001->870|2121->969|2154->975
                  LINES: 27->2|32->2|34->5|35->6|40->11|43->14|45->16|48->19|50->21|53->24|55->26|57->28|59->30|61->32|63->34
                  -- GENERATED --
              */
          