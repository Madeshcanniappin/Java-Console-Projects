package RandomPassGeneratorPackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomPass{
    private static final String Upper="ABCDEFGHIJKLMNOPQERSTUVWXYZ";
    private static final String Lower="abcdefghijklmnopqrstuvwxyz";
    private static final String Digits="1234567890";
    private static final String Symbols="`~!@#$%^&*()_+-={}||[]<>,.?";

    private static final SecureRandom Random=new SecureRandom();

    public static String generatePassword(int length)
    {
        if(length<4)
        {
            throw new IllegalArgumentException("Password length must be atleast 4");
        }
        List<Character> pass=new ArrayList<>();

        pass.add(Upper.charAt(Random.nextInt(Upper.length())));
        pass.add(Lower.charAt(Random.nextInt(Lower.length())));
        pass.add(Digits.charAt(Random.nextInt(Digits.length())));
        pass.add(Symbols.charAt(Random.nextInt(Symbols.length())));
        
        String allChars=Upper+Lower+Digits+Symbols;
        for (int i = 4; i < length; i++) {
            pass.add(allChars.charAt(Random.nextInt(allChars.length())));
        }

        Collections.shuffle(pass,Random);
        StringBuilder password=new StringBuilder();
        for(char c:pass)
        {
            password.append(c);
        }
        return password.toString();

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of your Password: ");
        int length=sc.nextInt();
        try {
            String password=generatePassword(length);
            System.out.println("Generated password: "+password);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
        
}
    
