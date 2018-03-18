package enum_description;

public class EnumDescription {
	/**
	 * 1:什么是枚举
	 *  某个类拥有有限个，可数的实例变量
	 *  
	 * 2:自定义枚举类与枚举有什么区别
	 *  使用enum声明的枚举，反编译后，发现是final修饰的，不可以有子类，默认继承ENUM类
	 *  自定义的可以有子类，可以继承其他类，可以实现接口
	 *  
	 * 3:枚举和常量有什么区别
	 *  枚举可以保证代码的健壮性，安全性，可靠性，编译时即可检测到实参是否合法
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Season s = Season.FALL;
		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;  
        
        System.out.println(f1 == f2);  
        System.out.println(f3 == f4);  
	}
}
