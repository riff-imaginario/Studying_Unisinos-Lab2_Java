package ex01;

public abstract class Dispositivo {
	private int id;
	private String modelo;

	public Dispositivo(int id, String modelo) {
		super();
		this.id = id;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		if (id != other.id)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}*/
	
	
}
