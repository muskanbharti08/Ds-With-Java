public class Practice01 {
    public static void main(String[] args) {
        int [] Array = {3,7,1,2,9,4,7,3,1,8,4};
        //BubbleSort(Array);
       // InsertationSOrt(Array);
        SelectionSort(Array);
        Print(Array);


    }

    public static void Print(int [] p ){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");
        }
    }

    // bubble sort
    public static void BubbleSort(int [] Ae){
        int n = Ae.length;
        for (int i = 0; i < (n-1); i++) {
            int swap = 0;
            for (int j = 0; j < (n-1)-i; j++) {
                if (Ae[j]>Ae[j+1]) {
                    int temp = Ae[j+1];
                    Ae[j+1]= Ae[j];
                    Ae[j] = temp;
                    swap++;
                }

            }
            if (swap==0) {{
                break;
            }
            }

        }

    }

public static void InsertationSOrt(int [] ar){
        int n = ar.length;
    for (int i = 1; i <n ; i++) {
        int temp = ar[i];
        int j= i-1;
        while(j>=0 && temp<ar[j]){
            ar[j+1]= ar[j];
            j--;

        }
        ar[j+1]= temp;

    }
}

public static void SelectionSort(int [] ar){
    int n = ar.length;
    for (int i = 0; i < n-1; i++) {

        int minposition=i;
        for (int j = i+1; j <n ; j++) {
            if (ar[minposition]>ar[j]) {
                minposition =j;
            }
            int temp= ar[minposition];
            ar[minposition]=ar[i];
            ar[i] = temp;

        }

    }
}


}
