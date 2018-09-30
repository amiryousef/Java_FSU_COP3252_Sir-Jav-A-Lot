/*
Yousef, Amir
COP-3252
Assignment5
4/12/2014
*/

import java.util.*;

//Sorcerer subclass of Enemy abstract superclass
public class Sorcerer extends Enemy
{
private String name;
private int armor;
private int weapon;
private int hitPoints;
private int sorcererDamage;

//Ogre's constructor
public Sorcerer(String name, int armor, int weapon, int hitPoints)
{
super(name, armor, weapon, hitPoints);
}

//takeDamage(int) receives the sorcerer's amount of damage
public void takeDamage(int sorcererDamage)
{
System.out.printf("\nThe Ogre amount of damage is: %d", sorcererDamage);
}

//invalidDamageException(int) throws exception if the damage value is negative
public static int invalidDamageException(int sorcererDamage) throws IllegalArgumentException
{
return sorcererDamage;
}

//Ogre override abstract method fight()of Enemy
@Override
public int fight()
{
sorcererDamage = weapon - armor;
return sorcererDamage;
}

//Ogre override toString() method
@Override
public String toString()
{
return String.format("\n %s \n %d \n %d \n %d \n", super.toString());
}
}