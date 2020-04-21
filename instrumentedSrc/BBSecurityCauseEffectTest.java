import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityCauseEffectTest {
  static {
    CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.ping();
  }

  /*
  * * Start c) cause-effect graphing
  */
  @Test
  public void test1c1(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[1]++;
    String[] args = {"1","0","1000000","60","90","36"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[2]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[3]++;
  }
  @Test
  public void test1c2(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[4]++;
    String[] args = {"1","0","1000000","43","86","33"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[5]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("95.23 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[6]++;
  }
  @Test
  public void test1c3(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[7]++;
    String[] args = {"1","0","100000","123","756","123"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[8]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("756.00 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[9]++;
  }
  @Test
  public void test1c4(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[10]++;
    String[] args = {"1","0","10","60","90","36"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[11]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - nu", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[12]++;
  }
  @Test
  public void test1c5(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[13]++;
    String[] args = {"1","0","10","43","86","33"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[14]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("95.23 - nu", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[15]++;
  }
  @Test
  public void test1c6(){
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[16]++;
    String[] args = {"1","0","10","123","756","123"};
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[17]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("756.00 - nu", bbs.getResultOutput());
CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5.statements[18]++;
  }
  /*
  * * Stop c) cause-effect graphing
  */
}

class CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "18eadd55-81be-48f7-8e53-ec6f31db70fe").addObservedContainer(new CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5 ());
  }
    public static long[] statements = new long[19];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$16bok4tmm8h3fj13dewwcj1pk9j3oou2yhgqt06ttqk5un5 () {
    super("BBSecurityCauseEffectTest.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 18; i++) {
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
    log.startNamedSection("BBSecurityCauseEffectTest.java");
      for (int i = 1; i <= 18; i++) {
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

