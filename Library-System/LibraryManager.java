public class LibraryManager {
    private static LibraryManager instance;
    private LibraryManager(){

    }

    public static LibraryManager getInstance(){
        if(instance==null){
            synchronized (LibraryManager.class){
                if(instance==null) {
                    instance = new LibraryManager();
                }
            }
        }
        return instance;
    }

    // Add functions for adding removing books registering and unregistering members
}
