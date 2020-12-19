import java.io.FileNotFoundException;

  import java.io.FileOutputStream;
  import java.io.IOException;

  import org.jdom.Attribute;
  import org.jdom.Comment;
  import org.jdom.Document;
  import org.jdom.Element;
  import org.jdom.output.Format;
  import org.jdom.output.XMLOutputter;

 public class JDomOutput
 {
     public static void main(String[] args) throws IOException
     {
         //�����ĵ�
         Document document = new Document();
         //������Ԫ��
         Element people = new Element("people");
         //�Ѹ�Ԫ�ؼ��뵽document��
         document.addContent(people);

         //����ע��
         Comment rootComment = new Comment("�����ݴӳ��������XML�У�");
         people.addContent(rootComment);

         //������Ԫ��
         Element person1 = new Element("person");
         //��Ԫ�ؼ��뵽��Ԫ����
         people.addContent(person1);
         //����person1Ԫ������
         person1.setAttribute("id", "001");

         Attribute person1_gender = new Attribute("gender", "male");
         person1.setAttribute(person1_gender);

         Element person1_name = new Element("name");
         person1_name.setText("���»�");
         person1.addContent(person1_name);

         Element person1_address = new Element("address");
         person1_address.setText("���");
         person1.addContent(person1_address);


         Element person2 = new Element("person");
         people.addContent(person2);

         person2.setAttribute("id", "002").setAttribute("gender","male");//������ԣ�����һ����Ӷ������

         Element person2_name = new Element("name");
         person2_name.setText("��־ӱ");
         person2.addContent(person2_name);

         Element person2_address = new Element("address");
         person2_address.setText("̨��");
         person2.addContent(person2_address);


         //����xml�����ʽ
         Format format = Format.getPrettyFormat();
         format.setEncoding("utf-8");//���ñ���
         format.setIndent("    ");//��������


         //�õ�xml�����
         XMLOutputter out = new XMLOutputter(format);
         //�����������xml��
         out.output(document, new FileOutputStream("jdom.xml"));//����FileWriter

     }
 }