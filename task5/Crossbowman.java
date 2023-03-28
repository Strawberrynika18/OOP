package OOP.task5;

public class Crossbowman extends ShooterClass {

        public Crossbowman(String name, int x, int y) {
            super(name,10, 4, 10,2,3, 3, x, y);
        }
    
    
        
        @Override
        public String getName() {
            return "Crossbowman";
        }
    }