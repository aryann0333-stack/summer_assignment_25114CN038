//  program to Convert binary to decimal.
#include <stdio.h>
#include <math.h>
#include <string.h>

int main()
{
    int i, leng, dotpos = -1;
    char bi[50];
    double decimal = 0.0;

    printf("Enter a binary number: ");
    scanf("%s", bi);

    leng = strlen(bi);

    // to find position of decimal

    for (i = 0; i <= leng; i++)
    {
        if (bi[i] == '.')
        {
            dotpos = i;
            break;
        }
    }

    // to check  if there is decimal point

    if (dotpos == -1)
    {
        dotpos = leng;
    }

    // convert integer part

    for (i = 0; i < dotpos; i++)
    {
        if (bi[i] == '1')
        {
            decimal += pow(2, dotpos - i - 1);
        }
    }

    // coverting fractional part

    for (i = dotpos + 1; i < leng; i++)
    {
        if (bi[i] == '1')
        {
            decimal += pow(2, -(i - dotpos));
        }
    }
    printf("IN DECIMAL=%.4lf\n", decimal);

    return 0;
}