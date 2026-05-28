// program to reverse a number

#include <stdio.h>

int main()
{
    int num, newnum = 0, rem, orig;

    printf("Enter a nnumber: ");
    scanf("%d", &num);
    orig = num;

    while (num != 0)
    {
        rem = num % 10;
        newnum = newnum * 10 + rem;
        num = num / 10;
    }
    printf("The reverse of %d is %d", orig, newnum);

    return 0;
}