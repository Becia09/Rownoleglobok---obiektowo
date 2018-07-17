import static java.lang.Math.abs;

public class Rownoleglobok
{
    public void rownoleglobok(int width, int height, int angle)
    {
        System.out.println(width +" - szerokosc\n"+height +" - wysokosc");
        //System.out.println(width + " " + height + " " + angle);

        String verse = "";
                for(
        int i = 0;
        i<width;i++)

        {
            verse += "*";
        }

                if(angle ==0||height ==1) //prostokat

        {
            for (int i = 0; i < height - 1; i++) {
                System.out.println(verse);
            }
            System.out.println(verse + "\n"); //ostatnia linijka poza petla bo ze znakiem konca linii
        }
                else //rownoleglobok

        {
            String space = "";
            for (int i = 0; i < abs(angle); i++) {
                space += " ";
            }

            if (angle > 0) {
                for (int i = 0; i < height - 1; i++) {
                    System.out.println(verse);
                    verse = space + verse;
                }
                System.out.println(verse + "\n"); //ostatnia linijka poza petla bo ze znakiem konca linii
            } else //angle < 0
            {
                String allSpace = space;
                for (int i = 0; i < height - 2; i++) {
                    allSpace += space;
                }

                verse = allSpace + verse;
                for (int i = 0; i < height; i++) {
                    System.out.println(verse);
                    verse = verse.substring(abs(angle));
                }
                //System.out.println(verse + "\n"); //ostatnia linijka poza petla bo ze znakiem konca linii
            }
        }
    }
}
