## 팩토리 메서드(Factory Method) 패턴
- 구체적으로 어떤 인스턴스를 만들지느 서브 클래스가 정한다
- 다양한 구현체(Product)가 있고, 그 중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator)를 제공할 수 있다.

### 팩토리 메서드의 장단점
- 장점: 기존코드를 건들이지 않고 확장이 가능하다
- 단점: 역할을 나눔으로서 클래스숫자가 증가함

### 실무에서는 어떻게 쓰이나?
- 단순한 팩토리 패턴
  - 매개변수의 값에 따라 또는 메서드에 따라 각기 다른 인스턴스를 리턴하는 단순한 버전의 팩토리 패턴
  - java.lang.Calendar 또는 java.lang.NumberFormat
- 스프링 BeanFactory
  - Object 타입의 Product를 만드는 BeanFactory라는 Creator

