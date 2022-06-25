public class TimeTest {
    public static void main(String[] args) throws Exception {
        Messager m1 = new Messager("m1");
        Messager m2 = new Messager("m2");
        m1.connect(m2);
        
        long start = System.currentTimeMillis();
        String chat = "hello";
        for (int i = 0; i < 100000; ++i) {
            m1.send(chat);
        }
        m2.receive();
        m2.printAll();
        // Get elapsed time in milliseconds
        long elapsedTimeMillis = System.currentTimeMillis()-start;


        System.out.println(elapsedTimeMillis/100000.0);

    }
}
