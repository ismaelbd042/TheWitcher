package wicther;

public class main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		TheWitcher brujo = new TheWitcher();

		brujo.setName("Juan D");

		brujo.setHealth(100);

		brujo.setHasSoul(true);

		if (brujo.isDeath()) {

			System.out.println(brujo.getName() + " esta muerto.");

		} else {

			System.out.println(brujo.getName() + " esta vivo.");

		}

	}

}
