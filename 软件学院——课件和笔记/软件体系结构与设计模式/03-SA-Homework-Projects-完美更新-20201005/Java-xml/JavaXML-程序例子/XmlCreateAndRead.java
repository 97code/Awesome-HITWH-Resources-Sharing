import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlCreateAndRead {

    public static void main(String[] args) {

        //�����ݿ��������д��xml�ļ�
        boolean flag = addCompany();

        //��xml�ļ�����չʾ��ҳ��
//      Map<String, Object> company = findByUnitcode("736350492");

        System.out.println(flag);

    }

    /**
     * �������xml��
     * @param form
     */
    public static boolean addCompany() {
        /*
         * 1. ���������õ�Document
         * 2. ���������õ�rootԪ��
         * 3. Ҫ�����ݶ���ת����ElementԪ��
         * 4. �Ѷ�������Բ��뵽rootԪ����
         * 5. ��дdocument
         */

        //��ȡҪд��xml�ļ������ݣ����Դ����ݿ��ȡ������ֱ����һ��Map������Ϊ����
        Map<String,Object> comMap = new HashMap<String,Object>();
        comMap.put("UNIT_ID", "89adf979asd");
        comMap.put("UNIT_CODE", "xiaoCreate");
        comMap.put("UNIT_NAME", "���й�˾");
        comMap.put("DISPLAYNAME", "��������");

        try {
            // 1. ����Docuembnt
            Document doc = DocumentHelper.createDocument();
            // 2. ������Ԫ��
            Element root = doc.addElement("city");
            root.addComment("�ĵ��ĸ�city�Ѿ�������");// ���ע��

        /*  //��������Ϊ׷�����ݵ� xml �ļ�ʱ ʹ��
            SAXReader reader = new SAXReader(); // ����������
            Document doc = reader.read("E://temptest//xmlTest.xml"); // �õ�Document
            Element root = doc.getRootElement(); //�õ���Ԫ��
        */
            /*
             * 3. ������Ԫ�أ���������ӵ�Ԫ�أ�
             * ��root�����һ����Ϊcompany��Ԫ�أ����������Ԫ��
             */
            Element comElement = root.addElement("company");
            // ����comElement�����ԣ�
            comElement.addAttribute("unitId", (String) comMap.get("UNIT_ID"));
            comElement.addAttribute("unitCode", (String) comMap.get("UNIT_CODE"));
            comElement.addAttribute("unitName", (String) comMap.get("UNIT_NAME"));
            comElement.addAttribute("cityArea", (String) comMap.get("DISPLAYNAME"));
            // ���comElement����Ԫ�ؽڵ㣡
            comElement.addElement("unitId").addText((String) comMap.get("UNIT_ID"));
            comElement.addElement("unitCode").addText((String) comMap.get("UNIT_CODE"));
            comElement.addElement("unitName").addText((String) comMap.get("UNIT_NAME"));
            comElement.addElement("cityArea").addText((String) comMap.get("DISPLAYNAME"));

            // ���������
            Writer out = new PrintWriter("E:\\temptest\\xmlTest.xml", "utf-8");
            // ��ʽ��
            OutputFormat format = new OutputFormat("\t", true);
            format.setTrimText(true);//ȥ��ԭ���Ŀհ�(\t�ͻ��кͿո�)��

            XMLWriter writer = new XMLWriter(out, format);
            // ��document����д��out���С�
            writer.write(doc);

            out.close();
            writer.close();

            return true;
        } catch(Exception e) {
            // �ѱ����쳣ת���������쳣��
            throw new RuntimeException(e);
        }
    }
}
