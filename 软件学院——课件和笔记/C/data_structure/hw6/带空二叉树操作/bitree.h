#include "stack.h"
#define OK 1
#define ERROR 0
#define TRUE 1
#define FALSE 0
#define OVERFLOW -1
typedef int Status;
/*typedef char TElemType;
typedef struct BiTNode { // ���ṹ
    TElemType      data;
    struct BiTNode  *lchild, *rchild; // ���Һ���ָ��                                  
} BiTNode, *BiTree;*/  //�˴������γ���һ���洢�ṹͷ�ļ�storage_tree.h����bitree.h��stack.h����
Status CreateBiTree(BiTree &T);//���ַ�������ʽ  �� ������ ������   ����һ�ö�����,������^��ʾ
void PreOrder (BiTree T);//�ȸ�����
void InOrder (BiTree T);//�и�����
void PostOrder (BiTree T);//�������
void visit(TElemType& e);//���ʺ���
void CountLeaf (BiTree T,  int& count);//ͳ��Ҷ�ӽڵ�ĸ���
int Depth (BiTree T );// ���ض����������
BiTNode *GoFarLeft(BiTree T, Stack &S);//�ҵ���T�������½��
void InOrder_I(BiTree T);//�ǵݹ��������