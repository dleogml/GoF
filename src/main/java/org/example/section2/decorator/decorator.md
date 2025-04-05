## 데코레이터(Decorator) 패턴
- 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴
- 상속이 아닌 위임을 사용해서 보다 유연하게(런타임에) 부가 기능을 추가하는 것도 가능하다


### 장단점
- 장점
  - 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다
  - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다
- 단점
  - 데코레이터를 조합하는 코드가 복잡할 수 있다

### 실무에서는 어떻게 쓰이나?
- Adapter 패턴에서 FileInputStream, InputStreamReader, BufferedReader도 목적에 따라 Decorator 패턴으로 볼 수 있다
- Java의 Collections이 제공하는 checkedList, unmodifiableList과 HttpServletRequestWrapper, HttpServletResponseWrapper 이 대표적인 예시이다
- Spring의 BeanDefinitionDecorator이 있고 WebFlux에서 사용하는 ServerHttpRequestDecorator, ServerHttpResponseDecorator 역시 데코레이터 패턴으로 구성되어 있다