import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityBoundaryTest {
  static {
    CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.ping();
  }

  /*
  * * Start b) boundary value analysis
  */
  @Test
  public void test1b1(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[1]++;
    String[] args = {"3","0","1000000","60","90","36","73","133","13","11","100","11"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[2]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da\n36.80 - da\n100.00 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[3]++;
  }
  @Test
  public void test1b2(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[4]++;
    String[] args = {"0"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[5]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[6]++;
  }
  @Test
  public void test1b3(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[7]++;
    String[] args = {"100001"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[8]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[9]++;
  }
  @Test
  public void test1b4(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[10]++;
    String[] args = {"1","-1"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[11]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[12]++;
  }
  @Test
  public void test1b5(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[13]++;
    String[] args = {"1","1000001"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[14]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[15]++;
  }
  @Test
  public void test1b6(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[16]++;
    String[] args = {"1","1","-1"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[17]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[18]++;
  }
  @Test
  public void test1b7(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[19]++;
    String[] args = {"1","1","1000001"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[20]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[21]++;
  }
  @Test
  public void test1b8(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[22]++;
    String[] args = {"1","1","10000","-1"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[23]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[24]++;
  }
  @Test
  public void test1b9(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[25]++;
    String[] args = {"1","1","10000","1234567"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[26]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[27]++;
  }
  @Test
  public void test1b10(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[28]++;
    String[] args = {"1","1","10000","12","-1"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[29]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[30]++;
  }
  @Test
  public void test1b11(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[31]++;
    String[] args = {"1","1","10000","12","9879345"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[32]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[33]++;
  }
  @Test
  public void test1b12(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[34]++;
    String[] args = {"1","1","10000","45","600","-19"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[35]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[36]++;
  }
  @Test
  public void test1b13(){
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[37]++;
    String[] args = {"1","1","10000","45","600","1234987"};
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[38]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881.statements[39]++;
  }
  /*
  * * Stop b) boundary value analysis
  */
}

class CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "690f9553-dc29-4900-a0e3-d52b2d249aee").addObservedContainer(new CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881 ());
  }
    public static long[] statements = new long[40];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$48jg6oue9t8lhppaofcddl1nupnj2529m4a0yjv881 () {
    super("BBSecurityBoundaryTest.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 39; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("BBSecurityBoundaryTest.java");
      for (int i = 1; i <= 39; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= -1; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
  }
}

