package lesson23_27_method_overloading;

public class MethodExam {

    public String get(){
        return "Hello";
    }

    public String get(String st){
        return st;
    }

    public String get(int n){
        return "Number " + n;
    }

    public void get(boolean g){
        System.out.println(g);
    }

    
}
