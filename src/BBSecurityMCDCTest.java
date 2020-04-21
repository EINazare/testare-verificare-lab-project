import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityMCDCTest {
  @Test
  public void test1(){
    String[] args = {"1","0","1000000","60","90","36"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da", bbs.getResultOutput());
  }
  @Test
  public void test2(){
    String[] args = {"2","0","1000000","60","90","36","60","90","36"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da\n77.19 - da", bbs.getResultOutput());
  }
  @Test
  public void test3(){
    String[] args = {"1","0","10","60","90","60"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("90.00 - nu", bbs.getResultOutput());
  }
  @Test
  public void test4(){
    String[] args = {};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test5(){
    String[] args = {"13","0","10","60","90","60"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test6(){
    String[] args = {"-1"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test7(){
    String[] args = {"1","1000013"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test8(){
    String[] args = {"1","1","1000013"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test9(){
    String[] args = {"1","1","10000","-1","13","13"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test10(){
    String[] args = {"1","1","10000","1","-13","13"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
  @Test
  public void test11(){
    String[] args = {"1","1","10000","1","13","-13"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
  }
}
