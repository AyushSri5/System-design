import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    List<FileSystem> list=new ArrayList<>();

    public void add(FileSystem system){
        list.add(system);
    }

    @Override
    public void ls() {
        for(FileSystem fileSystem:list){
            fileSystem.ls();
        }
    }
}
