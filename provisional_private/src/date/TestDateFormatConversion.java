package date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDateFormatConversion {
    public static void main(String[] args) {
        String dateStr = "2023.06.19"; // 需要转换的日期字符串
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd"); // 定义原始日期格式
        LocalDate date = LocalDate.parse(dateStr, formatter); // 将字符串解析为LocalDate对象
        String result = date.toString(); // 转换为标准格式（yyyy-MM-dd）
        System.out.println(result); // 输出转换后的日期字符串
    }

    @Test
    public void test01(){
        String inputDate = "2023.06.19";
        String convertedDate = convertDate(inputDate);
        System.out.println("转换后的日期为：" + convertedDate);
    }

    public static String convertDate(String inputDate) {
        String convertedDate = inputDate.replace(".", "-");
        return convertedDate;
    }
}
