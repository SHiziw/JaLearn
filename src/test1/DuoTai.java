package test1;
public class DuoTai {
    public static void main(String[] args){
        // ������̬�����˿��Ը��ܶද��ιʳ
        Master ma = new Master();
        //ma.feed(new Animal(), new Food());
        ma.feed(new Cat(), new Fish());
        ma.feed(new Dog2(), new Bone());
    }
}
// Animal�༰������
class Animal{
    public void eat(Food f){
        System.out.println("����һ��С������ڳ�" + f.getFood());
    }
}
class Cat extends Animal{
    public void eat(Food f){
        System.out.println("����һֻСè�䣬���ڳ�" + f.getFood());
    }
}
class Dog2 extends Animal{
    public void eat(Food f){
        System.out.println("����һֻ���������ڳ�" + f.getFood());
    }
}
// Food��������
class Food{
    public String getFood(){
        return "����";
    }
}
class Fish extends Food{
    public String getFood(){
        return "��";
    }
}
class Bone extends Food{
    public String getFood(){
        return "��ͷ";
    }
}
// Master��
class Master{
    public void feed(Animal an, Food f){
        an.eat(f);
    }
}