package view;

import controllerPilha.ControllerPilha;

public class Main {
	public static void main(String[] args) throws Exception {
		
		ControllerPilha pilha = new ControllerPilha(null);
		
		pilha.push(40);
		pilha.push(60);
		pilha.push(80);
		pilha.push(20);
		pilha.push(10);
		
		System.out.println(pilha.max());
		
	}
}
