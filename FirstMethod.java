//what is the method?
//addition = 10,20,30,40
//out of the main function or main method
//what is the importance of the static method
//why we are using static keyword
//can we call the method with static
//can we call the method without static
class FirstMethod{
    static int a=123;
    static void addition(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("addition = "+ c);
    }
    public static void main(String[] args) {
        FirstMethod obj1=new FirstMethod();
    //call the method
    obj1.addition();//static keyword output
    obj1.addition();//object output
    System.out.println("value of a = "+a);
    
    }
}