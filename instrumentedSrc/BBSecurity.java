/*
* * Problem: https://www.pbinfo.ro/probleme/2751/bbsecurity
*
* * !Atentie: Cerinta originala s-a modificat!
*
*
*
* * Enunt:
* Domnul X lucrează la BB Security ca paznic.
* Deoarece în România sunt foarte puțini hoți, acesta s-a gândit într-o zi să calculeze distanța dintre fiecare doi stâlpi de îngrădire din instituția pe care o păzește. Fiecare doi stâlpi de îngrădire sunt legați printr-un cablu rezistent, care, de obicei nu stă întins la maximum.
* Din cauză ca în instituție se găsesc mulți stâlpi, domnul X vă provoacă pe voi să calculați ce și-a propus el.
*
*
* * Cerinta:
* Se dă un număr n, un interval (a,b) și n triplete de forma l, c, h, reprezentând lungimea egala a doi stâlpi, lungimea cablului dintre acestea și înălțimea la care atârnă cablul față de podea.
* Se cere să se afle distanța dintre fiecare doi stâlpi care se afla in intervalul (a,b).
* Fiecare rezultat va fi afișat pe cate un rând nou.
*
*
* * Date de intrare:
* Programul citește de la tastatură un număr n, doua numere a si b, și apoi n triplete de forma l, c, h, cu semnificația de mai sus.
*
*
* * Date de iesire:
* Programul va afișa pe linia n a ecranului un număr de forma x care reprezintă lungimea dintre cei doi stâlpi, corespunzătoare datelor de pe linia n+1 din consola de citire, cu exact două zecimale, indiferent de caz, rotunjind a doua zecimală în comparație cu cea de-a treia, sau, dacă a doua zecimală este 5, zecimala a doua va crește cu o unitate doar dacă există încă una sau mai multe zecimale după cea de-a treia și măcar una din ele este > 0 (vezi Restricții). Alaturi de numarul x se va afisa si un mesaj daca acest numar se afla sau nu in intervalul (a,b).
*
*
* * Restricții și precizări:
* 1 ≤ n ≤ 100.000;
* a, b si cele n numere citite vor fi mai mici decât 1.000.000;
* n, l, c, h, a, b sunt numere naturale;
* este garantat că pentru orice triplet citit există un număr 0 ≤ x ≤ c;
* cea de-a doua zecimala se rotunjește de obicei după cea de-a treia (ex. 49.4376 se va afișa ca 49.44);
* ∀ a| a ∈ ℕ, acesta se va afișa ca a.00 (ex. 50 se va afișa ca 50.00);
* Atenție! 23.455 = 23.45 , 23.45501 = 23.46.
*
*
*
*
*
*
* Testing commands:
* javac BBSecurity.java BBSecurityTest.java && junit BBSecurityTest
*/

import java.lang.Math.*;
import java.util.*;

class BBSecurity
{
  static {
    CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.ping();
  }

  private int n;
  private double a;
  private double b;
  List<Double> l;
  List<Double> c;
  List<Double> h;
  List<Double> result;
  List<String> resultInInterval;
  private String resultOutput;
  public BBSecurity (String args[]){
    resultOutput = "";
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[1]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[2]++;
int CodeCoverConditionCoverageHelper_C1;
    if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((args.length < 3) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[1]++;
      resultOutput = "Invalid input";
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[3]++;

    } else {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[2]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[4]++;
      boolean validA = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[5]++;
      boolean validB = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[6]++;
      boolean validN = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[7]++;
boolean CodeCoverTryBranchHelper_Try1 = false;
      try {
CodeCoverTryBranchHelper_Try1 = true;
        n = Integer.parseInt(args[0]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[8]++;
      } catch(Exception e){
CodeCoverTryBranchHelper_Try1 = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[4]++;
        validN = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[9]++;
      } finally {
    if ( CodeCoverTryBranchHelper_Try1 ) {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[3]++;
}
  }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[10]++;
boolean CodeCoverTryBranchHelper_Try2 = false;
      try {
CodeCoverTryBranchHelper_Try2 = true;
        a = Integer.parseInt(args[1]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[11]++;
        a = Double.parseDouble(args[1]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[12]++;
      } catch(Exception e){
CodeCoverTryBranchHelper_Try2 = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[6]++;
        validA = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[13]++;
      } finally {
    if ( CodeCoverTryBranchHelper_Try2 ) {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[5]++;
}
  }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[14]++;
boolean CodeCoverTryBranchHelper_Try3 = false;
      try {
CodeCoverTryBranchHelper_Try3 = true;
        b = Integer.parseInt(args[2]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[15]++;
        b = Double.parseDouble(args[2]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[16]++;
      } catch(Exception e){
CodeCoverTryBranchHelper_Try3 = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[8]++;
        validB = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[17]++;
      } finally {
    if ( CodeCoverTryBranchHelper_Try3 ) {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[7]++;
}
  }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[18]++;
int CodeCoverConditionCoverageHelper_C2;
      if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (32)) == 0 || true) &&
 ((validN) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (16)) == 0 || true)))
 && (
(((CodeCoverConditionCoverageHelper_C2 |= (8)) == 0 || true) &&
 ((n<1) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((n > 100000) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[9]++;
        validN = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[19]++;

      } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[10]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[20]++;
int CodeCoverConditionCoverageHelper_C3;
      if((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (32)) == 0 || true) &&
 ((validA) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (16)) == 0 || true)))
 && (
(((CodeCoverConditionCoverageHelper_C3 |= (8)) == 0 || true) &&
 ((a<0) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((a > 1000000) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[11]++;
        validA = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[21]++;

      } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[12]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[22]++;
int CodeCoverConditionCoverageHelper_C4;
      if((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (32)) == 0 || true) &&
 ((validB) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (16)) == 0 || true)))
 && (
(((CodeCoverConditionCoverageHelper_C4 |= (8)) == 0 || true) &&
 ((b<0) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((b > 1000000) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[13]++;
        validB = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[23]++;

      } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[14]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[24]++;
int CodeCoverConditionCoverageHelper_C5;
      if((((((CodeCoverConditionCoverageHelper_C5 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C5 |= (128)) == 0 || true) &&
 ((args.length < 3 * n + 3) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (64)) == 0 || true)))
 || !
(((CodeCoverConditionCoverageHelper_C5 |= (32)) == 0 || true) &&
 ((validA) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (16)) == 0 || true)))
 || !
(((CodeCoverConditionCoverageHelper_C5 |= (8)) == 0 || true) &&
 ((validB) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (4)) == 0 || true)))
 || !
(((CodeCoverConditionCoverageHelper_C5 |= (2)) == 0 || true) &&
 ((validN) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 4) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 4) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[15]++;
        resultOutput = "Invalid input";
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[25]++;

      } else {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[16]++;
        l = new ArrayList<Double>();
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[26]++;
        c = new ArrayList<Double>();
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[27]++;
        h = new ArrayList<Double>();
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[28]++;
        result = new ArrayList<Double>();
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[29]++;
        resultInInterval = new ArrayList<String>();
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[30]++;
        double res;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[31]++;
        double lArgs = -1;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[32]++;
        double cArgs = -1;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[33]++;
        double hArgs = -1;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[34]++;
        boolean validL = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[35]++;
        boolean validC = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[36]++;
        boolean validH = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[37]++;
byte CodeCoverTryBranchHelper_L1 = 0;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[1]++;


int CodeCoverConditionCoverageHelper_C6;
        for(int i = 0 ;(((((CodeCoverConditionCoverageHelper_C6 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C6 |= (2)) == 0 || true) &&
 ((i < 3 * n) && 
  ((CodeCoverConditionCoverageHelper_C6 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) && false) ; i = i + 3){
if (CodeCoverTryBranchHelper_L1 == 0) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[1]--;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[2]++;
} else if (CodeCoverTryBranchHelper_L1 == 1) {
  CodeCoverTryBranchHelper_L1++;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[2]--;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[3]++;
}
          validL = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[38]++;
          validC = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[39]++;
          validH = true;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[40]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[41]++;
boolean CodeCoverTryBranchHelper_Try4 = false;
          try {
CodeCoverTryBranchHelper_Try4 = true;
            lArgs = Integer.parseInt(args[i + 3]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[42]++;
            lArgs = Double.parseDouble(args[i + 3]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[43]++;
          } catch(Exception e){
CodeCoverTryBranchHelper_Try4 = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[18]++;
            validL = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[44]++;
          } finally {
    if ( CodeCoverTryBranchHelper_Try4 ) {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[17]++;
}
  }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[45]++;
boolean CodeCoverTryBranchHelper_Try5 = false;
          try {
CodeCoverTryBranchHelper_Try5 = true;
            cArgs = Integer.parseInt(args[i + 4]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[46]++;
            cArgs = Double.parseDouble(args[i + 4]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[47]++;
          } catch(Exception e){
CodeCoverTryBranchHelper_Try5 = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[20]++;
            validC = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[48]++;
          } finally {
    if ( CodeCoverTryBranchHelper_Try5 ) {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[19]++;
}
  }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[49]++;
boolean CodeCoverTryBranchHelper_Try6 = false;
          try {
CodeCoverTryBranchHelper_Try6 = true;
            hArgs = Integer.parseInt(args[i + 5]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[50]++;
            hArgs = Double.parseDouble(args[i + 5]);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[51]++;
          } catch(Exception e){
CodeCoverTryBranchHelper_Try6 = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[22]++;
            validH = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[52]++;
          } finally {
    if ( CodeCoverTryBranchHelper_Try6 ) {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[21]++;
}
  }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[53]++;
int CodeCoverConditionCoverageHelper_C7;
          if((((((CodeCoverConditionCoverageHelper_C7 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C7 |= (32)) == 0 || true) &&
 ((validL) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (16)) == 0 || true)))
 && (
(((CodeCoverConditionCoverageHelper_C7 |= (8)) == 0 || true) &&
 ((lArgs < 0) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C7 |= (2)) == 0 || true) &&
 ((lArgs > 1000000) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[23]++;
            validL = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[54]++;

          } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[24]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[55]++;
int CodeCoverConditionCoverageHelper_C8;
          if((((((CodeCoverConditionCoverageHelper_C8 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C8 |= (32)) == 0 || true) &&
 ((validC) && 
  ((CodeCoverConditionCoverageHelper_C8 |= (16)) == 0 || true)))
 && (
(((CodeCoverConditionCoverageHelper_C8 |= (8)) == 0 || true) &&
 ((cArgs < 0) && 
  ((CodeCoverConditionCoverageHelper_C8 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C8 |= (2)) == 0 || true) &&
 ((cArgs > 1000000) && 
  ((CodeCoverConditionCoverageHelper_C8 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[25]++;
            validC = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[56]++;

          } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[26]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[57]++;
int CodeCoverConditionCoverageHelper_C9;
          if((((((CodeCoverConditionCoverageHelper_C9 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C9 |= (32)) == 0 || true) &&
 ((validH) && 
  ((CodeCoverConditionCoverageHelper_C9 |= (16)) == 0 || true)))
 && (
(((CodeCoverConditionCoverageHelper_C9 |= (8)) == 0 || true) &&
 ((hArgs < 0) && 
  ((CodeCoverConditionCoverageHelper_C9 |= (4)) == 0 || true)))
 || 
(((CodeCoverConditionCoverageHelper_C9 |= (2)) == 0 || true) &&
 ((hArgs > 1000000) && 
  ((CodeCoverConditionCoverageHelper_C9 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[9].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C9, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[9].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C9, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[27]++;
            validH = false;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[58]++;

          } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[28]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[59]++;
int CodeCoverConditionCoverageHelper_C10;
          if((((((CodeCoverConditionCoverageHelper_C10 = 0) == 0) || true) && (!
(((CodeCoverConditionCoverageHelper_C10 |= (32)) == 0 || true) &&
 ((validL) && 
  ((CodeCoverConditionCoverageHelper_C10 |= (16)) == 0 || true)))
 || !
(((CodeCoverConditionCoverageHelper_C10 |= (8)) == 0 || true) &&
 ((validC) && 
  ((CodeCoverConditionCoverageHelper_C10 |= (4)) == 0 || true)))
 || !
(((CodeCoverConditionCoverageHelper_C10 |= (2)) == 0 || true) &&
 ((validH) && 
  ((CodeCoverConditionCoverageHelper_C10 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[10].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C10, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[10].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C10, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[29]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[60]++;
            break;

          } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[30]++;}
          res = inputResult(Double.parseDouble(args[i + 3]),Double.parseDouble(args[i + 4]),Double.parseDouble(args[i + 5]));
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[61]++;
          l.add(Double.parseDouble(args[i + 3]));
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[62]++;
          c.add(Double.parseDouble(args[i + 4]));
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[63]++;
          h.add(Double.parseDouble(args[i + 5]));
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[64]++;
          result.add(res);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[65]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[66]++;
int CodeCoverConditionCoverageHelper_C11;
          if((((((CodeCoverConditionCoverageHelper_C11 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C11 |= (8)) == 0 || true) &&
 ((a <= res) && 
  ((CodeCoverConditionCoverageHelper_C11 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C11 |= (2)) == 0 || true) &&
 ((res <= b) && 
  ((CodeCoverConditionCoverageHelper_C11 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[11].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C11, 2) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[11].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C11, 2) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[31]++;
            resultInInterval.add("da");
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[67]++;

          } else {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[32]++;
            resultInInterval.add("nu");
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[68]++;
          }
        }
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[69]++;
int CodeCoverConditionCoverageHelper_C12;
        if((((((CodeCoverConditionCoverageHelper_C12 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C12 |= (32)) == 0 || true) &&
 ((validL) && 
  ((CodeCoverConditionCoverageHelper_C12 |= (16)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C12 |= (8)) == 0 || true) &&
 ((validC) && 
  ((CodeCoverConditionCoverageHelper_C12 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C12 |= (2)) == 0 || true) &&
 ((validH) && 
  ((CodeCoverConditionCoverageHelper_C12 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[12].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C12, 3) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[12].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C12, 3) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[33]++;
          generateResults();
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[70]++;

        } else {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[34]++;
          resultOutput = "Invalid input";
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[71]++;
        }
      }
    }
  }
  private double asinh(double x)
  {
    return Math.log(x + Math.sqrt(x*x + 1.0));
  }
  private double inputResult(double l,double c,double h){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[72]++;
int CodeCoverConditionCoverageHelper_C13;
    if((((((CodeCoverConditionCoverageHelper_C13 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C13 |= (2)) == 0 || true) &&
 ((h == l) && 
  ((CodeCoverConditionCoverageHelper_C13 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[13].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C13, 1) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[13].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C13, 1) && false)) {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[35]++;
      return c;

    } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[36]++;}
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[73]++;
    double a = (-(l-h+c/2)*(l-h-c/2))/(2*(l-h));
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[74]++;
    double res = 2 * a * asinh( 50 / a);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[75]++;
    String resString = Double.toString(res);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[76]++;
    String[] parts = resString.split("\\.");
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[77]++;
    String part1 = parts[0];
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[78]++;
    String part2 = parts[1];
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[79]++;
int CodeCoverConditionCoverageHelper_C14;
    if((((((CodeCoverConditionCoverageHelper_C14 = 0) == 0) || true) && ((
(((CodeCoverConditionCoverageHelper_C14 |= (128)) == 0 || true) &&
 ((part2.length() > 3) && 
  ((CodeCoverConditionCoverageHelper_C14 |= (64)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C14 |= (32)) == 0 || true) &&
 ((part2.charAt(2) == '5') && 
  ((CodeCoverConditionCoverageHelper_C14 |= (16)) == 0 || true)))
) || (
(((CodeCoverConditionCoverageHelper_C14 |= (8)) == 0 || true) &&
 ((part2.length() >= 3) && 
  ((CodeCoverConditionCoverageHelper_C14 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C14 |= (2)) == 0 || true) &&
 ((part2.charAt(2) > '5') && 
  ((CodeCoverConditionCoverageHelper_C14 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[14].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C14, 4) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[14].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C14, 4) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[37]++;
      res = Math.round(res * 100.0) / 100.0;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[80]++;

    } else {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[38]++;
      res = Math.floor(res * 100.0) / 100.0;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[81]++;
    }
    return res;
  }
  private void generateResults() {
    double res;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[82]++;
byte CodeCoverTryBranchHelper_L2 = 0;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[4]++;


int CodeCoverConditionCoverageHelper_C15;
    for( int i = 0 ;(((((CodeCoverConditionCoverageHelper_C15 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C15 |= (2)) == 0 || true) &&
 ((i < result.size()) && 
  ((CodeCoverConditionCoverageHelper_C15 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[15].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C15, 1) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[15].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C15, 1) && false); i++){
if (CodeCoverTryBranchHelper_L2 == 0) {
  CodeCoverTryBranchHelper_L2++;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[4]--;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[5]++;
} else if (CodeCoverTryBranchHelper_L2 == 1) {
  CodeCoverTryBranchHelper_L2++;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[5]--;
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.loops[6]++;
}
      res = result.get(i);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[83]++;
      resultOutput = resultOutput + Double.toString(res);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[84]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[85]++;
      String resString = Double.toString(res);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[86]++;
      String[] parts = resString.split("\\.");
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[87]++;
      String part1 = parts[0];
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[88]++;
      String part2 = parts[1];
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[89]++;
int CodeCoverConditionCoverageHelper_C16;
      if((((((CodeCoverConditionCoverageHelper_C16 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C16 |= (2)) == 0 || true) &&
 ((part2.length() == 1) && 
  ((CodeCoverConditionCoverageHelper_C16 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[16].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C16, 1) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[16].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C16, 1) && false)){
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[39]++;
        resultOutput = resultOutput + Integer.toString(0);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[90]++;

      } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[40]++;}
      resultOutput = resultOutput + " - " + resultInInterval.get(i);
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[91]++;
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[92]++;
int CodeCoverConditionCoverageHelper_C17;
      if((((((CodeCoverConditionCoverageHelper_C17 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C17 |= (2)) == 0 || true) &&
 ((i < result.size() - 1) && 
  ((CodeCoverConditionCoverageHelper_C17 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[17].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C17, 1) || true)) || (CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.conditionCounters[17].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C17, 1) && false)) {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[41]++;
        resultOutput = resultOutput + "\n";
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[93]++;

      } else {
  CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.branches[42]++;}
    }
  }
  public String getResultOutput() {
    return resultOutput;
  }
  public static void main(String args[])
  {
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[94]++;
    BBSecurity bbs = new BBSecurity(args);
    System.out.println(bbs.getResultOutput());
CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x.statements[95]++;
  }
}

class CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "690f9553-dc29-4900-a0e3-d52b2d249aee").addObservedContainer(new CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x ());
  }
    public static long[] statements = new long[96];
    public static long[] branches = new long[43];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[18];
  static {
    final String SECTION_NAME = "BBSecurity.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1,3,3,3,3,1,3,3,3,3,2,3,1,3,1,1,1};
    for (int i = 1; i <= 17; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[7];

  public CodeCoverCoverageCounter$juwtmfavzix3rxs1mzhm34x () {
    super("BBSecurity.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 95; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 42; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 17; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 6; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("BBSecurity.java");
      for (int i = 1; i <= 95; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 42; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 17; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 2; i++) {
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

