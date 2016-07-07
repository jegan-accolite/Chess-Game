/****************************************************************************
* Copyright (c) 2016 by Accolite.com. All rights reserved
*
* Created date :: Jul 7, 2016
*
*  @author :: Jegan Muthaiah
* ***************************************************************************
*/
package com.accolite.chess;

public class Player {
	String player_color;
	//Integer player_points;
	King king;
	Queen queen;
	Bishop[] bishop=new Bishop[2];
	Knight[] knight=new Knight[2];
	Rook[] rook=new Rook[2];
	
	/** The pawn. */
	Pawn[] pawn=new Pawn[8];
	char start='a';

	public Player(String player_color){
		this.player_color=player_color;
		//this.player_points=player_points;
		if(this.player_color == "white"){
			king=new King(new Square("e1"));
			queen=new Queen(new Square("d1"));
			bishop[0]=new Bishop(new Square("c1"));
			bishop[1]=new Bishop(new Square("f1"));
            knight[0]=new Knight(new Square("b1"));
            knight[1]=new Knight(new Square("g1"));
            rook[0]=new Rook(new Square("a1"));
            rook[1]=new Rook(new Square("h1"));
            for(int i=0;i<8;i++){
            	pawn[i]=new Pawn(new Square((char)(i+65)+"2"));
            }
		}
        else{
        	king=new King(new Square("e8"));
			queen=new Queen(new Square("d8"));
			bishop[0]=new Bishop(new Square("c8"));
			bishop[1]=new Bishop(new Square("f8"));
            knight[0]=new Knight(new Square("b8"));
            knight[1]=new Knight(new Square("g8"));
            rook[0]=new Rook(new Square("a8"));
            rook[1]=new Rook(new Square("h8"));
            for(int i=0;i<8;i++){
            	pawn[i]=new Pawn(new Square((char)(i+65)+"7"));
            }
    }
	}
	
/*	public void setPieces(){
		
	}*/
}
