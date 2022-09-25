class metotlar {
    public static void mesajVer(){
        System.out.println("merhaba");
    }
    public static void hesapla(){
        System.out.println("hesaplandı");
    }
    public static int topla(int sayi1,int sayi2){
        int toplam= sayi1+sayi2;
        System.out.println("toplam:"+ toplam);
        return toplam;
    }
    //toplanan 2 Sayının %10 nunu bulan metot
       /* public static void toplananIkiSayınınYuzdeOn(int sayi1,int sayi2){
            int toplam= sayi1+sayi2;
            double sonuc=toplam *10/100;
            System.out.println("sonuc:"+ sonuc);
        //kodsal olarak yanlış kulanılan kod metodu
        }*/
    // olamsı gereken yüzde alma metodu
    public static double toplananIkiSayininYuzdeOn(int sayi1, int sayi2){
        int toplam= sayi1+sayi2;
        double sonuc=toplam *10/100;
        return sonuc;


    }

    public static double krediHesapla(double krediMiktari){
        //hesaplar yapılır
        return 125000;
    }

    public static void main(String[] args) {
        mesajVer();
        hesapla();
        topla(6,2);
        System.out.println("topla:"+topla(6,3));
        System.out.println("ikisayı yüzdesi:"+toplananIkiSayininYuzdeOn(10,90));
    }
}
