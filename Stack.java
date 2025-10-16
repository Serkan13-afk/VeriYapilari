import java.util.Arrays;

public class Stack {

    public int[] dizi;
    public int es;

    public Stack(int es) {
        dizi = new int[es];
        this.es = 0;
    }

    public void push(int a) {
        if (es == dizi.length) {
            System.out.println("Stack dolu !");
        } else {
            dizi[es++] = a;
        }
    }

    public int pop() {
        if (es == 0) {
            System.out.println("Stack boş !");
            return -1; // hata durumu
        }
        int r = dizi[--es]; // önce es'i azalt, azaltılmış es yi dizinin indexi yap
        dizi[es] = 0;       // o elemanı sıfırla
        return r;
    }

    public void print() {
        System.out.println(Arrays.toString(dizi));
    }


}
