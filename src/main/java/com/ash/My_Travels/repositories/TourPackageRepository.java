package com.ash.My_Travels.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ash.My_Travels.entities.TourPackages;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackages,Long> {
	


}
