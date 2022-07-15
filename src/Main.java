import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        double sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.println("Sicaklik bilgisini giriniz : ");

        sicaklik = input.nextDouble();

        if(sicaklik < 5 ){
            System.out.println("Kayaga gidebilirsin");
        }else if(sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsin");
        }else if(sicaklik>25){
            System.out.println("Yuzmeye gidebilirsin");
        }
        if(sicaklik>=10 && sicaklik<=25){
            System.out.println("Piknige gidebilirsin");
        }

    }
}
