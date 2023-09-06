public class MissingNumberOfAnArray {
    public static void main(String[] args) {
     int [] GivenArray={2,4,5,1,6,};
   int a =   MissingELement(GivenArray);
        System.out.println("The Missing numbers are from the Array is :"+a);
    }
    public static void Print(int [] p){
        for (int i = 0; i <p.length ; i++) {
            System.out.println(p[i]);

        }
    }

    public static int MissingELement(int [] Array){
        int n = Array.length+1;
        int Sum = n*(n+1)/2;

        for (int i = 0; i < Array.length; i++) {

            Sum-=Array[i];

        }
        return Sum;
    }

}
