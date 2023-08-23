import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        boolean artik = false;
        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
            System.out.println(year + " artık yıldır.");
        else
            System.out.println(year + " artık yıl değildir.");



    }
}
