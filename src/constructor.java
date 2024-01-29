public class constructor {
    String name;
    constructor(){
        System.out.println(" constructor method called");
    }
    constructor (String t){
        name = t;
    }

    public static void main(String[] args){
        constructor cpp = new constructor();
        constructor java = new constructor("java");

        cpp.setName(" c++");

        java.getName();
        cpp.getName();

    }
    void setName(String t ){
        name = t;
    }
    void getName(){
        System.out.println("Language name :" + name);
    }
}


