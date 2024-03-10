#include <bits/stdc++.h>
using namespace std;

int main(){

	int l; int n;
	cin >> l >> n;

	vector<string> lawnMowers;
	int cheapest = INT_MAX;

	string line; getline(cin, line);
	for(int i = 0; i < n; i++){

		getline(cin, line);
		stringstream linestream(line);
		string name, value, priceS, rateS, timeS, rechargeS;
		
		getline(linestream, name, ',');
		getline(linestream, priceS, ',');
		getline(linestream, rateS, ',');
		getline(linestream, timeS, ','); 
		getline(linestream, rechargeS); 
		
		int price = stoi(priceS);
		double rate = stoi(rateS);
		double time = stoi(timeS);
		double recharge = stoi(rechargeS);

		double result = (10080.0 / (recharge + time));
		result *= time * rate;
		

		if(l <= result && price <= cheapest){

			if(cheapest > price) lawnMowers.clear();
			cheapest = price;
			lawnMowers.push_back(name);

			
		}
		
	}





	if(lawnMowers.size() == 0) cout << "no such mower";
	else {
		for(unsigned long i = 0; i < lawnMowers.size(); i++){
			cout << lawnMowers[i] << "\n";
		}
	}

	return 0;
}
