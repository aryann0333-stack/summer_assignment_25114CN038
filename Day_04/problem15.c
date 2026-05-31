//  program to print armstrong number
#include <stdio.h>
#include <math.h>

int main()
{
    int orignum, num, sum = 0, rem, a, orig, count = 0;

    printf("Enter the  number: ");
    scanf("%d", &num);
    orignum = num;
    orig = num;

    while (num != 0)
    {
        count++;
        num = num / 10;
    }

    while (orignum != 0)
    {
        rem = orignum % 10;
        a = pow(rem, count);
        sum = sum + a;
        orignum = orignum / 10;
    }
    if (b == sum)
        printf("Enterd number is Armstrong Number");
    else
        printf("Enterd number is not Armstrong number");

    return 0;
}