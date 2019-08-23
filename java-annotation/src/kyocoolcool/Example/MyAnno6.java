package kyocoolcool.Example;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited//父類有此註解會被子類繼承
public @interface MyAnno6 {
}