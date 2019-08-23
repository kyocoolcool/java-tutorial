package kyocoolcool.Main;

import java.lang.reflect.Field;

/**
 * @ClassName Main
 * @Description 讀取bean基本訊息，產生SQL建表語句
 * @Author chris
 * @Date 2019-04-25 19:23
 * @Version 1.0
 **/

public class Main {

    public static String buildSql(){
        StringBuilder str = new StringBuilder("CREATE TABLE ");
        Class<Emp> empClass = Emp.class;
        Table annotation = empClass.getAnnotation(Table.class);
        String tableName = annotation.tableName();
        str.append(tableName+" (");
        Field[] fields = empClass.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(Column.class)){
                Column column = field.getAnnotation(Column.class);
                String columnName = column.columnName();
                String columnType = column.columnType();
                String columnLength = column.columnLength();
                String conlumnConstraint = column.conlumnConstraint();
                if(columnName.equalsIgnoreCase("birth")){
                    str.append(columnName+" "+columnType+" "+conlumnConstraint+",");
                }
                else
                str.append(columnName+" "+columnType+"("+columnLength+") "+conlumnConstraint+",");
            }

        }
        String sql = str.substring(0, str.length() - 1)+")";
        return sql;
    }

    public static void main(String[] args) {
        String sql = buildSql();
        System.out.println(sql);
    }
}