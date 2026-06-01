// programm to check perfect nnumber
#include <stdio.h>

int main()
{
    int num, i, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    for (i = 1; i <= num / 2; i++)
    {
        if (num % i == 0)
            sum += i;
    }
    if (sum == num)
        printf("Enterd number is perfect number");
    else
        printf("Enterd number is not a perfect number");
    return 0;
}