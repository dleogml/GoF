## 이터레이터(Iterator) 패턴
- 집합 객체 내부 구조를 노출시키지 않고 순회 하는 방법을 제공하는 패턴
- 집합 객체를 순회하는 클라이언트 코드를 변경하지 않고 다양한 순회 방법을 제공할 수 있음


### 장단점
- 장점
  - 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있음
  - 일관된 인터페이스를 사용해 여러 형태의 집합 구조를 순회할 수 있음
- 단점
  - 클래스가 늘어나고 복잡도가 증가함 

### 실무에서는 어떻게 쓰이나?
- 자바
  - java.util.Enumeration 과 java.util.Iterator 에 사용됨
  - Java StAX(Streaming API for XML)의 Iterator 기반 API 이 있음
    - XmlEventReader, XmlEventWriter
- 스프링
  - CompositeIterator 가 대표적인 예시 