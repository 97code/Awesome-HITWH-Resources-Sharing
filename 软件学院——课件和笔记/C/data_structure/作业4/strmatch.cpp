#include <iostream>
#include <cstring>
#define ERROR -1
using namespace std;
typedef char sub_str[255]; //�����ַ�������sub_str
int Index(sub_str S, sub_str T, int pos = 0) //Ĭ�ϴӵ�һλ��ʼƥ�䣬����pos��Ĭ��ֵ=0
{
  int i = pos;
  int j = 0; //�±��0��ʼ
  while (i < strlen(S) && j < strlen(T))
  { //��ָ��û��ƥ��Խ���������
    if (S[i] == T[j])
    {
      ++i;
      ++j;
    } // ���ƥ���Ͼͼ����ȽϺ���ַ�
    else
    {
      i = i - j + 1;
      j = 0;
    } // ָ��������¿�ʼƥ��
  }
  if (j == strlen(T)) //����ִ�����β����Ҳ����ȫ��ƥ����
    return i - strlen(T);
  else
    return ERROR;
} // Index
int main()
{
  sub_str S, T;
  int pos;
  cout << "input mainstring  S:";
  cin >> S;
  cout << "input substring T:";
  cin >> T;
  cout << "input begin postion of match:";
  cin >> pos;
  int result = Index(S, T, pos);
  if (result != -1)
    cout << "the match pos =" << result << endl;
  else
    cout << "mismatch!" << endl;
  return 0;
}
