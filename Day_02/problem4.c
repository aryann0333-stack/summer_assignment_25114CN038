// check whether nnumber  is pallindrome or not

#include <stdio.h>

int main()
{
    int num, newnum = 0, rem = 0, orig;

    printf("Enter a number: ");
    scanf("%d", &num);
    orig = num;

    while (num != 0)
    {
        rem = num % 10;
        newnum = newnum * 10 + rem;
        num = num / 10;
    }
    if (newnum == orig)

        printf("Enterd number is pallindrome");
    else
        printf("Enterd number is not pallindrome");

    return 0;
}