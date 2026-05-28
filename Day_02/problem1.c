// program to find sum of digits of a number

#include <stdio.h>

int main()
{
    int num, sum = 0, rem, orig;

    printf("Enter any nnumber: ");
    scanf("%d", &num);
    orig = num;

    while (num != 0)
    {
        rem = num % 10;
        sum += rem;
        num = num / 10;
    }
    printf("Sum of digits of %d is %d", orig, sum);

    return 0;
}