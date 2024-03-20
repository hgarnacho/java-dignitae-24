package p15_monedas;

public class Juego {
	public final int OBJETIVO_MONEDAS = 121;
	Jugador[] jugadores;
	Cofre cofre;
	
	public Juego() {
		jugadores = new Jugador[4];
		this.jugadores[0] = new Jugador("Jugador 1");
		this.jugadores[1] = new Jugador("Jugador 2");
		this.jugadores[2] = new Jugador("Jugador 3");
		this.jugadores[3] = new Jugador("Jugador 4");
				
		cofre = new Cofre();
	}
	
	public void comenzarJuego(){
		
		int jugadorActual = 0;
		int numeroTurnos = 0;
		boolean restarMonedas;
		int numeroMonedas = 0;
		
		do {
			
			System.out.println("Turno de: " + this.jugadores[jugadorActual]);
			
			if(this.cofre.vaciaMonedas()) {
				System.out.println("Oooohhhh!!! Has perdido todas las monedas del cofre!!!");
				Jugador.tesoro = 0;
			} else {
				restarMonedas = this.cofre.restaMonedas();
				numeroMonedas = this.cofre.obtenerMonedas();

				if(restarMonedas) {
					Jugador.restarMonedasTesoro(numeroMonedas);;
					this.jugadores[jugadorActual].restarMonedas(numeroMonedas);
					System.out.println("Oh No!!! Restas " + numeroMonedas + " monedas del cofre!!!");
				}else {					
					if(Jugador.tesoro + numeroMonedas <= this.OBJETIVO_MONEDAS) {
						System.out.println("Bien!!! Sumas " + numeroMonedas + " monedas al cofre!!!");
						Jugador.sumarMonedasTesoro(numeroMonedas);
						this.jugadores[jugadorActual].sumarMonedas(numeroMonedas);						
					} else {						
							System.out.println("Las monedas no entran en el tesoro. Se desecharán!!!");						
					}				
				} 
			}
	
			System.out.println("Monedas en el  tesoro: " + Jugador.tesoro + " / " +  this.OBJETIVO_MONEDAS);
			
			jugadorActual = this.getSiguienteJugador(jugadorActual);
			numeroTurnos ++;
			
		}while(Jugador.tesoro < this.OBJETIVO_MONEDAS);
		
		System.out.println("Enhorabuena!!! has ganado el juego!!!");
		System.out.println("Número de turnos: " + numeroTurnos);
		

	}
	
	public int getSiguienteJugador(int jugadorActual) {
		return jugadorActual<3 ? jugadorActual + 1 : 0;
	}
	
}
