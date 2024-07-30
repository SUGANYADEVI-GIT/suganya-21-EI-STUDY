public class GreetingState implements State {
    @Override
    public void handle(Chatbot chatbot, String input) {
        System.out.println("Chatbot: Hello! How can I assist you today?");
        chatbot.setState(new ListeningState());
    }
}
