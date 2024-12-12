package Day1.arrays;
import java.util.*;

public class AmazonPractice {

    public static void validateMethod(String barcodeinput){
        // Split the configurations by '|'
        String[] configs = barcodeinput.split("\\|");

        Map<Integer, String> orderedConfigs = new TreeMap<>();
        Set<String> uniqueCodes = new HashSet<>();
        Set<Integer> ordinalSet = new HashSet<>();

        for (String config : configs) {
            if (config.length() <= 4) {
                System.out.println("Invalid configuration");
                return;
            }

            String ordinalStr = config.substring(0, 4);
            String configValue = config.substring(4);

            // Validate ordinal index
            int ordinal;
            try {
                ordinal = Integer.parseInt(ordinalStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid configuration");
                return;
            }

            if (ordinal == 0 || ordinalStr.equals("0000") || ordinalSet.contains(ordinal)) {
                System.out.println("Invalid configuration");
                return;
            }
            ordinalSet.add(ordinal);

            // Validate configuration value
            if (configValue.length() != 10 || !configValue.matches("[a-zA-Z0-9]+") || uniqueCodes.contains(configValue)) {
                System.out.println("Invalid configuration");
                return;
            }
            uniqueCodes.add(configValue);

            // Store in TreeMap to maintain order
            orderedConfigs.put(ordinal, configValue);
        }

        // Check for missing ordinal indices
        for (int i = 1; i <= ordinalSet.size(); i++) {
            if (!ordinalSet.contains(i)) {
                System.out.println("Invalid configuration");
                return;
            }
        }

        int expectedIndex = 1;
        for (int index : orderedConfigs.keySet()) {
            if (index != expectedIndex) {
                System.out.println("Invalid configuration: Missing ordinal index.");
                return;
            }
            expectedIndex++;
        }

        // Build the result string in the correct order with new lines
        StringBuilder result = new StringBuilder();
        result.append("[").append("\n");
        for (String value : orderedConfigs.values()) {
            result.append(value).append("\n");
        }
        result.append("]");

        // Return the formatted result
        System.out.println(result);
        //In case method return this
    }
    public static void main(String[] args) {
        String barcodeinput = "000533B8XLD2EZ|0001DJ2M2JBZZR|0002Y9YKoA7MYO|0004IKDJCAPG5Q|0003IBHMH59SBO";
        validateMethod(barcodeinput);

    }


}
