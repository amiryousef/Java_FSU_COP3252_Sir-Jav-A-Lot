/*
Yousef, Amir
COP-3252
Assignment5
4/12/2014
*/

import java.util.*;

//Ogre subclass of Enemy abstract superclass
public class Ogre extends Enemy
{
private String name;
private int armor;
private int weapon;
private int hitPoints;
private int ogreDamage;

//Ogre's constructor
public Ogre(String name, int armor, int weapon, int hitPoints)
{
super(name, armor, weapon, hitPoints);
}

//takeDamage(int) receives the ogre's amount of damage
public void takeDamage(int ogreDamage)
{
System.out.printf("\nThe Ogre amount of damage is: %d", ogreDamage);
}

//invalidDamageException(int) throws exception if the damage value is negative
public static int invalidDamageException(int ogreDamage) throws IllegalArgumentException
{
return ogreDamage;
}

//Ogre override abstract method fight()of Enemy
@Override
public int fight()
{
ogreDamage = weapon - armor;
return ogreDamage;
}

//Ogre override toString() method
@Override
public String toString()
{
return String.format("\n %s \n %d \n %d \n %d \n", super.toString());
}
}
