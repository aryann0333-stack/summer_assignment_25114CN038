// program to find LCM of  two number

#include <stdio.h>

int main()
{
    int num1, num2, rem = 0, lcm = 0, orignum1, orignum2;

    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    orignum1 = num1;
    orignum2 = num2;

    do
    {
        rem = num1 % num2;
        num1 = num2;
        num2 = rem;
    } while (rem != 0);

    // now for LCM use GCD=a*b/gcd
    lcm = (orignum1 * orignum2) / num1;
    printf("The Least Common Factor is %d", lcm);

    return 0;
}