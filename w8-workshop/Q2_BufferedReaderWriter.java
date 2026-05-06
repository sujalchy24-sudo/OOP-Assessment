import java.io.*;


public class Q2_BufferedReaderWriter {

    public static void main(String[] args) {
        String sourcePath = "one.txt";
        String destPath   = "two.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(sourcePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destPath))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();           // preserve line breaks
            }

            System.out.println("File copied successfully using BufferedReader/BufferedWriter.");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
