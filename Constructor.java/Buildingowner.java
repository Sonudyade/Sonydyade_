class Buildingowner {
     public static void main(String []arge){
     Building building = new Building();


    System.out.println(building);
    System.out.println(building.name);
    System.out.println(building.color);
    System.out.println(building.floor);
    System.out.println(building.noOfRoom);
    System.out.println(building.noOfDoor);

    Building building1 = new Building();

    System.out.println(building1);
    System.out.println(building1.name);
    System.out.println(building1.color);
    System.out.println(building1.floor);
    System.out.println(building1.noOfRoom);
    System.out.println(building1.noOfDoor);

    Buildingowner Buildingowner = new Buildingowner();
  }


     Buildingowner(){
            System.out.println("creating objectof Buildingowner"); 
     }
}