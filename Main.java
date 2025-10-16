
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  Stack_Ornek so1 = new Stack_Ornek(4);
        so1.push("Saat 10 da şirkete gidilecek");
        so1.push("Projenin Backend i yapılacak");
        so1.push("Öğle yemegi yenilecek");
        so1.push("Projenin toplantısı yapılacak");
        so1.print();
        so1.pop();
        so1.pop();

        so1.print();
        System.out.println("---------------------------------------------------");*/

        Queue_Ornek qo1 = new Queue_Ornek(4);
        qo1.push("Saat 10 da okula gidilecek");
        qo1.push("Projenin Backend i yapılacak");
        qo1.push("Öğle yemegi yenilecek");
        qo1.push("Projenin toplantısı yapılacak");
        qo1.print();
        qo1.pop();
        qo1.pop();

        qo1.print();

      /*  int [] dizi = {12,22,11,1,32,34,14,28,98,8};

        BubbleSort b = new BubbleSort(dizi);

        b.bubbleSort();
        b.print();

        int [] dizi2 = {12,22,11,1,32,34,14,28,98,8};

        SelectionSort s = new SelectionSort(dizi2);
        s.selectionSort();
        s.print();

*/





    }
}
