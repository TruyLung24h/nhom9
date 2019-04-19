package bootsample.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tintuc")

public class TinTuc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matintuc;
	private String  tenmuctintuc;
	private String tieude;
	private String hinhanh;
	private String noidung;
	private String noidungnho;
	
	private String tendangnhap;
	
	public TinTuc() {};
	public TinTuc(int matintuc, String tenmuctintuc, String tieude, String hinhanh, String noidung, String noidungnho,
			String tendangnhap) {
		super();
		this.matintuc = matintuc;
		this.tenmuctintuc = tenmuctintuc;
		this.tieude = tieude;
		this.hinhanh = hinhanh;
		this.noidung = noidung;
		this.noidungnho = noidungnho;
		
		this.tendangnhap = tendangnhap;
	}
	public int getMatintuc() {
		return matintuc;
	}
	public void setMatintuc(int matintuc) {
		this.matintuc = matintuc;
	}
	public String getTenmuctintuc() {
		return tenmuctintuc;
	}
	public void setTenmuctintuc(String tenmuctintuc) {
		this.tenmuctintuc = tenmuctintuc;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getNoidungnho() {
		return noidungnho;
	}
	public void setNoidungnho(String noidungnho) {
		this.noidungnho = noidungnho;
	}
	
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	
	
	
}
