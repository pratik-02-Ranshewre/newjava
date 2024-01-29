interface info{
    static final String language = "marathi";
    public void display();
}
public class inter implements  info {
    public static void main(String[] args){
         inter obj = new inter ();
        obj.display();

    }
    public void display(){
        System.out.println(language + " is awesome");
    }
}
