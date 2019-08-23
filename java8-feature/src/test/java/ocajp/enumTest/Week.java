package ocajp.enumTest;

public enum Week {
    Monday {
        @Override
        public String toString() {
            return "HappyDay";
        }

        int hello() {
            System.out.println(1);
            return 1;
        }
    }, Tuesday() {
        int hello() {
            System.out.println(2);
            return 2;
        }
    }, Thirsday("GOD") {
        @Override
        public String toString() {
            return "Thirsday";
        }

        int hello() {
            System.out.println(3);
            return 3;
        }
    }, Thursday {
        int hello() {
            System.out.println(4);
            return 4;
        }
    }, Friday {
        int hello() {
            System.out.println(5);
            return 5;
        }
    }, Saturday {
        int hello() {
            System.out.println(6);
            return 6;
        }
    }, Sunday {
        int hello() {
            System.out.println(7);
            return 7;
        }
    };

    private Week() {

    }

    Week(String a) {
        System.out.println(a);
    }

    abstract int hello();


    protected  static  enum   day{
        today,yesterday, tomorrow
    }


}
