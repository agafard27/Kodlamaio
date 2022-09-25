public class şartBloklari {
    public static void main(String[] args) {
        System.out.println("şartBloklari!");

        int not=55;
        //50 ve üzeri:geçti;
        String geçti=" başarıyla geçti";
        //40-49 :bütünleme;
        String büt="bütünlemeye kaldı";
        //0-39 :kaldı;
        String kaldı=" dersten kaldı";

        if(not>=50)
        {
            System.out.println(geçti);
        }
        else if(not>=40)
        {
            System.out.println(büt);
        }
        else System.out.println(kaldı);

    }
}
