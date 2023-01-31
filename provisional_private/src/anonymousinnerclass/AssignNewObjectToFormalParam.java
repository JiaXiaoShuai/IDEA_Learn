package anonymousinnerclass;

public class AssignNewObjectToFormalParam {
    MyData swap(MyData my){
        my = new MyData(); //这里让my形参指向了新对象，此时堆中有两个MyData对象，和main中的data对象无关
        int temp = my.x;
        my.x = my.y;
        my.y = temp;
        return my;
    }

    public static void main(String[] args) {
        //创建这个对象的目的是为了调用swap方法
        AssignNewObjectToFormalParam tools = new AssignNewObjectToFormalParam();

        MyData data = new MyData();
        data.x = 1;
        data.y = 2;
        System.out.println("交换之前：x = " + data.x +",y = " + data.y);//1,2
        tools.swap(data);//调用完之后，x与y的值交换？
        System.out.println("这个是"+tools.swap(data).x);
        System.out.println("这个是"+tools.swap(data).y);
        System.out.println("交换之后：x = " + data.x +",y = " + data.y);//1,2

    }
}
