/*
Yousef, Amir
COP-3252
Assignment5
4/12/2014
*/

import java.util.*;

//Knight concrete class
public class Knight 
{
private String knightName;
private int knightArmor;
private int knightWeapon;
private int knightHitPoints;
private int randomKnightName;
private int randomKnightArmor;
private int randomKnightWeapon;
private int knightDamage;

//Knight's user defined constructor
public Knight(String name, int armor, int weapon, int hitPoints)
{
knightName = name;
knightArmor = armor;
knightWeapon = weapon;
knightHitPoints = hitPoints;
}

// Knight's auto generated constructor
public Knight(int name, int armor, int weapon, int hitPoints)
{
randomKnightName = name;
randomKnightArmor = armor;
randomKnightWeapon = weapon;
knightHitPoints = hitPoints;
}

// Knight's set name
public void setKnightName(String name)
{
knightName = name;
}

// Knight's get name
public String getKnightName()
{
return knightName;
}

// Knight's set random name
public void setRandomKnightName()
{
Random randomNumbers = new Random();
randomKnightName = randomNumbers.nextInt(1000);
}

// Knight's get random name
public int getRandomKnightName()
{
return randomKnightName;
}

// Knight's set armor (1)Metal, (2)Plate, (3)Chain, or (4)Leather
public void setKnightArmor(int armor)
{
switch (armor)
{
case 1: knightArmor = 1;
knightDamage -= 500;
break;
case 2: knightArmor = 2;
knightDamage -= 400;
break;
case 3: knightArmor = 3;
knightDamage -= 300;
break;
case 4: knightArmor = 4;
knightDamage -= 200;
break;
}
knightArmor = armor;
}

// Knight's get armor
public int getKnightArmor()
{
return knightArmor;
}

// Knight's set random armor (1)Metal, (2)Plate, (3)Chain, or (4)Leather
public void setRandomKnightArmor()
{
Random randomNumbers = new Random();
randomKnightArmor = 1 + randomNumbers.nextInt(4);
}

// Knight's get random armor
public int getRandomKnightArmor()
{
return randomKnightArmor;
}

// set the knight weapon (1)Long Sword, (2)Battle Axe, (3)Spear, or (4)Warhammer
public void setKnightWeapon(int weapon)
{
switch (weapon)
{
case 1: knightWeapon = 1;
knightDamage += 200;
break;
case 2: knightWeapon = 2;
knightDamage += 300;
break;
case 3: knightWeapon = 3;
knightDamage += 400;
break;
case 4: knightWeapon = 4;
knightDamage += 500;
break;
}
knightWeapon = weapon;
}

// Knight's get weapon
public int getKnightWeapon()
{
return knightWeapon;
}

// Knight's set random weapon
public void setRandomKnightWeapon()
{
Random randomNumbers = new Random();
randomKnightWeapon = 1 + randomNumbers.nextInt(4);;
}

// Knight's get random weapon
public int getRandomKnightWeapon()
{
return randomKnightWeapon;
}

// Knight's set hit points
public void setKnightHitPoints(int hitPoints)
{
knightHitPoints = hitPoints;
}

// Knight's get hit points
public int getknightHitPoints()
{
return knightHitPoints;
}

// takeDamage(int) receives the knight's amount of damage
public void takeDamage(int damage)
{
knightDamage = damage;
}

// invalidDamageException(int) throws exception if the damage value is negative
public static int invalidDamageException(int knightDamage) throws IllegalArgumentException
{
return knightDamage;
}

public String toString()
{
return String.format("\n %s \n %d \n %d \n %d \n", getKnightName(), getKnightArmor(), getKnightWeapon(), getknightHitPoints());
}

}