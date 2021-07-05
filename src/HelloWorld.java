import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * @author jiayongpeng
 * @create 2021-07-04-6:57 下午
 * @date 2021/7/4
 */
public class HelloWorld {
    private static final String  str="1";
    public static final int NUM=1;

    private static int num;

    public static void main(String[] args) {
        testFunc();
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + args);
        System.out.println("HelloWorld.main");
        System.out.println("");
    }

    private static void testFunc() {
        //region Test
        System.out.println("Hello World!");
        //endregion
        ArrayList list1 = new ArrayList();
        list1.add(123);
        list1.add(456);
        for (Object o : list1) {

        }

        for (int i = 0; i < list1.size(); i++) {

        }

        for (int i = list1.size() - 1; i >= 0; i--) {

        }

        if (list1 == null) {

        }

        if (num == 0) {

        }

        if (list1 != null) {

        }

        if (list1 != null) {

        }

        if (list1 == null) {

        }




        new Date();
        list1.add(123,"sss");
    }

    public  static void method(){
        num = 10;
        try {
            FileInputStream fis=new FileInputStream("Hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void testUpdate(){
        //aaa
    }
   /**
    *
    * test
    */
   private int Num1 = 0;

}
