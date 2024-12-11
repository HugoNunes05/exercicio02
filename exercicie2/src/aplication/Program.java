package aplication;

import java.util.ArrayList;
import java.util.List;

import entidades.Time;

public class Program {

	public static void main(String[] args) {

		// 1 Receber o nome de dois times (Time A e Time B).
		// 2 Receber o número de gols marcados por cada time durante o jogo.
		// 3 Verificar qual time venceu ou se houve empate.
		// 4 Exibir o resultado da partida no formato:
		// "Time A venceu Time B por 3 a 1"
		// "Time B venceu Time A por 2 a 3"
		// "Empate: Time A 2 x 2 Time B"

		List<Time> lista = new ArrayList<>();

		lista.add(new Time("time A", 2));
		lista.add(new Time("time B", 2));

		Time.resultado(lista.get(0), lista.get(1));

	}

}
