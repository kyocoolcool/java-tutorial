package kyocoolcool.ch03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Chris Chen https://kyocoolcool.com
 * @version 1.0
 * @className News
 * @description
 * @date 2020/6/24 5:07 PM
 **/

public class News implements Comparable<News>{
    String title;
    Integer id;

    public News() {
    }

    public News(String title, Integer id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(News o) {
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        final News news = new News("hello",1);
        final News news2 = new News("test",10);

        final ArrayList<News> list = new ArrayList<>();
        list.add(news2);
        list.add(news);
        Collections.sort(list);
        System.out.println(list);
        final Comparator<News> newsComparator = (x, y) -> -(x.id - y.id);
        Collections.sort(list,newsComparator);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
