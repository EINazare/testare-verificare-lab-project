import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BBSecurityTest {
  static {
    CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.ping();
  }

  /*
  * * Start a) equivalence partitioning
  */
  @Test
  public void test1a1(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[1]++;
    String[] args = {"2","0","100","60","100","20","100","50","100"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[2]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("49.44 - da\n50.00 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[3]++;
  }
  @Test
  public void test1a2(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[4]++;
    String[] args = {};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[5]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[6]++;
  }
  @Test
  public void test1a3(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[7]++;
    String[] args = {"0.5"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[8]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[9]++;
  }
  @Test
  public void test1a4(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[10]++;
    String[] args = {"100001.7"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[11]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[12]++;
  }
  @Test
  public void test1a5(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[13]++;
    String[] args = {"17","1000001.9"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[14]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[15]++;
  }
  @Test
  public void test1a6(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[16]++;
    String[] args = {"3","13","1111333.8"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[17]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[18]++;
  }
  @Test
  public void test1a7(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[19]++;
    String[] args = {"1","0","893","2123456.1"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[20]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[21]++;
  }
  @Test
  public void test1a8(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[22]++;
    String[] args = {"2","30","1234","40","3321123.5"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[23]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[24]++;
  }
  @Test
  public void test1a9(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[25]++;
    String[] args = {"2","30","1234","40","43","4000987.9"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[26]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[27]++;
  }
  @Test
  public void test1a10(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[28]++;
    String[] args = {"2","30","1234","40","43","40"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[29]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[30]++;
  }
  /*
  * * Stop a) equivalence partitioning
  */
  /*
  * * Start b) boundary value analysis
  */
  @Test
  public void test1b1(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[31]++;
    String[] args = {"3","0","1000000","60","90","36","73","133","13","11","100","11"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[32]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da\n36.80 - da\n100.00 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[33]++;
  }
  @Test
  public void test1b2(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[34]++;
    String[] args = {"0"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[35]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[36]++;
  }
  @Test
  public void test1b3(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[37]++;
    String[] args = {"100001"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[38]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[39]++;
  }
  @Test
  public void test1b4(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[40]++;
    String[] args = {"1","-1"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[41]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[42]++;
  }
  @Test
  public void test1b5(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[43]++;
    String[] args = {"1","1000001"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[44]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[45]++;
  }
  @Test
  public void test1b6(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[46]++;
    String[] args = {"1","1","-1"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[47]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[48]++;
  }
  @Test
  public void test1b7(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[49]++;
    String[] args = {"1","1","1000001"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[50]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[51]++;
  }
  @Test
  public void test1b8(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[52]++;
    String[] args = {"1","1","10000","-1"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[53]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[54]++;
  }
  @Test
  public void test1b9(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[55]++;
    String[] args = {"1","1","10000","1234567"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[56]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[57]++;
  }
  @Test
  public void test1b10(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[58]++;
    String[] args = {"1","1","10000","12","-1"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[59]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[60]++;
  }
  @Test
  public void test1b11(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[61]++;
    String[] args = {"1","1","10000","12","9879345"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[62]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[63]++;
  }
  @Test
  public void test1b12(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[64]++;
    String[] args = {"1","1","10000","45","600","-19"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[65]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[66]++;
  }
  @Test
  public void test1b13(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[67]++;
    String[] args = {"1","1","10000","45","600","1234987"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[68]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("Invalid input", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[69]++;
  }
  /*
  * * Stop b) boundary value analysis
  */
  /*
  * * Start b) cause-effect graphing
  */
  @Test
  public void test1c1(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[70]++;
    String[] args = {"1","0","1000000","60","90","36"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[71]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[72]++;
  }
  @Test
  public void test1c2(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[73]++;
    String[] args = {"1","0","1000000","43","86","33"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[74]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("95.23 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[75]++;
  }
  @Test
  public void test1c3(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[76]++;
    String[] args = {"1","0","100000","123","756","123"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[77]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("756.00 - da", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[78]++;
  }
  @Test
  public void test1c4(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[79]++;
    String[] args = {"1","0","10","60","90","36"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[80]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("77.19 - nu", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[81]++;
  }
  @Test
  public void test1c5(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[82]++;
    String[] args = {"1","0","10","43","86","33"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[83]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("95.23 - nu", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[84]++;
  }
  @Test
  public void test1c6(){
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[85]++;
    String[] args = {"1","0","10","123","756","123"};
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[86]++;
    BBSecurity bbs = new BBSecurity(args);
    assertEquals("756.00 - nu", bbs.getResultOutput());
CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt.statements[87]++;
  }
  /*
  * * Stop b) cause-effect graphing
  */
}

class CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "690f9553-dc29-4900-a0e3-d52b2d249aee").addObservedContainer(new CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt ());
  }
    public static long[] statements = new long[88];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$136ktux9k5oixri2uzvizr1svwbwpt () {
    super("BBSecurityTest.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 87; i++) {
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
    log.startNamedSection("BBSecurityTest.java");
      for (int i = 1; i <= 87; i++) {
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

