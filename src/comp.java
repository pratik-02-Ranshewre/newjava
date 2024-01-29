public class comp {
 comp(){
     System.out.println("this constructor of comp class");
 }
 void comp_method(){
     System.out.println("power gone !shut down your PC soon...");
 }
 public static void main(String[] args){
     comp my = new comp();
     laptop your = new laptop();
     my.comp_method();
     your.laptop_method();


 }}
class laptop {
     laptop(){
         System.out.println(" this is constructor");

     }
     void laptop_method(){
         System.out.println(" 99% battery availabe");
     }
}


