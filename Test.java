public class Test {
	public static void main(String[] args) {
		System.out.println("Hello: ");
		if (args.length == 1) {
			System.out.println(args[0]);
			return;
		}
		if (args.length > 1) {
			for (String arg : args) {
				System.out.print(arg + ' ');
			}
		}
	}
}
