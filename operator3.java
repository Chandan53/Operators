package Operators;

public class operator3 {
    public static void main(String args[]){
        // unary operator need only one operand
        // a=a+1 --> a++ ---> ++a
        // a=a-1 --> a-- ---> --a
        // preincrement ++a
        // post_increment a++

        int a=10;
        // a++;
        // System.out.println(a);
        // a--;
        // System.out.println(a);

          // pre_increment
         //    int b=++a;
        //    System.out.println(a);
       //    System.out.println(b);
    
    // post_increment
       int b=a++;
       System.out.println(a);
       System.out.println(b);
       

    }
    
}
