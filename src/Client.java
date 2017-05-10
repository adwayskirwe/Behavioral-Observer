
public class Client {
    public  static void main(String[]args){
        Mkbhd obj=new Mkbhd();
        Adway adi=new Adway(obj);

        //Mkbhd.register(adi);
        obj.setVideo("Galaxy S8 Review");
        obj.setVideo("LG G6");
        obj.unregister(adi);
        obj.setVideo("Hoverboard");

    }
}
