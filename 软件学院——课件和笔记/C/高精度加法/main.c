#include <stdio.h>
#include <stdlib.h>
void add();
void reduction();
void instruction();
void E();
int main()
{

    int a,b,c;
    printf("                              10���ڼӼ���������ѧ����\n");
    printf("                              ******************************\n");
    printf("                              ******************************\n");
    printf("                              **                          **\n");
    printf("                              **       1�ӷ���ϰ          **\n");
    printf("                              **       2������ϰ          **\n");
    printf("                              **       3����˵��          **\n");
    printf("                              **       4�˳�����          **\n");
    printf("                              **                          **\n");
    printf("                              ******************************\n");
    printf("                              ******************************\n");
    printf("                      ����˵���ǰ�����֣�ѡ���ܣ������ֳ����˵���ǰ�����ֽ���ʾ0��");
    scanf("%d",&c);
    switch(c)
    {
    case 1:add();break;
    case 2:reduction();break;
    case 3:instruction();break;
    case 4:return 0;
    default:
        E();break;
    }
}
void add(int b,int c)
{
    system("cls");
    printf("��ʼ����^_^\n\n");
    int i,i2=0,i3=0,a1,p;
    for(i=0;i<=4;)
    {
        srand(time(NULL));
        a=rand()%10+1;
        b=rand()%10+1;
        if(a+b<=10)
        {
            printf("%d+%d=",b,c);
            scanf("%d",&a1);
            if(a1==b+c)
            {
                printf("��ȷ^_^\n");
                i++;
                continue;
            }
            else if(a1!=b+c)
            {
                i2++;
                for(;;)
                {
                    printf("����o(�i�n�i)o���������룡\n");
                    printf("%d+%d=",b,c);
                    scanf("%d",&a1);
                    if(a1!=b+c)
                    {
                        i2++;
                        if(i2==3)
                        {
                            printf("�����ȷ����%.f%%\n",100*(float)i/(i+i2+i3));
                            printf("���س�������");
                            getchar();
                            p=getchar();
                            if(p=='\n')
                            {
                              system("cls");
                              return main();
                            }


                        }
                    }
                    if(a1==b+c)
                    {
                        i3++;
                       printf("��ȷ^_^\n");
                       break;
                    }
                }
                continue;
            }
        }
        else
        {
            continue;
        }
        return 0;
    }
    printf("�����ȷ����%.2f%%",100*(float)i/(i+i2+i3));
    printf("���س�������\n");
    getchar();
    p=getchar();
    if(p=='\n');
    {
        system("cls");
        return main();
    }
}
void reduction(int a,int b)
{
    system("cls");
    printf("��ʼ����\n\n");
    int i,i2=0,i3=0,a1,p;
    for(i=0;i<=4;)
    {
        srand(time(NULL));
        a=rand()%10+1;
        b=rand()%10+1;
        if(a>=b)
        {
            printf("%d-%d=",a,b);
            scanf("%d",&a1);
            if(a1==a-b)
            {
                printf("��ȷ^_^\n");
                i++;
                continue;
            }
            else if(a1!=a-b)
            {
                i2++;
                for(;;)
                {
                    printf("����o(�i�n�i)o���������룡\n");
                    printf("%d-%d=",a,b);
                    scanf("%d",&a1);
                    if(a1!=a-b)
                    {
                        i2++;
                        if(i2==3)
                        {
                            printf("�����ȷ����%.f%%\n",100*(float)i/(i+i2+i3));
                            printf("���س�������");
                            getchar();
                            p=getchar();
                            if(p=='\n')
                            {
                              system("cls");
                              return main();
                            }


                        }
                    }
                    if(a1==a-b)
                    {
                        i3++;
                       printf("��ȷ^_^\n");
                       break;
                    }
                }
                continue;
            }
        }
        else
        {
            continue;
        }
        return 0;
    }
    printf("�����ȷ����%.2f%%",100*(float)i/(i+i2+i3));
    printf("���س�������\n");
    getchar();
    p=getchar();
    if(p='\n');
    {
        system("cls");
        return main();
    }

}
void instruction()
{
    int a;
    system("cls");
    printf("�㽫�����Ӽ�����Ŀ������Ϊ10���ڼӡ���������ʽ���ӷ�ʱ�������;����ܳ���10������ʱ�����������������ܴ���10���Ҳ����ָ��������������𰸴������ص���ϰ���⣬�Ҳ��ᱻ��Ϊ��ȷ���ش���ȷ������һ�⡣ÿ����ϰ5�⣬ÿ����ϰ���֮�������ȷ��ͳ�ơ�\n");
    printf("������س��������ز˵���");
    getchar();
    a=getchar();
    if(a=='\n')
    {
        system("cls");
        return main();
    }

}
void E()
{
    int p;
    system("cls");
    printf("0\n");
    printf("���س���������\n");
    getchar();
    p=getchar();
    if(p=='\n')
    {
        system("cls");
        return main();
    }
}
