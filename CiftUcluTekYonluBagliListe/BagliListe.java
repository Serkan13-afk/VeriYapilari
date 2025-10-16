package CiftUcluTekYonluBagliListe;


public class BagliListe {
    Node head;
    Node teal;
    int es;

    public BagliListe() {
        head = null;
        teal = null;
        es = 0;


    }

    public void basaEkleme(Node n) {

        if (head == null) {
            teal = n;
            head = n;
        } else {
            n.next = head;
            head = n;
        }


    }

    public void sonaEkleme(Node n) {

        if (head == null) {
            teal = n;
            head = n;
        } else {
            teal.next = n;
            teal = n;
        }


    }

    public void bastanSil() {

        if (head != null) {
            if (head == teal) {
                head = null;
                teal = null;
            } else {
                head = head.next;
            }
        } else {
            System.out.println("Dizi boş !");
        }


    }
    public void sondanSil() {

        if (head != null) {
            if (head == teal) {
                head = null;
                teal = null;
            } else {
                Node t = head;
                while (t.next != null){
                    t = t.next;
                }
                t.next = null;
                teal = t;



            }
        } else {
            System.out.println("Dizi boş !");
        }


    }


}
