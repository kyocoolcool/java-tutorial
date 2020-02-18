package kyocoolcool;

public interface Animal {
    public default String getName(){
        return null;
    };

    interface Mammal {
        public default String getName(){
            return null;
        };
    }

     abstract class Otter implements Animal, Mammal {
         @Override
         public String getName() {
             return null;
         }
     }
}
