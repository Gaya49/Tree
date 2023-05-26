

// Classe Leaf per rappresentare alberi vuoti
// I metodi definiti in Leaf restituiscono risultati costanti
// (che non dipendono dall’albero).

public class Leaf extends Tree {
    public Leaf() {
    }

    

    public boolean empty() {
        return true;
    } //l'albero vuoto e' vuoto

    public int max() {
        assert false;
        return 0;
    }

    /**
     * l'albero vuoto non ha
     * massimo. */

    public boolean contains(int x) {
        return false;
    }
    //l'albero vuoto non contiene nulla

    public Tree insert(int x) {
        return new Branch(x, this, this);
    }
    

    public Tree remove(int x) {
        return this;
    } //non c'e' nulla da
    //cancellare nell'albero vuoto

    
    protected String toStringAux
    (String prefix, String root, String left, String right) {
        return prefix + root + "leaf";
    }
}

