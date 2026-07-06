//static method are not overrid other than that
//static method are always hide
class Demo{
     static void print(){
        System.out.println("parent");}}
class StaticMethod extends Demo{
    static void print(){
        System.out.println("child");
    }
    public static void main(String[] args){
        Demo d1=new Demo();
        d1.print();
        StaticMethod s1=new StaticMethod();
        s1.print();
    }
}
//options
//parent
//child
//compile time error
//runtime error