package ch01

object C01_Array extends App {
  // Array

  val a = new Array[String](2) // String 타입이 2개 담을 수 있는 배열의 객체를 생성


  // val을 선언했는데도 값을 바꿀 수 있는 것은 불변의 val이 변수를 재할당할 수 없다는 것이지,
  // 변수가 가르키는 객체 안의 내용은 여전히 변경 가능하다는 것.

  a(0) = "Hello" // 배열 내 원하는 위치(Index)에 값 삽입
  a(1) = "World"

  //  값 가져오기
  print(a(0))
  // 변수 뒤에 하나 이상의 값을 괄호로 둘러싸서 호출하게 되면 컴파일러가 변수의 apply(0) 메소드를 호출하여 자동 변경시켜줌.
  // 즉, a(0) = a.apply(0)
  // apply() 메소드는 배열객체에만 존재하는 것이 아님.

  // 값 넣기
  a(0) = "Hallo"
  /*
  a(0) = "Hallo" 역시 컴파일러가 자동으로 update(0, "Hallo")메소드로 바꿔준다.
  즉,
  a(0) = "Hallo" == a.update(0, "Hallo")
  * */

  // 배열의 간편한 선언(new 생략, [String] 생략)

  /*
  [String] 생략
  초기화할때 인자로 String 들어가기 때문에 타입을 자동추론

  new 생략
  암시적으로 apply 팩토리 메소드를 호출하여 객체를 만들어줌.

  즉,
  Array.apply("Hello", "World") 와 같다.
  */
  val b = Array("Hello", "World")

}
