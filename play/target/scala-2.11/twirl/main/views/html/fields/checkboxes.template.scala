
package views.html.fields

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object checkboxes_Scope0 {
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

class checkboxes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,Map[String, Boolean],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", checkboxMap: Map[String, Boolean], help:String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-10" id=""""),_display_(/*5.33*/field/*5.38*/.id),format.raw/*5.41*/("""">
      """),_display_(/*6.8*/for((checkboxName, isChecked) <- checkboxMap) yield /*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
        """),format.raw/*7.9*/("""<label class="checkbox-inline">
          <input
            type="checkbox"
            name=""""),_display_(/*10.20*/(field.name + "[]")),format.raw/*10.39*/(""""
            id=""""),_display_(/*11.18*/checkboxName),format.raw/*11.30*/(""""
            value=""""),_display_(/*12.21*/checkboxName),format.raw/*12.33*/(""""
            """),_display_(/*13.14*/if(isChecked)/*13.27*/ {_display_(Seq[Any](format.raw/*13.29*/("""checked""")))}),format.raw/*13.37*/(""">
          """),_display_(/*14.12*/checkboxName),format.raw/*14.24*/("""
        """),format.raw/*15.9*/("""</label>
      """)))}),format.raw/*16.8*/("""
      """),format.raw/*17.7*/("""<span class="help-block">"""),_display_(/*17.33*/help),format.raw/*17.37*/("""</span>
      <span class="help-block">"""),_display_(/*18.33*/{field.error.map { error => error.message }}),format.raw/*18.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,checkboxMap:Map[String, Boolean],help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,checkboxMap,help)

  def f:((Field,String,Map[String, Boolean],String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,checkboxMap,help) => apply(field,label,checkboxMap,help)

  def ref: this.type = this

}


}

/**/
object checkboxes extends checkboxes_Scope0.checkboxes
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/fields/checkboxes.scala.html
                  HASH: 28b9a3d787967fa9725a751438404076c543c22c
                  MATRIX: 796->1|986->96|1016->100|1066->124|1093->143|1132->145|1172->155|1249->206|1262->211|1285->214|1314->217|1339->222|1406->263|1419->268|1442->271|1477->281|1537->326|1576->328|1611->337|1734->433|1774->452|1820->471|1853->483|1902->505|1935->517|1977->532|1999->545|2039->547|2078->555|2118->568|2151->580|2187->589|2233->605|2267->612|2320->638|2345->642|2412->682|2477->726
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|41->10|41->10|42->11|42->11|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|46->15|47->16|48->17|48->17|48->17|49->18|49->18
                  -- GENERATED --
              */
          