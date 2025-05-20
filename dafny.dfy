method between (p: int, r:int) returns (q: int)
    requires r-p>1
    ensures p < q <r
{
    q :=p+1;
}

method Main()
{
  var q:int;
  q := between(2, 5);   
print(q);
}

/*1. What does the program do? What is the precondition? What is the
postcondition?

Programul defineste o metoda numita between care primeste doi parametrii intregi p si r.
Preconditia este ca r-p>1, adica r trebuie sa fie mai mare decat p cu cel putin 2.
Postconditia este ca q trebuie sa fie mai mare decat p si mai mic decat r.
Aceasta inseamna ca q este un numar intreg care se afla intre p si r.

2. What happens if you change the body of the method with q := p + 2?
Give a counterexample.
In acest caz, preconditia ramane aceeasi, dar postconditia nu va mai fi
satisfacuta in toate cazurile.
De exemplu, daca p=1 si r=3, atunci q va fi 3, ceea ce nu satisface
postconditia p < q < r, deoarece 1 < 3 < 3 nu este adevarat.

3. What happens if you change the precondition with r-p>=1? Give a coun-
terexample.*/

// In acest caz, preconditia va permite ca r sa fie egal cu p+1, ceea ce
// va face ca q sa fie egal cu r. Astfel, postconditia p < q < r nu va mai fi
// satisfacuta. De exemplu, daca p=1 si r=2, atunci q va fi 2, ceea ce nu
// satisface postconditia 1 < 2 < 2, deoarece 1 < 2 < 2 nu este adevarat.
// In concluzie, schimbarea preconditiei in r-p>=1 va duce la situatii in care
// postconditia nu va mai fi satisfacuta, deoarece q poate fi egal cu r.


