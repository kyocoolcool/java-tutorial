package kyocoolcool.Example;

/**
 * @ClassName MyAnnotation
 * @Description
 * 自定義註解開發過程
 * 1.新建一個普通Java類
 * 2.把class關鍵字改成@interface，這樣我們就開發了一個自定義註解
 * 使用@interface聲明一個註解的時候，實際上是聲明了一個接口，默認繼承java.lang.annotation.Annotation
 * 一個註解，可以在類的任何位置使用就像修飾符一樣
 * 應用於包、類型、構造方法、方法、成員變量、參數、本地變量的聲明中使用annotation
 *
 * @Author chris
 * @Date 2019-04-25 15:40
 * @Version 1.0
 **/

public @interface MyAnnotation {
}