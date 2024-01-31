package com.cloudVendor.RestAPIdemo.service.impl;

import com.cloudVendor.RestAPIdemo.model.CloudVendor;
import com.cloudVendor.RestAPIdemo.repository.CloudVendorRepository;
import com.cloudVendor.RestAPIdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository){
        this.cloudVendorRepository=cloudVendorRepository;
    }
    @Override
    public String createCloudVendor(CloudVendor cloudVendor){
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }
    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }


}


