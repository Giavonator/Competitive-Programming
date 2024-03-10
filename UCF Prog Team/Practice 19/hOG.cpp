#include <bits/stdc++.h>
using namespace std;

typedef struct{
	string name;
	int price;
	int cutRate;
	int cutTime;
	int chargeTime;
} mower;

int main(){

	long l; int n;
	cin >> l >> n;

	vector<int> best;
	mower *lawnMowers = (mower*) malloc(sizeof(mower) * n);

	string line; getline(cin, line);
	for(int i = 0; i < n; i++){
		getline(cin, line);
		stringstream linestream(line);
		string value;
		
		getline(linestream, lawnMowers[i].name, ',');
		getline(linestream, value, ','); lawnMowers[i].price = stoi(value);
		getline(linestream, value, ','); lawnMowers[i].cutRate = stoi(value);
		getline(linestream, value, ','); lawnMowers[i].cutTime = stoi(value);
		getline(linestream, value, ','); lawnMowers[i].chargeTime = stoi(value);
		
		//cout << "\nTHIS IS MOWER:" << lawnMowers[i].name << "\n";
		//cout <<  "THIS IS THE PRICE: " << lawnMowers[i].price << "\n"; 
		//cout <<  "THIS IS THE PRICE: " << lawnMowers[i].cutRate << "\n"; 
		//cout <<  "THIS IS THE PRICE: " << lawnMowers[i].cutTime << "\n"; 
		//cout <<  "THIS IS THE PRICE: " << lawnMowers[i].chargeTime << "\n"; 

		
		int cut = lawnMowers[i].cutTime * lawnMowers[i].cutRate;
		int cycle = lawnMowers[i].cutTime + lawnMowers[i].chargeTime;
		int cycles = 10080 / cycle;

		if(l <= cut * cycles){
			if(best.size() == 0) best.push_back(i);
			else if (lawnMowers[best[0]].price > lawnMowers[i].price){
				best.clear();
				best.push_back(i);
			}
			else if(lawnMowers[best[0]].price == lawnMowers[i].price){
				//cout << "\nSAME PRICE\n";
				best.push_back(i);
			}
			
		}
		
	}





	if(best.size() == 0) cout << "no such mower";
	else {
		for(unsigned long i = 0; i < best.size(); i++){
			cout << lawnMowers[best[i]].name << "\n";
		}
	}

	return 0;
}
