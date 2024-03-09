#include <bits/stdc++.h>
using namespace std;

int main(){

	int n, q;
	cin >> n >> q;

	vector<vector<int> > grid(n, vector<int>(n));
	
	for(int i = 0; i < n; i++){
		string line; cin >> line;

		for(int x = 0; x < n; x++){
			int num = line[x] == '*' ? 1 : 0;

			if(x == 0) grid[i][0] = num;
			else grid[i][x] = grid[i][x-1] + num;

		}
	}


	
	for(int i = 0; i < n; i++){

		for(int x = 0; x < n; x++){
			cout << grid[i][x] << " ";
		}
		cout << "\n";
	}






	return 0;
}
