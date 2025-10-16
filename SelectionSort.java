import java.util.Arrays;

public class SelectionSort {
    public int[] dizi;

    public SelectionSort(int[] gelecekDizi) {
        dizi = gelecekDizi;
    }

    public void selectionSort() {
        int min = 0;

        for (int i = 0; i < dizi.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = dizi[i];
                dizi[i] = dizi[min];
                dizi[min] = temp;
            }
        }


    }

    public void print() {
        System.out.println(Arrays.toString(dizi));


    }


}
