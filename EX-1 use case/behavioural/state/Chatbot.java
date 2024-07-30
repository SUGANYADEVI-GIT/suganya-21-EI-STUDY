public class Chatbot {
    private State currentState;

    public Chatbot() {
        this.currentState = new GreetingState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void handleInput(String input) {
        this.currentState.handle(this, input);
    }

    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        chatbot.handleInput("start");
        chatbot.handleInput("input");
        chatbot.handleInput("process");
        chatbot.handleInput("response");
    }
}
