package firstproject;

class Singleton {
	
	private static Singleton single = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return single;
	}
	
	public void demo() {
		System.out.println("I am demo!");
	}
	
	

}
class ClassicSingleton {
	
	private static ClassicSingleton single = null;
	private ClassicSingleton() {
		
	}
	public static ClassicSingleton getInstance() {
		if(single == null) {
			single = new ClassicSingleton();
		}
		return single;
	}
	
	public void demo() {
		System.out.println("I am demo!");
	}

}
