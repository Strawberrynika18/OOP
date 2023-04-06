package OOP.task6;

import java.util.Collections;

public class Console {
    private static int step = 0;
    private static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("-b"))) + formatDiv("-c");
    private static final String mid10 = formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("-e"))) + formatDiv("-f");
    private static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("-h"))) + formatDiv("-i");
    public static void view(){
        if (step++ == 0) {
            System.out.print(Colors.ANSI_RED+"First step!"+Colors.ANSI_RESET);
            System.out.print(Colors.ANSI_GREEN +
                    String.join("", Collections.nCopies(20, formatDiv(" "))) + "Green Team" + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_BLUE +
                    String.join("", Collections.nCopies(55, formatDiv(" "))) + "Blue Team" + Colors.ANSI_RESET);
        } else {
            System.out.print(Colors.ANSI_RED + "Step: "+step+Colors.ANSI_RESET);
            System.out.print(Colors.ANSI_GREEN +
                    String.join("", Collections.nCopies(20, formatDiv(" "))) + "Green Team" +Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_BLUE +
                    String.join("", Collections.nCopies(55, formatDiv(" "))) + "Blue Team" + Colors.ANSI_RESET);
        }

        System.out.println(Console.top10);

        int npcIndex = 0;

        for (int i = 1; i <= MainProgramm.GANG_SIZE - 1; i++) {
            for (int j = 1; j <= MainProgramm.GANG_SIZE; j++) {
                System.out.print(getChar(new Positions(j, i)));
            }
            System.out.print("|");
            System.out.println(PrintInfo(npcIndex));
            System.out.println(Console.mid10);
            npcIndex++;
        }

        for (int j = 1; j <= MainProgramm.GANG_SIZE; j++) {
            System.out.print(getChar(new Positions(j, MainProgramm.GANG_SIZE)));
        }
        System.out.print("|");
        System.out.println(PrintInfo(npcIndex));
        System.out.println(Console.bottom10);
    }
    private static String getChar(Positions position){

        String str = "| ";
        boolean alive = false;
        for (int i = 0; i < MainProgramm.GANG_SIZE; i++) {
            if (MainProgramm.whiteSide.get(i).getPosition().isEquals(position))
            {
                if(MainProgramm.whiteSide.get(i).hp == 0)
                    str ="|"+Colors.ANSI_RED+MainProgramm.whiteSide.get(i).getName().toUpperCase().charAt(0)+Colors.ANSI_RESET;
                else {
                    str ="|"+Colors.ANSI_GREEN+MainProgramm.whiteSide.get(i).getName().toUpperCase().charAt(0)+Colors.ANSI_RESET;
                    alive = true;
                }
            }
            if (MainProgramm.darkSide.get(i).getPosition().isEquals(position) && !alive)
            {
                if(MainProgramm.darkSide.get(i).hp == 0)
                    str ="|"+Colors.ANSI_RED+ MainProgramm.darkSide.get(i).getName().toUpperCase().charAt(0)+Colors.ANSI_RESET;
                else str ="|"+Colors.ANSI_BLUE+ MainProgramm.darkSide.get(i).getName().toUpperCase().charAt(0)+Colors.ANSI_RESET;
            }
        }
        return str;
    }
    private static String PrintInfo(int npcIndex)
    {
        String str = "";

        if(MainProgramm.whiteSide.get(npcIndex).hp == 0)
            str +="   " + Colors.ANSI_RED+MainProgramm.whiteSide.get(npcIndex).getInfo()+Colors.ANSI_RESET;
        else str +="   " + Colors.ANSI_GREEN+MainProgramm.whiteSide.get(npcIndex).getInfo()+Colors.ANSI_RESET;
        if(MainProgramm.darkSide.get(npcIndex).hp == 0)
            str +="  " + Colors.ANSI_RED+MainProgramm.darkSide.get(npcIndex).getInfo()+Colors.ANSI_RESET;
        else str +="  " + Colors.ANSI_BLUE+MainProgramm.darkSide.get(npcIndex).getInfo()+Colors.ANSI_RESET;

        return str;
    }
    private static String formatDiv(String str){
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500')
                .replace("s", "...")
                .replace("o", "___");
    }
}