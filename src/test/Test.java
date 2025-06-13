/**
 * @author hands
 * @date 2025/5/9 17:29
 */
package test;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(Secret.getSecret());
    }

    public static class Secret {
        public static String secret = "hands";

        public static String getSecret() {
            return secret;
        }
    }

}

