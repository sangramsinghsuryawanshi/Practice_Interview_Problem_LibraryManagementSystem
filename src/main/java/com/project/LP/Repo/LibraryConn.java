package com.project.LP.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LP.Model.Library;

public interface LibraryConn extends JpaRepository<Library, Integer> 
{
	
}
