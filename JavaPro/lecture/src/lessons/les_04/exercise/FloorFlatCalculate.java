package lessons.les_04.exercise;

/*
В N этажном доме M квартир.
Определить, на каком этаже и в каком подъезде
находится квартира с заднным номером.
4 квартира на этаже
 */
// 9 этажей 108 квартир

//entrance

public class FloorFlatCalculate {

    /*
    nFlat = 108;
    nFloorPerBlock - 9;
    nFlatPerFloor = 4;
    blockNumber = nFlat / (nFloorBlock * nFlatPerFloor)

    108/36 = 3;
     */
    public static void main(String[] args) {
        int nKv = 324;
        int enEtazh = 9;
        int nPerFloor = 4;
        int appNo = 100;

        if(appNo <= 0 || appNo > nKv) throw new RuntimeException("incorrect input values ....");

        int floor = ((appNo - 1)%(nPerFloor*enEtazh))/nPerFloor+1;
        int podjezd = (appNo - 1)/(nPerFloor*enEtazh)+1;

        System.out.println("Floor " + floor);
        System.out.println("Podjezd " + podjezd);
    }
}
