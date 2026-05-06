import java.io.*;
import java.util.*;


public class Q3_OddEvenSplitter {

    // ---------- Read numbers from file ----------
    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Numbers may be space-separated on one or many lines
                String[] tokens = line.trim().split("\\s+");
                for (String token : tokens) {
                    if (!token.isEmpty()) {
                        numbers.add(Integer.parseInt(token));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return numbers;
    }

    // ---------- Filter even numbers ----------
    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) evens.add(n);
        }
        return evens;
    }

    // ---------- Filter odd numbers ----------
    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> odds = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 != 0) odds.add(n);
        }
        return odds;
    }

    // ---------- Write numbers to file ----------
    public void write(List<Integer> numbers, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int n : numbers) {
                bw.write(String.valueOf(n));
                bw.newLine();
            }
            System.out.println("Written to " + filePath + ": " + numbers);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    // ---------- Main ----------
    public static void main(String[] args) {
        // Create sample numbers.txt
        createSampleFile();

        Q3_OddEvenSplitter splitter = new Q3_OddEvenSplitter();

        List<Integer> allNumbers = splitter.read("numbers.txt");
        System.out.println("All numbers: " + allNumbers);

        splitter.write(splitter.getEven(allNumbers), "even.txt");
        splitter.write(splitter.getOdd(allNumbers),  "odd.txt");

        System.out.println("Done! Check odd.txt and even.txt.");
    }

    private static void createSampleFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("numbers.txt"))) {
            pw.println("1 2 3 4 5 6 7 8 9 10");
        } catch (IOException e) {
            System.err.println("Could not create numbers.txt: " + e.getMessage());
        }
    }
}