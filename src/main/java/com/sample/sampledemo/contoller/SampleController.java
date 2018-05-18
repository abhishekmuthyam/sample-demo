package com.sample.sampledemo.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class SampleController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeMessage() {
		return "Swagger Hello World";
	}


	@RequestMapping(value = "/pestore", method = RequestMethod.GET)
	public List<String> petStoreList(){
		ArrayList<String> list=new ArrayList<>();
		list.add("Fishes");
		list.add("Birds");
		list.add("Dogs");
		list.add("cats");
		return list;
	}
}
