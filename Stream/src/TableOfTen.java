public class TableOfTen {
    public static void main(String[] args) {
        int mul = 1;
        int k=10;
        System.out.println("Table of 10");
        for (int i = 10; i<=100; i+=10) {
            System.out.println(k+"*"+mul +"="+i);
            mul++;
        }
        System.out.println("Table in reverse order");

        // Table in Reverse order
        for (int i = 10; i >=1; i--) {
            System.out.println(k +"*"+i +"=" + i*k);

        }
    }
}
