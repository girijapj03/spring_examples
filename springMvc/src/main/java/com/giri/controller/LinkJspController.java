package com.giri.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class LinkJspController {
public LinkJspController() {
	super();
	System.out.println(this.getClass().getSimpleName() +"bean created");
}
@RequestMapping(value="/first.xyz")
public void onClicked() {
System.out.println("Invoked onClicked");	
}
@RequestMapping(value="/second.xyz")
public void onClicked1() {
System.out.println("Invoked onClicked1");	
}
@RequestMapping(value="/third.xyz")
public void onClicked2() {
System.out.println("Invoked onClicked2");	
}
}
