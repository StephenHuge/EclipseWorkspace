package test;

public class ClassName {
		 Inner i = new Inner();		
		void println(){
			i.print();
		}
		void print(String s){
			System.out.println(s);
		}
		class Inner{
			void print(){
				//	这里想要调用外面ClassName类的print()方法，
				//	就用外部类.this.print()的方式调用
				ClassName.this.print("I'm Inner!");
			}
		}	
	public static void main(String[] args){
		ClassName cn = new ClassName();	
		cn.println();
		
	}
}
