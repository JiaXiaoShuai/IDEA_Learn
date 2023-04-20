package com.jc.date;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

/**
 * 第三代：
 *  LocalDate、LocalTime、LocalDateTime
 *  ZoneId和ZoneDateTime
 *  持续日期/时间：Period和Duration
 */
public class TestThree {
    @Test
    public void test01(){
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate kai = LocalDate.of(2022,2,5);
        System.out.println(kai);

    }

    @Test
    public void test02(){
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime of = LocalTime.of(12,0,0);
        System.out.println(of);
    }

    @Test
    public void test03(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime of = LocalDateTime.of(2022,2,4,8,24,59,666);
        System.out.println(of);
    }

    @Test
    public void test04(){
        int day = LocalDate.of(2023,4,1).getDayOfMonth();
        System.out.println(day);

        int days = LocalDate.of(2023,4,1).getDayOfYear();//年初到设定日期的天数
        System.out.println(days);
    }

    @Test
    public void test05(){
        LocalDate today = LocalDate.now();
        LocalDate date2 = today.withDayOfMonth(25);//修改后的日期xxxx-xx-25
        System.out.println(today);
        System.out.println(date2);
    }

    @Test
    public void test06(){
        LocalDate today = LocalDate.now();
        System.out.println(today.isLeapYear());//false,是否闰年
    }

    @Test
    public void test07(){
        ////Set一个集合，是一个容器，装对象
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for(String availableZoneId : availableZoneIds){
            System.out.println(availableZoneId);
        }
    }

    @Test
    public void test08(){
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(now);
        //2023-03-31T07:31:39.842-07:00[America/Los_Angeles]
    }

    @Test
    public void test09(){
        LocalDate today = LocalDate.now();
        LocalDate kai = LocalDate.of(2022,2,7);
        Period period = Period.between(today,kai);//算两个日期间隔的时间，以年月日展现出来
        System.out.println(period);
    }

    @Test
    public void test10(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1992,5,1);
        Period period = Period.between(today,birthday);
        System.out.println(period);
    }

    @Test
    public void test11() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(df.format(now));
        //23-3-31 下午10:42

        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(df2.format(now));
        //2023-3-31 22:43:40

        DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        System.out.println(df3.format(now));
        //2023年3月31日 下午10时44分40秒

        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.systemDefault());
        System.out.println(df4.format(now));
        //2023年3月31日 星期五 下午10时49分39秒 CT

        DateTimeFormatter df5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.of("America/Los_Angeles"));
        System.out.println(df5.format(now));
        //2023年3月31日 星期五 下午11时09分19秒 PT

    }


    @Test
    public void test14(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(df.format(now));
        //2023-03-31 23:12:03 947
    }
}
