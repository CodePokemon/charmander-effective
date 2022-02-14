package chapter2.item1.book;

public class BeforeBook {
  private String title;
  private String author;

  public BeforeBook(String title) {
    this.title = title;
  }
  /*  [ERROR] 생성자 시그니쳐가 동일해 title과 author를 개별로 받는 생성자를 만들 수 없다.    */
  //  public BeforeBook(String author) {
  //    this.author = author;
  //  }

  /** 생성자 오버로딩이 불가능 하다면 static factory method pattern을 사용하여 수정해보자. => AfterBook 클래스로 이동 */

  /* getter */
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
}
