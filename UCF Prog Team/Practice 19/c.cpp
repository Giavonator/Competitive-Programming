#include <bits/stdc++.h>
using namespace std;

int main(){

	int n;
	cin >> n;

	vector<int> dirty;
	int num; cin >> num;
	dirty.push_back(num);

	int sumDirty = 0;
	int clean = 1;
	

	for(int i = 1; i < n; i++){
		cin >> num;
		//printf("NUM IS: %d\n", num);
		//printf("Sum Dirty: %d\n", sumDirty);
		//printf("Size in dirty: %lu\n", dirty.size());
		//printf("Distance since last %d\n", num - dirty.back());

		if(sumDirty + (dirty.size() * (num - dirty.back())) >= 20){
			//printf("CLEAN CEHCK %d\n", i);
			clean++;
			dirty.clear();
			dirty.push_back(num);
			sumDirty = 0;
		}
		else{
			//printf("NO CLEAN %d\n", i);
			sumDirty += (dirty.size() * (num - dirty.back()));
			dirty.push_back(num);
			//printf("%d\n", dirty[0]);
			//printf("%d\n", dirty[dirty.size()]);
		}
		

		//printf("\n");

	}

	cout << clean;

	
	return 0;
}
