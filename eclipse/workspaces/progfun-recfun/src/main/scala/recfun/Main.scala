package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) {
      /*
       * Base case.
       */
      1
    } else {
      /*
       * pascal(c, r) = pascal(c-1, r-1) + pascal(c, r-1)
       */
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    /*
     * Define recursive balance function.
     */
    def balance_rec(chs: List[Char], left_paren: Int): Boolean = {
      /*
       * Base case.
       */
      if (chs.indexOf('(') == -1 && chs.indexOf(')') == -1) {
        /*
         * There is no paren's.  Return True iff left_paren counter == 0
         */
        left_paren == 0
      } else {
        chs(0) match {
          case '(' => balance_rec(chs.tail, left_paren + 1)
          case ')' =>
            if (left_paren != 0) {
              balance_rec(chs.tail, left_paren - 1)
            } else {
              /*
             * Unbalanced paren's.
             */
              false
            }
          /*
         * Neither '(' nor ')'.  Simply skip. 
         */
          case _ => balance_rec(chs.tail, left_paren)
        }
      }
    }
    balance_rec(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeRec(value: Int, index: Int): Int = {
      if (index < 0 || value < 0) {
        0
      } else if (value == 0) {
        1
      } else {
        countChangeRec(value - coins(index), index) +
          countChangeRec(value, index - 1)
      }
    }
    countChangeRec(money, coins.size - 1)
  }
}
