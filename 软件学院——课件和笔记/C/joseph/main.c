#include<iostream>
using namespace std;
 typedef struct CLinkList
 {
int data;
 struct CLinkList *next;
 }node;
 int main()
 {
     node *L,*r,*s;
       L = new node;
        r =L;
        int n = 41,i;
        int k = 3;
         for(i = 1;i<=n;i++)       //β�巨��������
          {
        s = new node;
          s->data = i;
            r->next = s;
             r= s;    }
             r->next =L->next;       //�����һ�����ָ���һ�������ݽ��
             node *p;    p = L->next;    delete L;   //ɾ����һ���յĽ�� ///ģ����Լɪ������
               while(p->next != p)
                    //�ж���������Ϊ���϶�ʣ��һ���ˣ� ѭ����������һ�����ݵ�next����������
    {        for(i = 1;i<k-1;i++)
      {            p = p->next;                         //ÿk������һ����
       }        cout<<p->next->data<<"->";        p->next = p->next->next;
            //���ýڵ��������ɾ����
             p = p->next;    }
              cout<<p->data<<endl;
              return 0;}
