package forcomp

object test_ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(21); 

  val s1 = "Robert";System.out.println("""s1  : String = """ + $show(s1 ));$skip(42); 
  val s2 = s1.toLowerCase().sortWith(_<_);System.out.println("""s2  : String = """ + $show(s2 ));$skip(13); val res$0 = 
  s2.drop(1);System.out.println("""res0: String = """ + $show(res$0));$skip(27); val res$1 = 
  s2.span(x => x == s2(0));System.out.println("""res1: (String, String) = """ + $show(res$1));$skip(218); 
  def pack(s: String): List[(Char, Int)] = s match {
    case "" => List()
    case _ => {
      val first = s(0)
      val (span1, span2) = s.span(c => c == first)
      (first, span1.length) :: pack(span2)
    }
  };System.out.println("""pack: (s: String)List[(Char, Int)]""");$skip(11); val res$2 = 
  pack(s2);System.out.println("""res2: List[(Char, Int)] = """ + $show(res$2));$skip(31); 
	val s2_map = s2 groupBy(x=>x);System.out.println("""s2_map  : scala.collection.immutable.Map[Char,String] = """ + $show(s2_map ));$skip(65); 
  val s2_list = s2_map map {case (k, v) => (k, v.length)} toList;System.out.println("""s2_list  : List[(Char, Int)] = """ + $show(s2_list ));$skip(17); val res$3 = 

	s2_list.sorted;System.out.println("""res3: List[(Char, Int)] = """ + $show(res$3));$skip(12); val res$4 = 
	Nil :: Nil;System.out.println("""res4: List[scala.collection.immutable.Nil.type] = """ + $show(res$4));$skip(49); val res$5 = 
	List("a", "aa", "b", "bb").toSet.subsets.toList;System.out.println("""res5: List[scala.collection.immutable.Set[String]] = """ + $show(res$5));$skip(27); val res$6 = 
	for (i <- 0 to 3) yield i;System.out.println("""res6: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$6));$skip(33); val res$7 = 
	List(('a',1)) ++ List(('b', 1));System.out.println("""res7: List[(Char, Int)] = """ + $show(res$7));$skip(41); 
	val m1 = List(('a', 1), ('b', 2)).toMap;System.out.println("""m1  : scala.collection.immutable.Map[Char,Int] = """ + $show(m1 ));$skip(26); 
	val m2 = m1 + ('a' -> 2);System.out.println("""m2  : scala.collection.immutable.Map[Char,Int] = """ + $show(m2 ));$skip(19); 
	val m3 = m2 - 'b';System.out.println("""m3  : scala.collection.immutable.Map[Char,Int] = """ + $show(m3 ));$skip(25); val res$8 = 
	List('a', 'a').mkString;System.out.println("""res8: String = """ + $show(res$8));$skip(18); val res$9 = 
	'a'.toString * 2;System.out.println("""res9: String = """ + $show(res$9));$skip(65); val res$10 = 
	List("a", "aa", "b", "bb").filterNot(Seq("a", "b").contains(_));System.out.println("""res10: List[String] = """ + $show(res$10))}
}
