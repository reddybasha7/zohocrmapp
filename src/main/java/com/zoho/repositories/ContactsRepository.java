package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
