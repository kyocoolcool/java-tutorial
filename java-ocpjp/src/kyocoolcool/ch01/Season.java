package kyocoolcool.ch01;

public enum Season {
    SPRING("Low"),SUMMER("Medium"),FALL("High"), WINTER(("Medium"));
    private String expectedVisitors;
    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}


