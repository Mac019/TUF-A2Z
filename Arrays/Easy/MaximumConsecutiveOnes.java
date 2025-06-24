class Main {

    // Function to find the maximum number of consecutive 1s
    int findMaxConsecutiveOnes(int[] arr, int n) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
            0, 0, 0, 
            1, 1, 1, 
            0, 0, 0, 0, 0, 0, 0, 
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        };
        int n = arr.length;

        Main mac = new Main();
        int result = mac.findMaxConsecutiveOnes(arr, n);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
