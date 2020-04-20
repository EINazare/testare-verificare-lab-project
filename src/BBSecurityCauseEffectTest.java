import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityCauseEffectTest {
  /*
  * * Start c) cause-effect graphing
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
  * * Stop c) cause-effect graphing
  */
}
