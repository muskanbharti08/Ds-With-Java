public class InsertationSort {
    public static void main(String[] args) {
        int [] Aray = {9,3,5,2,1,3,4,5,4,3};
        Insertation(Aray);
        Print(Aray);

    }
    public static void Print(int [] p){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");

        }
    }


    public static void Insertation(int [] ar){
        for (int i = 1; i < ar.length; i++) {   // index 0th element will always sorted in Insertation sort so we take from 1 index
            int temp = ar[i];
            int j = i-1;    // for sorted portion or indexes
            while (j>=0 && temp<ar[j]){
                ar[j+1]= ar[j];
                j--;
            }
            ar[j+1] = temp;

        }

    }
}