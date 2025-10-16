import java.util.Arrays;

public class Stack_Ornek {
    String[] dizi;
    int elemansayisi;

    public Stack_Ornek(int diziUzunlugu) {
        dizi = new String[diziUzunlugu];
        this.elemansayisi = 0;

    }

    public void push(String gorev) {
        if (elemansayisi == dizi.length) {
            System.out.println("Yığıt dolu !");
        } else {
            dizi[elemansayisi++] = gorev; // indexe eleman ekledik
        }
    }

    public String pop() {

        if (elemansayisi == 0) {
            System.out.println("Yığıt boş zaten");
            return null;
        }
        String gorev = dizi[--elemansayisi];
        dizi[elemansayisi] = "Görev yapıldı";
        return gorev;
    }

    public void print() {
        System.out.println(Arrays.toString(dizi));


    }


}
