import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String str = "Greetings "+ name + ". How are you this fine time?";
        return str;
    }
    public String guestGreeting(String name, String dayTime){
        String str = "Greetings " + name + ". How are you this fine " + dayTime + " ?";
        return str;
    }
    public String guestGreeting(String name, Date date){
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String str = "Greetings " + name + ". How are you this fine "+ DateFor.format(date);
        return str;
    }
    public String dateAnnouncement() {
    Date date = new Date();
        return "Its is currently:"+ date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        if(a!=-1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(b!=-1){
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
    public String yelling(String message){
        String str = message.toUpperCase()+"!!!!!!!!!!";
        return str;
    }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

