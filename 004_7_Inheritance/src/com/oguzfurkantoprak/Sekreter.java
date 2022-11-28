package com.oguzfurkantoprak;

// extend etmek miras almak anlamına gelir.
public class Sekreter extends Personel {
	
	private long tel1SeriNo;
	private long tel2SeriNo;
	
	
	public Sekreter(long tel1SeriNo) {
		super("herhangi bir metin");
		// birden fazla super çağrısı yapılamaz.
		this.tel1SeriNo = tel1SeriNo;
	}
	
			
	public Sekreter() {
		super();
	}



	public long getTel1SeriNo() {
		return tel1SeriNo;
	}
	public void setTel1SeriNo(long tel1SeriNo) {
		this.tel1SeriNo = tel1SeriNo;
	}
	public long getTel2SeriNo() {
		return tel2SeriNo;
	}
	public void setTel2SeriNo(long tel2SeriNo) {
		this.tel2SeriNo = tel2SeriNo;
	}
	
	
	
	
}
