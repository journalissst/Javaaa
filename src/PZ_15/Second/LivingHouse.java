package PZ_15.Second;
import java.util.Scanner;
public interface LivingHouse {
    Scanner s = new Scanner(System.in);
    void setRoomsCount(int roomsCount);
    default void calculateSquare(){
        System.out.println("Введите длину и ширину участка: ");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float sq = a * b;
        System.out.println(sq);
    }
    boolean isHaveGarden();
}
