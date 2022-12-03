package com.jc.xiaobai.oop9;

public enum WeekDays03 {
    MONDAY("加",1), TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;

    int index;
    private String name;

    private WeekDays03(){

    }



    private WeekDays03(String name,int index){
        this.name = name;
        this.index =index;
    }

    @Override
    public String toString() {
        return MONDAY("加",1);
    }

    private String MONDAY(String name, int index) {
        WeekDays03 we = WeekDays03.MONDAY;
        MONDAY.name = name;
        MONDAY.index = index;
        return "对象名字："+name()+"\n姓名："+name+"\n序号："+index;
    }
}
