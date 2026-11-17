## 방문자(Visitor) 패턴
- 기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법 
- 더블 디스패치 (Double Dispatch)를 활용할 수 있음
  - Element 의 accept 메서드와 Visitor 의 visit 메서드를 통해 두번의 디스패치 일어나게 됨 


### 장단점
- 장점
  - 기존 코드를 수정하지 않고 새로운 기능을 추가할 수 있음(Visitor)
- 단점
  - 사용구조가 복잡함 
  - Element 의 추가/삭제시에는 많은 변경을 필요로 하게 됨 



### 실무에서는 어떻게 쓰이나?
- 자바 
  - FileVisitor, SimpleFileVisitor
  - AnnotationValueVisitor
  - ElementVisitor
- 스프링
  - BeanDefinitionVisitor