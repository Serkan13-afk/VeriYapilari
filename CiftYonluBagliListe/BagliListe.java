package CiftYonluBagliListe;

public class BagliListe {
    Node teal;
    Node head;

    int es;


    public BagliListe() {
        head = null;
        teal = null;
        es = 0;


    }

    public void basaEkle(Node n) {
        if (head == null) {
            head = n;
            teal = n;

        } else {
            n.next = head;
            head.prev = n;
            head = n;


        }

    }

    public void sonaEkle(Node n) {
        if (head == null) {
            head = n;
            teal = n;

        } else {
            teal.next = n;
            n.prev = teal;
            teal = n;


        }

    }
    public void bastanSil() {
        if (head == null) {
            System.out.println("Liste boş");

        } else {
           if(head == teal){
               head = null;
               teal = null;

           }
           else{
               head.next.prev = null;
               head = head.next;

           }


        }

    }

    public void sondanSil() {
        if (head == null) {
            System.out.println("Liste boş");

        } else {
            if(head == teal){
                head = null;
                teal = null;

            }
            else{
                teal.prev.next = null;
                teal = teal.prev;

            }


        }

    }





}
