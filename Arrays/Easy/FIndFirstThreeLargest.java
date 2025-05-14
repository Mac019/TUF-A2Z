package Arrays.Easy;

public class FIndFirstThreeLargest {

    public static void main(String[] args) {
        int[] n = {1, 5, 3, 9, 2, 8, 7};

        int first = n[0];
        int second = n[0];
        int third = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > first) {
                third = second;
                second = first;
                first = n[i];
            } else if (n[i] > second && n[i] != first) {
                third = second;
                second = n[i];
            } else if (n[i] > third && n[i] != second && n[i] != first) {
                third = n[i];
            }
        }

        System.out.println("Largest: " + first);
        System.out.println("Second Largest: " + second);
        System.out.println("Third Largest: " + third);
    }
}

