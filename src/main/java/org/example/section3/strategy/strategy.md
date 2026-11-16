## 전략(Strategy) 패턴
- 여러 알고리즘을 캡슐화하고 상호 교환 가능하게 만드는 패턴
- 컨텍스트에서 사용할 알고리즘을 클라이언트가 선택함 


### 장단점
- 장점
  - 새로운 전략을 추가하더라도 기존 코드를 변경하지 않음(가장 큰 장점, OCP)
  - 상속 대신 위임을 사용할 수 있음
  - 런타임에 전략을 변경할 수 있음
- 단점
  - 복잡도가 증가함
  - 클라이언트 코드가 구체적인 전략을 알아야 함 



### 실무에서는 어떻게 쓰이나?
- 자바
  - Comparator 가 매우 대표적인 전략 패턴의 예 
- 스프링
  - 매우 많은 예시가 있으나 가장 대표적인 것들로는 ApplicationContext, BeanDefinitionParser, PlatformTransactionManager, CacheManager 가 있음