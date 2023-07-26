

// Finding Minimum Element from an Array

public class MiniumElement {
    public static void main(String[] args) {
    int [] Array = {56,45,34,34,4,5};
    int x = Minimum(Array);
        System.out.println("The Minimum value of an array "+ x);


    }


    public static int Minimum(int [] Array){
        int Minimum = Array[0];  // we store the first element of Array
        for (int i = 1; i < Array.length; i++) {

            if (Array[i]<Minimum) {  // if the next value is less than the minimum , then the minimum value will update
                Minimum=Array[i];
            }

        }
        return Minimum;
    }
}
