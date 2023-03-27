package OOP.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Scanner;

import task4.InfantryClass.*;
import task4.MagClass.*;
import task4.ShooterClass.*;
import task4.Crossbowman;
import task4.Snipper;
import task4.Outlaw;
import task4.Spearman;



public class MainProgramm {
  

        public static final int GANG_SIZE = 10;
        public static ArrayList<BaseHero> whiteSide = new ArrayList<>();
        public static ArrayList<BaseHero> darkSide = new ArrayList<>();
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            Init();
    
            while(true){
                step();
                Console.view();
                sc.nextLine();
            }
    
        }
        
        public static void Init() {
    
                for (int i = 1; i < GANG_SIZE + 1; i++) {
                    switch(new Random().nextInt(4)){
                        case 0:
                         darkSide.add(new ClassPeasant(BaseHero.generateName(), 10, i));
                            break;
                        case 1:
                         darkSide.add(new Snipper(BaseHero.generateName(), 10, i));
                            break;
                        default:
                         darkSide.add(new Outlaw(BaseHero.generateName(), 10, i));
                            break;
                    }
                    switch(new Random().nextInt(4)){
                        case 0:
                            whiteSide.add(new ClassPeasant(BaseHero.generateName(), 1, i));
                            break;
                        case 1:
                            whiteSide.add(new Spearman(BaseHero.generateName(), 1, i));
                            break;
                        case 2:
                            whiteSide.add(new Monah(BaseHero.generateName(), 1, i));
                            break;
                        default:
                        whiteSide.add(new Crossbowman(BaseHero.generateName(), 1, i));
                            break;
                    }
                }
        }
                
        public static void step() {
            ArrayList<BaseHero> result = new ArrayList<>();
                result.addAll  (darkSide);
                result.addAll(whiteSide);
                result.sort(new Comparator<BaseHero>() {
                    @Override
                    public int compare (BaseHero b1, BaseHero b2){
                        if(b1.getSpeed() == b2.getSpeed())
                        return 0;
                        else if(b1.getSpeed() > b2.getSpeed())
                        return 1;
                        else return -1;
                    }
                });
    
                for(BaseHero unit : result){
                    if(darkSide.contains(unit)){
                        unit.step(whiteSide, darkSide);
                    } else
                        unit.step(darkSide, whiteSide);
                }
    
            }
    
    }
    