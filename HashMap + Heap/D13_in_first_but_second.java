import java.util.*;
import java.lang.*;
import java.io.*;

class D13_in_first_but_second {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] num = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextLong();
        }
        int m = scn.nextInt();
        long[] num2 = new long[m];
        for (int i = 0; i < m; i++) {
            num2[i] = scn.nextLong();
        }
        solve(num, num2, n, m);
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input two arrays and lengths.
    // It should print required output.
    public static void solve(long a[], long b[],int n, int m)
    {
        HashSet<Long> set = new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(b[i]);
        }
        for (int i=0;i<n;i++){
            if(!set.contains(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
}