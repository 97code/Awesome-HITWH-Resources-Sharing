#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct data
{
    int id;
    int length;
    char type;
    char name[11];
}DATA;

int main()
{DATA *pstart,*p;
 void *q,*pbegin;
 int *pn;
 char *ps,ch;
 int n,m,i,j,recordlen=0;
 printf("�������ֶ���:\n");
 scanf("%d",&m);
 printf("�������¼��:\n");
 scanf("%d",&n);
 system("cls");
 pstart=(DATA *)calloc(m,sizeof(DATA));
  p=pstart;
  for (i=0;i<m;i++,p++)
  {
      p->id=i+1;
      printf("�������ֶ�����:\n");
      scanf(" %s",p->name);
      printf("�������ֶ����ͣ�����n��int,s��string\n");
      scanf(" %c",&p->type);
     if (p->type=='s')
     {
         printf("�������ַ�������\n");
         scanf("%d",&p->length);
         p->length++;
     }
     else p->length=4;
     printf("һ���ֶ���Ϣ�Ѿ��������!�밴���������\n\n");
     getchar();getch();
  }
  p=pstart;
  system("cls");
  printf("�ѽ�����¼���ֶ�������Ϣ:\n");
  for (i=0;i<m;i++,p++)
  {
      recordlen+=p->length;
      printf("�ֶ�ID:%d,\t%s,\t%d,\t%c\n",i+1,p->name,p->length,p->type);
  }
  p=pstart;
  printf("%d\n",recordlen);
  printf("�������������¼����Ϣ:\n");
  getch();
  system("cls");

  pbegin=(char*)calloc(n,recordlen);
  q=pbegin;
  for (i=0;i<n;i++)
  { p=pstart;
     for (j=0;j<m;j++,p++)
     {
         printf("%s=",p->name);
      if (p->type=='n')
        {
             pn=(int*)q;
             scanf("%d",pn);
             getchar();
             q+=4;
        }
      if (p->type=='s')
      {
          ps=(char*)q;
          gets(ps);
          q+=p->length;
      }
     }
     printf("һ����¼�Ѿ�¼�����!�����������,ESC�˳�\n");
     ch=getch();
     if (ch==27)
     {
        printf("\n\n\n�������н�����������������~~~~~ ��������˳���");
         getch();
        return 0;
     }
 }
 //getchar();
 system("cls");
 printf("�Ѿ�¼�����Ϣ:\n");
 q=pbegin;
 for (i=0;i<n;i++)
 { p=pstart;
      for (j=0;j<m;j++,p++)
     {
         if (p->type=='n')
        {
             pn=(int*)q;
             printf("%s:%d\t",p->name,*pn);
             q+=4;
        }
      if (p->type=='s')
      {
          ps=(char*)q;
          printf("%s:%s\t",p->name,ps);
          q+=p->length;
      }
     }
     printf("\n");
 }
 free(pstart);
 free(pbegin);
 printf("\n\n\n�������н�����������������~~~~~ ��������˳���");
 getch();
  return 0;
}

