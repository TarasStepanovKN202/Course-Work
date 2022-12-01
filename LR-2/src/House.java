/**
 * Class House with info about house in the city
 */
public class House {
    private int houseid, flatnumber, area, floor, rooms;
    private String street;

    public House() {

    }


    /**
     * method that returns string with information about a flat
     * @return info about a flat
     */
    @Override
    public String toString() {
        return "House{" +
                "houseid=" + houseid +
                ", flatnumber=" + flatnumber +
                ", area=" + area +
                ", floor=" + floor +
                ", rooms=" + rooms +
                ", street='" + street + '\'' +
                '}';
    }

    public House(int houseid, int flatnumber, int area, int floor, int rooms, String street) {
        this.houseid = houseid;
        this.flatnumber = flatnumber;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
    }

    /**
     * Getter of the Flat Area
     * @return area
     */
    public int getArea() {
        return area;
    }

    /**
     * Getter of the floor number
     * @return number of the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Getter of the number of rooms
     * @return quantity of rooms
     */
    public int getRooms() {
        return rooms;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public void setFlatnumber(int flatnumber) {
        this.flatnumber = flatnumber;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseid() {
        return houseid;
    }

    public int getFlatnumber() {
        return flatnumber;
    }

    public String getStreet() {
        return street;
    }
}
