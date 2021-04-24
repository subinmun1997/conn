package com.android.smartbox;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.android.smartbox.ANDao;
import com.android.smartbox.ANDto;


public class ASelectMultiCommand implements ACommand{

	@Override
	public void execute(Model model) {			
		ANDao adao = new ANDao();
		ArrayList<ANDto> adtos = adao.anSelectMulti();
		
		model.addAttribute("anSelectMulti", adtos); 
		
	}
	
}