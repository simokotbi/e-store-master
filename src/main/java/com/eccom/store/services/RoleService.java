package com.eccom.store.services;


import com.eccom.store.model.Role;
import com.eccom.store.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

        @Autowired
        private RoleRepository roleRepository;

        public Role createNewRole(Role role) {
            return roleRepository.save(role);
        }
}
