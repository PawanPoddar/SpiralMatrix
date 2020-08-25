import java.util.Scanner;
class SpiralMatrix{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    int i,j;
    int k=0,l=0;
    int m,n;
    
    System.out.println("Enter the row");
    m=sc.nextInt();
    System.out.println("Enter the column");
    n=sc.nextInt();
     int a[][]=new int[m][n];
    int lastCol=n-1;
    int lastRow=m-1;
    int val=1;
   
  do
  {
    for(i=k;i<=lastCol;i++)
    {
      a[k][i]=val++;
    }
    k++;
    for(i=k;i<=lastRow;i++)
    {
        
    a[i][lastCol]=val++;
    }
    lastCol--;
    if(k<=lastRow)
    {
    for(i=lastCol;i>=l;i--)
    {
      a[lastRow][i]=val++;
      
    }
    lastRow--;
  }
  if(l<=lastCol)
  {
    for(i=lastRow;i>=k;i--)
    {
      a[i][l]=val++;
    }
    l++;
  }
  }while(k<=lastRow && l<=lastCol);
 
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
    if(a[i][j]<=9) 
    System.out.print("0"+a[i][j]+" ");
    else
      System.out.print(a[i][j]+" ");
   }
   try{Thread.sleep(1000);}catch(Exception e){}
   System.out.println();
  }
  }
}

    
    
