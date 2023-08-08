public class LinearSearch {
    public static void main(String[] args) {
    int [] Array ={2,43,56,78,89,45};
    int a = Search(Array,78);
        System.out.println(a);
    }

    public static int Search(int [] ar, int x){
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == x) {{
                return i;
            }
            }

        }
        return -1;
    }

}
