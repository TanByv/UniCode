package Java.Week7;

public class Task7A {
    public static void main(String[] args) { // Main method
        int i = 0; // Define counter variable
        while (i < 7) { // Start while loop if counter is less than 7
            Double r1 = (Math.random() * (110 - 40)) + 40; // 
            Double r2 = (Math.random() * (2 - 1.5)) + 1.5;
            System.out.println("Test " + (i+1) + ": " + r1 + " kilograms weight and " + r2 + " meters height");
            System.out.println(bmiClass(r1, r2) + "\n");
            i++;
        }
    }
    public static String bmiClass (double weight, double height) {

        double bmiValue = weight / (height*height); // kg / m*m
        
            if (bmiValue > 35) return "Obese Class II";
        
            else if (bmiValue > 30) return "Obese Class I";
        
            else if (bmiValue > 25) return "Overweight";
        
            else if (bmiValue > 18.5) return "Normal";
        
            else if (bmiValue > 17) return "Mild Thinness";
        
            else if (bmiValue > 16) return "Moderate Thinness";
        
            else if (bmiValue <= 16) return "Severe Thinness";
        
            else return "Invalid Value!";
        }
}
