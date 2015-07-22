#include<iostream>
using namespace std;

int main(void){
	int grade[10];
	int N=8,i;
	for(i=0;i<N;i++){
       cout<<"请输入成绩："<<endl;
       cin>>grade[i];
       if(grade[i]>=425&&grade[i]<=710)
         cout<<"恭喜你！你已通过四级考试！"<<endl;
	   else if(grade[i]>710&&grade[i]<0)
		 cout<<"sorry!您的输入错误，请重新输入！"<<engl;
       else if(grade[i]>0&&grade[i]<425)
        cout<<"很遗憾，你未能通过四级考试。。"<<endl;
	}

}
