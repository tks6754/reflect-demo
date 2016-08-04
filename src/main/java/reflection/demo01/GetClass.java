package reflection.demo01;

/**
 * 获得Class类对象的方法
 * <p/>
 */
public class GetClass {
    public boolean ClassCheck() {
        try {
            System.out.println("第一种，通过类本身获得对象");
            Class UserClass = this.getClass();
            System.out.println("第一种方式成功！类名：" + UserClass.toString() + "\n");

            System.out.println("第二种，通过子类实例获取父类");
            UserInfo ui = new UserInfo();
            UserClass = ui.getClass();
            Class SubUserClass = UserClass.getSuperclass();
            System.out.println("第二种方式成功！类名：" + SubUserClass.toString() + "\n");

            System.out.println("第三种，通过类名加.class获得对象");
            Class ForClass = UserInfo.class;
            System.out.println("第三种方式成功！类名：" + ForClass.toString() + "\n");

            //常用，结合配置文件一起使用，灵活
            System.out.println("第四种，通过类名的字符串获得对象");
            Class ForName = Class.forName("UserInfo");
            System.out.println("第四种方式成功！类名：" + ForName.toString() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public static void main(String[] args) {
        GetClass gc = new GetClass();
        gc.ClassCheck();
        if (gc.ClassCheck()) {
            System.out.println("所有反射全部成功！");
        } else {
            System.out.println("反射有问题，请检查！");
        }
    }

}
