#include<iostream>
using namespace std;

int main(void){
	int grade[10];
	int N=8,i;
	for(i=0;i<N;i++){
       cout<<"������ɼ���"<<endl;
       cin>>grade[i];
       if(grade[i]>=425&&grade[i]<=710)
         cout<<"��ϲ�㣡����ͨ���ļ����ԣ�"<<endl;
	   else if(grade[i]>710&&grade[i]<0)
		 cout<<"sorry!��������������������룡"<<engl;
       else if(grade[i]>0&&grade[i]<425)
        cout<<"���ź�����δ��ͨ���ļ����ԡ���"<<endl;
	}

}
