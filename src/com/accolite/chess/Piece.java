/****************************************************************************
* Copyright (c) 2016 by Accolite.com. All rights reserved
*
* Created date :: Jul 7, 2016
*
*  @author :: Jegan Muthaiah
* ***************************************************************************
*/
package com.accolite.chess;

public class Piece {
	Square position;
	//isBoolean isDead;
	public Piece(Square position){
		this.position=position;
		//this.isDead=false;
	}
	
	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public Square getPosition() {
		return position;
	}
	public void setPosition(Square position) {
		this.position = position;
	}
/*	public boolean isValid(Board board,Square from,Square to){
		if(from.isValid() && to.isValid())
			return true;
		else
			return false;
	}*/
}
