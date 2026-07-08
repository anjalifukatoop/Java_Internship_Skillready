class Static_Variable{
    static int a=100;
    static{a=a+20;}//120 static method using only static keyword
    public static void main(String[] args) {
        System.out.println("value of a "+a);

    }
}
//options
//30
//130
//100
//addres of var
//not availble