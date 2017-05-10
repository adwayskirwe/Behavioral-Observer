
public interface Observable {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notification();
    public String getVideo();
    public String getName();
}
