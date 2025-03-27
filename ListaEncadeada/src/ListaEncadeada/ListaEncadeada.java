package ListaEncadeada;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	public void adicionar(Contato valor) {
		// criar celula
		Celula celula = new Celula();
		// colocar o valor dentro da casinha
		celula.setValor(valor);
		// COMO VOU ENFILEIRAR ESSAS CASINHAS PARA TER UMA LISTA ENCADEADA?
		// Vamos primeiro saber como ta a nossa lista?
		if (primeiro == null && ultimo == null) {
			// vou entrar aqui se e somente se a lista estiver vazia
			primeiro = celula; // | DERIC ||-->
			ultimo = celula; // | DERIC ||-->
		} else {
			// vamos entrar aqui quando a lista já conter dado
			ultimo.setProximo(celula);// | DERIC ||--> | DIEGO ||-->
			ultimo = celula;
		}
	}

	// como eu vou percorrer numa lista encadeada se não tenho o index como em
	// vetor?
	// Teremos que implementar algo para nos movimentar na sequencia de casinhas

	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}

	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
}
