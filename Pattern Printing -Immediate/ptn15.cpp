#include <iostream>
using namespace std;

int main()
{
        int n = 4, k = 1;
        for (int i = 1; i <= n; i++)
        {
                char value = 65 - i + 1;
                for (int j = 1; j < i; j++)
                {
                        cout << value << " ";
                }
                value++;
                cout << endl;
        }
}