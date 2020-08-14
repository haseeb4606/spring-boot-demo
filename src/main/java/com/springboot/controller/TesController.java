package com.springboot.controller;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.SpringbootDto;

@RestController
@RequestMapping("/show")
public class TesController {

	private SpringbootDto dto;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String displayTest() {

		return "show";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public SpringbootDto postInfo(@RequestBody SpringbootDto dto) {

		System.out.println(dto.toString());

		return dto;

	}

	@GetMapping("/Time")
	public String showTime() {

		return "The current server time is " + LocalDateTime.now();

	}

	@Value("${team.name}")
	private String teamName;

	@Value("${player.name}")
	private String playerName;

	@GetMapping("/teaminfo")
	public String getPlayerInfo() {

		return "my favorit team is " + teamName + " my favorit palyer is " + playerName;
	}

	public SpringbootDto getDto() {
		return dto;
	}

	public void setDto(SpringbootDto dto) {
		this.dto = dto;
	}

}
