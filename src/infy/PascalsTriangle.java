package infy;

/*
input: 4
output:
1
1       1
1       2       1
1       3       3       1

input: 6
output:
                    1
                1       1
            1       2       1
        1       3       3       1
    1       4       6       4       1
1       5       10      10      5       1
 */
public class PascalsTriangle {
    public static void main(String[] args) {

        int row = 8;

        int[][] pascalTri = new int[row][row];

        for(int i=0; i< row; i++)
        {
            // System.out.print("("+(i+1)+",0) ");
            for(int j=0; j<=i; j++)
            {
                if(i == j || j==0)
                    pascalTri[i][j] = 1;
                else
                    pascalTri[i][j] = pascalTri[i-1][j-1] + pascalTri[i-1][j];

                System.out.print(pascalTri[i][j] + " ");

            }
            System.out.println();
        }
    }

}
