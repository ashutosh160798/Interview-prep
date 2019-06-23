import java.util.*;

public class D13_num_of_pair_sum_in_matrix {

    // This is a functional problem. You have to complete this function.
    // It takes as input two matrices and k.
    // It should return the count of pairs with sum k.
    public static int solve(int[][] num1, int[][] num2, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                map.put(num1[i][j], map.getOrDefault(num1[i][j], 0) + 1);
            }
        }
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                if(map.containsKey(k-num2[i][j])){
                    count+=map.get(k-num2[i][j]);
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for size of matrices.
        int N = sc.nextInt();

        int[][] mat1 = new int[N][N];

        // Input for first matrix
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int[][] mat2 = new int[N][N];

        // Input for second matrix.
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int K = sc.nextInt();

        System.out.println(solve(mat1, mat2, K));

    }

    // Function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}