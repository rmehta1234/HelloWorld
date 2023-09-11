public class HelloWorld {
	public static void main(String[] args) {
		
		if(args.length == 0){
			System.out.println("Please pass an argument(hello or goodbye) while running the program.");
			return;
		}
		String input = args[0].toLowerCase();
		if (input.equals("hello")){
			System.out.println("Hello World!");
		}
		else if (input.equals("goodbye")){
			System.out.println("Goodbye, cruel world!");
		}
		else {
			System.out.println("I cannot understand anything other than hello or goodbye.");
		}

	}
}