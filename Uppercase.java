public class Uppercase {
    public static void main(String[] args) {
        String lowercase = "gideOn";
       String firstletter = String.valueOf(lowercase.charAt(0));
       String rem = lowercase.substring(1,lowercase.length()).toLowerCase();
        System.out.println(firstletter.toUpperCase()+rem);
    }
    }
