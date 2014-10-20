class NamaPemainBola { //nama kelas
//deklarasi variabel
	String Nama; //mendeklarasikan variabel Nama yang bertipe data string
	String Club; //mendeklarasikan variabel Club yang bertipe data string
	String Posisi; //mendeklarasikan variabel Posisi yang bertipe data string
	String NoPunggung; //mendeklarasikan variabel NoPunggung yang bertipe data string
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama
	}
	public void setNama(String x){ //deklarasi set untuk atribut Nama
		this.Nama=x;
	}
	
	public String getClub(){ //inisialisasi nilai Club
		return Club; //mengembalikan nilai Club
	}
	public void setClub(String y){ //deklarasi set untuk atribut Club
		this.Club=y;
	}
	
	public String getPosisi(){ //inisialisasi nilai Posisi
		return Posisi; //mengembalikan nilai Posisi
	}
	public void setPosisi(String a){ //deklarasi set untuk atribut Posisi
		this.Posisi=a;
	}
	
	public String getNoPunggung(){ //inisialisasi nilai NoPunggung
		return NoPunggung; //mengembalikan nilai NoPunggung
	}
	public void setNoPunggung(String b){ //deklarasi set untuk atribut NoPunggung
		this.NoPunggung=b;
	}
	
	public static void main(String [] args){
		NamaPemainBola bola = new NamaPemainBola();
		bola.setNama("Aaron Ramsey"); //mengisi nilai setter Nama 
		System.out.print("\nNama Pemain Bola : "); //output kalimat
		System.out.print(bola.getNama()); //memanggil setter Nama dengan getter
		
		bola.setClub("Arsenal "); //mengisi nilai setter Club
		System.out.print("\nClubnya adalah : "); //output kalimat
		System.out.print(bola.getClub()); //memanggil setter Club dengan getter
		
		bola.setPosisi("Centarl Miedfelder"); //mengisi nilai setter Posisi
		System.out.print("\nPosisinya adalah : "); //output kalimat
		System.out.print(bola.getPosisi()); //memanggil setter Posisi dengan getter
		
		bola.setNoPunggung("16"); //mengisi nilai setter NoPunggung
		System.out.print("\nNo Punggungnya adalah : "); //output kalimat
		System.out.print(bola.getNoPunggung()); //memanggil setter NoPunggung dengan getter
	}
}