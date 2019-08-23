package kyocoolcool.Example;

public @interface MyAnno3 {
    String name();
    int age();
    // 提供缺省值
    String value() default "GodLA GOOD GOOD";
}
