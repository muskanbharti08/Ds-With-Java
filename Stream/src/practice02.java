public class practice02 {
    public static void main(String[] args) {
        int [] Array ={3,4,1,5,6,7};
//        int c=MissingNumber(Array);
//        System.out.println(c);
        SelectionSort(Array);
        Print(Array);

    }
    public static void Print(int [] p){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+"  ");

        }
    }

    public static int MissingNumber(int [] ar){
        int n = ar.length+1;
        int sum = n*(n+1)/2;
        for (int i = 0; i < ar.length; i++) {
            sum-=ar[i];


        }
        return sum;

    }

    public static void SelectionSort(int [] ar){
        int n = ar.length;
        for (int i = 0; i <n-1; i++) {
            int minposition = i;
            for (int j = i+1; j <n-1 ; j++) {
                if (ar[minposition]>ar[j]) {
                    minposition = j;
                }
                int temp = ar[minposition];
                ar[minposition] = ar[i];
                ar[i] = temp;


            }

        }

    }
}
