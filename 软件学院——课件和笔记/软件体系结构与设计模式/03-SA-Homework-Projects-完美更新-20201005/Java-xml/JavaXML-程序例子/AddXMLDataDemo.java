/**
 * ���XML����
 * @author ֣��
 */
 import java.io.File;
 import java.io.StringWriter;

 import javax.xml.parsers.DocumentBuilder;
 import javax.xml.parsers.DocumentBuilderFactory;
 import javax.xml.parsers.ParserConfigurationException;
 import javax.xml.transform.Transformer;
 import javax.xml.transform.TransformerFactory;
 import javax.xml.transform.dom.DOMSource;
 import javax.xml.transform.stream.StreamResult;

 import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AddXMLDataDemo {

	//static File file = new File("E:/eclipse-workspace/JavaEE_workspace/Day34XML/src/Persons.xml");//Persons.xml�ļ�����·��
	static File file = new File("E:/Java-xml/AgentInfo.xml");//Persons.xml�ļ�����·��

	public static void main(String[] args) throws Exception {
		//�ٻ�ý�����DocumentBuilder�Ĺ���ʵ��DocumentBuilderFactory  Ȼ���õ�DocumentBuilder����
		DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//�ڻ�ȡһ��������ļ������ķǿ�Document����
		Document doc = newDocumentBuilder.parse(file);
		//��ͨ���ĵ������ø��ĵ�����ĸ��ڵ�
		Element root = doc.getDocumentElement();

		//����һ���µ�person�ڵ�
		Element person = doc.createElement("person");
		//����person�ļ����ӽڵ�
		Element name = doc.createElement("name");
		Element age = doc.createElement("age");
		Element sex = doc.createElement("sex");
		//���ӽڵ�����ֵ
		name.setTextContent("��������");
		age.setTextContent("56");
		sex.setTextContent("��");
		//���ӽڵ�׷�ӵ�person
		person.appendChild(name);
		person.appendChild(age);
		person.appendChild(sex);
		//��person��id����ֵ
		person.setAttribute("id", "4");
		//��person׷�ӵ����ڵ�
		root.appendChild(person);

		//ע�⣺XML�ļ��Ǳ����ص��ڴ��� �޸�Ҳ�����ڴ��� ==�������Ҫ���ڴ��е�����ͬ����������
		/*
		 * static TransformerFactory newInstance():��ȡ TransformerFactory ����ʵ����
		 * abstract  Transformer newTransformer():����ִ�д� Source �� Result �ĸ��Ƶ��� Transformer��
		 * abstract  void transform(Source xmlSource, Result outputTarget):�� XML Source ת��Ϊ Result��
		 */
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		DOMSource source = new DOMSource(doc);
		//Source source = new DOMSource(doc);
		//StreamResult result = new StreamResult();

		StreamResult result = new StreamResult(file);

		//Result result = new StreamResult(file);
		transformer.transform(source, result);//�� XML==>Source ת��Ϊ Result
	}

}
