// program to print prime number in a range
#include <stdio.h>

int main()
{
    int i, j, num, prime;

    printf("Enter a number(range): ");
    scanf("%d", &num);

    for (j = 2; j <= num; j++)
    {
        prime = 1;

        for (i = 2; i < j; i++)
        {
            if (j % i == 0)
            {

                prime = 0;
                break;
            }
        }
        if (prime == 1)
            printf("The number %d is prime !\n", j);
    }
    return 0;
}