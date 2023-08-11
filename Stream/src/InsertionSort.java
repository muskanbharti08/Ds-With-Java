public class InsertionSort {
    public static void main(String[] args) {
        int [] Array = {2,8,2,7,81,45,24,3,1,87,98,56}; //  the given unsorted Array
        Insertion(Array);

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");     // for printing  the array

        }

    }

    public static void Insertion(int [] ar){
        int n = ar.length;                  // initilizing the length of an Array
        for (int i = 1; i <n ; i++) {  // i=1 beacause no need to sort index 0
            int temp = ar[i];
            int j = i-1;    // for enter in sorted part
            while(j >= 0  &&  temp < ar[j]){
                ar[j+1] = ar[j];
                j--;

            }
            ar[j+1] = temp;
        }


    }
}


