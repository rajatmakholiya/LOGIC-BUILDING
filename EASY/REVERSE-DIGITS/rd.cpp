#include <string>
#include <iostream>
using namespace std;

class Solution {
    public:
    int reverseDigit(int n){
        string s = to_string(n);
        reverse(s.begin(), s.end());
        return stoi(s);
    }
};

int main(){
    Solution s;
    cout << s.reverseDigit(12345) << endl;  // Output: 54321
    return 0;
}