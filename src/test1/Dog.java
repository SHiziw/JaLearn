package test1;
public class Dog{
    String name;
    int age;
   
    // ���췽����û�з���ֵ
    Dog(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println("��л������������");
    }
   
    // ��ͨ�����������з���ֵ
    void bark(){
        System.out.println("��������Ҫ����");
    }
 
    void hungry(){
        System.out.println("���ˣ��Ҷ���");
    }
   
    public static void main(String arg[]){
        // ��������ʱ���ݵĲ���Ҫ�빹�췽�������б��Ӧ
        Dog myDog = new Dog("����", 3);
    }
}