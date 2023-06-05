package entities;

public class Televisor {

	public int canal;
	public int volume;
	public boolean ligado;

	public Televisor() {
// Inicializando os atributos com valores padrão
		canal = 1;
		volume = 0;
		ligado = false;
	}

	public void aumentarVolume() {
// Verifica se o televisor está ligado e se o volume atual é menor que 10
		if (ligado && volume < 10) {
			volume++;
		}
	}

	public void reduzirVolume() {
// Verifica se o televisor está ligado e se o volume atual é maior que 0
		if (ligado && volume > 0) {
			volume--;
		}
	}

	public void subirCanal() {
// Verifica se o televisor está ligado e se o canal atual é menor que 16
		if (ligado && canal < 16) {
			canal++;
		}
	}

	public void descerCanal() {
// Verifica se o televisor está ligado e se o canal atual é maior que 1
		if (ligado && canal > 1) {
			canal--;
		}
	}

	public void ligarTelevisor() {
// Define o atributo "ligado" como true
		ligado = true;
	}

	public void desligarTelevisor() {
// Define o atributo "ligado" como false
		ligado = false;
	}

	public void mostrarStatus() {
// Exibe na saída padrão o canal, o volume e se o televisor está ligado ou desligado
		System.out.println("Canal: " + canal);
		System.out.println("Volume: " + volume);
		System.out.println("Televisor ligado: " + (ligado ? "Sim" : "Não"));
	}

}