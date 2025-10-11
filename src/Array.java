import java.util.Scanner;

public class Array  {
//    static int[] array=new int[20];
//    int i;
    public static void main(String[] args) {
        int[] array=new int[20];
        for (int a=1;a <= 20; a++){
            int i = a-1;
            array[i] = a;
            System.out.println(array[i]);
        }
        food();
    }
//      System.out.println(array[i]);

    public static void food(){
        Scanner scanner=new Scanner(System.in);
        String[] favFood=new String[3];
        System.out.println("Enter your fav food");
        for (int b=0;b<favFood.length;b++){
            System.out.println(b+1 + ":\t");
            favFood[b]=scanner.nextLine();

        }
        System.out.println(" your fav food are:\n" + favFood[0]+"\n"+ favFood[1]+"\n" + favFood[2]);
//        return 0;
    }



}