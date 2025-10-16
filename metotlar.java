public class metotlar {

    public int[] dizi;
    public int elemanSayisi;


    public metotlar(int diziBoyutu) {

        dizi = new int[diziBoyutu];
        elemanSayisi = 0;

    }


    public void add(int a) {
        if (dizi.length > elemanSayisi) {
            dizi[elemanSayisi++] = a; // elaman sayısı başta 0 olacak indexe ata sonra 1 yap
        }

    }

    public boolean search(int a) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == a) {
                return true;
            }
        }
        return false;
    }

    public void update(int a, int b) {
        boolean arananVarMi = false;
        int bulunanIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == a) {
                arananVarMi = true;
                bulunanIndex = i;
            }
        }
        if (arananVarMi) {
            dizi[bulunanIndex] = b;

        } else {
            System.out.println("Böyle bir eleman dizide yoktur update");
        }
    }

    public void remove(int a) {
        boolean elemanVarmi = false;
        int bulunanIndex = 0;


        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == a) {
                elemanVarmi = true;
                bulunanIndex = i;
            }
        }

        if (elemanVarmi) {
            for (int j = bulunanIndex; j < dizi.length; j++) {
                if (j == dizi.length - 1) {
                    dizi[j] = 0;
                } else {
                    dizi[j] = dizi[j + 1];

                }
            }
        } else {
            System.out.println("Böyle bir eleman yoktur remove");
        }

    }
}
