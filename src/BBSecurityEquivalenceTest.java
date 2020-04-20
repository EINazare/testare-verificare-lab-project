import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityEquivalenceTest {
  /*
  * * Start a) equivalence partitioning
  */
  @Test
  public void test1a1(){
    String[] args = {"2","0","100","60","100","20","100","50","100"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("49.44 - da\n50.00 - da", bbs.getResultOutput());
  }
  @Test
  public void test1a2(){
    String[] args = {};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a3(){
    String[] args = {"0.5"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a4(){
    String[] args = {"100001.7"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a5(){
    String[] args = {"17","1000001.9"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a6(){
    String[] args = {"3","13","1111333.8"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a7(){
    String[] args = {"1","0","893","2123456.1"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a8(){
    String[] args = {"2","30","1234","40","3321123.5"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a9(){
    String[] args = {"2","30","1234","40","43","4000987.9"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1a10(){
    String[] args = {"2","30","1234","40","43","40"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  /*
  * * Stop a) equivalence partitioning
  */
}
