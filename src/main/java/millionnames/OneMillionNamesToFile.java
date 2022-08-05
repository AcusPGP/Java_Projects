package millionnames;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OneMillionNamesToFile {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter("/Users/macbook/IdeaProjects/Java_Projects/OneMillionNames.txt");
                for (int i = 0; i < 1000000; i++) {
                    writer.write("Nguyen Van " + i +"\n");
                }
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
