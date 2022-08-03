package millionnames;

public class OneMillionNamesF {
    public static void main(String[] args) {
        name();
    }

    public static void name() {
        int i = 1000000;
        for (int n = 1; n <= i; n++) {
            System.out.println("Nguyen Van " + n);
        }
    }
}
