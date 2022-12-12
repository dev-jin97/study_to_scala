package ch01

object C01_List extends App {
  // List
  /*
  스칼라의 배열이 값을 변경 할 수 있는 순서가 정해진 시퀀스라면 스칼라의 리스트는 기본적으로  값을 변경 할 수 없는 시퀀스입니다.
  함수형 스타일이라는것은 메소드 내에서 절대로 부수효과가 일어나면 안되는, 그래서 더 신뢰할 수 있고 재사용하기 쉬운 코드를 만드는게 주 목적이라 ,
  그 목적에 적합한 콜렉션이라 할 수 있습니다.
  */

  // List 생성
  val list = List(1, 2, 3) // new 와 [Int] 생략, apply 메소드 암시적 호출

  val x = List.range(1, 10) // 범위로 List (1, 2, 3, 4, 5, 6, 7, 8, 9)

  val y = List.fill(3)("Foo") // 3개의 Foo 데이터 삽입 = List("Foo", "Foo", "Foo")

  val z = List.tabulate(5)(n => n * n) // 두번째 괄호의 연산식에 맞게 선언 (0, 1, 4, 9 ,16)


  // 원소 가져오기
  val a = List(1, 2, 3)
  a(2)

  // 두개의 리스트 합치기
  val add_a = List(1, 2)
  val add_b = List(3, 4)

  val use_clone = add_a ::: add_b // ::: 는 오로지 리스트에서만 사용

  val non_use_clone = add_a ++ add_b

  // 리스트 앞에 요소 추가
  // List(1, 2) 앞 0 을넣어 List(0, 1, 2) 하는 방식 ==> ::

  val concat_a = List(1, 2, 3)
  val result_b = 0 :: concat_a // 값을 초기화 하는 것이 아닌, 새로운 변수로 선언함.
  // 0 :: concat_a == concat_a.::(0) 과 같음

  // 리스트 뒤에 요소 추가
  // :+
  val result_c = concat_a :+ 4
  // :+ 는 리스트의 길이만큼 오래 걸림, 효율적으로 처리하려면 아래와 같이 활용

  val reverse_a  = (4 :: List(1, 2, 3).reverse).reverse // reverse 사용으로 (3, 2, 1)을 만든 뒤 앞에 넣고 다시 reverse

  val add_list_a = List(1, 2, 3) ::: List(4) // 새로운 리스트 추가

  // 두번째 원소까지 제거
  val drop_a = List(1, 2, 3)
  val res_a = drop_a.drop(2) // 결과 List(3), 자체의 원소를 제거한 것이 아닌, 원소 제거한 리스트를 반환하는 것

  // 요소중 길이가 3인 것의 개수를 센다.
  val condition_a = List("Hello", "world", "boy")
  println(condition_a.count(s=> s.length == 3)) // s=> s.length == 3 , 람다식, 인자가 s인 함수

  // 리스트의 각 원소를 변경하여 새리스트르 반환.
  val list_a = List("Hello", "World", "Boy")
  val list_b = list_a.map(s=> s + 'X')

  /*
  되도록이면 var를 안쓰는 방향으로 코딩해야함.
  */
  // Nil의 존재
  val use_Nil = 1 :: 2 :: 3 :: Nil // 결과 : List(1, 2, 3)

  /*리스트 끝에 Nil이 필요로 하는 이유는 :: 메소드가 List 클래스의 메버이기 때문*/
  /*만약 없다면*/

//  val non_use_Nil = 1 :: 2 :: 3 // Int로 지정안했다고 오류뜸.

}
