public class MathTest {
    public static void main(String[] args) {
        
        double sqrtResult = Math.sqrt(37);
        System.out.println("SQRT: " + sqrtResult);

        
        double sinResult = Math.sin(Math.toRadians(270)); 
        System.out.println("SIN: " + sinResult);

        
        double cosResult = Math.cos(Math.toRadians(270));
        System.out.println("COS: " + cosResult);

        
        double floorResult = Math.floor(22.8);
        System.out.println("FLOOR: " + floorResult);

        
        double ceilResult = Math.ceil(22.8);
        System.out.println("CEIL: " + ceilResult);

        
        long roundResult = Math.round(22.8);
        System.out.println("ROUND: " + roundResult);

        
        int maxResult = Math.max(71, 68);
        System.out.println("MAX: " + maxResult);

        
        int minResult = Math.min(71, 68);
        System.out.println("MIN: " + minResult);

        
        double randomResult = Math.random() * 100;
        System.out.println("RANDOM: " + randomResult);
    }
}
