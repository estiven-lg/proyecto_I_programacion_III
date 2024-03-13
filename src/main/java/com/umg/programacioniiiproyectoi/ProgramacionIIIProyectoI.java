/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.umg.programacioniiiproyectoi;

import com.umg.programacioniiiproyectoi.classes.Arméctic;
import com.umg.programacioniiiproyectoi.classes.Node;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProgramacionIIIProyectoI {

	public static void main(String[] args) {
		System.out.print( Pattern.compile("(?<=[a-zA-Z0-9])[a-zA-Z]|(?<=[a-zA-Z])[a-zA-Z0-9]").matcher("a+45+a").find());
	}
}
