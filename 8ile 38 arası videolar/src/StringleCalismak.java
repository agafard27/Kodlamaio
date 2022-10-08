public class StringleCalismak extends ArraysDemo{
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel.";
        yaz(mesaj);
       /* yaz("Eleman sayısı:"+mesaj.length());
        yaz("5.eleman:"+mesaj.charAt(4));
        yaz(mesaj.concat("Yaşasın!"));
        yaz(mesaj,"B");
        yaz(mesaj,".",1);
        char [] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);
       yaz(String.valueOf(karakterler));
           yaz(mesaj.indexOf('a'));
        yaz(mesaj.lastIndexOf('a'));*/
      String yeniMesaj=mesaj.replace(' ','-');
       yaz(yeniMesaj);
       //2. indexten sonra kes substring...
       yaz(mesaj.substring(2,3));
       //split kelimeleri kesmekte kullanılır...
      for(String kelime:mesaj.split(" ",'-')){
          yaz(kelime);
      }
      //aramalrda sklıkla kullanılır
      //bütün harfleri küçültür
        yaz(mesaj.toLowerCase());
      //kelimenin bütün harfleri büyük yazar
       yaz(mesaj.toUpperCase());
        //trim kelimenin başındaki vesonundaki boşlukları düzenler atar
       yaz(mesaj.trim());

    }
}
