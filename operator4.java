package Operators;

public class operator4 {
    public static void main(String args[]){
        // Relational operator
        // == --> equal to
        // != --> not equal to
        // >  --> greater than
        // >= --> greater than equal to
        // <  --> less than
        // <= --> less than equal to


        int a=2;
        int b=2;
        System.out.println(a==b);
        int c=2;
        int d=3;
        System.out.println("not equal to " +(c!= d) );

        System.out.println("greater than " + (d>c));
        System.out.println(" greater than equal to " + (c>=a));
        System.out.println("less than " + (c<d));
        System.out.println("less than equal to " + (c<=d));
    }
    
}
