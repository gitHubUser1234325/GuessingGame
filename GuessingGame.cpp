#include <iostream>
#include <time.h>
#include <cstdlib>
using namespace std;
int main(){
    cout<<"The computer is thinking of a number between 1 and 100."<<endl;
    cout<<"Try to guess what that number is in 10 tries or less."<<endl;
    srand((unsigned) (time(NULL)));
    int num = rand()%100;
    int guess;
    for(int i = 0; i < 10; i++){
        cout<<"Guess "<<i + 1<<": ";
        cin>>guess;
        if(i == 0 && guess == num){
            cout<<"Correct, first try!"<<endl;
            break;
        }
        else if(guess > num){
            cout<<"Too High"<<endl;
        }
        else if(guess < num){
            cout<<"Too Low"<<endl;
        }
        else if(guess == num){
            cout<<"Correct, the number was "<<num<<endl;
            cout<<"It took you "<<i + 1<<" guesses."<<endl;
            break;
        }
        else if(i == 10){
            cout<<"You have used up all of your guesses."<<endl;
            cout<<"The correct number was: "<<num<<endl;
        }
    }
    return 0;
}
