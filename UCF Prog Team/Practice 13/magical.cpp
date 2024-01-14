#include <iostream>
using namespace std;

int main() {
	int num = 0;
	cin >> num;
	int i = 4;
	while(num % i != 3){
		i++;
	}
	cout << i << "\n";

	return 0;
}