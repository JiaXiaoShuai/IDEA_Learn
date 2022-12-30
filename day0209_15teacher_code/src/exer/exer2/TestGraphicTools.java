package exer.exer2;

public class TestGraphicTools {
    public static void main(String[] args) {
        try{
            GraphicTools.printRectangle(5,5,'*');
        }catch (InvalidValueException e){
            e.printStackTrace();
        }
    }
}
