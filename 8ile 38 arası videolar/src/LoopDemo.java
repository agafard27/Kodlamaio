public class LoopDemo {
    public static void main(String[] args) {
        for (int i=1;i<10;i+=2){
         System.out.println(i);
        } System.out.println("döngü bitmiştir");
        int i=1;
        while (i<10){
            System.out.println(i);
            i+=2;
            }
        System.out.println("While Döngüsü bitti ");
        int j=100;
        do{
            System.out.println(j);
           j+=2;
        }
        while(j<10);
        System.out.println("do-while Döngüsü Bitti");



    }
}
