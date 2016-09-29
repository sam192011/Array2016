import  java.io.*;
class array2016
{
public static void main()throws IOException
{
int i,j,k,x=0,y=0, sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int M= Integer.parseInt(br.readLine());
int a[][]=new int[M][M];
if(M<3 || M>10)
{
System.out.println("Invalid Input");
}
else
{
System.out.println("Original Matrix :");
for(i=0; i<M;i++)
{
for(j=0;j<M;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
System.out.print(a[i][j]);
}
System.out.println();
}

for(i=1;i<M-1;i++)
{
for(j=1;j<M-1;j++)
{
x++;
}
}
int b[]=new int[x];
for(i=1;i<M-1;i++)
{
for(j=1;j<M-1;j++)
{
b[y]=a[i][j];
y++;
}
}
y=0;
int c = 0;
for(i=0; i<M-1; i++)
{
for(j=i+1; j<M; j++)
{
if(b[i]>b[j])
{
c = b[i];
b[i] = b[j];
b[j] = c;
}
}
}
for(i=1;i<M-1;i++)
{
for(j=1;j<M-1;j++)
{
a[i][j]=b[y];
y++;
}
}
System.out.println("Rearranged Matrix :");
for(i=0;i<M;i++)
{
for(j=0;j<M;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
for(i=0;i<M;i++)
{
for(j=0;j<M;j++)
{
if(i==j || (i+j)==M-1)
{
sum=sum+a[i][j];
System.out.print(a[i][j] + "\t");
}
else
System.out.print("\t");
}
System.out.println();
}
System.out.println("Sum of diagonal Elements:" +sum);
}
}
}

