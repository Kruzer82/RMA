package com.kruzer.rma.Repository;

import com.kruzer.rma.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserAppRepository extends CrudRepository<Users,Integer> {
    Users findFirstByName(String name);
}
