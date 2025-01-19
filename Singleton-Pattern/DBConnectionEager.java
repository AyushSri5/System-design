public class DBConnectionEager {
    private static DBConnectionEager instance = new DBConnectionEager();

    private DBConnectionEager(){

    }

    public static DBConnectionEager getInstance(){
        return instance;
    }
}
