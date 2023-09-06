public class Main {
  public static void main(String[] args) {
    String name1 = "Fischl";
    int level1 = 75;
    String weaponType1 = "Bow";

    String name2 = "Nahida";
    int level2 = 86;
    String weaponType2 = "Catalyst";

    String name3 = "Heizou";
    int level3 = 90;
    String weaponType3 = "Catalyst";

    int avgLevel = (level1+level2+level3)/3;
    boolean levelCompare = level1 > level2;
    boolean weaponCompare = weaponType3 == weaponType2;

    System.out.println("Genshin Stats for Character 1");
    System.out.println("Name: " + name1);
    System.out.println("Level: " + level1);
    System.out.println("Weapon: " + weaponType1 + "\n");

    System.out.println("Genshin Stats for Character 2");
    System.out.println("Name: " + name2);
    System.out.println("Level: " + level2);
    System.out.println("Weapon: " + weaponType2 + "\n");

    System.out.println("Genshin Stats for Character 3");
    System.out.println("Name: " + name2);
    System.out.println("Level: " + level2);
    System.out.println("Weapon: " + weaponType2 + "\n");

    System.out.println("The average character level is: " + avgLevel); // (operation: sum and divide)
    System.out.println("Fischl has a higher level than Nahida: " + levelCompare); // (operation: comparison)
    System.out.println("Heizou and Nahida are both catalyst users: " + weaponCompare); // (operation: comparison)
    
  }
}