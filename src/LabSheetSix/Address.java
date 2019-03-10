package LabSheetSix;

/**
 * @author Callum Anderson
 * @version 1.0
 */

public class Address {

    private final int houseNum;
    private final String streetName, postCode, county;

    public Address(){

        this(0,"DEFAULT","DEFAULT","DEFAULT");

    }

    public Address(int houseNum, String streetName, String postCode, String county){

        this.houseNum = houseNum;
        this.streetName = streetName;
        this.postCode = postCode;
        this.county = county;

    }

    public int getHouseNum(){ return houseNum; }

    public String getStreetName() { return streetName; }

    public String getPostCode(){ return postCode; }

    public String getCounty() { return county; }

    @Override
    public String toString(){

        return houseNum + "," + streetName + "," + postCode + "," + county;

    }

}
