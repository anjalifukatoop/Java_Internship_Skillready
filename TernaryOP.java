//what is ternary operator or conditional operator
// ternary operator is the short form of if else statement
// if (condition){}
//else{}
//syntax of ternary op
//condition ? value1:value2
//condition ? true_value: false_value
//if the condition is true then expression1 executes
//otherwise expression 2 execute
class TernaryOP{
    public static void main(String[] args) {
        int marks=60;
        String result=(marks>=40)?"PASS":"FAIL";
        System.out.println("Student is "+result);

    }
}