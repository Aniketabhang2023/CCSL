

import java.math.*;
import java.util.*;

public class RSA
{
	public static void main(String[] args) {
	  
	  int p, q, n, d = 0, e, i, z;
	  int msgback = 0;
	  int msg = 9;
	  double c;
	  p = 7;
	  q = 11;
	  n = p * q;
	  z = (p-1) * (q-1);
	  System.out.println("value of z is : " +z);
	  
	  for(e = 2; e<z; e++ )
	  {
	      if( gcd(e,z) == 1){
	          break;
	      }
	  }
	  System.out.println("value of e is : " +e);
	  
	 
	  for(i = 0;i<=9;i++){
	      int x = 1 + (z * i);
	      if(x % e == 0)
	      {
	          d = x / e;
	          break;
	      }
	  }
	  System.out.println("value of d is : " +d);
	  
	    c = (Math.pow(msg, e)) % n;
		System.out.println("Encrypted message is : " + c);
        BigInteger N = BigInteger.valueOf(n);
    	BigInteger C = BigDecimal.valueOf(c).toBigInteger();
		msgback = (C.pow(d)).mod(N);
		System.out.println("Decrypted message is : "+ msgback);
	}
	    
	 
	 static int gcd(int e , int z)
	  {
	      if(e == 0)
	          return z;
	      else
	          return gcd(z % e, e);
	      
	  }
	  
}
