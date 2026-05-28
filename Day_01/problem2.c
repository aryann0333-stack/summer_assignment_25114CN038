// program to print  multiplication table of enterd number

#include <stdio.h>

int main()
{
    int num, i, p = 0;
    printf("Enter required number: ");
    scanf("%d", &num);

    for (i = 1; i <= 10; i++)
    {
        p = num * i;
        printf("%d*%d=%d\n", num, i, p);
    }

    return 0;
}
