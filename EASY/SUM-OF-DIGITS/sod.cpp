#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int sumOfDigits(int n) {
        int sum = 0;
        string s = to_string(n);
        for (char c : s) {
            sum += c - '0';
        }
        return sum;
    }
};

int main() {
    Solution s;
    cout << s.sumOfDigits(1234) << endl;  // Output: 10
    return 0;
}
