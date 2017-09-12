import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ExamGradesTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCreateExamGrades() {
    double grades[] = new double[10];
    
    for (int i = 0; i < 10; i++) {
      grades[i] = 100 - i;
    }
    
    ExamGrades g = new ExamGrades(grades);
    
    assertEquals(100.0, g.grades[0]);
    assertEquals(91.0, g.grades[9]);
  }
  
    public void testHighestGrade(){
      
      double grades[] = new double[10];
    
      for (int i = 0; i < 10; i++) {
        grades[i] = 100 - i;
      }
    
      ExamGrades g = new ExamGrades(grades);
      assertEquals(100.0, g.highestGrade());
     
      double grades2[] = {72.0, 75.0, 83.0};
      ExamGrades g2 = new ExamGrades(grades2);
      assertEquals(83.0, g2.highestGrade());
      
      double grades3[] = {100.0};
      ExamGrades g3 = new ExamGrades(grades3);
      assertEquals(100.0, g3.highestGrade());
      
      double grades4[] = {72.0, 75.0, 75.0};
      ExamGrades g4 = new ExamGrades(grades4);
      assertEquals(75.0, g4.highestGrade());
      
      double grades5[] = {80.0, 80.0, 80.0, 81.0};
      ExamGrades g5 = new ExamGrades(grades5);
      assertEquals(81.0, g5.highestGrade());
        
      double grades6[] = {70.0, 70.0, 70.0, 70.0};
      ExamGrades g6 = new ExamGrades(grades6);
      assertEquals(70.0, g6.highestGrade());
      
      double grades7[] = {70.1, 70.2, 70.3, 70.4};
      ExamGrades g7 = new ExamGrades(grades7);
      assertEquals(70.4, g7.highestGrade());
      
      double grades8[] = {75.0, 74.0, 73.0};
      ExamGrades g8 = new ExamGrades(grades8);
      assertEquals(75.0, g8.highestGrade());
      
  }

  
}
