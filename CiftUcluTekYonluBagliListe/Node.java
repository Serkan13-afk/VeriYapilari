package CiftUcluTekYonluBagliListe;


public class Node {
    Node next;
    int data;

    public Node(int d) {

        data = d;
        next = null;


    }

    @Override
    public String toString() {
        return "[" + data + "," + next + "]";
    }
}

