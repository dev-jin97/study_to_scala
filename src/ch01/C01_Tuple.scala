package ch01

object C01_Tuple extends App {
  // Tuple
  /*
  1. 리스트와 마찬가지로 변경 불가능
  2. 리스트와 다른 점은 다른 타입의 원소를 넣을 수 있다는 점
  3. 메소드에서 여러 다양한 객체를 리턴해야 하는 경우 유용.
  */

  // Tuple 생성
  // 튜플의 타입은 원소의 개수와 각각의 타입에 따라 달라짐 (22개 까지 지원해줌.)
  val tuple1 = (99, "High") // 객체들을 콤마로 구분하여 () 사이에 넣어주면 됨.

  // 원소의 접근
  println(tuple1._1) // 첫번째 값에 접근 가능 ** 튜플은 index 0 이 아닌 1부터 시작한다.

  // 왜 튜플은 apply() 메소드를 할 수 없을까.
  // 리스트이 apply 메소드는 항상 동일한 타입의 객체를 반환하는 반면, 튜플의 각 원소들은 각기 다를 수 있기 때문.

}
