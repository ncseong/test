package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.aaa.a");
		}catch(RuntimeException e){
			System.out.println("runtime"+e.getMessage());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
