// program to find product of digits

#include <stdio.h>

int main()
{
    int num, prod = 1, rem = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    while (num != 0)
    {
        rem = num % 10;
        prod *= rem;
        num = num / 10;
    }
    printf("Product of digits is %d", prod);
    return 0;
}