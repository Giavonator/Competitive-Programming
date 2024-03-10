#include <bits/stdc++.h>
using namespace std;

int main(){

	int n;
	cin >> n;
	string str;
	bool possible = true;

	for(int i = 0; i < n; i++){
		int current = -1;
		cin >> str;

		if(str[0] != 'm') current = stoi(str);

		if(current != -1 && current != (i+1)){
			possible = false;
		}

	}

	if(possible) cout << "makes sense";
	else cout << "something is fishy";
	

	
	return 0;
}
