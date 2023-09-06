public class BubbleSort {
    public static void main(String[] args) {
        int[] Array = {4, 6, 1, 2, 32, 3, 9, 11, 29};
        int [] x = bubbleSort(Array);
        Print(x);


    }

    public static void Print(int[] p) {
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");

        }
    }

    public static int [] bubbleSort(int[] Array) {
        int n = Array.length;
        for (int i = 0; i < (n - 1); i++) {
            int swap = 0;

            for (int j = 0; j < (n - 1) - i; j++) {

                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j + 1];
                    Array[j + 1] = Array[j];
                    Array[j] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                break;
            }

        }
        return Array;
    }
}
