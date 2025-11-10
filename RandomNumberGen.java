import java.security.SecureRandom;
import java.util.Scanner;
public class RandomNumberGen {
	public static void main(String[] args) {
		SecureRandom Random = new SecureRandom();
		Scanner Scan = new Scanner(System.in);
		System.out.println("How many characters do you want your passcode to have? (Max 15000)");
		System.out.println("If you want an actual passcode I'd reccomend 1000 characters or more.");
		int Amount = Scan.nextInt();
		Scan.nextLine();
		StringBuilder Password = new StringBuilder();
		if (Amount > 15000) {
			System.out.println("Too many numbers. Going to 15000...");
			Amount = 15000;
		}
		System.out.println("Would you like random symbols? (True/False)");
		String WantsSymbols = Scan.nextLine();
		for (int i = 0; i < Amount; i += 1) {
				int doDecimal = Random.nextInt(48);
				boolean didSymbol = false;
				if (WantsSymbols.equalsIgnoreCase("True")) {
					if (doDecimal == 0) {Password.append("!"); didSymbol = true;}
					else if (doDecimal == 1) {Password.append("@"); didSymbol = true;}
					else if (doDecimal == 2) {Password.append("#"); didSymbol = true;}
					else if (doDecimal == 3) {Password.append("$"); didSymbol = true;}
					else if (doDecimal == 4) {Password.append("%"); didSymbol = true;}
					else if (doDecimal == 5) {Password.append("^"); didSymbol = true;}
					else if (doDecimal == 6) {Password.append("&"); didSymbol = true;}
					else if (doDecimal == 7) {Password.append("*"); didSymbol = true;}
					else if (doDecimal == 8) {Password.append("("); didSymbol = true;}
					else if (doDecimal == 9) {Password.append(")"); didSymbol = true;}
					else if (doDecimal == 10) {Password.append("-"); didSymbol = true;}
					else if (doDecimal == 11) {Password.append("_"); didSymbol = true;}
					else if (doDecimal == 12) {Password.append("="); didSymbol = true;}
					else if (doDecimal == 13) {Password.append("+"); didSymbol = true;}
					else if (doDecimal == 14) {Password.append("?"); didSymbol = true;}
					else if (doDecimal == 15) {Password.append("/"); didSymbol = true;}
					else if (doDecimal == 16) {Password.append(","); didSymbol = true;}
					else if (doDecimal == 17) {Password.append("<"); didSymbol = true;}
					else if (doDecimal == 18) {Password.append(">"); didSymbol = true;}
					else if (doDecimal == 19) {Password.append("∞"); didSymbol = true;}
					else if (doDecimal == 20) {Password.append("£"); didSymbol = true;}
					else if (doDecimal == 21) {Password.append("¶"); didSymbol = true;}
					else if (doDecimal == 22) {Password.append("æ"); didSymbol = true;}
					else if (doDecimal == 23) {Password.append("±"); didSymbol = true;}
				}
				if (didSymbol == true) {
					didSymbol = false;
				}
				else {
						int PickLetter = Random.nextInt(52);
						if (PickLetter == 0) {Password.append("A");}
						else if (PickLetter == 1) {Password.append("B");}
						else if (PickLetter == 2) {Password.append("C");}
						else if (PickLetter == 3) {Password.append("D");}
						else if (PickLetter == 4) {Password.append("E");}
						else if (PickLetter == 5) {Password.append("F");}
						else if (PickLetter == 6) {Password.append("G");}
						else if (PickLetter == 7) {Password.append("H");}
						else if (PickLetter == 8) {Password.append("I");}
						else if (PickLetter == 9) {Password.append("J");}
						else if (PickLetter == 10) {Password.append("K");}
						else if (PickLetter == 11) {Password.append("L");}
						else if (PickLetter == 12) {Password.append("M");}
						else if (PickLetter == 13) {Password.append("N");}
						else if (PickLetter == 14) {Password.append("O");}
						else if (PickLetter == 15) {Password.append("P");}
						else if (PickLetter == 16) {Password.append("Q");}
						else if (PickLetter == 17) {Password.append("R");}
						else if (PickLetter == 18) {Password.append("S");}
						else if (PickLetter == 19) {Password.append("T");}
						else if (PickLetter == 20) {Password.append("U");}
						else if (PickLetter == 21) {Password.append("V");}
						else if (PickLetter == 22) {Password.append("W");}
						else if (PickLetter == 23) {Password.append("X");}
						else if (PickLetter == 24) {Password.append("Y");}
						else if (PickLetter == 25) {Password.append("Z");}
						////////////////////////////////////////////////////////
						else if (PickLetter == 26) {Password.append("a");}
						else if (PickLetter == 27) {Password.append("b");}
						else if (PickLetter == 28) {Password.append("c");}
						else if (PickLetter == 29) {Password.append("d");}
						else if (PickLetter == 30) {Password.append("e");}
						else if (PickLetter == 31) {Password.append("f");}
						else if (PickLetter == 32) {Password.append("g");}
						else if (PickLetter == 33) {Password.append("h");}
						else if (PickLetter == 34) {Password.append("i");}
						else if (PickLetter == 35) {Password.append("j");}
						else if (PickLetter == 36) {Password.append("k");}
						else if (PickLetter == 37) {Password.append("l");}
						else if (PickLetter == 38) {Password.append("m");}
						else if (PickLetter == 39) {Password.append("n");}
						else if (PickLetter == 40) {Password.append("o");}
						else if (PickLetter == 41) {Password.append("p");}
						else if (PickLetter == 42) {Password.append("q");}
						else if (PickLetter == 43) {Password.append("r");}
						else if (PickLetter == 44) {Password.append("s");}
						else if (PickLetter == 45) {Password.append("t");}
						else if (PickLetter == 46) {Password.append("u");}
						else if (PickLetter == 47) {Password.append("v");}
						else if (PickLetter == 48) {Password.append("w");}
						else if (PickLetter == 49) {Password.append("x");}
						else if (PickLetter == 50) {Password.append("y");}
						else if (PickLetter == 51) {Password.append("z");}
				}
			}
		System.out.println("Your passcode is: " + Password);
		Scan.close();
	}
}