//when the class loads that time all the static blocks 
//are exicuted from top to bottom
class Static_Priority{
    static{
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("Main Method block");
    }
    static{
        System.out.println("Second static block");
    }
}