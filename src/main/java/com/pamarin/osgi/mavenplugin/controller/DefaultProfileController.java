/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.osgi.mavenplugin.controller;

import com.pamarin.osgi.mavenplugin.service.ProfileService;

/**
 *
 * @author anonymous
 */
public class DefaultProfileController {

    private final ProfileService profileService;

    public DefaultProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    public void printServiceName() {
        System.out.println("service name --> " + profileService.getName());
    }

}
