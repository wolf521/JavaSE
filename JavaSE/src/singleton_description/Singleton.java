package singleton_description;

/**
 * ����ģʽ
 * 
 * @author Administrator
 *
 */
public class Singleton {
	public static void main(String[] args) {

	}
}

/**
 * ������������:���˷����ܣ������̲߳���ȫ�����߳��¿���
 * 
 * @author Administrator
 *
 */
class SingleFullMan {
	private static SingleFullMan singleFullMan = null;

	private SingleFullMan() {
	}

	public static SingleFullMan getInstance() {
		if (singleFullMan == null) {
			singleFullMan = new SingleFullMan();
		}
		return singleFullMan;
	}
}

/**
 * ����˫�ؼ����������̲߳���ȫ������������ܲ� ����volatile���ָ���������µĻ�ð������
 * 
 * @author Administrator
 *
 */
class SingleFullMan1 {
	private static volatile SingleFullMan1 singleFullMan = null;

	private SingleFullMan1() {
	}

	public static SingleFullMan1 getInstance() {
		if (singleFullMan == null) {
			// ˫�ؼ����
			synchronized (SingleFullMan1.class) {
				if (singleFullMan == null) {
					singleFullMan = new SingleFullMan1();
				}
			}
		}
		return singleFullMan;
	}
}

/**
 * ��������ģʽ�������Դ��̰߳�ȫ�ԣ�ȱ�㣺�����˷�
 * 
 * @author Administrator
 *
 */
class SingleLazy {
	private static SingleLazy singleFullMan = new SingleLazy();

	private SingleLazy() {
	}

	public static SingleLazy getInstance() {
		return singleFullMan;
	}
}

/**
 * ö�ٵ���
 * 
 * @author Administrator
 *
 */
enum SingleEnum {
	INSTANCE
}

/**
 * Holderģʽ�����������ܣ��̰߳�ȫ
 * @author Administrator
 *
 */
class SingletonH {
	private static class SingletonHolder {
		private static final SingletonH singleton = new SingletonH();

		private SingletonHolder() {
		}
	}

	private SingletonH() {
	}

	public synchronized static SingletonH getInstance() {
		return SingletonHolder.singleton;
	}
}