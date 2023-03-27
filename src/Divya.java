import java.util.Scanner;

public class Divya {
    public static void towerofhanoi(int n,String src, String dest,String helper){
        if(n==1){
            System.out.println("move the disk" +n+ "from" +src+ "to" +dest);
            return;
        }
        towerofhanoi(n-1,src,dest,helper);
        System.out.println("move the disk" +n+ "from" +src+ "to" +dest);
        towerofhanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Divya.towerofhanoi(n,"s","h" , "d");
    }
}
