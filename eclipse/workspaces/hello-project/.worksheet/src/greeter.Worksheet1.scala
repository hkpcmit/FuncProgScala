package greeter

object Worksheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(11); 
	val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(28); 
	def increase(i: Int) = i+1;System.out.println("""increase: (i: Int)Int""");$skip(13); val res$0 = 
	increase(x);System.out.println("""res0: Int = """ + $show(res$0))}
}
