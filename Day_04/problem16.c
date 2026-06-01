// program to find armstrong number in range

#include <stdio.h>
#include <math.h>

int main()
{
    int orig, num, i, sum, count, temp, rem;

    printf("Enter the range for Armstrong Number : ");
    scanf("%d", &num);

    printf("Armstrong Numbers in the range are:\n");

    for (i = 1; i <= num; i++)
    {
        orig = i;
        temp = i;
        count = 0;

        while (temp != 0)
        {
            count++; // countiing digits
            temp = temp / 10;
        }
        temp = i;
        sum = 0;
        while (temp != 0)
        {
            rem = temp % 10;             // extracting digit
            sum = sum + pow(rem, count); // calculating sum
            temp = temp / 10;            // reducing number
        }
        if (sum == orig)
            printf("%d\t", i);
    }
    return 0;
}