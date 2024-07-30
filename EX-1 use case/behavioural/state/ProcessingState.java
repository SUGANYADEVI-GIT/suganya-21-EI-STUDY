public class ProcessingState implements State {
    @Override
    public void handle(Chatbot chatbot, String input) {
        System.out.println("Chatbot is processing the input...");
        chatbot.setState(new RespondingState());
    }
}
