#include <iostream>
using namespace std;

int fibonnaci(int n){
    if(n < 2){
        return n;
    }
    return fibonnaci(n-1) + fibonnaci(n-2);
}

int main(){
    int x;
    cout<<"Input a number: "<<endl;
    cin>>x;
    cout<<"The "<<x<<" number in the fibonacci sequence is "<<fibonnaci(x)<<endl;
}