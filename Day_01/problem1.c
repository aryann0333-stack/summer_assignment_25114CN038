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

    printf("The sum upto  %d  number is: %d ", num, sum);

    return 0;
}