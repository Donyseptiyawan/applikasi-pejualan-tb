package net.smktarunabhakti.penjualan.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "trx_jual detail")
public class PenjualanDetail {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid" , strategy = "uuid2")
		private String id;
		
	@ManyToOne
	private Penjualan header;
		
	private Barang barang;
		
	@Column(name="jumlah_barang")
	private int jumlah;
	
	@Column(name="total_harga")
	private BigDecimal totalharga;
	
}
