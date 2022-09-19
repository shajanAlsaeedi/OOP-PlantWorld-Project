package finalprojectshajanalsaeedi;

import java.util.ArrayList;

/**
 * nursery Owner class : is public class extends userService. Take information
 * about nursery owner. take plant stored in array list for each nursery and
 * displaying.
 */
public class nurseryOwner extends userService {

    public String nameNursery;
    private ArrayList<plant> plantinfo;
    private String address;

    /**
     * Default Constructor #1.
     */
    public nurseryOwner() {
    }

    /**
     * Default Constructor #2.
     *
     * @param name
     * @param number
     * @param gender
     * @param age
     * @param nameNursery
     * @param address
     *
     */
    public nurseryOwner(String name, String number, String gender, int age,
            String nameNursery, String address) {
        
        super(name, number, gender, age);

        this.nameNursery = nameNursery;
        this.address = address;
        plantinfo = new ArrayList<plant>();
    }

    /**
     * Method add plant in array list.
     */
    public void addPlant(plant newPlant) {
        plantinfo.add(newPlant);
    }

    /**
     * Method remove plant from array list.
     */
    public void removePlant(plant newPlant) {
        plantinfo.remove(newPlant);
    }

    /**
     * Method print all list of plants.
     */
    public void printList() {

        for (int i = 0; i < plantinfo.size(); i++) {
            System.out.println(plantinfo.get(i).toString());
        }
    }

    /**
     * Method getNameNursery @raturn nameNursery.
     */
    public String getNameNursery() {
        return nameNursery;
    }

    /**
     * Method setNameNursery take @param nameNursery.
     */
    public void setNameNursery(String nameNursery) {
        this.nameNursery = nameNursery;
    }

    /**
     * Method getAddress @raturn address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method setAddress take @param address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    /**
     * Method toString @return text want display it.
     */
    public String toString() {
        return "\n-------- H E L L O  TO " + nameNursery + " --------\n"
                + super.toString() + "\nAddress:" + address;
    }

    /**
     * Print all details in class. .
     */
    public void PrintDetails() {
        System.out.println(toString() + plantinfo);

    }

}
