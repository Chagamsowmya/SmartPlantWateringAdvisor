import java.util.Scanner;

public class SmartPlantWateringAdvisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("=== Smart Plant Watering Advisor ===");

        // Input collection
        System.out.print("Enter Plant Name: ");
        String plant = scanner.nextLine();

        System.out.print("Enter Soil pH: ");
        double ph = scanner.nextDouble();

        System.out.print("Enter Temperature (°C): ");
        double temp = scanner.nextDouble();

        System.out.print("Enter Humidity (%): ");
        double humidity = scanner.nextDouble();

        // Generate and display advice
        String advice = getWateringAdvice(plant, ph, temp, humidity);
        System.out.println("\n" + advice);
    }

    // Method to provide smart watering advice
    public static String getWateringAdvice(String plant, double ph, double temp, double humidity) {
        StringBuilder advice = new StringBuilder();

        advice.append("🪴 Plant: ").append(plant).append("\n");

        // Soil pH feedback
        if (ph < 6.0) {
            advice.append("⚠️ Soil is too acidic. Add lime to adjust pH.\n");
        } else if (ph > 7.5) {
            advice.append("⚠️ Soil is alkaline. Add sulfur to reduce pH.\n");
        } else {
            advice.append("✅ Soil pH is good for most plants.\n");
        }

        // Humidity-based watering schedule
        if (humidity < 30) {
            advice.append("💧 Water daily due to low humidity.\n");
        } else if (humidity < 60) {
            advice.append("💧 Water every 2 days.\n");
        } else {
            advice.append("💧 Water twice a week (humidity is high).\n");
        }

        // Temperature advice
        if (temp > 35) {
            advice.append("🌇 Water in the evening to reduce evaporation.\n");
        } else {
            advice.append("🌅 Water early in the morning.\n");
        }

        return advice.toString();
    }
}
