package chapter2.item1.book;

public class AfterBook {
  private String title;
  private String author;

  private AfterBook(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public static AfterBook createBookSetTitle(String title) {
    return new AfterBook(title, "");
  }

  public static AfterBook createBookSetAuthor(String author) {
    return new AfterBook("", author);
  }

  /* getter */
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
}
