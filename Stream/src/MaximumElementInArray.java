// finding maximum Element  in  an Array
public class MaximumElementInArray {
    public static void main(String[] args) {
        // here is the given Array
        int[] array = {23, 34, 23, 32};
        int x = MaxElement(array);              // Method call and store maximum value in the variable x
        System.out.println("The Greatest element is " + x);

    }


    //Method Declaration
    public static int MaxElement(int[] array) {
        int Max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }


        }
        return Max;
    }


}
