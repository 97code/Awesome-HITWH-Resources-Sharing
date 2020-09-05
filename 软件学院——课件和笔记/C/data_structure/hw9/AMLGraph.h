#define OK 1
#define ERROR 0
#define TRUE 1
#define FALSE 0
#define MAX_Info 20
typedef int Status;
/* ����ͼ���ڽӶ��ر�洢��ʾ */
#define MAX_VERTEX_NUM 20//��������
#define MAX_NAME 20 //����ֵ��20���ַ�
#define MAX_INFO 20 //����Ϣ����󳤶�20�ַ�
typedef enum{unvisited,visited}VisitIf;
typedef char  InfoType;
typedef char  VertexType[MAX_NAME];//��������

 typedef struct EBox
 {
   VisitIf mark; /* ���ʱ�� */
   int ivex,jvex; /* �ñ����������������λ�� */
   struct EBox *ilink,*jlink; /* �ֱ�ָ�������������������һ���� */
   InfoType *info; /* �ñ���Ϣָ�� */
 }EBox;
 typedef struct
 {
   VertexType data;
   EBox *firstedge; /* ָ���һ�������ö���ı� */
 }VexBox;
 typedef struct
 {
   VexBox adjmulist[MAX_VERTEX_NUM];
   int vexnum,edgenum; /* ����ͼ�ĵ�ǰ�������ͱ��� */
 }AMLGraph;
Status LocateVex(AMLGraph G,VertexType u); /* ��ʼ����: ����ͼG����,u��G�ж�������ͬ���� */
                                           /* �������: ��G�д��ڶ���u,�򷵻ظö���������ͼ��λ��;���򷵻�-1 */
void MarkUnvizited(AMLGraph G); /* �ñߵķ��ʱ��Ϊδ������ */
Status CreateGraph(AMLGraph &G); /* �����ڽӶ��ر�洢�ṹ,��������ͼG */
void Output(AMLGraph G); /* �������ͼ���ڽӶ��ر�G */
