
public class Adway implements Observer {
    Observable obj;

    public Adway(Observable o){
        obj=o;
        obj.register(this);
    }

    @Override
    public void refreshData(Observable able) {

        if(able==obj){
            System.out.println("I am watching "+obj.getName()+" new video titled "+obj.getVideo());
        }

    }
}
