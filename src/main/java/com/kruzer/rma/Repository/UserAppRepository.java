package com.kruzer.rma.Repository;

import com.kruzer.rma.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAppRepository extends JpaRepository<Users,Integer> {

}
