
package views.html.fields

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object text_Scope0 {
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

class text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(field: Field, label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.89*/("""

  """),format.raw/*4.3*/("""<div class="form-group """),_display_(/*4.27*/if(field.hasErrors)/*4.46*/ {_display_(Seq[Any](format.raw/*4.48*/("""has-error""")))}),format.raw/*4.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*5.44*/label),format.raw/*5.49*/("""</label>
    <div class="col-sm-10">
      <input type="text" 
             class="form-control" 
             id=""""),_display_(/*9.19*/field/*9.24*/.id),format.raw/*9.27*/("""" 
             name=""""),_display_(/*10.21*/field/*10.26*/.name),format.raw/*10.31*/("""" 
             value=""""),_display_(/*11.22*/field/*11.27*/.value.getOrElse("")),format.raw/*11.47*/(""""
             placeholder=""""),_display_(/*12.28*/placeholder),format.raw/*12.39*/("""" />
      <span class="help-block">"""),_display_(/*13.33*/help),format.raw/*13.37*/("""</span>
      <span class="help-block">"""),_display_(/*14.33*/{field.error.map { error => error.message }}),format.raw/*14.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,placeholder,help)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,placeholder,help) => apply(field,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object text extends text_Scope0.text
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/fields/text.scala.html
                  HASH: 670230bf6156481cd6d9da592a19b770fdc359ed
                  MATRIX: 770->2|952->89|982->93|1032->117|1059->136|1098->138|1138->148|1210->194|1235->199|1377->315|1390->320|1413->323|1463->346|1477->351|1503->356|1554->380|1568->385|1609->405|1665->434|1697->445|1761->482|1786->486|1853->526|1918->570
                  LINES: 27->2|32->2|34->4|34->4|34->4|34->4|34->4|35->5|35->5|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|43->13|43->13|44->14|44->14
                  -- GENERATED --
              */
          