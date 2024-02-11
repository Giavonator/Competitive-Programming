#include <iostream>
using namespace std;

	//Inserting: O(l); Contain: O(l);
	//Linear Respective to length;

typedef struct trieNode{

	int numWords;
	vector<trieNode*> children;
	trieNode(): children(26, nullptr) {}

}trieNode;

void insert(string &s, trieNode *root);
int contains(string &s, trieNode *root);

int main() {
	
	string word; cin >> word;
	
	trieNode *first = new trieNode();
	first->children[0];

	insert(word, first);cin >> word;
	cout << contains(word, first);


	return 0;
}

void insert(string &s, trieNode *root){

	trieNode *cur = root;
	for(int i  = 0; i < (int) s.length(); i++){

		cur->numWords++;
		int x = s[i] - 'a';
		if(cur->children[x] == nullptr) cur->children[x] = new trieNode();
		cur = cur->children[x];

	}

}

int contains(string &s, trieNode *root){

	trieNode *cur = root;

	for(int i = 0; i < (int) s.length(); i++){

		int x = s[i] - 'a';
		if(cur->children[x] == NULL) return 0;
		cur = cur->children[x];
	}

	return cur->numWords;

}