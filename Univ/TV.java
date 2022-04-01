public class TV{
	String com;
	int year,inch;
	
	void show(){
		System.out.println(com+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
		
	TV(String com, int year,int inch){
		this.com = com;
		this.year=year;
		this.inch=inch;
		}
	
	public static void main(String args[]) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}
}
