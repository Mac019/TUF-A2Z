public class SimpleBacktracking {

    public static void findPaths(int current, int target, String path) {
        if (current == target) {
            System.out.println(path);
            return;
        }

        if (current > target) {
            return; // invalid path
        }

        // Try +1
        findPaths(current + 1, target, path + "1 ");

        // Try +2
        findPaths(current + 2, target, path + "2 ");
    }

    public static void main(String[] args) {
        findPaths(0, 3, "");
    }
}
