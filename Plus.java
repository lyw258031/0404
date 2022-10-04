public class Plus {
    public static void Add(int arr1[][],int arr2[][],int arr3[][],int x,int y) {
        int row,col;
        if(x<=0||y<=0) {

        }
        for( row=1;row<=x;row++) {
            for(col=1;col<=y;col++) {
                arr3[(row-1)][(col-1)]=arr1[(row-1)][(col-1)]+arr2[(row-1)][(col-1)];
            }
        }
    }
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        int[][] arr=new int [3][3];
        Add(c,d,arr,3,3);
        System.out.println("c数组+d数组的结果为：");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(" "+arr[i][j]+"  ");
            System.out.println();
        }
    }
}