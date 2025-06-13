import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        // 定义内部类 Secret
        class Secret {
            private String secretCode = "123456";
        }

        // 获取 Class 对象
        Class<?> clazz = Secret.class;

        // 创建对象实例
        Object secret = clazz.getDeclaredConstructor().newInstance(); // 替代已废弃的 clazz.newInstance()

        // 获取私有字段
        Field field = clazz.getDeclaredField("secretCode");

        // 设置可访问，绕过 private 修饰符
        field.setAccessible(true);

        // 获取字段值
        String code = (String) field.get(secret);
        System.out.println(code); // 输出：123456
    }
}
