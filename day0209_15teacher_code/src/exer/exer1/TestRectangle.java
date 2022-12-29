package exer.exer1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(12,2);
        Rectangle re1;
        Object re2;
        try{
            re1 = (Rectangle) re.clone();
            System.out.println(re1);
            System.out.println(re1==re);

            re2 = re.clone();
            System.out.println(re2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            re1 = new Rectangle();
            re1.setLength(re.getLength());
            re1.setWidth(re.getWidth());
        }

        System.out.println(re1);
    }
}
