## 퍼사드(Facade) 패턴
- 복잡한 서브 시스템 의존성을 최소화하는 방법
- 클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할 수 있다

### 장단점
- 장점
  - 서브 시스템에 대한 의존성을 한곳으로 모을 수 있다
- 단점
  - 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다

### 실무에서는 어떻게 쓰이나?
- Spring의 JavaMailSenderImpl와 MailSender
- Spring의 PlatformTransactionManager와 JdbcTransactionManager