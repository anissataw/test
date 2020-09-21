

public class Main {

    public static void main(String[] args) {

        String message = "Hello this is a test.";
        String[] split = message.split(" ");
        String reverse = "";
        for(int x = 0; x<split.length; x++){
            String index = split[x];
            for(int y = index.length()-1; y>=0; y--){
                Character reverse_char = index.charAt(y);
                reverse = reverse + reverse_char;

            }
            if(x!= split.length){
                reverse = reverse+" ";
            }

        }
        System.out.print(reverse);


    }
}

