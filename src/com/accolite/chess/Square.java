/****************************************************************************
* Copyright (c) 2016 by Accolite.com. All rights reserved
*
* Created date :: Jul 7, 2016
*
*  @author :: Jegan Muthaiah
* ***************************************************************************
*/
package com.accolite.chess;

// TODO: Auto-generated Javadoc
/**
 * The Class Square.
 */
public class Square {
	
	/** The position. */
	String position;
	
	/** The available. */
	boolean available;

	/**
	 * Instantiates a new square.
	 */
	public Square() {
		available=false;
	}

	/**
	 * Instantiates a new square.
	 *
	 * @param position the position
	 */
	public Square(String position) {
		this.position = position;
		available = true;
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position the new position
	 */
	public void setPosition(String position) {
		this.position = position;
	}
/*	public boolean isValid(){

	}
	public boolean isOccupied(){
	
	}*/
}
