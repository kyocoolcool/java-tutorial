package kyocoolcool.date;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

/**
 * @ClassName LocalDateTimeTest
 * @Description
 *
 * @Author chris
 * @Date 2019-04-22 11:34
 * @Version 1.0
 **/

public class LocalDateTimeTest {
/**
 * @Author chris
 * @Description
 * 1.LocalDate
 * 2.LocalTime
 * 3.LocalDateTime
 * @Date 13:59 2019-04-22
 * @Param
 * @return void
 **/
    @Test
    public void test1(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = LocalDateTime.of(1988, 4, 3, 12, 0, 30);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusYears(2);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = localDateTime.minusMonths(2);
        System.out.println(localDateTime2);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

    }

    /**
     * @Author chris
     * @Description
     * Instant:時間戳計(以Unix元年1970年1月1日00:00:00-到某個時間之間的毫秒值)
     * @Date 13:59 2019-04-22
     * @Param
     * @return void
     **/
    @Test
    public void test2(){
        Instant now = Instant.now();//默認獲取UTC時區
        System.out.println(now);
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime.toEpochSecond());
        Instant instant = Instant.ofEpochSecond(1);
        System.out.println(instant);

    }

    /**
     * @Author chris
     * @Description
     * Duration:計算兩個時間間隔
     * @Date 14:12 2019-04-22
     * @Param
     * @return void
     **/
    @Test
    public void test3() throws InterruptedException {
        Instant instant = Instant.now();
        Thread.sleep(1000);
        Instant instant1 = Instant.now();
        Duration duration = Duration.between(instant, instant1);
        System.out.println(duration);
        System.out.println(duration.toMillis());
        System.out.println("-------------------");
        LocalTime localTime = LocalTime.now();
        Thread.sleep(1000);
        LocalTime localTime1 = LocalTime.now();
        Duration duration1 = Duration.between(localTime, localTime1);
        System.out.println(duration1.toMillis());
    }

    /**
     * @Author chris
     * @Description
     * Period:計算兩個日期間隔
     * @Date 14:20 2019-04-22
     * @Param
     * @return void
     **/
    @Test
    public void test4(){
        LocalDate localDate = LocalDate.of(2018, 01, 02);
        LocalDate localDate1 = LocalDate.now();
        Period period = Period.between(localDate, localDate1);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

    /**
     * @Author chris
     * @Description
     * TemporalAdjuster:時間校正
     * @Date 17:30 2019-04-22
     * @Param
     * @return void
     **/
    @Test
    public void test5(){
        LocalDateTime ldt = LocalDateTime.of(2019,4,26,21,9,0);
        System.out.println(ldt);
        LocalDateTime ldt2 = ldt.withDayOfMonth(10);
        System.out.println(ldt2);
        LocalDateTime ldt3 = ldt.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(ldt3);
        System.out.println("----------------");
        //自定義
        LocalDateTime localDateTime = ldt.with((l) -> {
            LocalDateTime ldt4 = (LocalDateTime) l;
            DayOfWeek dayOfWeek = ldt4.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.SATURDAY)) {
                return ldt4.plusDays(3);
            } else if (dayOfWeek.equals(DayOfWeek.FRIDAY)) {
                return ldt4.plusDays(2);
            } else return ldt4.plusDays(1);
        });
        System.out.println(localDateTime);
    }
        
    /**
     * @Author chris
     * @Description
     * DateTimeFormatter:格式化時間日期
     * @Date 21:17 2019-04-22
     * @Param 
     * @return void
     **/
    @Test
    public void test6(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        LocalDateTime ldt = LocalDateTime.now();
        String s = ldt.format(formatter);
        System.out.println(s);
        System.out.println("---------------");
        //自訂
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        String s1 = ldt.format(formatter1);
        System.out.println(s1);
        System.out.println("---------------");
        LocalDateTime parse = ldt.parse(s1,formatter1);
        System.out.println(parse);
    }

    /**
     * @Author chris
     * @Description
     * ZoneDate
     * ZoneTime
     * ZoneDateTime
     * @Date 21:29 2019-04-22
     * @Param
     * @return void
     **/
    @Test
    public void test7(){
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(x-> System.out.println(x));
    }

    @Test
    public void test8() {
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Europe/Tallinn"));
        System.out.println(localDateTime);
        LocalDateTime ldt2 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zonedDateTime = ldt2.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }

    /**
     * @description: 轉換字串格式
     * @param
     * @return: void
     * @author: Chris Chen
     * @time: 2019-05-11 14:23
     */
    @Test
    public void test9() {
        LocalDate now = LocalDate.now();
        String ymd = now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(ymd);
    }
}