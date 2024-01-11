class A
{
	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 3 == 0) {
                System.out.println("Skipping " + i);
            }
            System.out.println("Value: " + i);
        }
    }
}