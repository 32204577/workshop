public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
         while (true) {
             try {
                 System.out.println("Delay 2 seconds.");
                 Thread.sleep(2000); // 延时2秒（2000毫秒）                                         
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
}
