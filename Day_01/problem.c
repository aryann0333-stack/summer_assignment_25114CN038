//  program to Calculate sum of first N natural numbers
#include <stdio.h>

int main()
{
    int num, i, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    for (i = 1; i <= num; i++)
    {
        sum += i;
    }

    printf("The sum upto enterd number is: %d ", sum);

    return 0;
}