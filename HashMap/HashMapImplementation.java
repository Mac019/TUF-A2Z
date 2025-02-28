package HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // 2. Insert Key-Value Pairs
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);

        // 3. Retrieve a Value
        System.out.println("Alice's Marks: " + studentMarks.get("Alice"));

        // 4. Check if a Key Exists
        if (studentMarks.containsKey("Bob")) {
            System.out.println("Bob's Marks: " + studentMarks.get("Bob"));
        }

        // 5. Check if a Value Exists
        if (studentMarks.containsValue(78)) {
            System.out.println("A student has scored 78.");
        }

        // 6. Remove a Key-Value Pair
        studentMarks.remove("Charlie");
        System.out.println("After removing Charlie: " + studentMarks);

        // 7. Iterate Over the HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Get Only Keys
        System.out.println("Keys: " + studentMarks.keySet());

        // 9. Get Only Values
        System.out.println("Values: " + studentMarks.values());

        // 10. Get Size of HashMap
        System.out.println("Size of HashMap: " + studentMarks.size());
    }
}
