package Arrays.Easy;

public class RemoveDuplicates {

    static int removedups(int container[], int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (container[j] != container[i]) {
                i++;
                container[i] = container[j];
            }
        }
        return i + 1;
    }

    public static void main(String args[]) {
        int container[] = {1, 1, 2, 2, 2, 3, 3};
        int n = container.length;
        int count = removedups(container, n);
        for (int k = 0; k < count; k++) {
            System.out.print(container[k] + " ");
        }
    }
}

