package java8;

public class Java8User implements Java8DefaultInterface {

    public static boolean isRealUser(String realUser) {
        return realUser.equalsIgnoreCase("real");
    }

    @Override
    public void proceed() {
        System.out.println("Java8User:: proceed");
    }
}
