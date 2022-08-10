public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Charming","Cruel","Fantastic","Gentle","Huge","Perfect","Rough","Sharp","Tasty","Zealous"};

        String[] nouns = {"Quaker Oats","Wimbledon","Central ark Zoo","War and Peace","Foot", "Head","Bitterness","Egg","Frog","Finger"};

        String randomAdjective = adjectives[(int) Math.floor(Math.random()*adjectives.length)];
        String randomNoun = nouns[(int) Math.floor(Math.random()*nouns.length)];
        System.out.println("Here is your server name:\n");
        System.out.print(randomAdjective +"-"+ randomNoun);



    }
}
