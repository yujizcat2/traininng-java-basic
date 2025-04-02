package RandomLucky;

public class Randomlucky {

	public static void main(String[] args) {
		System.out.println("Your lucky is, ");
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("小吉");
		} else {
			System.out.println("凶");
		}
		switch (fortune) {
		case 1:
			System.out.println("You are the most lucky one");
			break;
		case 2:
			System.out.println("You are very lucky");
			break;
		case 3:
			System.out.println("You are lucky");
			break;
		default:
			System.out.println("You are not lucky");
			break;
		}
	}

}
