/*
Yousef, Amir
COP-3252
Assignment5
4/12/2014
*/

import java.util.*;

//Troll subclass of Enemy abstract superclass
public class Troll extends Enemy
{
private String name;
private int armor;
private int weapon;
private int hitPoints;
private int trollDamage;

//Ogre's constructor
public Troll(String name, int armor, int weapon, int hitPoints)
{
super(name, armor, weapon, hitPoints);
}

//takeDamage(int) receives the troll's amount of damage
public void takeDamage(int trollDamage)
{
System.out.printf("\nThe Ogre amount of damage is: %d", trollDamage);
}

//invalidDamageException(int) throws exception if the damage value is negative
public static int invalidDamageException(int trollDamage) throws IllegalArgumentException
{
return trollDamage;
}

//Ogre override abstract method fight()of Enemy
@Override
public int fight()
{
trollDamage = weapon - armor;
return trollDamage;
}

//Ogre override toString() method
@Override
public String toString()
{
return String.format("\n %s \n %d \n %d \n %d \n", super.toString());
}
}