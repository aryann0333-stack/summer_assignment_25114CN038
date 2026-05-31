// program to  find nth fibonacci term
#include <stdio.h>

int main()
{
    int n, i, a = 0, b = 1, next;
    printf("Enter the required term :");
    scanf("%d", &n);

    for (i = 1; i <= n; i++)
    {
        if (i == n)
            printf("The required term of fibonacci series is: %d", a);
        next = a + b;
        a = b;
        b = next;
    }
    return 0;
}