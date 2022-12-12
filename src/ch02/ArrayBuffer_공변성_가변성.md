# ArrayBuffer, vetor,  공변성 가변성

## ArrayBuffer

### 스칼라에는 자바의 java.util.ArrayList 가 없다.
대신 ArrayBuffer 가 있다. `mutable`속성을 지녔다.
또한 ListBuffer 는 LinkedList 역할이다.

### ArrayList 와 동등한 스칼라의 컬렉션은 무엇인가?

#### 스칼라의 디폴트 컬렉션
스칼라에서 자바의 `List` 인터페이스와 동등한 것은 `Seq`
스칼라는 사용자에게 `Seq` 를 팩토리로서 사용할 수 있게 함, 특정 구현을 하도록 강제 하지 않음.  
그 결과 스칼라의 리스트나 벡터를 선택할 수 있게 되었음. 둘 다 변경 불가능.  
벡터는 `index` 접근 시 좋은 성능을 보여줌. 리스트도 벡터가 갖지 못한 고유의 장점을 갖고 있음.


#### 어떤 스칼라 컬렉션이 자바의 ArrayList 와 비슷할까?

`scala.collection.mutable.ArrayBuffer`, mutable 하다.  
`scala.collection.immutable.Vetor`, immutable 하다.



