
import java.util.Vector;
public class Mkbhd implements Observable {

    Vector data=new Vector();
    String video;

    @Override
    public void notification() {
        for(int i=0;i<data.size();i++){
            Observer obs=(Observer)data.elementAt(i);
            obs.refreshData(this);
        }
    }

    @Override
    public void register(Observer obj) {
        data.addElement(obj);

    }

    @Override
    public void unregister(Observer obj) {
        data.removeElement(obj);
    }

    public String getVideo(){
        return video;
    }
    public void setVideo(String vid){
        video=vid;
        this.notification();
    }
    public String getName(){
        return "MKBHD";
    }
}
