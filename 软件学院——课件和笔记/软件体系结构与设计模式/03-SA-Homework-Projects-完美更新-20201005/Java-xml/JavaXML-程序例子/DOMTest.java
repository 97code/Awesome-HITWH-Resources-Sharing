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

public class DOMTest {
    /*����xml*/
    public void createXML() throws Exception{
        DocumentBuilder db=getDocumentBuilder();
        Document document=db.newDocument();
        Element bookstore=document.createElement("bookStore");
        //��bookstore���ڵ�������ֽڵ�book
        Element book=document.createElement("book");
        Element name=document.createElement("name");
        book.appendChild(name);
        name.setTextContent("С����");
        book.setAttribute("id", "1");
        //��book�ڵ���ӵ�bookstore���ڵ���
        bookstore.appendChild(book);
        //��bookstore�ڵ㣨�Ѿ�������book��,��ӵ�dom����
        document.appendChild(bookstore);
        //����TransformerFactory����
        TransformerFactory tff=TransformerFactory.newInstance();
        //����Transformer����
        Transformer tf=tff.newTransformer();
        //�����ļ�����
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        tf.transform(new DOMSource(document), new StreamResult(new File("boos1.xml")));
    }
    public static void main(String []args) throws Exception{
        DOMTest test=new DOMTest();
        test .createXML();
    }

}

