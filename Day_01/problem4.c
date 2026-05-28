// program to count digit in a number
#include <stdio.h>

int main()
{

    int num, count = 0, original;

    printf("Enter a required number : ");
    scanf("%d", &num);
    original = num;

    if (num == 0)
    {
        count = 1;
    }
    while (num != 0)
    {
        num = num / 10;
        count++;
    }

    printf("The digit in %d are %d", original, count);
    return 0;
}