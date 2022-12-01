import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class Main with main method from which the execution of the program begins
 * includes method of creating the array, 3 methods which are demanded by task
 */
public class Main {
    public static Scanner scan = new Scanner(System.in);

    /**
     * main method from which the execution of the program begins
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        ArrayList<House> arr = new ArrayList<House>();
        ArrayList<House> arrtmp = new ArrayList<House>();
        System.out.println("Enter number of the flats:");
        int N = scan.nextInt();
        InputHouses(N, arr);
        PrintRes(N,arr);
        int M = FixedRooms(N, arr, arrtmp);
        PrintRes(M,arrtmp);
        M = FixedRoomFloor(N,arr, arrtmp);
        PrintRes(M,arrtmp);
        M = FixedArea(N, arr, arrtmp);
        PrintRes(M,arrtmp);
    }

    /**
     * method creates array of flats
     *
     * @param N means number of flats
     */
    public static void InputHouses(int N, ArrayList<House> arr) {

        for (int i = 0; i < N; i++) {
            System.out.println("Enter HouseID, FlatNumber, AreaSize, FloorNumber, RoomQuantity, StreetName:");
            arr.add(new House(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.next()));
        }

    }

    public static void PrintRes(int N, ArrayList<House> arr) {
        System.out.println("List of flats:1");
        for (int i = 0; i < N; i++) {
            System.out.println(arr.get(i));
        }
    }

    /**
     * method searches for flats with given quantity of rooms
     *
     * @param N means number of flats
     */
    public static int FixedRooms(int N, ArrayList<House> arr, ArrayList<House> arrtmp) {
        arrtmp.clear();

        System.out.println("Task 1.\nInput quantity of rooms in searched flats:");
        int M = scan.nextInt();
        int j=0;
        House hs;
        for (int i = 0; i < N; i++) {
            hs=arr.get(i);
            if (hs.getRooms() == M) {
                arrtmp.add(hs);
                j++;
            }
        }
        return j;
    }


    /**
     * method searches for flats with given quantity of rooms and fixed interval of floors
     *
     * @param N means number of flats
     * @return
     */
    public static int FixedRoomFloor(int N, ArrayList<House> arr, ArrayList<House> arrtmp) {
        arrtmp.clear();

        int j=0;
        System.out.println("Task 2.\nInput quantity of rooms in searched flats:");
        int M = scan.nextInt();
        System.out.println("Input lower floor limit:");
        int l = scan.nextInt();
        System.out.println("Input upper floor limit:");
        int r = scan.nextInt();
        House hs;
        for (int i = 0; i < N; i++) {
            hs=arr.get(i);
            if (hs.getRooms() == M && hs.getFloor() >= l && hs.getFloor() <= r) {
                arrtmp.add(hs);
                j++;
            }
        }
        return j;
    }

    /**
     * method searches for flats with area size bigger than given
     *
     * @param N means number of flats
     */
    public static int FixedArea(int N, ArrayList<House> arr, ArrayList<House> arrtmp) {
        arrtmp.clear();

        int j=0;
        System.out.println("Task 3.\nInput lowest area size in searched flats:");
        int M = scan.nextInt();
        House hs;
        for (int i = 0; i < N; i++) {
            hs = arr.get(i);
            if (hs.getArea() > M) {
                arrtmp.add(hs);
                j++;
            }
        }
        return j;
    }
}