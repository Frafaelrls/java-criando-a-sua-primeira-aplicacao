public class ConverteTemperatura {
    public static void main(String[] arg){

        double temperaturaCelcius = 37.2;

        double temperaturaFahrenheit = (temperaturaCelcius * 1.8) + 32;
        System.out.printf("A temperatura convertida é: %.2f", temperaturaFahrenheit);
    }
}
