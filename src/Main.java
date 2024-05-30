//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60;
        double height = 1.65;
        int index = (int) service.calculate(weight, height);
        System.out.println("Твой индекс массы тела: " + index);

    }
}
