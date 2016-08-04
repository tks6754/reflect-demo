package reflection.demo02;

import java.lang.reflect.Method;

/**
 * 获得类方法
 * <p/>
 * Created by miaokun on 2016/8/4.
 */
public class GetMethod {
    public static void getMethods(String className) {
        try {
            System.out.println("开始遍历类" + className + ".class");
            //获得类名
            Class cls = Class.forName(className);
            //利用方法获得所有该类的方法
            System.out.println("利用类的getDeclaredMethods获得类的所有方法");
            Method ml[] = cls.getDeclaredMethods();
            System.out.println("遍历获得的方法数组\n");
            for (int i = 0; i < ml.length; i++) {
                System.out.println("开始遍历第" + (i + 1) + "个方法");
                Method m = ml[i];
                System.out.println("开始获取方法的变量类型");
                Class ptype[] = m.getParameterTypes();
                for (int j = 0; j < ptype.length; j++) {
                    System.out.println("方法参数" + j + "类型为" + ptype[j]);
                }
                Class gEx[] = m.getExceptionTypes();
                for (int j = 0; j < gEx.length; j++) {
                    System.out.println("异常" + j + "为" + gEx[j]);
                }
                System.out.println("该方法的返回值类型为：" + m.getReturnType() + "\n");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GetMethod.getMethods("reflection.demo01.UserInfo");
    }
}
