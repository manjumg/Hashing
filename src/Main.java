import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Create HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            // Increment count if key exists, else put 1
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 4: Find the most frequent element
        int mostFrequent = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        // Step 5: Display result
        System.out.println("\nFrequency of each element: " + frequencyMap);
        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("It appears " + maxCount + " times.");

        sc.close();
    }
}
