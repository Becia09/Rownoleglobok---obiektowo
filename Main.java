import java.util.Scanner;
import static java.lang.Math.abs;

public class Main
{
    public static int parserInt(String number, int rangeBegin, int rangeEnd)
    {
        int result = 0;

        try {
            result = Integer.parseInt (number);
        } catch(NumberFormatException e) {
            System.out.println ("Podano nieliczbową wartosc");
            System.exit(0);
        }

        if (result < rangeBegin || result > rangeEnd) {
            System.out.println("Podana wartosc jest za duza lub za mała");
            System.exit(0);
        }

        return result;
    }
    public static void main (String[] args)
    {
        System.out.println ("Podaj dlugosci bokow rownolegloboku i kat: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //System.out.println("wczytano: " + str + ".");
        //System.out.println("dlugosc str: " + str.length());

        String tabString[] = str.split(" ");

        //System.out.println("rozmiar tablicy: " + tabString.length);

        if (tabString.length != 3)
        {
            System.out.println("Niewlasciwa ilosc elementów");
            System.exit(0);
        }

        int width, height, angle; //szerokosc, wysokosc i kat rownolegloboku

        width = parserInt(tabString[0], 1, 100);
        height = parserInt(tabString[1], 1, 100);
        angle = parserInt(tabString[2], -100, 100);

        //---------------------------------------------------------------klasa rownoleglobok
        Rownoleglobok figura = new Rownoleglobok();
        figura.rownoleglobok(width, height, angle);
    }
}