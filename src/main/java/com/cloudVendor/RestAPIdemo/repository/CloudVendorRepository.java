package com.cloudVendor.RestAPIdemo.repository;

import com.cloudVendor.RestAPIdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
