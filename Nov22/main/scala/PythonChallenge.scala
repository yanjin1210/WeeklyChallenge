object PythonChallenge extends App{

  def isRepeating(s: String, len: Int): Boolean = {
    val pattern = s.substring(0,len)
    for(i<-len until s.length by len) {
      if(s.substring(i, i + len) != pattern) return false
    }
    true
  }

  def repeated(s: String): Boolean = {
    val n = s.length
    if (n < 2) return false
    for (i<-1 to n/2 if n % i == 0) {
      if (isRepeating(s, i)) return true
    }
    false
  }
}
