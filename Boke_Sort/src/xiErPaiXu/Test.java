package xiErPaiXu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        ShellSort.shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
