package exception;

public class AdultPerson {
    private int age;
    private int height;

    public AdultPerson(){

    }

    public AdultPerson(int age,int height){
        if(age<=0||height<=0){
            throw new NotAdultPerson("不是成年人");
        }
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public void setAge(int age){
        if(age <= 0){
            throw new NotAdultPerson("不是成年人");
        }

        this.age = age;
    }

    public void setHeight(int height){
        if(height <= 0){
            throw new NotAdultPerson("不是成年人");
        }

        this.height = height;
    }
}
