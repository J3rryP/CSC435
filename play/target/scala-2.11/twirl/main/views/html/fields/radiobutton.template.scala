
package views.html.fields

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object radiobutton_Scope0 {
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

class radiobutton extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Field,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(field: Field, label: String = "CHANGEME", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.63*/("""

  """),format.raw/*4.3*/("""<div class="form-group """),_display_(/*4.27*/if(field.hasErrors)/*4.46*/ {_display_(Seq[Any](format.raw/*4.48*/("""has-error""")))}),format.raw/*4.58*/("""">
    <label class="col-sm-2 control-label" for=""""),_display_(/*5.49*/field/*5.54*/.id),format.raw/*5.57*/("""">"""),_display_(/*5.60*/label),format.raw/*5.65*/("""</label>
    <div id=""""),_display_(/*6.15*/(field.id + "s")),format.raw/*6.31*/("""" class="col-sm-10" >
    
      <label class="radio-inline">
        <input
          type="radio"
          name=""""),_display_(/*11.18*/field/*11.23*/.name),format.raw/*11.28*/(""""
          id=""""),_display_(/*12.16*/field/*12.21*/.id),format.raw/*12.24*/(""""
          value="M"
          />
        Male
      </label>
      <input
          type="radio"
          name=""""),_display_(/*19.18*/field/*19.23*/.name),format.raw/*19.28*/(""""
          id="field.id"
          value="F"
          />
        Female
      </label>
   
      <span class="help-block">"""),_display_(/*26.33*/help),format.raw/*26.37*/("""</span>
      <span class="help-block">"""),_display_(/*27.33*/{field.error.map { error => error.message }}),format.raw/*27.77*/("""</span>
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
object radiobutton extends radiobutton_Scope0.radiobutton
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/fields/radiobutton.scala.html
                  HASH: e15ba6be116440c3c00fd5b898821820e583f8fb
                  MATRIX: 777->2|933->63|963->67|1013->91|1040->110|1079->112|1119->122|1196->173|1209->178|1232->181|1261->184|1286->189|1335->212|1371->228|1515->345|1529->350|1555->355|1599->372|1613->377|1637->380|1780->496|1794->501|1820->506|1972->631|1997->635|2064->675|2129->719
                  LINES: 27->2|32->2|34->4|34->4|34->4|34->4|34->4|35->5|35->5|35->5|35->5|35->5|36->6|36->6|41->11|41->11|41->11|42->12|42->12|42->12|49->19|49->19|49->19|56->26|56->26|57->27|57->27
                  -- GENERATED --
              */
          