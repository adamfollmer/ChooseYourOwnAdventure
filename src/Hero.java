
public class Hero {
	String[] backpack = { "EMPTY BOTTLE", "20 GOLD", "", "" };
	String name;
	String classType;
	String[] spells = new String[3];
	int health;
	int level;

	public Hero(String Name, String ClassType) {
		name = Name;
		classType = ClassType;
		health = 100;
		level = 1;
		if (classType.equals("ROGUE")) {
			spells[0] = "SHIV";
			spells[1] = "ALAKHAZAM";
			spells[2] = "STEALTH";
		} else if (classType.equals("WARRIOR")) {
			spells[0] = "TAUNT";
			spells[1] = "ATTACK";
			spells[2] = "SHIELD_BLOCK";
		} else {
			spells[0] = "FIREBALL";
			spells[1] = "ARCANE_EXPLOSION";
			spells[2] = "PYROBLAST";
		}
	}
	public void menu (String direction){
		
	}

}
