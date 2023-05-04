package com.ash.My_Travels.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ash.My_Travels.entities.TourPackages;
import com.ash.My_Travels.services.TourPackageService;

@RestController
@RequestMapping("/tourPackages")
public class WebServiceController {
private final TourPackageService tourPackageService;

public WebServiceController(TourPackageService tourPackageService) {
	super();
	this.tourPackageService = tourPackageService;
}
@GetMapping
public Iterable<TourPackages> getAllTourPackages()
{
	return this.tourPackageService.lookup();
}


}
