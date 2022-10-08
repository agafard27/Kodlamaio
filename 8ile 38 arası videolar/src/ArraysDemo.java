public class ArraysDemo {
    public static  void yaz (String yaz,String b,int Srcend){

        if (Srcend==1){
            System.out.println(yaz.endsWith(b));
        }

    }
    public static  void yaz (String yazıl,String b){
        System.out.println(yazıl.startsWith(b));


    }


    public static  void yaz (String yaz,char c){
        System.out.println(yaz.endsWith(String.valueOf(c)));
    }

    public static  void yaz (int yazil){
        System.out.println(yazil);
    }
    public static  void yaz (double yazil){
        System.out.println(yazil);
    }

    public static  void yaz (String yazil){
        System.out.println(yazil);
    }
    public static void main(String[] args) {
       /* String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";
        String ogrenci4="Ahmet";

        yaz(ogrenci1);
        yaz(ogrenci2);
        yaz(ogrenci3);
        yaz(ogrenci4);

        yaz("---------------------------------");
      String[] ogrenciler=new String[4];
      ogrenciler[0]=ogrenci1;
      ogrenciler[1]=ogrenci2;
      ogrenciler[2]=ogrenci3;
      ogrenciler[3]=ogrenci4;
      for (int i=0;i<ogrenciler.length;i++){
          yaz(ogrenciler[i]);
      }
        for (String ogrenci:ogrenciler) {
            yaz(ogrenci);
        }
     */
    }
}
