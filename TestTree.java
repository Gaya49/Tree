

import java.util.*;


public class TestTree {
    public static void main(String[] args) {
        
        vuoto = vuoto.insert(10);
        System.out.println("l'abero è stato modificato    \n" + vuoto);
        System.out.println();

        Random r = new Random(System.currentTimeMillis());
        //r e` un generatore di numeri pseudo-casuali definito a partire
        //dall’orologio di sistema.

        // Creo un albero t con n numeri interi casuali tra 0 e (n-1)
        int n = 8;
        Tree t = new Leaf(); //L'albero t nasce vuoto
        for (int i = 0; i < n; i++)
            t = t.insert(r.nextInt(n)); 

       
        System.out.println("Stampa albero casuale t di al piu' " + n + " elementi \n\n" + t + "\n\n t.max() = " + t.max());

        //Creo un albero u inserendo sempre elementi piu' grandi
        //quindi sempre nella parte destra dell’albero
        Tree u = new Leaf();
        for (int i = 0; i < n; i++) u = u.insert(i);
        System.out.println("\n Stampa albero u di " + n + " elementi, tutti figli destri \n\n" + u);

        //Creo un albero u inserendo sempre elementi piu' piccoli
        //quindi sempre nella parte sinistra dell’albero
        Tree v = new Leaf();
        for (int i = n - 1; i >= 0; i--) v = v.insert(i);
        System.out.println("\n Stampa albero v di " + n + " elementi, elementi, tutti figli sinistri \n\n" + v);

        Tree w = new Leaf();
        w = w.insert(3);
        w = w.insert(1);
        w = w.insert(4);
        w = w.insert(2);
        System.out.println("\n Stampa albero w con insieme nodi = {1,2,3,4} \n\n" + w);
        w.remove(3);
        System.out.println("\n w senza il nodo 3\n\n" + w);
    }
}



