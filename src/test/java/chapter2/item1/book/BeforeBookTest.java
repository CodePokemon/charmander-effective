package chapter2.item1.book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeforeBookTest {
  @Test
  @DisplayName("title만 설정한 BeforeBook 객체 테스트")
  void createBookSetTitle() {
    // given
    final String expectedTitle = "Effective Java";
    final String expectedAuthor = null;
    BeforeBook bookSetTitle = new BeforeBook(expectedTitle);

    // when
    String title = bookSetTitle.getTitle();
    String author = bookSetTitle.getAuthor();

    // then
    assertEquals(expectedTitle, title);
    assertEquals(expectedAuthor, author);
  }

  @Test
  @DisplayName("author만 설정한 BeforeBook 객체 테스트")
  void createBookSetAuthor() {
    // given
    final String expectedTitle = null;
    final String expectedAuthor = "Joshua Bloch";
    BeforeBook bookSetTitle = new BeforeBook(expectedAuthor); // author를 설정할 수 있는 방법이 없다.

    // when
    String title = bookSetTitle.getTitle();
    String author = bookSetTitle.getAuthor();

    // then
    assertNotEquals(expectedTitle, title);
    assertNotEquals(expectedAuthor, author);
  }
}
