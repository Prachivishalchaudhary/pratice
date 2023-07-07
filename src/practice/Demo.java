package practice;

public class Demo {
    public static void main(String[] args) {
        //+,-,/,*,%,++,--
        //++
        int x = 6;
        int y = 10;
        //x =x-y;//6-10
        //y =x+y;//6-10+10=6
        //x=y-x;//6-6+10=10
        System.out.println(x+" "+y);
        x+=y-(y=x);
        System.out.println(x+" "+y);
        int sum = x+y;
        System.out.println(sum);
        int minus = x-y;
        System.out.println(minus);
        int product = x*y;
        System.out.println(product);
        int divide = x/y;
        System.out.println(divide);
        int remainder = x%y;
        System.out.println(remainder);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(y--);
        System.out.println(--y);
        System.out.println((x<y)&&(x==4));
        System.out.println((x<y)||(x==4));
        System.out.println(!(x<y));
        int a = 678;
        int b = 986;
        //int temp = a;
       // a=b;
        //b=temp;
        System.out.println(a+" "+b);//
        System.out.println("45675476dfhgfjg");
        //a = a-b;
        //b=a+b;//a-b+b=a
        //a = b-a;//a-a+b=b
        System.out.println(a+" "+b);
        a+=b-(b=a);//a=a+b-(a=b)=678+986-986
        System.out.println(a+" "+b);
        int d=(a+b)*(a-b);
        System.out.println(d);
        double e = a+b;
        System.out.println(e);



    }
}
