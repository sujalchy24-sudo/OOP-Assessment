import java.io.*;


public class Q4_WordCounter {

    public static void main(String[] args) {
        // Create sample file for demo
        createSampleFile();

        String filePath = "sample.txt";
        int wordCount   = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    // Split by one or more whitespace characters
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
            return;
        }

        System.out.println("File: " + filePath);
        System.out.println("Total word count: " + wordCount);
    }

    private static void createSampleFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("sample.txt"))) {
            pw.println("The quick brown fox jumps over the lazy dog.");
            pw.println("Java file I/O is powerful and flexible.");
            pw.println("BufferedReader makes reading text files easy.");
        } catch (IOException e) {
            System.err.println("Could not create sample.txt: " + e.getMessage());
        }
    }
}