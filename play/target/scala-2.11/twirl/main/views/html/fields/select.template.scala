
package views.html.fields

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object select_Scope0 {
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

class select extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Field,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10">
      <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/("""">
      
          <option id=""""),_display_(/*10.24*/field/*10.29*/.name),format.raw/*10.34*/("""" value="10" >10 to 13</option>
          <option id=""""),_display_(/*11.24*/field/*11.29*/.name),format.raw/*11.34*/("""" value="14" >14 to 17</option>
          <option id=""""),_display_(/*12.24*/field/*12.29*/.name),format.raw/*12.34*/("""" value="18" >18 to 25</option>
          <option id=""""),_display_(/*13.24*/field/*13.29*/.name),format.raw/*13.34*/("""" value="26" >26 to 35</option>
          <option id=""""),_display_(/*14.24*/field/*14.29*/.name),format.raw/*14.34*/("""" value="35" >35+</option>
       
      </select>
      <span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,help)

  def f:((Field,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,help) => apply(field,label,help)

  def ref: this.type = this

}


}

/**/
object select extends select_Scope0.select
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/fields/select.scala.html
                  HASH: 81f843916d06645f0767814d42b14c5e4a3773d5
                  MATRIX: 767->1|923->62|953->66|1003->90|1030->109|1069->111|1109->121|1186->172|1199->177|1222->180|1251->183|1276->188|1395->281|1408->286|1431->289|1491->322|1505->327|1531->332|1613->387|1627->392|1653->397|1735->452|1749->457|1775->462|1857->517|1871->522|1897->527|1979->582|1993->587|2019->592|2129->675|2154->679|2221->719|2286->763
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|48->17|48->17|49->18|49->18
                  -- GENERATED --
              */
          