
public class rollingDice {
	public static int rollDice() {
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		return dice1 + dice2;
		
	}
	public static void main(String[] args) {
		int i = 0;
		int countUno = 0;
		int countDos = 0;
		int countTres = 0;
		int countCuatro = 0;
		int countCinco = 0;
		int countSeis = 0;
		int countSiete = 0;
		int countOcho = 0;
		int countNueve = 0;
		int countDiez = 0;
		int countDieciuno = 0;
		int num = 0;
		
		for(i=0;i<37;i++) {
			num = rollDice();
			if(num == 1) {
				countUno += 1;
			}
			else if(num == 2) {
				countDos += 1;
			}
			else if(num == 3) {
				countTres += 1;
			}
			else if(num == 4) {
				countCuatro += 1;
			}
			else if(num == 5) {
				countCinco += 1;
			}
			else if(num == 6) {
				countSeis += 1;
			}
			else if(num == 7) {
				countSiete += 1;
			}
			else if(num == 8) {
				countOcho += 1;
			}
			else if(num == 9) {
				countNueve += 1;
			}
			else if(num == 10) {
				countDiez += 1;
			}
		}
	}
}
