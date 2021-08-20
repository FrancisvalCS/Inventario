package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computador implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String marca;
	private String modelo;
	private Integer hd;
	private String unidadeHd;
	private Integer ram;
	private Integer patrimonio;
	private String setor;
	private String status;
	private String sn;
	private String so;
	private String type;
	private String obs;
	
	public Computador() {}

	public Computador(Integer id, String nome, String marca, String modelo, Integer hd, String unidadeHd, Integer ram,
			Integer patrimonio, String setor, String status, String sn, String so, String type, String obs) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.hd = hd;
		this.unidadeHd = unidadeHd;
		this.ram = ram;
		this.patrimonio = patrimonio;
		this.setor = setor;
		this.status = status;
		this.sn = sn;
		this.so = so;
		this.type = type;
		this.obs = obs;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Integer getHd() {
		return hd;
	}



	public void setHd(Integer hd) {
		this.hd = hd;
	}



	public String getUnidadeHd() {
		return unidadeHd;
	}



	public void setUnidadeHd(String unidadeHd) {
		this.unidadeHd = unidadeHd;
	}



	public Integer getRam() {
		return ram;
	}



	public void setRam(Integer ram) {
		this.ram = ram;
	}



	public Integer getPatrimonio() {
		return patrimonio;
	}



	public void setPatrimonio(Integer patrimonio) {
		this.patrimonio = patrimonio;
	}



	public String getSetor() {
		return setor;
	}



	public void setSetor(String setor) {
		this.setor = setor;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getSn() {
		return sn;
	}



	public void setSn(String sn) {
		this.sn = sn;
	}



	public String getSo() {
		return so;
	}



	public void setSo(String so) {
		this.so = so;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}
	
	public String getObs() {
		return obs;
	}



	public void setObs(String obs) {
		this.obs = obs;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hd == null) ? 0 : hd.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((patrimonio == null) ? 0 : patrimonio.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
		result = prime * result + ((setor == null) ? 0 : setor.hashCode());
		result = prime * result + ((sn == null) ? 0 : sn.hashCode());
		result = prime * result + ((so == null) ? 0 : so.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((unidadeHd == null) ? 0 : unidadeHd.hashCode());
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (hd == null) {
			if (other.hd != null)
				return false;
		} else if (!hd.equals(other.hd))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (patrimonio == null) {
			if (other.patrimonio != null)
				return false;
		} else if (!patrimonio.equals(other.patrimonio))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		if (setor == null) {
			if (other.setor != null)
				return false;
		} else if (!setor.equals(other.setor))
			return false;
		if (sn == null) {
			if (other.sn != null)
				return false;
		} else if (!sn.equals(other.sn))
			return false;
		if (so == null) {
			if (other.so != null)
				return false;
		} else if (!so.equals(other.so))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (unidadeHd == null) {
			if (other.unidadeHd != null)
				return false;
		} else if (!unidadeHd.equals(other.unidadeHd))
			return false;
		if (obs == null) {
			if (other.obs != null)
				return false;
		} else if (!obs.equals(other.obs))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Computador [id=" + id + ", nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", hd=" + hd
				+ ", unidadeHd=" + unidadeHd + ", ram=" + ram + ", inventario=" + patrimonio + ", setor=" + setor
				+ ", status=" + status + ", sn=" + sn + ", so=" + so + ", type=" + type + "]";
	}



	

	

}
