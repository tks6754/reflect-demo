package reflection.demo02;

import reflection.demo01.UserInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获得类和类属性的修饰符
 * <p/>
 * Created by miaokun on 2016/8/4.
 */
public class GetModifiers {
    private String username = "liu shui jing";
    float f = Float.parseFloat("1.000");
    public static final int i = 37;

    //获得类的修饰符
    public static String useModifiers(UserInfo ui) {
        Class uiClass = ui.getClass();
        int m = uiClass.getModifiers();
        return Modifier.toString(m);
    }

    //获得本类属性的修饰符
    public void checkThisClassModifiers() {
        Class tc = this.getClass();
        Field fl[] = tc.getDeclaredFields();

        for (int i = 0; i < fl.length; i++) {
            System.out.println("第" + (i + 1) + "个属性的修饰符为：" + Modifier.toString(fl[i].getModifiers()));
        }

    }

    public static void main(String[] args) {

        //获得类的修饰符
        UserInfo ui = new UserInfo();
        System.out.println("获得这个类的修饰符：" + GetModifiers.useModifiers(ui) + "\n");

        //获得本类属性的修饰符
        GetModifiers gm = new GetModifiers();
        gm.checkThisClassModifiers();

    }


}
