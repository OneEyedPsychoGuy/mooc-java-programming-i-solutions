public class Message {
    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Message)) {
            return false;
        }

        Message message = (Message) obj;

        return this.sender.equals(message.sender) &&
            this.content.equals(message.content);
    }

    @Override
    public String toString() {
        return this.sender + ": " + this.content;
    }
}