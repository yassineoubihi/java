class HelloWorld {
    public static void main(String[] args) {
        int numberOfArguments = args.length;
        int sum = 0;
        int i = 0;
        String userInput;
        if (numberOfArguments < 1 || numberOfArguments > 1) {
            System.out.println("invalid arguments !!");
            System.exit(0);
        }
        else
        {
            if (args[0].length() != 6)
            {
                System.out.println("Enter 6 digits");
                System.exit(0);
            }
            while (i < 6)
            {
                userInput = args[0];
                int c = (int) userInput.charAt(i);
                sum += c - 48;
                i++;
            }
            System.out.println(sum);
        }
    }
}
