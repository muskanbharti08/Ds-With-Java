public class SelectionSort {
    public static void main(String[] args) {
        int [] GivenArray = {4,1,3,2,8,6};
        SelectionSort(GivenArray);
        Print(GivenArray);


    }

    public static void SelectionSort(int [] ar){
        for (int i = 0; i <ar.length-1; i++) { // for term count
            int minPosition = i;
            for (int j = i+1; j <ar.length ; j++) {  // for sorted array
                if(ar[minPosition]>ar[j]){
                    minPosition=j;
                }
                int temp = ar[minPosition];
                ar[minPosition] = ar[i];
                ar[i]= temp;



            }
        }

    }
    public static void Print(int [] p){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");

        }
    }
}
