package DesignPatterns;


//Singleton Design pattern
public class Logger {
    private static volatile Logger logger;
    private Logger(){
        System.out.println("Logger Initialised !!");
    }

    public static Logger getLogger(){
        if (logger == null){ //Performance check to stop threads which havent ran parallely
            synchronized (Logger.class){ //Synchronized to make single thread access
                if(logger == null){    //Double-checking in singleton thread
                    logger = new Logger(); //Initialize only once
                }
            }
        }
        return logger; //Return already initialised Singleton
    }
}
