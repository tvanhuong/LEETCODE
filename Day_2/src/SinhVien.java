
public class SinhVien {
	
	String ten;
	String maso;
	double diem;
	
	

	public static void main(String[] args) 
	{
		SinhVien sv1 = new SinhVien();
		
		sv1.ten = "Trần Văn Hưởng";
		sv1.maso = "dpm245425";
		sv1.diem = 7.5;
		System.out.print("Họ và tên:"+ sv1.ten+"\nmssv: "+ sv1.maso+"\nĐiểm: "+sv1.diem);

	}

}
