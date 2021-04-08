
public class Persona implements Comparable {
	private int id;
	private String cognome;
	private String nome;
	private String codFisc;
	
	
	
	public Persona(int id, String cognome, String nome, String codFisc) {
		super();
		this.id = id;
		this.cognome = cognome;
		this.nome = nome;
		this.codFisc = codFisc;
	}
	
	
	public String getCodFisc() {
		return codFisc;
	}
	public void setCodFisc(String codFisc) {
		this.codFisc = codFisc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFisc == null) ? 0 : codFisc.hashCode());
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Persona other = (Persona) obj;
		if (codFisc == null) {
			if (other.codFisc != null)
				return false;
		} else if (!codFisc.equals(other.codFisc))
			return false;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", codFisc=" + codFisc + "]";
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (this == o)
			return 0;
		if (o == null)
			return 0;
		if (getClass() != o.getClass())
			return 0;
		Persona other = (Persona) o;
		
		return id-other.id ;
	}

	
	
	
	
}
