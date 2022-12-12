# Hello World

스칼라는 자바와 동일하게 프로그램을 실행하기 위한 진입점으로 `main()`함수를 구해야 합니다.
`main()`함수를 구현하는 방법은 두 가지가 있는데,
1. 싱글톤 객체(object)로 구현
2. 싱글톤 객체(object)가 App trait 상속.
이 있습니다. 두 번째 방법의 App trait 내부적으로 `main()`함수를 구현해 주기 때문에, 첫번째 방법과 동작 방식의 차이는 없습니다.

```scala
// main 함수를 생성App 을 상속하여 실행하는 방법 
object S01_HelloWorldObject {
  def main(args: Array[String]): Unit = {
    println("Hello World main")
  }
}
```

