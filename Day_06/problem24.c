//  program to Find x^n without pow().
#include <stdio.h>

int main()
{

    int x, n, i;
    long long result = 1;

    printf("Enter a base (x): ");
    scanf("%d", &x);
    printf("Enter a power(n): ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        result = result * x;
    }

    printf("%d^%d=%lld", x, n, result);

    return 0;
}