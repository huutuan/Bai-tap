package cfg_tutorial;

public class CheckTriagle {
	public static void main(String[] args){
		try{
			// Bộ ca kiểm thử theo tiêu chuẩn C1P
			// Triagle triagle = new Triagle(1, 5, 2);
			// Triagle triagle = new Triagle(3, 5, 6);
			// Triagle triagle = new Triagle(4, 4, 4);
			Triagle triagle = new Triagle(4, 4, 2);
			int i = triagle.Check_Triagle();
			if(i == -1)
				System.out.println("Khong phai la tam giac!");
			else if (i == 0)
				System.out.println("Tam giac thuong!");
			else if (i == 1)
				System.out.println("Tam giac can!");
			else
				System.out.println("Tam giac deu!");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
