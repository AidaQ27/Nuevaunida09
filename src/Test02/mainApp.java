package Test02;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		
		Serie series[] = new Serie[5];
		Videojuego videojuego[] = new Videojuego[5];
		
		series[0] = new Serie("The Witcher", 2,"Fantasía","Lauren Schmidt Hissrich");
		series[1] = new Serie("Juego de Tronos", 8,"Drama","George R. R. Martin");
		series[2] = new Serie("Vikingos", 6,"Drama","Michael Hirst");
		series[3] = new Serie("Breaking Bad", 5,"Drama","George Vincent Gilligan, Jr");
		series[4] = new Serie("Dark", 3,"Misterio","Baran bo Odar");
		
		videojuego[0] = new Videojuego("Far Cry 6", 120,"Acción","Ubisoft");
		videojuego[1] = new Videojuego("Back 4 Blood", 70,"Acción","Warner Bros");
		videojuego[2] = new Videojuego("Resident Evil Village", 150,"Survival horror","Capcom");
		videojuego[3] = new Videojuego("Deathloop", 70,"FPS","Bethesda Softworks");
		videojuego[4] = new Videojuego("It Takes Two", 50,"Lógica","Electronic Arts");
		
		/* Entregamos algunos videojuegos y series */
		
		series[0].entregar();
        series[1].entregar();
        videojuego[2].entregar();
        videojuego[3].entregar();
        videojuego[4].entregar();
        
        /* Contamos cuantos entregados hay, y los mostramos */
        
        int SeriesEntregadas=0;
        int VideojuegosEntregados=0;
        
        for(int i=0;i<series.length;i++){
            if(series[i].isEntregado()){
                SeriesEntregadas+=1;
                series[i].devolver();
  
            }
            if(videojuego[i].isEntregado()){
            	VideojuegosEntregados+=1;
                videojuego[i].devolver();
            }
        }
  
        JOptionPane.showMessageDialog(null,"Hay "+SeriesEntregadas+" series entregadas");
        JOptionPane.showMessageDialog(null,"Hay "+VideojuegosEntregados+" videojuegos entregados");
        
        /* Comparar las series y saber que serie tiene más temporadas */
        
        Serie masTemporadas= series[0];
       
        for(int i=0;i<series.length;i++) {
        	Serie segunda=series[i];
        	if(masTemporadas.getNumeroTemporadas()<segunda.getNumeroTemporadas()) {
        		masTemporadas = segunda;
        	}
        }
        
        Videojuego masHoras = videojuego[0];
        for(int i=0; i<videojuego.length;i++) {
        	Videojuego segundo = videojuego[i];
        	if(masHoras.getHorasEstimadas()<segundo.getHorasEstimadas()) {
        		masHoras = segundo;
        	}
        }
        JOptionPane.showMessageDialog(null,"Más temporadas \n"+masTemporadas.toString());
        JOptionPane.showMessageDialog(null,"Más horas estimadas \n"+masHoras.toString());
        

	}

}
