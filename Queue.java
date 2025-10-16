import java.util.Arrays;

public class Queue {

    public int[] dizi;
    public int es;

    public Queue(int es) {
        dizi = new int[es];
        this.es = 0;
    }

    public void push(int a) {
        if (es == dizi.length) {
            System.out.println("Stack dolu !");
        } else {
            dizi[es++] = a; // önce es i 1 arttır sonra indexe ata
        }
    }

    public int pop() {
        if (es == dizi.length) {
            System.out.println("Kuyruk dolu !");
        }
        int ilkeleman = dizi[0];
        for (int i = 0; i < es - 1; i++) { // son elemana sıfır verecez ondan sona kadar gitmedik sona sıfır vermek için
            dizi[i] = dizi[i + 1];
        }
        dizi[--es] = 0; // indexe değeri ata sonra es i 1 düşür
        return ilkeleman;


    }

    public void print() {
        System.out.println(Arrays.toString(dizi));
    }
}
