// program to find factorial of a number
#include <stdio.h>

int main()
{

    int fact = 1, num, i;

    printf("Enter a number:");
    scanf("%d", &num);

    for (i = 1; i <= num; i++)
    {
        fact = fact * i;
    }

    printf("Factorial of a %d is %d", num, fact);

    return 0;
}