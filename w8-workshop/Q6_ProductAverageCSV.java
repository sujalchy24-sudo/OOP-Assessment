import java.io.*;
import java.util.*;


public class Q6_ProductAverageCSV {

    // ---------- Main ----------
    public static void main(String[] args) {
        createSampleProductFile();      // demo data

        String inputFile  = "products.txt";
        String outputFile = "product_averages.csv";

        // Map: product name -> list of prices
        Map<String, List<Double>> productMap = new LinkedHashMap<>();

        // --- Read products.txt ---
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                if (firstLine && line.toLowerCase().startsWith("product")) {
                    firstLine = false;  // skip header
                    continue;
                }
                firstLine = false;

                String[] parts = line.split(";");
                if (parts.length < 2) continue;

                String product = parts[0].trim();
                // Remove commas from numbers like 40,000.0
                String priceStr = parts[1].trim().replace(",", "");

                try {
                    double price = Double.parseDouble(priceStr);
                    productMap.computeIfAbsent(product, k -> new ArrayList<>()).add(price);
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid price: " + parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            return;
        }

        // --- Compute averages and write CSV ---
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("PRODUCT,AVERAGE_PRICE");
            bw.newLine();

            for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
                String name = entry.getKey();
                List<Double> prices = entry.getValue();

                double sum = 0;
                for (double p : prices) sum += p;
                double avg = sum / prices.size();

                bw.write(String.format("%s,%.2f", name, avg));
                bw.newLine();

                System.out.printf("Product: %-15s | Prices: %-30s | Average: %.2f%n",
                        name, prices, avg);
            }
            System.out.println("\nAverages written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }

    // Helper: create sample products.txt
    private static void createSampleProductFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("products.txt"))) {
            pw.println("product;price");
            pw.println("Laptop;40000.0");
            pw.println("SmartPhone;50000.0");
            pw.println("SmartPhone;60000.0");
            pw.println("Laptop;80000");
            pw.println("Tablet;35000.0");
            pw.println("Tablet;45000.0");
            pw.println("Headphones;5000.0");
        } catch (IOException e) {
            System.err.println("Could not create products.txt: " + e.getMessage());
        }
    }
}