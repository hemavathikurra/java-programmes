import java.io.*;
class Ternary
{
public static void main(String[] args)
{
// variable declaration 
int n1 = 5,n2 = 10, res;
System.out.println("First num: " + n1); 
System.out.println("Second num: " + n2);
// Performing ternary operation 
res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
// Print the largest number 
System.out.println("Result = " + res);
}
}