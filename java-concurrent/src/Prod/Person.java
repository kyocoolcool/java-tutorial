package Prod;

/**
 * @ClassName Person
 * 
 * @Author Chris Chen
 * @Date 2020/2/18 4:53 PM
 * @Version 1.0
 **/

public class Person {
    public int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "score=" + score +
                '}';
    }
}
