public class BinarySearch {
    public static void main(String[] args) {
        int [] Array = {2,5,7,12,23,34,45};

        int c = Search(Array , 34);
        System.out.println(c);

    }

    public static int Search(int [] Arr, int x){
        int low = 0;
        int high = Arr.length-1;
        int mid;

        while (low <= high){
            mid = (low+high) /2;

            if (Arr[mid] == x) {
                return mid;
            }
            else if (Arr[mid] <= x) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
}
