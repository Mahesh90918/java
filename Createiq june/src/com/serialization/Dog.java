package com.serialization;

import java.io.Serializable;

public class Dog implements Serializable {

	transient static int i = 10;
	transient final int j = 20;
	// ¬í sr com.serialization.Dog§ ÌZƒÂ40 xp

//transient  int i = 10;
//transient static int j = 20;
// ¬í sr com.serialization.Dogp›ƒÉõß†  xp
//transient static int i = 10;
//transient final int j = 20;

//	final int i = 10;
//	static int j = 20;
	// ¬í sr com.serialization.Dog…½ÙÞ{ç€ I ixp

	/*
	 * static Vs Transient : static variable is not part of object state hence they
	 * won't participate in serialization because of this declaring a static
	 * variable as transient there is no use.
	 */
	/*
	 * Transient Vs Final: final variables will be participated into serialization
	 * directly by their values. Hence declaring a final variable as transient there
	 * is no use. //the compiler assign the value to final variable
	 * 
	 */

}
