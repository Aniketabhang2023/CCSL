import java.util.Scanner;
public class Diffie
{
    public static long power(long g, long a, long p){
        return (long)Math.pow(g,a)%p;
    }
    

public static void main(String[] args)
    {
        long P, G, x, a, y, b, ka, kb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p:");
        P = sc.nextInt();
       

       
        System.out.println("Enter the value of g:");
        G = sc.nextInt();
       
        System.out.println("The private key a for Alice:"
                           );
        a = sc.nextInt();
       

        x = power(G, a, P);

        System.out.println("The private key b for Bob:");
                           
        b = sc.nextInt();
       
       
        y = power(G, b, P);

       
        ka = power(y, a, P); 
        kb = power(x, b, P); 

        System.out.println("Secret key for the Alice is:"+ ka);
                           
        System.out.println("Secret key for the Bob is:"+ kb);
                           
    }
}

