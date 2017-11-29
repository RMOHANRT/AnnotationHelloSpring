package com.ram.anno.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(TextEditorConfig.class);

	      TextEditor te = ctx.getBean(TextEditor.class);
	      te.spellCheck();
	      
	      SpellChecker sc = ctx.getBean(SpellChecker.class);
	      sc.checkSpelling();
	   }
}