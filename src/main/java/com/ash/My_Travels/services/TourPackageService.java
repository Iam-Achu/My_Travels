package com.ash.My_Travels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.My_Travels.entities.TourPackages;
import com.ash.My_Travels.repositories.TourPackageRepository;

@Service
public class TourPackageService {
	TourPackageRepository tourPackageRepository;

	@Autowired
	public TourPackageService(TourPackageRepository tourPackageRepository) {
		super();
		this.tourPackageRepository = tourPackageRepository;
	}
	public TourPackages createTourPackage(TourPackages tourPackage)
	{
		return (TourPackages)tourPackageRepository.findById(tourPackage.getId())
				.orElse(tourPackageRepository.save(tourPackage ));
	}
	public Iterable<TourPackages> lookup()
	{
		return tourPackageRepository.findAll();
	}
	public long total()
	{
		return tourPackageRepository.count();
	}
}
