// ������͵�����
#include <iostream>
using namespace std;
typedef int ElemType;
typedef struct LNode
{
	ElemType data;
	struct LNode *next;
} LNode, *LinkList;
void CreateList(LinkList &L, int n)
{
	//����һ��n��Ԫ�ص����Ա�ͷ�巨������¼���Ϊ��β�������¼���Ϊ��ͷ
	L = (LinkList)malloc(sizeof(LNode));
	L->next = NULL;
	for (LinkList p; n >= 1; n--)
	{
		p = (LinkList)malloc(sizeof(LNode));
		cout << "�������" << n << "��Ԫ��";
		cin >> p->data;
		p->next = L->next;
		L->next = p;
	}
}
void TraverseList(LinkList L)
{ //����
	LinkList p = L->next;
	while (p)
	{
		cout << p->data << " ";
		p = p->next;
	}
}
void ReverseList(LinkList &L)
{ //����
	//�ڴ����ƴ���
	LinkList p = (LinkList)malloc(sizeof(LNode));
	p->next = NULL;
	LinkList pr;
	while (L->next)
	{
		p->data = L->next->data;
		pr = (LinkList)malloc(sizeof(LNode));
		pr->next = p;
		p = pr;
		L = L->next;
	}
	p->data = L->data;
	L = p;
}
int main()
{ //������
	LinkList L;
	CreateList(L, 5); //��������L,5��Ԫ��
	cout << "����L=";
	TraverseList(L); //�����������L

	cout << "\n"
		 << "L������=";
	ReverseList(L);  //��������L
	TraverseList(L); //�����������L
	return 0;
}
