#include <iostream>
#include <algorithm>
using namespace std;

int main(){

	int T; 
	cin >> T;
	for(int t = 0; t < T; t++){
		int N; cin >> N;

		vector<int> values(N);
		vector<int> preMax(N);
		vector<int> postMax(N);

		for(int i = 0; i < N; i++){
			
			cin >> values[i];
			if(i == 0) preMax[i] = values[i];
			else preMax[i] = max(preMax[i-1], (values[i] + i));
			
		}

		postMax[N-1] = values[N-1] - (N - 1);
		for(int i = N-2; i>=0; i--){
			postMax[i] = max(postMax[i+1], values[i] - i);
		}

		int high = -1;
		for(int i = 1; i < N-1; i++){
			high = max(high, preMax[i-1] + values[i] + postMax[i+1]);
		}

		cout << high << "\n";


	}
	



	return 0;
}