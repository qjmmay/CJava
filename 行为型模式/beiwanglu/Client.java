package com.qjm.beiwanglu;

public class Client {
	public static void main(String args[]) {
		OriginatorChess chess=new OriginatorChess(new MementoChess("��",2,2));
		play(chess);
		chess.setX(3);
		play(chess);
		chess.setY(6);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
	}
	private static int index=0;
	private static CaretakerChess caretaker=new CaretakerChess();
	public static void play(OriginatorChess chess) {
		index++;
		caretaker.AddMem(chess.SavetoMemento());
		chess.show();
	}
	public static void undo(OriginatorChess chess,int i) {
		System.out.println("*********����***********");
		index--;
		chess.Restore(caretaker.getMem(index-1));
		chess.show();
	}
	public static void redo(OriginatorChess chess,int i) {
		System.out.println("*********��������***********");
		index++;
	
		chess.show();
	}
}
