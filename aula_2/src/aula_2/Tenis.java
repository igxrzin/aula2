package aula_2;

public class Tenis {
	public String modelo;
	public String cor;
	public int tamanho;
	public String colecao;
	
	public void Estreou() {
		System.out.println ("O Tenis: " + modelo + "estreou");
	}
	
	public void GetTenis() {
		System.out.println(
				"Modelo: " + modelo +
				"\nCor: " + cor +
				"\nTamanho: " + tamanho +
				"\nColeção: " + colecao
				);

}
}
