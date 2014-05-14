package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_barang")
public class Barang implements Serializable{
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid" , strategy = "uuid2")
	private String id;
public class Barang {

	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNamabarang() {
		return namabarang;
	}

	public void setNamabarang(String namabarang) {
		this.namabarang = namabarang;
	}

	public String getKodebarang() {
		return kodebarang;
	}

	public void setKodebarang(String kodebarang) {
		this.kodebarang = kodebarang;
	}
	
	
	@Column(name="kode_barang",nullable = false , leght = 5)
	private String namabarang;
	
	private String kodebarang;
	@Column(name="kode_barang",nullable = false , leght = 5)

	}
}
