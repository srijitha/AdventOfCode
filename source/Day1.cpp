#include<iostream>
#include<stdio.h>
#include<fstream>

using namespace std;

main(){
	string line;
	int count=0;
	ifstream input_file("input.txt");
	if(input_file.is_open()){
		while(getline(input_file,line)){
			int i=0;
			for(i=0;i<line.length();i++){
				if(line[i] == '(')
					count++;
				else if(line[i] == ')')
					count--;
				else
					cout<<"Invalid Inp"<<endl;
			}
		}
	}

	cout<<"Floor is "<<count<<endl;
}
