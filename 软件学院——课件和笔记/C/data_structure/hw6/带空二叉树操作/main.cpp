#include "bitree.h"
#include <iostream>
using namespace std;
int  main(){
	BiTree bt;//�����������bt
	cout<<"����������һ�������������������^��ʾ����AB^C^^D^^"<<endl;
	CreateBiTree(bt);//������  AB^C^^D^^
	cout<<"�������"<<endl;
	PreOrder(bt);//�������
	cout<<"\n�ݹ��������"<<endl;
	InOrder(bt);//�ݹ��������
	cout<<"\n�ǵݹ��������"<<endl;
	InOrder_I(bt);//�ǵݹ��������
	cout<<"\n�������"<<endl;
	PostOrder(bt);//�������
	cout<<"\nҶ�ӽڵ�ĸ���Ϊ��";
	int count=0;
	CountLeaf (bt,count);//ͳ��Ҷ�ӽڵ�ĸ���
	cout<<count<<endl;
	cout<<"�����������Ϊ��"<<Depth (bt);// ���ض����������
    cout<<endl;
	system("pause");
	return 0;
}