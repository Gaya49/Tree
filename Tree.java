
// Tree.java - Classe astratta alberi binari di ricerca
// INVARIANTE DI CLASSE: ogni oggetto e' un albero di ricerca
// Realizziamo gli alberi binari con 2 sottoclassi concrete:
// LEAF: contiene il solo albero vuoto "leaf"
// BRANCH: contiene tutti gli alberi non vuoti


public abstract class Tree {
    //Test se l'albero e' vuoto
    public abstract boolean empty();

    //Massimo elemento dell'albero, se non vuoto:
    //in un albero binario e' il nodo piu' a destra
    public abstract int max();

    //Test di appartenenza
    public abstract boolean contains(int x);

    // Aggiunta di un elemento a un albero. Modifica l'albero
    // precedente, la cui forma originaria va persa.
    public abstract Tree insert(int x);
    // Si usa con t = t.insert(x), per salvare le modifiche fatte a t

    // Rimozione di un elemento da un albero (se c'e'). Modifica
    // l'albero precedente, che va perso.
    public abstract Tree remove(int x);
    // Si usa con t = t.remove(x), per salvare le modifiche fatte a t

    protected abstract String toStringAux
            (String prefix, String root, String left, String right);
    //Metodo che gestisce la parte NON pubblica della stampa.

    public String toString() {
        return toStringAux("", "___", "   ", "   ");
    }
  
}


