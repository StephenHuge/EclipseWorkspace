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
				//	������Ҫ��������ClassName���print()������
				//	�����ⲿ��.this.print()�ķ�ʽ����
				ClassName.this.print("I'm Inner!");
			}
		}	
	public static void main(String[] args){
		ClassName cn = new ClassName();	
		cn.println();
		
	}
}
