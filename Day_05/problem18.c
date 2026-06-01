//  program to print strong number

#include <stdio.h>

int main()
{
    int i, rem, fact, num, sum = 0, temp;

    printf("Enter a number: ");
    scanf("%d", &num);

    temp = num;

    while (temp != 0)
    {
        rem = temp % 10;
        fact = 1;
        for (i = 1; i <= rem; i++)
        {
            fact = fact * i;
        }
        temp = temp / 10;
        sum = sum + fact;
    }

    if (num == sum)
        printf("Enterd number is a strong number ");
    else
        printf("Enterd number is not a strong number");

    return 0;
}
