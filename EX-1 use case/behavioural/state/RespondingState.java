public class RespondingState implements State {
    @Override
    public void handle(Chatbot chatbot, String input) {
        System.out.println("Chatbot: Here is the response to your input.");
        chatbot.setState(new GreetingState());
    }
}
