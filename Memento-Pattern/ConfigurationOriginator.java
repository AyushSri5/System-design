public class ConfigurationOriginator {
    int height;
    int width;

    ConfigurationOriginator(int height,int width){
        this.width=width;
        this.height=height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreMemento(ConfigurationMemento memento){
        this.height= memento.height;
        this.width= memento.width;
    }
}
