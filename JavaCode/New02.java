import java.util.Scanner;

public class New02 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[2];
        arr[3] = new int[1];
        arr[4] = new int[3];

        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                System.out.println("enter the marks of college " +i+ " and student " +j);
                arr[i][j] = scan.nextInt();

            }
        }
        System.out.println("Arrays content are");
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
                  System.out.print(arr[i][j] + "           ");
            System.out.println();
        }
    }
}
