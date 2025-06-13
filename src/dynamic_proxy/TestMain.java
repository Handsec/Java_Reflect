/**
 * @author hands
 * @date 2025/5/10 23:35
 */
package dynamic_proxy;

public class TestMain {
    public static void main(String[] args){
        /*需求:
        外面的人想要大明星唱一首歌
        1.获取代理的对象
                代理对象 = ProxyUti1.createProxy(大明是的对象);
        2.再调用代理的唱歌方法
                代理对象.唱歌的方法("只因你太美");
       */

        // 1. 获取代理的对象
        BigStar bigStar = new BigStar("蔡徐坤");
        Star proxy = ProxyUtil.createProxy(bigStar);

        // 2.调用唱歌的方法
        // proxy.sing("只因你太美"); //无返回值，不说谢谢
        String result1 = proxy.sing("只因你太美");
        System.out.println(result1);
        // 3.调用跳舞的方法
        proxy.dance();
        System.out.println("---跳舞结束--");
        // 4.调用rap的方法
        String rap = proxy.rap("rap");
        System.out.println(rap);


    }
}
