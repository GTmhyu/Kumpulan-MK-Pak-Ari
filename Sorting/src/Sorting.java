import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nama : ");
        int a = input.nextInt();
        System.out.println();

        String[] Array;
        Array = new String[a];
        String temp;

        for(int i=0;i<a;i++) {
            System.out.print("Nama " +(i+1)+" adalah: ");
            Array[i]=input.next();
        }
        for(int x=1;x<a;x++)
        {
            for(int y=0;y<a-x;y++)
            {
                if(Array[y].compareTo(Array[y+1])>0)
                {
                    temp=Array[y];
                    Array[y]=Array[y+1];
                    Array[y+1]=temp;
                }
            }
        }

        System.out.println("Setelah Diurutkan");
        for(int z=0;z<a;z++){
            System.out.println((z+1)+". "+ Array[z]);
        }

    }
}
