/**
 * @author hands
 * @date 2025/5/10 22:53
 */
package dynamic_proxy;

public class BigStar implements Star{
    private String name;


    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    //唱歌 跳舞
    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在唱" + name);
        return "--------thanks--------";

    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在跳舞");
    }

    public String rap(String rap){
        System.out.println(this.name + "正在rap");
        return "------rap 结束，thanks-------";
    }
    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "BigStar{name = " + name + "}";
    }

}

