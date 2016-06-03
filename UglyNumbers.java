public class UglyNumbers {

	public static void main(String[] args) {
		boolean cond = false;
		int cont = 5;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		//loop dos numeros
		for (int j = 1; j <= 16; j++) {
		//verifica se é primo
			if (isPrime(j) == true) {
				prime.add(j);
			} else {
			//condição 1 para ser ugly number
				if (j % 2 == 0 || j % 3 == 0 || j % 5 == 0) {
					int tam = prime.size();
					for (int g = 0; g <= tam; g++) {
					//cond 2 para ser ugly number
						if (j % prime.get(g) == 0) {
							cond = false;
						}
					}
					// se for ugly number
					if (cond == true) {
						cont++;
						System.out.println(j);
						if (cont == 11) {
							System.out.println(j);
						}
					}
				}
			}
		}

	}
// função que pegei na net
	private static boolean isPrime(int num) {
		if (num == 2) {
			return true;
		} else if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}
}
