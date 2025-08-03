import java.util.*;
public class RandomPass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String charPool="ABCDEFGHIJKLMNOPQERSTUVWXYZ0123456789!@#$%^&*()_+=-abcdefghijklmnopqrstuvwxyz";
        System.out.println("Enter the Length of the Password: ");
        int len=sc.nextInt();
        StringBuilder password=new StringBuilder();

        for (int i = 0; i < len; i++) {
            int index=random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }
        System.out.println("Generated Password: "+password.toString());
        sc.close();

    }
}