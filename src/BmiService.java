public class BmiService {
    public int calculate (int weight, float height) {
        float bmi= weight/(height*height);
        return (int) bmi;

    }
}
