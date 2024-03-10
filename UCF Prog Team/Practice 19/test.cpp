#include <bits/stdc++.h>
using namespace std;

int main(){

	int n, q;
	cin >> n >> q;

	vector<vector<int> > grid(n + 1, vector<int>(n + 1));
	
	for(int i = 1; i <= n; i++){
		string line; cin >> line;

		for(int x = 1; x <= n; x++){
			int num = line[x-1] == '*' ? 1 : 0;
			grid[i][x] = grid[i][x-1] + num;

		}
	}

	for(int i = 1; i <= n; i++){

		for(int x = 1; x <= n; x++){

			grid[x][i] += grid[x-1][i];

		}
	}

	for(int i = 0; i < q; i++){
		int y1, x1, y2, x2;
		cin >> y1 >> x1 >> y2 >> x2;

		int num = grid[y2][x2];
		num -= grid[y2][x1 - 1] + grid[y1 - 1][x2] - grid[y1 - 1][x1 - 1];
		printf("%d\n", num);

	}



	return 0;
}
