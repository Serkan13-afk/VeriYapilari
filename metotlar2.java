public class metotlar2 {
    private int[] dizi;
    int dizidekiEleman = 0;

    public metotlar2(int n) {

        dizi = new int[n];


    }

    public void add2(int a) {
        if (dizi.length > dizidekiEleman) {
            dizi[dizidekiEleman] = a;
            dizidekiEleman++;
        }


    }

    public void search2(int a) {

        for (int i = 0; dizi.length > i; i++) {
            if (dizi[i] == a) {
                System.out.println("Aranan eleman dizide mevcut");
                return;
            }

        }
        System.out.println("Aranan eleman dizide bulunamadı !");


    }

    public void update2(int a, int b) {
        for (int i = 0; dizi.length > i; i++) {
            if (dizi[i] == a) {
                dizi[i] = b;
                return;
            }

        }
        System.out.println("Böyle bir sayı mevcut değil dizide");

    }

    public void remove2(int a) {
        boolean elemanVaemi = false;
        int silinecekElemanIndex = 0;
        for (int i = 0; dizi.length > i; i++) {
            if (dizi[i] == a) {
                elemanVaemi = true;
                silinecekElemanIndex = i;
            }
        }
        if (elemanVaemi) {
            for (int i = silinecekElemanIndex; dizi.length > i; i++) {
                if (dizi.length - 1 == i) {
                    dizi[i] = 0;
                    return;
                } else {
                    dizi[i] = dizi[i+1];

                }
            }

        } else {
            System.out.println("Silinecek eleman sistemde mevcut değil");
        }


    }


}
