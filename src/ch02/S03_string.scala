package ch02

object S03_string  extends App {
  // TODO: 스칼라의 문자열 처리

  var str1 = "Hello World"
  println(str1)

  var str2 =
    """Hello
      |World
      |""".stripMargin
  println(str2)

  // 접두어 s
  // String 내의 변수명을 넣어 값을 치환하여 문자열로 나타냄. python의 접두어 f모듈과 같음.
  var str3 = s"println $str1"
  println(str3)
  println(s"2 * 3 = ${2 * 3}")

  def minus(x:Int, y:Int) = x - y
  println(s"${Math.pow(2, 3)}")
  println(s"${minus(2, 3)}")


  println("--------------------------------------------------")
  // 접두어 f
  // 자바의 printf()와 같음.
  val height:Double = 182.3
  val name = "James"
  println(f"$name%s is $height%2.1f meters tall")


  // 접두어 raw
  // 특수 기호 \n, \t 등을 처리하지 않고 문자 그대로 표현하게 할 수 있음.
  val rawStr = raw"가\n나"
  println(rawStr)
}
