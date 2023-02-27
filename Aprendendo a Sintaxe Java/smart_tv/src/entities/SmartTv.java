package entities;

public class SmartTv {
	protected boolean ligada;
	protected int canal;
	protected int volume;
	
	public SmartTv() {
		this.ligada = false;
		this.canal = 1;
		this.volume = 25;
	}
	
	
	public boolean isLigada() {
		return ligada;
	}


	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}


	public int getCanal() {
		return canal;
	}


	public void setCanal(int canal) {
		this.canal = canal;
		System.out.println("Canal: " + canal);
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public void ligar() {
		setLigada(true);
		}
	
	public void desligar() {
		setLigada(false);
	}
	
	public void aumentarVolume() {
		volume += 1;
		System.out.println("Aumentando o volume para " + volume);
	}
	
	public void diminuirVolume() {
		volume -= 1;
		System.out.println("Diminuindo o volume para " + volume);
	}
	
	public void aumentarCanal() {
		canal += 1;
		System.out.println("Canal: " + canal);
	}
	
	public void diminuirCanal() {
		canal -= 1;
		System.out.println("Canal: " + canal);
	}


	@Override
	public String toString() {
		return "TV ligada ? " + ligada + ", Canal: " + canal + ", Volume= " + volume;
	}
	
	
	
	
	

}
