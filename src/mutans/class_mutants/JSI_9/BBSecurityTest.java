import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityTest {
  /*
  * * Start a) equivalence partitioning
  */
  @Test
  public void test1a1(){
    String[] args1 = {"2","0","100","60","100","20","100","50","100"};
    String[] args2 = {"1","0","100","60","100","20"};
    BBSecurity bbs1 = new BBSecurity(args1);
    BBSecurity bbs2 = new BBSecurity(args2);
    assertEquals("49.44 - da\n50.00 - da", bbs1.getResultOutput());
    assertEquals("49.44 - da", bbs2.getResultOutput());
    assertEquals("49.44 - da\n50.00 - da", bbs1.getResultOutput());
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
  /*
  * * Start b) cause-effect graphing
  */
  @Test
  public void test1c1(){
    String[] args = {"1","0","1000000","60","90","36"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da", bbs.getResultOutput());
  }
  @Test
  public void test1c2(){
    String[] args = {"1","0","1000000","43","86","33"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("95.23 - da", bbs.getResultOutput());
  }
  @Test
  public void test1c3(){
    String[] args = {"1","0","100000","123","756","123"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("756.00 - da", bbs.getResultOutput());
  }
  @Test
  public void test1c4(){
    String[] args = {"1","0","10","60","90","36"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - nu", bbs.getResultOutput());
  }
  @Test
  public void test1c5(){
    String[] args = {"1","0","10","43","86","33"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("95.23 - nu", bbs.getResultOutput());
  }
  @Test
  public void test1c6(){
    String[] args = {"1","0","10","123","756","123"};
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("756.00 - nu", bbs.getResultOutput());
  }
  /*
  * * Stop b) cause-effect graphing
  */
}
