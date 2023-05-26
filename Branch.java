

public class Branch extends Tree {
    private int elem;   //radice
    private Tree left;  //nodi a sinistra: piu' piccoli della radice
    private Tree right; //nodi a destra: piu' grandi della radice

    public Branch(int elem, Tree left, Tree right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public boolean empty() {
        return false;
    }
    

    public int max() {
        return right.empty() ? elem : right.max();
    }
    // Se la parte destra e' vuota il nodo piu' grande e' la radice.
    // Altrimenti il nodo piu' grande si trova a destra

    public boolean contains(int x) {
        if (x == elem) 
            return true;
        else if (x < elem)
            
            return left.contains(x);
        else //x>elem
    
            return right.contains(x);
    }

    public Tree insert(int x) {
        
        if (x < elem)
            left = left.insert(x);
            //e' essenziale aggiornare il valore di left
        else if (x > elem)
            right = right.insert(x);
        //e' essenziale aggiornare il valore right
        return this;
    }

    public Tree remove(int x) {
        if (x < elem) {
            // se c'e', l'elemento da eliminare e` nel sottoalbero sinistro
            left = left.remove(x); //aggiorno left
            return this;
        } else if (x > elem) {
            // se c'e', l'elemento da eliminare e' nel sottoalbero destro
            right = right.remove(x); //aggiorno right
            return this;
        }
       
        else { //
            if (left.empty())
                // il sottoalbero sinistro e` vuoto, dunque resta il
                // sottoalbero destro:
                return right;
            else if (right.empty())
                // il sottoalbero destro e` vuoto, dunque resta il
                // sottoalbero sinistro:
                return left;
            else {
                elem = left.max();
                // rimpiazzo elem con il massimo del sottoalbero
                // sinistro (massimo dei minimi)
              
                left = left.remove(elem); //aggiorno left
                return this;
            }
        }

    }


    public Tree search(int x) {
        if (x < elem) {
            // se c'e', l'elemento da eliminare e` nel sottoalbero sinistro
            left = left.remove(x); //aggiorno left
            return this;
        } else if (x > elem) {
            // se c'e', l'elemento da eliminare e' nel sottoalbero destro
            right = right.remove(x); //aggiorno right
            return this;
        }
        
        else return this;
    }

   
    protected String toStringAux
    (String prefix, String root, String left, String right) {
        return this.left.toStringAux(prefix + left, "   /", "   ", "  ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
                this.right.toStringAux(prefix + right, "   \\", "  ¦", "   ");
    }
}



