package test1;
public class DuoTai {
    public static void main(String[] args){
        // 借助多态，主人可以给很多动物喂食
        Master ma = new Master();
        //ma.feed(new Animal(), new Food());
        ma.feed(new Cat(), new Fish());
        ma.feed(new Dog2(), new Bone());
    }
}
// Animal类及其子类
class Animal{
    public void eat(Food f){
        System.out.println("我是一个小动物，正在吃" + f.getFood());
    }
}
class Cat extends Animal{
    public void eat(Food f){
        System.out.println("我是一只小猫咪，正在吃" + f.getFood());
    }
}
class Dog2 extends Animal{
    public void eat(Food f){
        System.out.println("我是一只狗狗，正在吃" + f.getFood());
    }
}
// Food及其子类
class Food{
    public String getFood(){
        return "事物";
    }
}
class Fish extends Food{
    public String getFood(){
        return "鱼";
    }
}
class Bone extends Food{
    public String getFood(){
        return "骨头";
    }
}
// Master类
class Master{
    public void feed(Animal an, Food f){
        an.eat(f);
    }
}