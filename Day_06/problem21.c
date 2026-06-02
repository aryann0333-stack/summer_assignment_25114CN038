// program to Convert decimal to binary.
#include <stdio.h>

int main()
{

    int intpart, i = 0, j, count = 0;
    int binary[50];
    double num, fracpart;

    printf("Enter a decimal number: ");
    scanf("%lf", &num);

    // seprating intger and fraction part

    intpart = (int)num;
    fracpart = num - intpart;

    // to convert integer part into binary

    printf("IN BINARY :");

    if (intpart == 0)
    {
        printf("0");
    }
    else
    {
        while (intpart > 0)
        {
            binary[i] = intpart % 2;
            intpart /= 2;
            i++;
        }
        for (j = i - 1; j >= 0; j--)
        {
            printf("%d", binary[j]);
        }
    }

    // to convert fractional part into binary
    if (fracpart > 0)
    {
        printf(".");
        while (fracpart > 0)
        {
            fracpart *= 2;
            if (fracpart >= 1)
            {
                printf("1");
                fracpart -= 1;
            }
            else
            {
                printf("0");
            }
            count++;
            if (count == 4)
                break;
        }
    }

    return 0;
}