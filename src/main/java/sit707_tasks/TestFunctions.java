package sit707_tasks;

public class TestFunctions {

    public int add(int a, int b) {
        return a + b;
    }

    public String concat(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("Input cannot be null");
        }
        return a + b;
    }

}
