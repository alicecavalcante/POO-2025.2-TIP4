package br.edu.principal;

public class MaiorMenor {
	  public static int numMaior(int n1, int n2, int n3, int n4, int n5) {
	        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
	        	return n1;}
	        if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) { 
	        	return n2;}
	        if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
	        	return n3;}
	        if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
	        	return n4;}
	        else {
	        return n5;
	        }
	    }
	  
	  public static int numMenor(int n1, int n2, int n3, int n4, int n5) {
	        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
	        	return n1;}
	        if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
	        	return n2;}
	        if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
	        	return n3;}
	        if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
	        	return n4;}
	        else {
	        return n5;
	        }
	    }
	}

