// Singleton Pattern
class Logger{
    private static Logger instance;
    private Logger(){}
    public static Logger getInstance(){
        if(instance == null){ 
            instance = new Logger();
        }
        return instance;
    } 
    public void log(String message){
        System.out.println(message);

    }
}
public class LoggerTesting{
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("hello");
        logger2.log("hi");
        if(logger1 == logger2){
            System.out.println("both logger1 and logger2 are from same instance ");
        }
        else{
             System.out.println("both logger1 and logger2 are not from same instance ");
        }

    }
}