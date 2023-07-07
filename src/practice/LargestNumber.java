package practice;

public class LargestNumber {
    public static void main(String[] args){
        int x = 20;
        int y = 20;
        int z = 20;
        if((x>y)&&(x>z)){
            System.out.println("x is greatest number");
        }
        else if((y>x)&&(y>z)){
            System.out.println("y is greatest number");
        }
        else if((z>x)&&(z>y)){
            System.out.println("z is greatest number");
        }
        else{
            System.out.println("invalid ooption");
        }
    }
}
