package test;

public class SingletonTest {
	private static volatile SingletonTest singleton;
	public static SingletonTest getInstance(){
		if(singleton == null){
			synchronized (SingletonTest.class){
				if(singleton == null){
					singleton = new SingletonTest();
				}
			}
		}
		return singleton;
	}
}
