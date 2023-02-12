import java.util.Arrays;

public class CuSu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] cs = new int[arr.length];

        cumSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cumSum[i] = cumSum[i - 1] + arr[i];
        }

        System.out.println("Cumulative Sum: " + Arrays.toString(cs));
    }
}

