package kyocoolcool.ch01;

public enum Season3 {
    SPRING{
        public void sayHi() {
            System.out.println("SPRING HI");
        }
    },
    SUMMER{
        public void sayHi() {
            System.out.println("SUMMER HI");
        }
    },FALL,WINTER;
    public void sayHi(){
        System.out.println("default hi");
    }

}
