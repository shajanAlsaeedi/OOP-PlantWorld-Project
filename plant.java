package finalprojectshajanalsaeedi;

/**
 * plant class : this class for plant information . take all information and
 * displaying
 */
// three size if plants.
enum Size {
    small, medium, large
};

public class plant {

    private String namePlant;
    private Size sizePlant;
    private double pricePlant;

    /**
     * Default Constructor #1.
     */
    public plant() {

        this.namePlant = "";
        

    }

    /**
     * Constructor #2.
     *
     * @param namePlant
     * @param sizePlant
     * @param pricePlant
      * .
     */
    public plant(String namePlant, Size sizePlant, double pricePlant) {
        this.namePlant = namePlant;
        this.sizePlant = sizePlant;
        this.pricePlant = pricePlant;
    }

    /**
     * Method getNamePlant @return namePlant.
     */
    public String getNamePlant() {
        return namePlant;
    }

    /**
     * Method setNamePlant @param namePlant.
     */
    public void setNamePlant(String namePlant) {
        this.namePlant = namePlant;
    }

    /**
     * Method getSizePlant @return sizePlant.
     */
    public Size getSizePlant() {
        return sizePlant;
    }

    /**
     * Method getPricePlant @return pricePlant.
     */
    public double getPricePlant() {
        return pricePlant;
    }

    /**
     * Method setPricePlant @param pricePlant.
     */
    public void setPricePlant(double pricePlant) {

        this.pricePlant = pricePlant;
    }
    /**
     * Method toString @raturn text want displaying.
     */
    public String toString() {
        return "\n\t ***** PLANT Information ***** \t\n"
                + "Name :" + namePlant + "\nSize :" + sizePlant
                + "\nPrice : " + pricePlant + "\n";
    }

    /** Print all details in class .. */
    public void PrintDetails() {
        System.out.println(toString());

    }

}
