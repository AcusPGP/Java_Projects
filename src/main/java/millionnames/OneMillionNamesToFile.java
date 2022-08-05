package millionnames;

import java.io.*;

public class OneMillionNamesToFile {
    public static void main(String[] args) throws IOException {
        long beign = System.currentTimeMillis();
        file();
        int num = 4600000;
        findNumber(num);
        long end = System.currentTimeMillis();
        long time = end - beign;
        System.out.println("Time :" + time + " milli seconds." );

    }

    public static void file() {
        try {
            File file = new File("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt");
                for (int i = 0; i < 5000000; i++) {
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
