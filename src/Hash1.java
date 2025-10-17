import java.util.HashMap;
import java.util.Scanner;

public class Hash1 {
    public static void main(String[] args) {

        HashMap<String, String> populationMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Adding elements to a HashMap using Scanner
        System.out.println("Enter number of countries to add:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name: ");
            String country = sc.nextLine();

            System.out.print("Enter population (e.g., 130cr): ");
            String population = sc.nextLine();

            populationMap.put(country, population);
        }

        System.out.println("\nInitial HashMap: " + populationMap);

        // 2️⃣ Retrieving values from a HashMap
        System.out.print("\nEnter country to retrieve its population: ");
        String keyToGet = sc.nextLine();
        System.out.println("Population of " + keyToGet + ": " + populationMap.get(keyToGet));

        // 3️⃣ containsKey(Object key): Checks if a key exists
        System.out.print("\nEnter a country to check if it exists: ");
        String keyToCheck = sc.nextLine();
        System.out.println("Does country '" + keyToCheck + "' exist? " + populationMap.containsKey(keyToCheck));

        // 4️⃣ containsValue(Object value): Checks if a population value exists
        System.out.print("\nEnter a population value to check (e.g., 60cr): ");
        String valueToCheck = sc.nextLine();
        System.out.println("Does population '" + valueToCheck + "' exist? " + populationMap.containsValue(valueToCheck));

        // 5️⃣ remove(Object key): Removes an entry by its key
        System.out.print("\nEnter a country to remove: ");
        String keyToRemove = sc.nextLine();
        populationMap.remove(keyToRemove);
        System.out.println("After removing '" + keyToRemove + "': " + populationMap);

        // 6️⃣ replace(KeyType key, ValueType newValue): Updates the value for an existing key
        System.out.print("\nEnter a country to update its population: ");
        String keyToReplace = sc.nextLine();
        if (populationMap.containsKey(keyToReplace)) {
            System.out.print("Enter new population value: ");
            String newValue = sc.nextLine();
            populationMap.replace(keyToReplace, newValue);
            System.out.println("After updating: " + populationMap);
        } else {
            System.out.println("Country not found!");
        }

        // ✅ Iterating over all entries
        System.out.println("\nFinal Country-Population List:");
        for (String country : populationMap.keySet()) {
            System.out.println("Country: " + country + ", Population: " + populationMap.get(country));
        }

        sc.close();
    }
}
