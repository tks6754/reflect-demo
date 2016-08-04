package reflection.demo02;

/**
 * 获得类实现的接口
 * <p/>
 * Created by miaokun on 2016/8/4.
 */
public class GetInterfaces {
    public static void getInterfaces(String className) {
        try {
            //取得类
            Class clazz = Class.forName(className);
            Class[] ifs = clazz.getInterfaces();
            for (int i = 0; i < ifs.length; i++) {
                String IName = ifs[i].getName();
                System.out.println("该类实现的接口名字为：" + IName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GetInterfaces.getInterfaces("reflection.demo02.Student");
    }

}
