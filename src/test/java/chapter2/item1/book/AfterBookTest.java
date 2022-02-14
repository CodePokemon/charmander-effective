package chapter2.item1.book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterBookTest {
  @Test
  @DisplayName("title만 설정한 AfterBook")
  void createBookSetTitle() {
    // given
    final String expectedTitle = "Effective Java";
    final String expectedAuthor = "";
    AfterBook bookSetTitle = AfterBook.createBookSetTitle(expectedTitle);

    // when
    String title = bookSetTitle.getTitle();
    String author = bookSetTitle.getAuthor();

    // then
    assertEquals(expectedTitle, title);
    assertEquals(expectedAuthor, author);
  }

  @Test
  @DisplayName("author만 설정한 AfterBook 객체")
  void createBookSetAuthor() {
    // given
    final String expectedTitle = "";
    final String expectedAuthor = "Joshua Bloch";
    AfterBook bookSetTitle = AfterBook.createBookSetAuthor(expectedAuthor);

    // when
    String title = bookSetTitle.getTitle();
    String author = bookSetTitle.getAuthor();

    // then
    assertEquals(expectedTitle, title);
    assertEquals(expectedAuthor, author);
  }
}
