package com.inheritance;
public class Square extends Rectangle {
	
		void show() {
			System.out.println("This is square subclass of Rectangle") ;
			
		}

		public static void main(String[] args) {
			Square s=new Square();
			s.show();
			}

	}

