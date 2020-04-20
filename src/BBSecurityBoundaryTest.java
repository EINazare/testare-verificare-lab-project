import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityBoundaryTest {
  /*
  * * Start b) boundary value analysis
  */
  @Test
  public void test1b1(){
    String[] args = {"3","0","1000000","60","90","36","73","133","13","11","100","11"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da\n36.80 - da\n100.00 - da", bbs.getResultOutput());
  }
  @Test
  public void test1b2(){
    String[] args = {"0"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b3(){
    String[] args = {"100001"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b4(){
    String[] args = {"1","-1"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b5(){
    String[] args = {"1","1000001"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b6(){
    String[] args = {"1","1","-1"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b7(){
    String[] args = {"1","1","1000001"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b8(){
    String[] args = {"1","1","10000","-1"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b9(){
    String[] args = {"1","1","10000","1234567"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b10(){
    String[] args = {"1","1","10000","12","-1"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b11(){
    String[] args = {"1","1","10000","12","9879345"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b12(){
    String[] args = {"1","1","10000","45","600","-19"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test1b13(){
    String[] args = {"1","1","10000","45","600","1234987"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  /*
  * * Stop b) boundary value analysis
  */
}
