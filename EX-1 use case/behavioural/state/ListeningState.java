public class ListeningState implements State {
    @Override
    public void handle(Chatbot chatbot, String input) {
        System.out.println("Chatbot is listening...");
        chatbot.setState(new ProcessingState());
    }
}
