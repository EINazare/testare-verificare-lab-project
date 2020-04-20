# testare-verificare-lab-project
Proiectul de Laborator de la Testare &amp; Verificare

## Comenzi:
```
javac BBSecurity.java BBSecurityTest.java && junit BBSecurityTest
```


## Problema: https://www.pbinfo.ro/probleme/2751/bbsecurity

!Atentie: Cerinta originala s-a modificat!

## Enunt:

Domnul X lucrează la BB Security ca paznic.
Deoarece în România sunt foarte puțini hoți, acesta s-a gândit într-o zi să calculeze distanța dintre fiecare doi stâlpi de îngrădire din instituția pe care o păzește. Fiecare doi stâlpi de îngrădire sunt legați printr-un cablu rezistent, care, de obicei nu stă întins la maximum.
Din cauză ca în instituție se găsesc mulți stâlpi, domnul X vă provoacă pe voi să calculați ce și-a propus el.


## Cerinta:

Se dă un număr n, un interval (a,b) și n triplete de forma l, c, h, reprezentând lungimea egala a doi stâlpi, lungimea cablului dintre acestea și înălțimea la care atârnă cablul față de podea.
Se cere să se afle distanța dintre fiecare doi stâlpi care se afla in intervalul (a,b).
Fiecare rezultat va fi afișat pe cate un rând nou.


## Date de intrare:

Programul citește de la tastatură un număr n, doua numere a si b, și apoi n triplete de forma l, c, h, cu semnificația de mai sus.


## Date de iesire:

Programul va afișa pe linia n a ecranului un număr de forma x care reprezintă lungimea dintre cei doi stâlpi, corespunzătoare datelor de pe linia n+1 din consola de citire, cu exact două zecimale, indiferent de caz, rotunjind a doua zecimală în comparație cu cea de-a treia, sau, dacă a doua zecimală este 5, zecimala a doua va crește cu o unitate doar dacă există încă una sau mai multe zecimale după cea de-a treia și măcar una din ele este > 0 (vezi Restricții). Alaturi de numarul x se va afisa si un mesaj daca acest numar se afla sau nu in intervalul (a,b).


## Restricții și precizări:

- 1 ≤ n ≤ 100.000;
- a, b si cele n numere citite vor fi mai mici decât 1.000.000;
- n, l, c, h, a, b sunt numere naturale;
- este garantat că pentru orice triplet citit există un număr 0 ≤ x ≤ c;
- cea de-a doua zecimala se rotunjește de obicei după cea de-a treia (ex. 49.4376 se va afișa ca 49.44);
- ∀ a| a ∈ ℕ, acesta se va afișa ca a.00 (ex. 50 se va afișa ca 50.00);
- Atenție! 23.455 = 23.45 , 23.45501 = 23.46.
