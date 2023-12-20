import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Java or 2.Kotlin?");
        int f= sc.nextInt();
        if(f!=1){
            MainKt.main();
        }else{
            System.out.println("Enter a Integer");
            var a=sc.nextInt();
            System.out.println("enter Another");
            var b=sc.nextInt();
            var c=ClassA.solve(a,b);
            System.out.println(c);
        }


    }
}
