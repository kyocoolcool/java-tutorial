package kyocoolcool.exam_v1475.exam128;

class  Book {
   String read(String bname) {
        return "Read" + bname;
    }
}

class EBook extends Book {
    @Override
    public  String read(String url){
        return "View" + url;
    }
}

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println( b1.read("Java Programing"));
        Book b2 = new EBook();
        System.out.println(b2.read("http://ebook.com/ebook"));
    }
}
