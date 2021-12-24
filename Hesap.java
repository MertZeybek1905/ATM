package Atm;

public class Hesap {
    public String isim;
    public int bakiye;
    public String parola;
    public Hesap(String isim,int bakiye,String parola){
        this.isim=isim;
        this.bakiye=bakiye;
        this.parola=parola;
    }
 
    public String getKullanici_adi() {
        return isim;
    }

    public void setKullanici_adi(String isim) {
        this.isim = isim;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void ParaYatır(int tutar){
        this.bakiye+=tutar;
        System.out.println("Yeni Tutar"+this.bakiye);
    }
    public void ParaCek(int tutar){
        if(this.bakiye<tutar){
            System.out.println("Bakiyeniz yeterli degil");
        }
        else{
            this.bakiye-=tutar;
            System.out.println("Yeni bakiyeniz"+this.bakiye);
        }
    }
}
