package controllerPilha;

public class ControllerPilha {

	No topo;
	int maior;

	public ControllerPilha(int[] vetor) {
		if(vetor != null) {
			for(int item : vetor) {
				push(item);
			}
		}
		topo = null;
	}

	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;

	}

	public void push(int valor) {
		No novoValor = new No();
		novoValor.dado = valor;
		if (isEmpty()) {
			topo = novoValor;
			this.maior = valor;
		} else {
			novoValor.proximo = topo;
			topo = novoValor;
			if(valor > this.maior) {
				this.maior = valor;
			}
		}
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public int top() throws Exception {

		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}

		return topo.dado;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			cont = 1;
			No atual = topo;
			while (atual.proximo != null) {
				atual = atual.proximo;
				cont++;
			}
		}
		return cont;
	}
	
	public int max() throws Exception {
		if(isEmpty()) {
			throw new Exception("Lista vazia");
		}
		return this.maior;
	}

}
