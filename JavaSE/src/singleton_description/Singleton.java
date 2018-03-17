package singleton_description;

/**
 * 单例模式
 * 
 * @author Administrator
 *
 */
public class Singleton {
	public static void main(String[] args) {

	}
}

/**
 * 基础饱汉单例:不浪费性能，但是线程不安全。单线程下可用
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
 * 加上双重检查锁解决多线程不安全，解决并发性能差 加上volatile解决指令重排序导致的获得半个对象
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
			// 双重检查锁
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
 * 基础饿汉模式，天生自带线程安全性，缺点：性能浪费
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
 * 枚举单例
 * 
 * @author Administrator
 *
 */
enum SingleEnum {
	INSTANCE
}

/**
 * Holder模式，不牺牲性能，线程安全
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