import java.util.Arrays;

public class BubbleSort {

    public int[] dizi;

    public BubbleSort(int[] girilendizi) {
        dizi = girilendizi;

    }

    public void bubbleSort() {
        for (int i = 0; i < dizi.length - 1; i++) {

            for (int j = 1; j < dizi.length - i; j++) {
                if (dizi[j - 1] > dizi[j]) {
                    int temp = dizi[j - 1];
                    dizi[j - 1] = dizi[j];
                    dizi[j] = temp;
                }
            }

        }

    }

    public void print() {
        System.out.println(Arrays.toString(dizi));


    }


}
