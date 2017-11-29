package br.inatel.dm110.calc.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.calc.core.CalculadoraImp;

@ApplicationPath("/rest")
public class RestAppliclation extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalculadoraImp.class);
		return classes;
	}
}
