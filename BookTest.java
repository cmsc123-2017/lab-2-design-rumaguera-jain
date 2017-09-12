import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class BookTest extends TestCase {
 
  public void testSameAuthorSame() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book time = new Book(hawking, "A Brief History of Time", 1988);
    Book stone = new Book(rowling, "The Philosophers's Stone",  1997);
    
    assertEquals(false, time.sameAuthor(stone));
  }
  
  public void testSameAuthorNotSame() {
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book stone = new Book(rowling, "The Philosophers's Stone", 1997);
    Book secrets = new Book(rowling, "The Chamber of Secrets", 1998);
    
    assertEquals(true, secrets.sameAuthor(stone));
  }
  
  public void testPublishedBefore() {
    
    Author rowling = new Author("J.K. Rowling", "F");
    Author yoon = new Author("Nicola Yoon", "F");
    Author mafi = new Author("Tahereh Mafi", "F");
    Author tolkien = new Author("JRR Tolkien", "M");
    Author riggs = new Author("Ransom Riggs", "M");
    
    Book stone = new Book(rowling, "The Philosophers's Stone", 1997);
    Book secrets = new Book(rowling, "The Chamber of Secrets", 1998);
    Book sun = new Book(yoon, "The Sun is Also a Star", 2005);
    Book ignite = new Book(mafi, "Ignite Me", 2005);
    Book hobbit = new Book(tolkien, "The Hobbit", 2001);
    Book peculiar = new Book(riggs, "Miss Peregrine's Home for Peculiar Children", 2003);
    
    assertEquals(true, secrets.publishedBefore(stone));
    assertEquals(false, sun.publishedBefore(ignite));
    assertEquals(false, hobbit.publishedBefore(peculiar));
    assertEquals(true, sun.publishedBefore(peculiar));
    assertEquals(false, hobbit.publishedBefore(ignite));
    
  }
}
