package reflection.demo02;

/**
 * Created by miaokun on 2016/8/4.
 */
public class GetParentClass {
    public static String getParentClass(UserInfoMore uim) {
        //获得父类
        Class uimc = uim.getClass().getSuperclass();
        System.out.println("获得父类的名字为：" + uimc.getName());
        return uimc.getName();
    }

    public static void searchParentClass() {
    }

    public static void main(String[] args) {
        UserInfoMore uim = new UserInfoMore();
        System.out.println("成功获得UserInfoMore的父类：" + GetParentClass.getParentClass(uim));
    }

}
