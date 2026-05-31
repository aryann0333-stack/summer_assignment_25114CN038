// program to generate fibonacci series
#include <stdio.h>

int main()
{
    int a = 0, b = 1, next, i, num1;

    printf("Enter number of terms :");
    scanf("%d", &num1);

    for (i = 1; i <= num1; i++)
    {
        printf("%d\t", a);
        next = a + b;
        a = b;
        b = next;
    }
    return 0;
}
