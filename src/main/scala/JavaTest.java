import java.util.stream.Stream;

public class JavaTest {
    public static void run(Runnable runnable) {
        runnable.run();
    }

    public static void main(String[] args) {
        run(() -> System.out.println("java-java"));
        ScalaTest.run(() -> System.out.println("java-scala"));
        System.out.println(Stream.class);
    }
}
