package entidades;

public class Time {

	private String nome;
	private int gol;

	public Time(String nome, int gol) {
		this.nome = nome;
		this.gol = gol;
	}

	public String getNome() {
		return nome;
	}

	// não precisa de setNome pq não pode mudar nome do time está certo?

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

	public static void resultado(Time timeA, Time timeB) {
		if (timeA.getGol() > timeB.getGol()) {
			System.out.println(
					timeA.getNome() + " venceu " + timeB.getNome() + " por " + timeA.getGol() + " a " + timeB.getGol());
		} else {
			if (timeA.getGol() < timeB.getGol()) {
				System.out.println(timeB.getNome() + " venceu " + timeA.getNome() + " por " + timeB.getGol() + " a "
						+ timeA.getGol());
			} else {
				System.out.println("Empate por " + timeA.getGol() + "X" + timeB.getGol() + " entre " + timeA.getNome()
						+ " e " + timeB.getNome());
			}

		}
	}

}
