package Miscellaneous;

public class Nqueens
{
    static int ans=0;

    static void truefalseMarker(boolean flag, int i, int j, int n, int[][] cell)
    {
        if(!flag)
        {
            int a,b;
            for(a=i+1;a<=n-1;a++)
                cell[a][j]++;
            for(a=i+1,b=j-1 ; a<=n-1 && b<=n-1 && b>=0 ; a++,b--)
                cell[a][b]++;
            for(a=i+1,b=j+1 ; a<=n-1 && b<=n-1 ; a++,b++)
                cell[a][b]++;
        }
        else
        {
            int a,b;
            for(a=i+1;a<=n-1;a++)
                cell[a][j]--;
            for(a=i+1,b=j-1 ; a<=n-1 && b<=n-1 && b>=0 ; a++,b--)
                cell[a][b]--;
            for(a=i+1,b=j+1 ; a<=n-1 && b<=n-1 ; a++,b++)
                cell[a][b]--;
        }
    }
    static void work(int queen_row_index, int queen_col_index,int n, int[][] cell)
    {
        if(queen_row_index==n && queen_col_index==0)
        {
            ans++;
            return;
        }
        if(queen_row_index==n)
            return;
        if(cell[queen_row_index][queen_col_index]>0)
            return;

        truefalseMarker(false, queen_row_index,queen_col_index,n, cell);

        for(int j=0;j<=n-1;j++)
            work(queen_row_index+1,j,n,cell);

        truefalseMarker(true, queen_row_index,queen_col_index,n, cell);
    }
    public static void solveNQueens(int n)
    {
        int[][] cell=new int[n][n];

        int i,j;

        for(i=0;i<=n-1;i++)
            for(j=0;j<=n-1;j++)
                cell[i][j]=0;

        for(j=0;j<=n-1;j++)
            work(0,j,n,cell);
    }

    public static void main(String[] args)
    {
        System.out.println(ans);
        solveNQueens(1);
        System.out.println(ans);
    }
}
