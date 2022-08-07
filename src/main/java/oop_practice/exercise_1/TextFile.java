package oop_practice.exercise_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {
    public void text(String id, String name, String age, String address, String type) {
        try {
            File file = new File("/Users/macbook/IdeaProjects/Java_Projects/file.txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter("/Users/macbook/IdeaProjects/Java_Projects/file.txt");
                String text = id + " " + name + " " + age + " " + address + " " + type;
                writer.write(text + "\n");
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
