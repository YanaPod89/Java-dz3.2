public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        float height = 1.87F;
        int result = service.calculate(weight, height);
        System.out.println(result);
    }
}