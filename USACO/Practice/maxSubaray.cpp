#include <iostream>
using namespace std;

int main(){

	int n; cin >> n;
	vector<long long> pfx(n+1); 


	for(int i = 1; i <= n; i++){
		cin >> pfx[i];
		pfx[i] += pfx[i-1];
	}

	long long maxSubarray = -1;
	long long minPfx = pfx[1];
	for(int i = 2; i <= n; i++){
		maxSubarray = max(maxSubarray, pfx[i] - minPfx);
		minPfx = min(minPfx, pfx[i]);
	}

	cout << maxSubarray << "\n";


	return 0;
}