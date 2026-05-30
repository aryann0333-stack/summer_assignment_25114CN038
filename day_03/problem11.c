// a program to Find GCD of two numbers. by euclidean method
#include <stdio.h>

int main()
{
    int num1, num2, rem = 0;

    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);

    do
    {
        rem = num1 % num2;
        num1 = num2;
        num2 = rem;

    } while (rem != 0);

    printf("The Highest common factor is %d", num1);
    return 0;
}
