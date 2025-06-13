/**
 * @author hands
 * @date 2025/5/10 23:04
 */
package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 类的作用：
 *      创建一个代理
 *
 * */
public class ProxyUtil {
    /*
     * 方法的作用：
     *       给一个明显的对象，创建一个代理
     * 形参：
     *       被代理的明星对象
     *
     * 返回值：
     *       给明星创建的代理
     *
     *  需求：
     *
     * */

    /**
     * 创建一个大明星的代理对象
     * 该方法的目的是为了在不修改原有大明星对象的基础上，添加额外的功能或行为控制
     * 例如，可以添加权限控制、日志记录等，而不必直接修改大明星对象的代码
     *
     * @param bigStar 大明星对象，通过这个对象，代理可以访问大明星的原始行为和属性
     * @return 返回一个代理对象，该对象封装了大明星对象，并可以在调用大明星的方法前后添加额外的操作
     */
    public static Star createProxy(BigStar bigStar) {

        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(), //参数一：类加载器，去加载生成的代理类
                new Class[]{Star.class,},         //参数二：被代理对象的接口，代理对象必须实现这个接口
                //参数三：代理对象需要实现的方法，以及如何实现
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                         * 参数一：代理的对象
                         * 参数二：代理对象需要实现的方法
                         * 参数三：代理对象需要实现的方法对应的参数
                         * 返回值：代理对象需要实现的方法对应的返回值
                         *
                         * */

                        System.out.println("开始代理");
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }else if ("rap".equals(method.getName())){
                            System.out.println("准备rap，收钱");
                        }
                        // 去找大明星开始唱歌或者跳舞
                        // 代码的表现形式：调用大明星里面唱歌或者跳舞的方法
                        return method.invoke(bigStar, args);
                    }
                }

        );
        return star;
    }
}
