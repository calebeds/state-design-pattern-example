public class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already Off. Going to be On now");
        context.setState(new On());
    }
}
