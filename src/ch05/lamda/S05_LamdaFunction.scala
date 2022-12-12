package ch05.lamda

object S05_LamdaFunction extends App {
  // TODO: 익명의 람다 함수
  /*
  람다함 수

  언더바 _ 로 묵시적인 파라미터를 지정할 수 있음.
  * */


  // 3개의 파라미터를(함수 f, x, y)를 받는 함수
  def exec(f: (Int, Int) => Int, x:Int, y:Int) = f(x, y)


  // 람다 함수를 전달하여 처리, x + y 작업을 하는 함수 전달
  println(exec((x:Int, y:Int) => x + y, 2, 3))

  // exec 선업시에 타입을 입력해서 추가적인 설정 없이 처리 가능
  println(exec((x, y)=> x + y, 2, 4))

  // 함수에 따라 다른 처리
  println(exec((x , y) => x - y, 7, 3))

  // 언더바를 이용하여 묵시적인 처리 가능
  println(exec(_*_, 7, 3))

}
