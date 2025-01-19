public class DBConnectionLazy {
    private static DBConnectionLazy instance;

    private DBConnectionLazy(){}

    synchronized public static DBConnectionLazy getInstance() {
        if(instance==null){
            instance=new DBConnectionLazy();
        }
        return instance;
    }
}
