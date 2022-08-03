package millionnames;

public class OneMillionNamesR {
    public static void main(String[] args) {
        name(1);
    }
    public static String name(int n) {
        if(n == 1000001) {
            return "Finished";
        }
        System.out.println("Nguyen Van " + n);
        return name(n+1);
    }
}
