


class Factorial
{
    public static void main(String args[])
    {
        int num=Integer.parseInt(args[0]);
        int fact=1;
        
        for(int i=2;i<=num;i++)
        {
           fact=fact*i;

        }
            System.out.println(fact);
}
}