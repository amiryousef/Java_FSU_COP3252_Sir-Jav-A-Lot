/*
Yousef, Amir
COP-3252
Assignment5
4/12/2014
*/

import java.util.*;
 
//Enemy's abstract superclass
public abstract class Enemy
{
private String enemyName;
private int enemyArmor;
private int enemyWeapon;
private int enemyHitPoints;
private int enemyDamage;
private int randomEnemyName;
private int randomEnemyArmor;
private int randomEnemyWeapon;
private int randomEnemyHitPoints;

//Enemy's constructor
public Enemy(String name, int armor, int weapon, int hitPoints)
{
enemyName = name;
enemyArmor = armor;
enemyWeapon = weapon;
enemyHitPoints = hitPoints;
}

//Enemy's auto generated constructor
public Enemy(int name, int armor, int weapon, int hitPoints)
{
randomEnemyName = name;
randomEnemyArmor = armor;
randomEnemyWeapon = weapon;
randomEnemyHitPoints = hitPoints;
}

//Enemy's set name
public void setEnemyName(String name)
{
enemyName = name;
}

//Enemy's return name
public String getEnemyName()
{
return enemyName;
}

//Enemy's set armor (1)Metal, (2)Plate, (3)Chain, or (4)Leather
public void setEnemyArmor(int armor)
{
switch (armor)
{
case 1: enemyArmor = 1;
enemyDamage -= 500;
break;
case 2: enemyArmor = 2;
enemyDamage -= 400;
break;
case 3: enemyArmor = 3;
enemyDamage -= 300;
break;
case 4: enemyArmor = 4;
enemyDamage -= 200;
break;
}
enemyArmor = armor;
}

//Enemy's return armor
public int getEnemyArmor()
{
return enemyArmor;
}

//Enemy's set weapon (1)Long Sword, (2)Battle Axe, (3)Spear, or (4)Warhammer
public void setEnemyWeapons(int weapon)
{
switch (weapon)
{
case 1: enemyWeapon = 1;
enemyDamage += 200;
break;
case 2: enemyWeapon = 2;
enemyDamage += 300;
break;
case 3: enemyWeapon = 3;
enemyDamage += 400;
break;
case 4: enemyWeapon = 4;
enemyDamage += 500;
break;
}
enemyWeapon = weapon;
}

//Enemy's return weapon
public int getEnemyWeapon()
{
return enemyWeapon;
}

//Enemy's hit ponits
public void setEnemyHitPoints(int hitPoints)
{
enemyHitPoints = hitPoints;
}

//Enemy's return hit points
public int getEnemyHitPoints()
{
return enemyHitPoints;
}

//takeDamage(int) receives the enemy's amount of damage
public void takeDamage(int enemyDamage)
{
System.out.printf("\nThe Enemy amount of damage is: %d", enemyDamage);
}

//invalidDamageException(int) throws exception if the damage value is negative
public static int invalidDamageException(int enemyDamage) throws IllegalArgumentException
{
return enemyDamage;
}

//static method getRandomEnemy() returns randomly one enemy (Ogre, Sorcerer, or Troll)
public static int getRandomEnemy()
{
Random randomNumbers = new Random();
int enemy = 1 + randomNumbers.nextInt(6);
return enemy;
}

//toString() will be overidden by subclasses
@Override
public String toString()
{
return String.format( "\n%s\n%d\n%d\n%d\n", getEnemyName(), getEnemyArmor(), getEnemyWeapon(), getEnemyHitPoints());
}

//abstract method to be overridden by subclasses
public abstract int fight();
}