public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier allChannelNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        String message = "System update at 10 PM tonight.";

        System.out.println("Sending notifications via Email only:");
        emailNotifier.send(message);

        System.out.println("\nSending notifications via Email and SMS:");
        smsAndEmailNotifier.send(message);

        System.out.println("\nSending notifications via Email, SMS, and Slack:");
        allChannelNotifier.send(message);
    }
}
