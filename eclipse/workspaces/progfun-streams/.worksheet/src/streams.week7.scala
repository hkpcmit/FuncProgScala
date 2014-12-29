package streams

object week7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  val lv1 = Vector(Vector('S', 'T'), Vector('o', 'o'));System.out.println("""lv1  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Char]] = """ + $show(lv1 ));$skip(11); val res$0 = 
	lv1(0)(0);System.out.println("""res0: Char = """ + $show(res$0));$skip(12); val res$1 = 
	lv1.length;System.out.println("""res1: Int = """ + $show(res$1));$skip(33); val res$2 = 
	lv1.indexWhere(_.contains('o'));System.out.println("""res2: Int = """ + $show(res$2));$skip(33); 
	val s1 = Stream(1) ++ Stream(2);System.out.println("""s1  : scala.collection.immutable.Stream[Int] = """ + $show(s1 ));$skip(11); val res$3 = 
	s1.toList;System.out.println("""res3: List[Int] = """ + $show(res$3))}
}
