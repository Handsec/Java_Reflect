package dynamic_proxy;

public interface Star {

    //我们可以把所有下那个要被代理的方法定义在接口当中
    String sing(String name);

    void dance();
    String rap(String rap);
}
