import java.util.Random;
public class random_numbers {
    public static void main(String[] args){
        Random random = new Random();

        int x = random.nextInt(6)+1; // 6 limits the value to 0 to 5,  +1 makes it 1 to 6

        double y = random.nextDouble();

        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
