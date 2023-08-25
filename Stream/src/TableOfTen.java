public class TableOfTen {
    public static void main(String[] args) {
        int mul = 1;
        int k=10;
        System.out.println("Table of 10");
        for (int i = 10; i<=100; i+=10) {
            System.out.println(k+"*"+mul +"="+i);
            mul++;
        }
    }
}
