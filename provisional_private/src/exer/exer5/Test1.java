package exer.exer5;

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
    }
}
