package cm.ksoft.devlab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cm.ksoft.devlab.models.Position;
import cm.ksoft.devlab.repo.PositionRepository;

@RestController
public class PositionController {
	
	@Autowired
	private PositionRepository positionrepository;
	
	@RequestMapping(value="/data/position", method=RequestMethod.POST)
	public Position position(@RequestParam(value="lb_lo") double lo,
			@RequestParam(value="lb_la") double la){
		
		Position myPosition = new Position(lo, la);
		positionrepository.save(myPosition);
		
		return new Position(lo, la);
	}
}
