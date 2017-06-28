import java.util.*;

public class TestSwitch {
	public static void main(String[] args) {
		char c = 'a';
		switch (c) {
			case 'a':
			    System.out.println("a = aa");
			    break;
			case 'b':
				System.out.println("b = bb");
				break;
			default:
				System.out.println("c = cc");
				break;
		}
	}
}