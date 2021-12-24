package Atm;

import java.util.Scanner;

public class Login {
    
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String isim;
        String şifre ;
       System.out.println("Kullanıcı adı girin");
       isim=scanner.nextLine();
       System.out.println("şifre girin");
       şifre=scanner.nextLine();
       if(hesap.getKullanici_adi().equals(isim)&& hesap.getParola().equals(şifre)){
            return true;
       }
       else{
        return false;
       }
       
  



    }
}
