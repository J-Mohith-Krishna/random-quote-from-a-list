import java.util.Random;

public class RandomQuoteGenerator {
    public static void main(String[] args) {
        String[] quotes = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);
        String randomQuote = quotes[randomIndex];

        System.out.println("Random Quote: " + randomQuote);
    }
}
