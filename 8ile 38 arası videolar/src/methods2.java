public class  methods2 extends ArraysDemo {
    public static void main(String[] args) {
         String mesaj="Bugün hava çok güzel";

          String yeniMesaj=mesaj.substring(0,2);


    }   //Java Dersi 25 : Parametreli Metodları Anlamak 11:58
       public static String sehirVer(){
        return "Ankara";
       }
     public static void ekle(){
      yaz("Eklendi");
     }
     public static void sil(){
      yaz("Silindi");
     }
     public static void güncelle(){
        yaz(" Güncellendi");
     }
    public static int topla(int a,int b){

        return a+b;
    }
    public static int topla(int ... sayilar){
         int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
}
