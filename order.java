package finalprojectshajanalsaeedi;

/**
 * Order class : is public class take attributes from other classes. concatenate
 * the order to user that choose it .
 */
public class order {

    private userService userInfo; // user inforamtion.
    private plant planOrder;      // plant order. 
    public nurseryOwner nurinfo; // nursery information.

    /**
     * Default Constructor #1.
     */
    public order() {
    }

    /**
     * * Constructor #2.
     *
     * @param userInfo
     * @param nurinfo
     * @param planOrder
     */
    public order(userService userInfo, nurseryOwner nurinfo, plant planOrder) {
        this.userInfo = userInfo;
        this.nurinfo = nurinfo;
        this.planOrder = planOrder;
    }

    /**
     * Mutator method to change the user Service
     *
     * @param userInfo .
     */
    public void setUserInfo(userService userInfo) {
        this.userInfo = userInfo;
    }

    public userService getUserInfo() {
        return userInfo;
    }

    /**
     * Mutator method to change the planOrder
     *
     * @param planOrder .
     */
    public void setPlanOrder(plant planOrder) {

        this.planOrder = planOrder;
    }

    public plant getPlanOrder() {
        return planOrder;
    }

    @Override
    /** Method toString to @return text want print it. */
    public String toString() {
        return "\nPlant you choose it:" + planOrder;
    }
    /**Print all details in class . .*/
    
    public void PrintDetails() {
        System.out.println(toString());

    }

}
