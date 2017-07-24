
package views.html.fields

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textarea_Scope0 {
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

class textarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, rows: String = "3", label: String = "CHANGEME", placeholder: String = "", help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.109*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-2 control-label">"""),_display_(/*4.44*/label),format.raw/*4.49*/("""</label>
    <div class="col-sm-10">
      <textarea class="form-control"
                rows=""""),_display_(/*7.24*/rows),format.raw/*7.28*/("""" 
                id=""""),_display_(/*8.22*/field/*8.27*/.id),format.raw/*8.30*/("""" 
                name=""""),_display_(/*9.24*/field/*9.29*/.name),format.raw/*9.34*/("""" 
                placeholder=""""),_display_(/*10.31*/placeholder),format.raw/*10.42*/("""" 
                >"""),_display_(/*11.19*/field/*11.24*/.value.getOrElse("")),format.raw/*11.44*/("""</textarea>
      <span class="help-block">"""),_display_(/*12.33*/help),format.raw/*12.37*/("""</span>
      <span class="help-block">"""),_display_(/*13.33*/{field.error.map { error => error.message }}),format.raw/*13.77*/("""</span>
    </div>
  </div>"""))
      }
    }
  }

  def render(field:Field,rows:String,label:String,placeholder:String,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,rows,label,placeholder,help)

  def f:((Field,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,rows,label,placeholder,help) => apply(field,rows,label,placeholder,help)

  def ref: this.type = this

}


}

/**/
object textarea extends textarea_Scope0.textarea
              /*
                  -- GENERATED --
                  DATE: Thu May 11 14:28:24 EDT 2017
                  SOURCE: C:/Users/Jeremiah/Desktop/CSC435/CSC435-master/play/app/views/fields/textarea.scala.html
                  HASH: c3fa99f9ae74a973d5e0691aa8a1360478b800ad
                  MATRIX: 785->1|988->108|1018->112|1068->136|1095->155|1134->157|1174->167|1246->213|1271->218|1394->315|1418->319|1468->343|1481->348|1504->351|1556->377|1569->382|1594->387|1654->420|1686->431|1734->452|1748->457|1789->477|1860->521|1885->525|1952->565|2017->609
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|44->13
                  -- GENERATED --
              */
          