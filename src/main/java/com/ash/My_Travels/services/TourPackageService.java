package com.ash.My_Travels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.My_Travels.entities.TourPackage;
import com.ash.My_Travels.repositories.TourPackageRepository;

@Service
public class TourPackageService {
	TourPackageRepository tourPackageRepository;

	@Autowired
	public TourPackageService(TourPackageRepository tourPackageRepository) {
		super();
		this.tourPackageRepository = tourPackageRepository;
	}
	public TourPackage createTourPackage(long id, String name, String place, Integer noOfDays, double cost)
	{
		return (TourPackage)tourPackageRepository.findById(id)
				.orElse(tourPackageRepository.save(  new TourPackage(id,name,place,noOfDays,cost)));
	}
	public Iterable<TourPackage> lookup()
	{
		return tourPackageRepository.findAll();
	}
	public long total()
	{
		return tourPackageRepository.count();
	}
}
