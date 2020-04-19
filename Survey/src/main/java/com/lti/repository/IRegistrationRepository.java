package com.lti.repository;

import org.springframework.data.repository.CrudRepository;

import com.lti.models.Registration;

public interface IRegistrationRepository extends CrudRepository<Registration, Integer> {

}
