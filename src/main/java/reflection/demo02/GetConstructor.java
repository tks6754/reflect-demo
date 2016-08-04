package reflection.demo02;

import java.lang.reflect.Constructor;

/**
 * 获取类的构造函数
 *
 * Created by miaokun on 2016/8/4.
 */
public class GetConstructor {
    //构造函数一
    GetConstructor(int a) {

    }

    //构造函数二
    GetConstructor(int a, String b) {

    }

    public static void getConstructorInfo(String className) {
        try {
            //获得类的对象
            Class cl = Class.forName(className);
            System.out.println("获得类" + className + "所有的构造函数");
            Constructor ctorlist[] = cl.getDeclaredConstructors();
            System.out.println("遍历构造函数\n");
            for (int i = 0; i < ctorlist.length; i++) {
                Constructor con = ctorlist[i];
                System.out.println("这个构造函数的名字为：" + con.getName());
                System.out.println("通过构造函数获得这个类的名字为：" + con.getDeclaringClass());

                Class cp[] = con.getParameterTypes();//获得参数
                for (int j = 0; j < cp.length; j++) {
                    System.out.println("参数 " + j + " 为 " + cp[j] + "\n");
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        GetConstructor.getConstructorInfo("reflection.demo02.GetConstructor");
    }

}
