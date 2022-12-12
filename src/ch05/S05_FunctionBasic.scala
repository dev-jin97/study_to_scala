package ch05

/*===============================================================*/
object S05_FunctionBasic extends App {
  /*
  함수는 def()로 선언이 됨. 함수를 선언할 때 리턴문과 리턴 타입이 생략 가능, 매개변수의 파라미터 타입은 생략할 수 없음.
  리턴값이 없는 함수를 선언할 때 Unit 을 이용. 함수의 매개변수는 불변이기에 재할당 불가
  * */

  // defined function
  def add(x:Int, y: Int): Int ={
    return x + y
  }

  // 리턴 타입 생략 가능

  def add(x:Int, y:Double) = {
    x + y

    // return 타입을 생략하게 되면 컴파일러가 반환값을 이용하여 자동으로 추론.
    // 리턴 타입이 Unit이 아니라면 함수의 마지막 값을 리턴.
  }

  // Unit 선언
  def add_unit(x: Int, y:Int): Unit = {
    println(x + y)
  }

  // 리턴 타입이 Unit인 것도 생략가능
  def add_unit(x : Int, y:Double) = {
    println(x + y)
  }

  /*===============================================================*/

  /*
  함수의 축약형

  함수가 1라인으로 처리 가능한 경우에는 중괄호{} 없이 선언 가능
  * */
  def printUpper(message:String):Unit = println(message.toUpperCase())

  // 반환타입 생략 가능
  def printLower(message:String) = println(message.toLowerCase())

  /*===============================================================*/

  /*
  파라미터의 기본값
  함수의 파라미터는 기본값을 설정할 수 있음.
  * */
  def useDefaultParam(x:Int, y:Int = 10) = x + y

  /*===============================================================*/

  /*
  가변 길이 파라미터, *를 이용하면 Seq형으로 변환되어 입력됨.
  * */
  def sum(num:Int*) = num.sum

  val result_val = sum(1, 2, 3)

  println(result_val)
  /*===============================================================*/

  /*
  함수의 중첩
  */
  def run(): Unit = {
    def middle(): Unit = {
      println("middle")
    }

    println("Start")
    middle()
    println("End")
  }

  run()

}
