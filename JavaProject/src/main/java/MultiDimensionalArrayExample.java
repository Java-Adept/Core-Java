public class MultiDimensionalArrayExample {

    public static void main(String arg[]) {
       // int [][] arr=new int;
        int [][] arr = {
                {10,20,30},
                {40,50,60},
                {20,45,36}
        };

//
//        arr[0][1]=10;
//        arr[0][2]=20;

        for(int i=0; i<=2;i++) {
            for(int j=0;j<=2;j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.print("\n");
        }

    }


}
