import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityEquivalenceTest {
  static {
    CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.ping();
  }

  /*
  * * Start a) equivalence partitioning
  */
  @Test
  public void test1a1(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[1]++;
    String[] args = {"2","0","100","60","100","20","100","50","100"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[2]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("49.44 - da\n50.00 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[3]++;
  }
  @Test
  public void test1a2(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[4]++;
    String[] args = {};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[5]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[6]++;
  }
  @Test
  public void test1a3(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[7]++;
    String[] args = {"0.5"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[8]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[9]++;
  }
  @Test
  public void test1a4(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[10]++;
    String[] args = {"100001.7"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[11]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[12]++;
  }
  @Test
  public void test1a5(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[13]++;
    String[] args = {"17","1000001.9"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[14]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[15]++;
  }
  @Test
  public void test1a6(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[16]++;
    String[] args = {"3","13","1111333.8"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[17]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[18]++;
  }
  @Test
  public void test1a7(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[19]++;
    String[] args = {"1","0","893","2123456.1"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[20]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[21]++;
  }
  @Test
  public void test1a8(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[22]++;
    String[] args = {"2","30","1234","40","3321123.5"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[23]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[24]++;
  }
  @Test
  public void test1a9(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[25]++;
    String[] args = {"2","30","1234","40","43","4000987.9"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[26]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[27]++;
  }
  @Test
  public void test1a10(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[28]++;
    String[] args = {"2","30","1234","40","43","40"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[29]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl.statements[30]++;
  }
  /*
  * * Stop a) equivalence partitioning
  */
}

class CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "690f9553-dc29-4900-a0e3-d52b2d249aee").addObservedContainer(new CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl ());
  }
    public static long[] statements = new long[31];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$16bok4tmm8h3fj13dnl4ujt93jlm43jqosaeyfxyf19hvfl () {
    super("BBSecurityEquivalenceTest.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 30; i++) {
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
    log.startNamedSection("BBSecurityEquivalenceTest.java");
      for (int i = 1; i <= 30; i++) {
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

