package OOP.task3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

import task3.InfantryClass.*;
import task3.MagClass.*;
import task3.ShooterClass.*;
import task3.Crossbowman;
import task3.Snipper;
import task3.Outlaw;
import task3.Spearman;



public class MainProgramm {
    public static void main(String[] args) {
                
                ArrayList<BaseHero> friends = new ArrayList<>();
                ArrayList<BaseHero> enemies = new ArrayList<>();
                ArrayList<BaseHero> result = new ArrayList<>();
        
                    for (int i = 0; i < 10; i++) {
                        switch(new Random().nextInt(4)){
                            case 0:
                             enemies.add(new ClassPeasant(getName()));
                                break;
                            case 1:
                             enemies.add(new Snipper(getName()));
                                break;
                            default:
                             enemies.add(new Outlaw(getName()));
                                break;
                        }
                        switch(new Random().nextInt(4)){
                            case 0:
                                friends.add(new ClassPeasant(getName()));
                                break;
                            case 1:
                                friends.add(new Spearman(getName()));
                                break;
                            case 2:
                                friends.add(new Monah(getName()));
                                break;
                            default:
                                friends.add(new Crossbowman(getName()));
                                break;
                        }
                    }
                    result.addAll (enemies);
                    result.addAll(friends);
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
        
                    System.out.println("вражеская команда");
                    for (BaseHero hero : enemies) {
                        System.out.print(" - " + hero.getInfo() + " - ");
                        hero.getNAME();
                    }
        
                    System.out.println("Команда союзников" );
                    for (BaseHero hero : friends) {
                        System.out.print(" - " + hero.getInfo() + " - ");
                        hero.getNAME();
                    }
        
                    enemies.forEach(u -> u.step(enemies, friends));
        
                }
        
                private static String getName(){
                    return List.values()[new Random().nextInt(List.values().length)].toString();
                }
        
        }
    