package tP2fichier;

import java.io.*;

public class TestCopy {
    public static void main(String[] args) throws IOException {
    	File inputFile = new File("D:\\fichiers\\in.txt");
    	File outputFile = new File("D:\\fichiers\\out.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    bw.write(parts[0] + " " + parts[1]);
                    bw.newLine();
                }
            }

            System.out.println("Copie du fichier terminée.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
