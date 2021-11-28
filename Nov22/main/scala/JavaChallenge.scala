import scala.io.StdIn

object JavaChallenge extends App{

  def ascending(s: String): Boolean = {
    val n = s.length
    if (n < 2) return false
    var startingLength = 1
    while (startingLength <= n / 2) {
      var start = 0
      var end = start + startingLength
      var cur = s.substring(start, end).toLong
      var next = ""
      do {
        next = (cur + 1).toString
        cur = next.toLong
        start = end
        end = start + next.length
      } while (end <= n && s.substring(start).startsWith(next))
      if (start == n) return true
      startingLength += 1
    }
    false
  }

  def squarePatch(n: Int): Array[Array[Int]] = {
    if (n == 0)  Array()
    else if (n > 0) Array.fill(n,n)(n)
    else throw new IllegalArgumentException()
  }
}
