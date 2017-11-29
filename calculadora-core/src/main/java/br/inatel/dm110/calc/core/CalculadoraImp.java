package br.inatel.dm110.calc.core;

import br.inatel.dm110.calc.api.Calculadora;
import br.inatel.dm110.calc.api.Resultado;

public class CalculadoraImp implements Calculadora {

	@Override
	public Resultado sum(int first, int second) {
		Resultado resultado = new Resultado();
		resultado.setFirst(first);
		resultado.setSecond(second);
		resultado.setResult(first + second);
		return resultado;
	}

	@Override
	public Resultado subtract(int first, int second) {
		Resultado resultado = new Resultado();
		resultado.setFirst(first);
		resultado.setSecond(second);
		resultado.setResult(first - second);
		return resultado;
	}

}
