package java8;

/**
 * In java 8, Interface can define default and static method.
 */

public interface Java8DefaultInterface {

    public void proceed() ;

    default String getOverview() {
        return "ATV made by " + producer();
    }

    static String producer() {
        return "Default method";
    }
}
