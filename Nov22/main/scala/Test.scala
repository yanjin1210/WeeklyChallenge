import JavaChallenge._


object Test extends App{

  def longStringTest(): Unit = {
    val longValues = new Array[Long](10000)
    for (i <- 0 to 9999) longValues(i) = 40000000000L + i
    val longString = longValues.mkString
    try {
      assert(ascending(longString), "Did not passed long string test.")
    }
    catch {
      case e: AssertionError => println(e.getMessage)
    }
    for (i<-0 to 9999) longValues(i) = i
    try {
      assert(ascending(longValues.mkString), "Did not passed long string test.")
    }
    catch {
      case e: AssertionError => println(e.getMessage)
    }
  }

  def emptyStringTest(): Unit = {
    val emptyString = ""
    try {
      assert(!ascending(""), "Did not passed empty string test.")
    }
    catch {
      case e: AssertionError => println(e.getMessage)
    }
  }

  def singleNumberTest(): Unit = {
    try {
      assert(!ascending("1"), "Did not passed empty string test.")
      assert(!ascending("13"), "Did not passed empty string test.")
      assert(!ascending("101"), "Did not passed empty string test.")
      assert(!ascending("100000000000000"), "Did not passed empty string test.")
    }
    catch {
      case e: AssertionError => println(e.getMessage)
    }
  }



}
