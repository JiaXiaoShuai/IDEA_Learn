package exer.exer5;

/**
 * 包装类的一些使用方法和注意事项
 */
public class Test1 {
    public static void main(String[] args) {
        int a = Integer.parseInt("54664");
        System.out.println(a);

        /*int a1 = Integer.parseInt("wo");
        System.out.println(a1);//会报错数字格式异常NumberFormatException*/

        boolean b = Boolean.parseBoolean("TrUEdsde");
        System.out.println(b);//除了true大小写混合之外，其余的字母组合结果都是false

        boolean c = Boolean.valueOf("True");
        System.out.println(c);

        int a2 = Integer.MAX_VALUE;
        System.out.println(a2);
        a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        char c1 = Character.toLowerCase('D');
        char c2 = Character.toUpperCase('d');
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toHexString(32));
        System.out.println(Integer.toOctalString(32));

        Integer a1 = 128;
        Integer a3 = 129;//包装类缓存对象为了防止需要一个数就创建一个对象而设定的（对象多的话会占用内存）
        System.out.println(a1);
        System.out.println(a3);
        System.out.println(a1==a3);//false 包装类缓存对象-128~127之间，超过了相当于创建了新的对象（地址都不一样了）

        Integer m = new Integer(1);//新new的在堆中
        Integer n = 1;//这个用的是缓冲常量在方法区
        System.out.println(m==n);//false

        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1==d2);//false 比较地址，没有缓存对象，每一个都是新new的

        Integer i = 1000;
        double j =1000;
        System.out.println(i==j);//true i会自动拆箱为int，然后根据基本数据类型“自动类型转换”规则，转为double比较

        Integer i1 = 1000;
        int j1 = 1000;
        System.out.println(i1 == j1);//true 会自动拆箱，按照基本数据类型进行比较

        /*Integer i2 = 1;
        Double  d3 = 1.0;
        System.out.println(i2==d3);//编译报错*/


        int q = 1;
        Integer w = new Integer(180);
        Cricle e = new Cricle();
        change(q,w,e);
        System.out.println(q+"\t"+w+"\t"+e.radius);//包装类虽是对象，但是在方法的传递机制上是“不可变”对象，即一旦修改就是新对象，和实参无关
    }
    public static void change(int a,Integer b,Cricle c){
        a +=10;
        b +=10;
        c.radius +=10;
    }
}
class Cricle{
    double radius;
}