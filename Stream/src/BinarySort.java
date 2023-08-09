public class BinarySort {
    public static void main(String[] args) {
        int [] Array = {2,4,5,6,8};
        int a = Position(Array,7);
        System.out.println(a);
        a=Position(Array,1);
        System.out.println(a);

    }

    public static int Position(int[] Ar, int x) {

        int low = 0;
        int high = Ar.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Ar[mid] == x) {
                return x;
            } else if (Ar[mid]< x) {
                low =mid+1;
            }
            else{
            high = mid-1;}

        }
        return low;

    }
}
