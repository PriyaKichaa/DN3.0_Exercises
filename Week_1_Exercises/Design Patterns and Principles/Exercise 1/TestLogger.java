public class TestLogger{
    public static void main(String[] args){
        Logger logger1 = new Logger();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello World");
        logger2.log("Hello World");
        if (logger1 == logger2) {
            System.out.println("Logger has only one instance.");
        } else {
            System.out.println("Logger has multiple instances.");
        }

    }
}