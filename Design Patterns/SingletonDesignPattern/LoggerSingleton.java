package SingletonDesignPattern;

public class LoggerSingleton {
    private static volatile LoggerSingleton instance = null;
    // The field must be declared volatile so that double check lock would work correctly
    private LoggerSingleton(){
        //private constructor
    }
    public static LoggerSingleton getInstance(){
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    return new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
