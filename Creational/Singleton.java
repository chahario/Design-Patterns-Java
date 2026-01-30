class Singleton {
    private static Singleton instance;
    
    private Singleton(){ // constructor can not be static
    // keywords in java are in small case
    }
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton(); // we have to use the instance class variable , so here we are asigning the value to it.

        }
        return instance;
    }
}

