package test1;
public class Dog{
    String name;
    int age;
   
    // 构造方法，没有返回值
    Dog(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println("感谢主人领养了我");
    }
   
    // 普通方法，必须有返回值
    void bark(){
        System.out.println("汪汪，不要过来");
    }
 
    void hungry(){
        System.out.println("主人，我饿了");
    }
   
    public static void main(String arg[]){
    }
}