class Orang {
	String Nama;
	
	public String getNama(){
		return Nama;
	}
	
	public void setNama(String x){
		this.Nama=x;
	}
	
	public static void main(String [] args){
		Orang orangPertama = new Orang();
		orangPertama.setNama("Yahdi Firdaus");
		System.out.print("Nama Saya adalah : ");
		System.out.print(orangPertama.getNama());
	}
}