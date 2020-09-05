#include "stdio.h"
#include <iostream>
using namespace std;
#include "bitree.h"
Status CreateBiTree(BiTree &T)
{
   TElemType ch;
   //scanf(&ch);//����ch
   cin >> ch;
   if (ch == '^')
      T = NULL; //�μ����ÿո��ʾ�գ�������^��ʾ��
   else
   {
      if (!(T = (BiTNode *)malloc(sizeof(BiTNode))))
         exit(OVERFLOW);
      T->data = ch;            // ���ɸ����
      CreateBiTree(T->lchild); // ����������
      CreateBiTree(T->rchild); // ����������
   }
   return OK;
} // CreateBiTree ���ַ�������ʽ  �� ������ ������   ����һ�ö�����,������^��ʾ

void PreOrder(BiTree T)
{ // �������������
   if (T)
   {
      cout << T->data;     // ���ʽ��
      PreOrder(T->lchild); // ����������
      PreOrder(T->rchild); // ����������
   }
}
void InOrder(BiTree T)
{ // �������������
   if (T)
   {
      InOrder(T->lchild); // ����������
      cout << T->data;    // ���ʽ��
      InOrder(T->rchild); // ����������
   }
}
void PostOrder(BiTree T)
{ // �������������
   if (T)
   {
      PostOrder(T->lchild); // ����������
      PostOrder(T->rchild); // ����������
      cout << T->data;      // ���ʽ��
   }
}

//BiTNode *GoFarLeft(BiTree T, Stack *S){//ԭ�μ��еĺ���ͷ����Ϊ�����  &S
BiTNode *GoFarLeft(BiTree T, Stack &S)
{ //�ҵ���T�������½��
   if (!T)
      return NULL;
   while (T->lchild)
   {
      Push(S, T);
      T = T->lchild;
   }
   return T;
}

void InOrder_I(BiTree T)
{
   //Stack *S;
   Stack S;
   InitStack(S);               //��ʼ��ջS
   BiTree t = GoFarLeft(T, S); // �ҵ������µĽ��
   while (t)
   {
      cout << t->data;
      if (t->rchild)
         t = GoFarLeft(t->rchild, S);
      else if (!StackEmpty(S)) // ջ����ʱ��ջ
                               //t = Pop(S);
         Pop(S, t);
      else
         t = NULL; // ջ�ձ�����������
   }               // while
} // Inorder_I
void CountLeaf(BiTree T, int &count)
{ //ͳ��Ҷ�ӽڵ�ĸ���
   if (T)
   {
      if ((!T->lchild) && (!T->rchild))
         count++; // ��Ҷ�ӽ�����
      CountLeaf(T->lchild, count);
      CountLeaf(T->rchild, count);
   } // if
} // CountLeaf
int Depth(BiTree T)
{ // ���ض����������
   int depthval, depthLeft, depthRight;
   if (!T)
      depthval = 0;
   else
   {
      depthLeft = Depth(T->lchild);
      depthRight = Depth(T->rchild);
      depthval = 1 + (depthLeft > depthRight ? depthLeft : depthRight);
   }
   return depthval;
}
