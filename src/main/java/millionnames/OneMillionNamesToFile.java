package millionnames;

import java.io.*;

public class OneMillionNamesToFile {
    public static void main(String[] args) throws IOException {
        file();
        int num = 999999;
        findNumber(num);
    }

    public static void file() {
        try {
            File file = new File("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt");
                for (int i = 0; i < 1000000; i++) {
                    writer.write("Nguyen Van " + i + "\n");
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void findNumber(int num) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt"));
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] array = currentLine.split(" ");
            int t = Integer.parseInt(array[2]);
            if (t == num) {
                System.out.println(currentLine + "\n");
                reader.close();
                break;
            }
        }
        reader.close();
    }
}
