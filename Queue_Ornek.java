import java.util.Arrays;

public class Queue_Ornek {
    String[] dizi;
    int elemanSayisi;

    public Queue_Ornek(int diziUzunlugu) {
        dizi = new String[diziUzunlugu];
        elemanSayisi = 0;
    }

    // Kuyruğa ekleme (enqueue)
    public void push(String gorev) {
        if (elemanSayisi == dizi.length) {
            System.out.println("Kuyruk dolu!");
        } else {
            dizi[elemanSayisi++] = gorev;
        }
    }

    // Kuyruktan çıkarma (dequeue)
    public String pop() {
        if (elemanSayisi == 0) {
            System.out.println("Kuyruk boş!");
            return null;
        }
        String cikan = dizi[0]; // ilk giren eleman çıkar
        for (int i = 0; i < elemanSayisi - 1; i++) {
            dizi[i] = dizi[i + 1]; // sola kaydır
        }
        dizi[--elemanSayisi] = null; // son elemanı null yap
        return cikan;
    }

    public void print() {
        System.out.println(Arrays.toString(dizi));
    }
}
