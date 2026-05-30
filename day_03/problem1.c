// program to check  whether number is prime or not

#include <stdio.h>

int main()
{
    int num, i, flag = 1;
    printf("Enter a required number to check: ");
    scanf("%d", &num);

    for (i = 2; i <= num / 2; i++)
    {
        if (num % i == 0)
        {
            flag = 0;
            break;
        }
    }
    if (flag == 0)
    {
        printf("Enterd number is not prime");
    }
    else

        printf("Ennterd number is prime");

    return 0;
}