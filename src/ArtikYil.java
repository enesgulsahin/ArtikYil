import java.util.Scanner;
public class ArtikYil {
    public static void main (String [] args) {
        Scanner inp = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz:");
        yil = inp.nextInt();
        if (yil % 4 == 0 && yil%100!=0  || yil % 400 == 0) {
           System.out.print(yil + "\nArtık bir yıldır");
        }else{
            System.out.print(yil + "\nArtık bir yıl değildir");
        }
    }
}


