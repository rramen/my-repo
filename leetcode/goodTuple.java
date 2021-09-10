public class goodTuple {
    public static int tuple(int[] a) {
        int count = 0, check = 0;

        for(int i = 1; i < a.length - 1; i++) {
            if(a[i-1] == a[i]) {check++;}
            if(a[i-1] == a[i+1]) {check++;}
            if(a[i] == a[i+1]) {check++;}
            if(check == 2) {
                count++;
            }
            check = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,1,1,2,1,3,4};
        System.out.print(tuple(a));
    }
}
