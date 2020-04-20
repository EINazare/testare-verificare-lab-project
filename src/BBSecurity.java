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
    if(args.length < 3){
      resultOutput = "Invalid input";
    } else {
      boolean validA = true;
      boolean validB = true;
      boolean validN = true;
      try {
        n = Integer.parseInt(args[0]);
      } catch(Exception e){
        validN = false;
      }
      try {
        a = Integer.parseInt(args[1]);
        a = Double.parseDouble(args[1]);
      } catch(Exception e){
        validA = false;
      }
      try {
        b = Integer.parseInt(args[2]);
        b = Double.parseDouble(args[2]);
      } catch(Exception e){
        validB = false;
      }
      if(validN && (n<1 || n > 100000)){
        validN = false;
      }
      if(validA && (a<0 || a > 1000000)){
        validA = false;
      }
      if(validB && (b<0 || b > 1000000)){
        validB = false;
      }
      if(args.length < 3 * n + 3 || !validA || !validB || !validN){
        resultOutput = "Invalid input";
      } else {
        l = new ArrayList<Double>();
        c = new ArrayList<Double>();
        h = new ArrayList<Double>();
        result = new ArrayList<Double>();
        resultInInterval = new ArrayList<String>();
        double res;
        double lArgs = -1;
        double cArgs = -1;
        double hArgs = -1;
        boolean validL = true;
        boolean validC = true;
        boolean validH = true;
        for(int i = 0 ; i < 3 * n ; i = i + 3){
          validL = true;
          validC = true;
          validH = true;
          try {
            lArgs = Integer.parseInt(args[i + 3]);
            lArgs = Double.parseDouble(args[i + 3]);
          } catch(Exception e){
            validL = false;
          }
          try {
            cArgs = Integer.parseInt(args[i + 4]);
            cArgs = Double.parseDouble(args[i + 4]);
          } catch(Exception e){
            validC = false;
          }
          try {
            hArgs = Integer.parseInt(args[i + 5]);
            hArgs = Double.parseDouble(args[i + 5]);
          } catch(Exception e){
            validH = false;
          }
          if(validL && (lArgs < 0 || lArgs > 1000000)){
            validL = false;
          }
          if(validC && (cArgs < 0 || cArgs > 1000000)){
            validC = false;
          }
          if(validH && (hArgs < 0 || hArgs > 1000000)){
            validH = false;
          }
          if(!validL || !validC || !validH){
            break;
          }
          res = inputResult(Double.parseDouble(args[i + 3]),Double.parseDouble(args[i + 4]),Double.parseDouble(args[i + 5]));
          l.add(Double.parseDouble(args[i + 3]));
          c.add(Double.parseDouble(args[i + 4]));
          h.add(Double.parseDouble(args[i + 5]));
          result.add(res);
          if(a <= res && res <= b){
            resultInInterval.add("da");
          } else {
            resultInInterval.add("nu");
          }
        }
        if(validL && validC && validH){
          generateResults();
        } else {
          resultOutput = "Invalid input";
        }
      }
    }
  }
  private double asinh(double x)
  {
    return Math.log(x + Math.sqrt(x*x + 1.0));
  }
  private double inputResult(double l,double c,double h){
    if( h == l) {
      return c;
    }
    double a = (-(l-h+c/2)*(l-h-c/2))/(2*(l-h));
    double res = 2 * a * asinh( 50 / a);
    String resString = Double.toString(res);
    String[] parts = resString.split("\\.");
    String part1 = parts[0];
    String part2 = parts[1];
    if((part2.length() > 3 && part2.charAt(2) == '5') || (part2.length() >= 3 && part2.charAt(2) > '5')){
      res = Math.round(res * 100.0) / 100.0;
    } else {
      res = Math.floor(res * 100.0) / 100.0;
    }
    return res;
  }
  private void generateResults() {
    double res;
    for( int i = 0 ; i < result.size(); i++){
      res = result.get(i);
      resultOutput = resultOutput + Double.toString(res);
      String resString = Double.toString(res);
      String[] parts = resString.split("\\.");
      String part1 = parts[0];
      String part2 = parts[1];
      if(part2.length() == 1){
        resultOutput = resultOutput + Integer.toString(0);
      }
      resultOutput = resultOutput + " - " + resultInInterval.get(i);
      if(i < result.size() - 1) {
        resultOutput = resultOutput + "\n";
      }
    }
  }
  public String getResultOutput() {
    return resultOutput;
  }
  public static void main(String args[])
  {
    BBSecurity bbs = new BBSecurity(args);
    System.out.println(bbs.getResultOutput());
  }
}
