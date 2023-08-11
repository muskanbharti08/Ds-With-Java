

public class ReverseELementOfArray {
    public static void main(String[] args) {
        int [] Array = {1,2,3,4,4,5,6,7,8,9};

        Reverse(Array);
        System.out.print("Reversed Elements are:-" + " ");
        print(Array);

    }

    public static int [] Reverse (int [] ar){
        int temp =0;
        int start =0;
        int end = ar.length-1;

        while (start<end){
            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;

        }
        return ar;
    }
    public static void print(int [] p){
        for (int i = 0; i < p.length ; i++) {
            System.out.print(p[i]+" ");

        }
    }
}
