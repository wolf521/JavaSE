package clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * �����¡
 * 
 * @author Administrator
 *
 */
public class CloneUtil {
	private CloneUtil() {  
        throw new AssertionError();  
    }  
  
    @SuppressWarnings({ "unchecked"})
	public static <T> T clone(T obj) throws Exception {  
        ByteArrayOutputStream bout = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bout);  
        oos.writeObject(obj);  
  
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bin);  
        return (T) ois.readObject();  
          
        // ˵��������ByteArrayInputStream��ByteArrayOutputStream�����close����û���κ�����  
        // �����������ڴ����ֻҪ�������������������ܹ��ͷ���Դ  
    }  
}
