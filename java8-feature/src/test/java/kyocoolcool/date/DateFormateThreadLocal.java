package kyocoolcool.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateFormateThreadLocal
 * @Description TODO
 * @Author chris
 * @Date 2019-04-22 09:44
 * @Version 1.0
 **/

public class DateFormateThreadLocal {
    protected static final ThreadLocal<SimpleDateFormat> df= ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd"));


    public static Date convert(String source) throws ParseException {
        return df.get().parse(source);

    }

}