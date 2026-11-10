## 옵저버(Observer) 패턴
- 다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴
- 발행(publish) - 구독(subscribe) 패턴을 구현할 수 있음


### 장단점
- 장점
  - 상태를 변경하는 객체(publisher)와 변경을 감지하는 객체(subscriber)의 관계를 느슨하게 유지할 수 있음
  - Subject의 상태 변경을 주기적으로 조회하지 않고 자동으로 감지할 수 있음
  - 런타임에 옵저버를 추가하거나 제거할 수 있음
- 단점
  - 복잡도가 증가함
  - 다수의 Observer 객체를 등록 이후 해지하지 않는다면 memory leak이 발생할 수 있음
  - subscriber를 담아놓는 메모리 객체(예제의 Map)는 gc의 대상이 되지 않기 때문에 주의해야함(WeakReference도 있지만 명시적인 해지가 최선의 방법)


### 실무에서는 어떻게 쓰이나?
- 자바
  - Observer, Observable : Java 9 버전 이후 Deprecated 되었기 때문에 권장하지 않음
  - PropertyChangeListener, PropertyChangeEvent, PropertyChangeSupport 
  - Flow : Publisher, Subscriber, Subscribe 를 활용하여 동기 or 비동기적으로 옵저버 패턴 구현 가능
- 스프링
  - ApplicationContext : EventPublisher 역할을 하고 임의의 Event 를 수신하는 Subscriber 를 통해 Event 수신이 가능(옵저버 패턴) 