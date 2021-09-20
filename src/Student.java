public class Student {
    public static void main(String[] args){
        marks m = new marks(88,89,67,90,97);

        double avg1 = m.avg();
        System.out.println("Your average is "+ avg1);
    }
}