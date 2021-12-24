package Atm;

import java.util.Scanner;

public class atm {
    public void Calıs(Hesap hesap){
        Scanner scanner= new Scanner(System.in);
        Login login= new Login();
        System.out.println("Banka projesine hoşgeldiniz");
        String işlemler="1-Para çekme \n"
                       +"2-Para Yatırma \n"
                       +"3-Bakiye sorgulama";
         int giris=3;
         String secenek;
         int tutar;
        while(true){
           if( login.login(hesap)){
                System.out.println("giriş başarılı");
            }
            else{
                System.out.println("giriş başarısız");
                  break;
                
                }
           
            }
            System.out.println("-----------");
            System.out.println(işlemler);
            secenek= scanner.nextLine();
            System.out.println("lütfen işlem yapmak istediğiniz seçeneği girin");
            switch(secenek){
                case "1":
                   System.out.println(("çekmek istediginiz tutarı girin"));
                    tutar=scanner.nextInt();
                   hesap.ParaCek(tutar);
                   default:
                     System.out.println("çıkış yapılıyor");
                     break;
                case "2":
                    System.out.println(("yatırmak  istediginiz tutarı girin"));
                    tutar=scanner.nextInt();
                    hesap.ParaYatır(tutar);
                    break;
                case "3":
                    System.out.println(("Bakiyeniz"+hesap.getBakiye()));
                    break;
            }

            }
            
    
    }

